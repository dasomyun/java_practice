-- 4. 서브쿼리 : 하나의 테이블에서 검색한 결과를 다른 테이블에 전달하여 새로운 결과를 검색하는 경우

--4-1) 단일행 서브 쿼리 : 단일행 서브 쿼리는 수행결과 오직 하나의 로우 (Row, 행) 만을 반환하는 서브쿼리를 갖는 것을 말한다.
-- 메인쿼리 where 절에서는 단일행 비교연산자 =,>,<,>=,<=를 사용해야만 한다.

-- Jack의 부서명 구하기
SELECT department_id
FROM employees
WHERE first_name = 'Jack'; -- 80

SELECT department_id , department_name
FROM departments
WHERE department_id = 80;

SELECT department_name    -- 메인 쿼리 
FROM departments
WHERE department_id = (SELECT department_id     -- 서브 쿼리 ( 서브쿼리가 먼저 실행 )
                                  FROM employees
                                  WHERE first_name='Jack');

-- Jack과 동일한 직군을 가진 사원 출력 
SELECT job_id
FROM employees
WHERE first_name = 'Jack';

SELECT employee_id , first_name , job_id
FROM employees
WHERE job_id = 'SA_REP';

SELECT employee_id , first_name , job_id
FROM employees
WHERE job_id = (SELECT job_id
                       FROM employees
                       WHERE first_name = 'Jack');

-- Jack의 연봉과 동일하거나 더 많이 받는 사원명과 연봉 출력 
SELECT salary
FROM employees
WHERE first_name = 'Jack'; -- 8400

SELECT first_name , salary
FROM employees
WHERE salary >= 8400;

SELECT first_name , salary
FROM employees
WHERE salary >= (SELECT salary
                        FROM employees
                        WHERE first_name = 'Jack');

--Jack 연봉보다 많이 받고 Lex의 연봉보다 적게 받는 사원 출력 
-- Jack의 연봉과 Lex의 연봉을 알기

SELECT salary
FROM employees
WHERE first_name = 'Jack'; -- 8400

SELECT salary 
FROM employees
WHERE first_name = 'Lex'; -- 17000

SELECT first_name , salary
FROM employees
WHERE salary > 8400 AND salary < 17000; 

SELECT first_name , salary
FROM employees
WHERE salary > (SELECT salary
                       FROM employees
                       WHERE first_name = 'Jack') 
AND salary < (SELECT salary 
                   FROM employees
                   WHERE first_name = 'Lex'); 


-- 4-2) 서브쿼리에서 그룹함수 사용하기
SELECT MAX(salary)
FROM employees;   --24000

SELECT MAX(salary), first_name 
FROM employees;  -- error

SELECT first_name , salary
FROM employees
WHERE salary = 24000;

-- 단일행 서브쿼리에서는 Group by절 사용 못함
-- 가장 연봉을 많이 받는 사원 출력 
SELECT first_name , salary
FROM employees
WHERE salary = (SELECT MAX(salary)
                      FROM employees);
                      
-- 가장 연봉을 적게 받는 사원 출력
SELECT first_name, salary
FROM employees
WHERE salary = (SELECT MIN(salary)
                      FROM employees);
                      
-- 평균 연봉보다 많이 받는 사원 출력 
SELECT first_name , salary
FROM employees
WHERE salary > (SELECT round(avg(salary)) 
                      FROM employees);
                      
-- 60번 부서 번호를 가진 사원 중에서 최대 연봉을 받는 사원과 동일한 연봉을 받는 사원의 사번, 사원명, 연봉 출력
SELECT MAX(salary)
FROM employees
WHERE department_id = 60;

SELECT employee_id , first_name, salary 
FROM employees
WHERE salary = 9000;

SELECT employee_id , first_name, salary 
FROM employees
WHERE salary = (SELECT MAX(salary)
                       FROM employees
                       WHERE department_id = 60);

-- 4-3) 다중행 서브쿼리 : 서브쿼리에서 반환하는 결과가 하나 이상의 행일 때
--       다중행 서브쿼리는 반드시 다중 행 연산자(multiply row operator)와 함께 사용

--       IN : 메인 쿼리의 비교 조건이 서브 쿼리의 결과 중에 하나라도 일치하면 참
--       ALL : 메인 쿼리의 비교 조건이 서브 쿼리의 검색 결과와 모든 값이 일치하면 참
--       ANY , SOME : 메인 쿼리의 비교 조건이 서브 쿼리의 검색 결과와 하나 이상 일치하면 참
--       EXISTS : 서브쿼리의 결과 값이 참이 나오면 메인 쿼리의 결과값을 리턴합니다. 

--       IN : 메인 쿼리의 비교 조건이 서브 쿼리의 결과 중에 하나라도 일치하면 참
-- Steven 사원과 같은 부서에서 근무하는 사원들의 사원명과 부서코드 출력 

SELECT first_name , department_id
FROM employees
WHERE department_id IN (SELECT department_id
                                  FROM employees
                                  WHERE first_name = 'Steven');

SELECT department_id
FROM employees
WHERE first_name = 'Steven';

-- 연봉을 12000이상 받는 사원과 동일한 부서에서 일하는 사원들의 사원명과 연봉 출력 
SELECT DISTINCT department_id
FROM employees
WHERE salary > 12000;  -- 90, 80, 20

SELECT first_name , salary , department_id
FROM employees
WHERE department_id = 90 OR department_id = 80 OR department_id = 20;

SELECT first_name , salary , department_id
FROM employees
WHERE department_id IN (90,80,20);

SELECT first_name , salary , department_id
FROM employees
WHERE department_id IN (SELECT DISTINCT department_id
                                  FROM employees
                                  WHERE salary > 12000);

-- Steven 사원과 같은 부서에 있는 사원들의 이름과 입사일, 부서코드를 출력하는데 
-- Adam은 빼고 출력
SELECT department_id
FROM employees
WHERE first_name='Steven';

SELECT first_name , hire_date , department_id
FROM employees
WHERE (department_id=90 OR department_id=50) and first_name <> 'Adam';

SELECT first_name , hire_date , department_id
FROM employees
WHERE department_id IN (90,50) AND first_name <> 'Adam';

SELECT first_name , hire_date , department_id
FROM employees
WHERE department_id IN (SELECT department_id
                                   FROM employees
                                   WHERE first_name='Steven')
 AND first_name <> 'Adam';

-- 부서별 평균 연봉과 동일한 연봉을 받는 사원 출력 
SELECT department_id, round(avg(salary))
FROM employees
GROUP BY department_id;

SELECT first_name , salary 
FROM employees
WHERE salary IN ( SELECT round(avg(salary))
                         FROM employees
                         GROUP BY department_id)
ORDER BY 2 DESC;

SELECT first_name , salary 
FROM employees
WHERE salary IN ( SELECT department_id , round(avg(salary))     -- error
                         FROM employees
                         GROUP BY department_id)
ORDER BY 2 DESC;


-- ALL : 메인 쿼리의 비교 조건이 서브 쿼리의 검색 결과와 모든 값이 일치하면 참 ( 즉 최대값 보다 크면 참 )

-- 사원번호 150, 200 보다 큰 사원번호 출력
SELECT employee_id 
FROM employees
WHERE employee_id > ALL(150,200); -- = 나올수 없뚬

-- 30번 부서의 최대 연봉보다 많은 연봉을 받는 사원 출력 
-- 다중행 서브쿼리
SELECT first_name , salary
FROM employees
WHERE salary > ALL ( SELECT salary
                           FROM employees
                           WHERE department_id = 30);

-- 단일행 서브쿼리 

SELECT first_name , salary
FROM employees
WHERE salary > (SELECT MAX(salary) 
                       FROM employees
                       WHERE department_id=30);
  -- select 문의 컬럼 1개  , 다중행 서브쿼리는 연산자가 지정되어 있다                     

--       ANY , SOME : 메인 쿼리의 비교 조건이 서브 쿼리의 검색 결과와 하나 이상 일치하면 참 ( 즉, 가장 작은 값 보다 크면 참 ) 

--       사원 번호가 150과 200보다 큰 사원번호 출력
SELECT employee_id 
FROM employees
WHERE employee_id > ANY(150, 200);

-- 30번 부서의 최소 연봉보다 많은 연봉을 받는 사원과 연봉 출력
-- 다중 서브쿼리
SELECT first_name , salary
FROM employees
WHERE salary > ANY (SELECT salary 
                              FROM employees 
                              WHERE department_id=30);

SELECT salary
FROM employees
WHERE department_id = 30;

-- 단일 서브쿼리
SELECT salary
FROM employees
WHERE salary > (SELECT MIN(salary)
                       FROM employees
                       WHERE department_id = 30);

--       EXISTS : 서브쿼리의 결과 값이 참이 나오면 메인 쿼리의 결과값을 리턴합니다. 
--       서브 쿼리가 참을 리턴합니다. 하지만 메인과 서브는 아무런 관계가 없다.
--       서브쿼리와 메인쿼리는 INNER JOIN으로 같이 묶였기 때문에, 그러한 조건으로 참을 리턴할때 비로소 메인쿼리의 결과값이 리턴된다.

SELECT first_name
FROM employees
WHERE EXISTS (SELECT * 
                      FROM employees
                      WHERE department_id = 90);


-- 5. 인라인 뷰
-- 인라인 뷰는 서브쿼리문에 바깥쪽 select문 from절 내부에 사용된 서브쿼리문을 말한다.
-- 내부에 사용되는 서브쿼리는 별칭이 부여된다.

-- 최고 연봉을 받는 사원 출력 / 단일행 서브쿼리
SELECT first_name , salary
FROM employees
WHERE salary = (SELECT MAX(salary)
                      FROM employees);

-- 최고 연봉을 받는 사원 출력 / 다중행 서브쿼리 
SELECT first_name , salary
FROM employees
WHERE salary >= ALL (SELECT salary FROM employees);

-- 최고 연봉을 받는 사원 출력 / 인라인 뷰 
SELECT emp.first_name , emp.salary , yee.subsalary
FROM employees emp, (SELECT MAX(salary) AS subsalary
                                FROM employees) yee
WHERE emp.salary = yee.subsalary;

-- 최하 연봉을 받는 사원 출력 / 단일행 서브쿼리 
SELECT MIN(salary)
FROM employees emp;

SELECT first_name , salary 
FROM employees
WHERE salary = (SELECT MIN(salary) 
                       FROM employees);
                       
-- 최하 연봉을 받는 사람 / 다중행 서브쿼리 
SELECT first_name , salary
FROM employees
WHERE salary <= ALL (SELECT salary FROM employees);

-- 최하 연봉을 받는 사원 출력 / 인라인 뷰  
SELECT emp.first_name , emp.salary , yee.sub
FROM employees emp , (SELECT MIN(salary) AS sub 
                                 FROM employees) yee
WHERE emp.salary = yee.sub;

-- 부서별 최고 연봉을 받는 사원 출력 
SELECT e.department_id, e.first_name, e.salary, s.max_salary
FROM employees e , (SELECT department_id, MAX(salary) AS max_salary
                             FROM employees
                             GROUP BY department_id) s 
WHERE e.department_id = s.department_id  and e.salary = s.max_salary
ORDER BY 1 DESC;

-- 부서별 최하 연봉을 받는 사원 출력
SELECT e.department_id, e.first_name , e.salary, d.min_salary
FROM employees e , ( SELECT department_id, MIN(salary) min_salary
                              FROM employees 
                              GROUP BY department_id) d
WHERE e.department_id = d.department_id AND e.salary = d.min_salary
ORDER BY 1 ASC;

-- Jack 부서명을 출력
SELECT department_id
FROM employees
WHERE first_name = 'Jack';

SELECT department_name , department_id
FROM departments
WHERE department_id = 80;

SELECT department_name , department_id
FROM departments
WHERE department_id = (SELECT department_id 
                                  FROM employees
                                  WHERE first_name ='Jack'); -- Jack의 이름은 출력 안됨 - 인라인 뷰 사용
      
SELECT e.first_name , e.department_id , d.department_name
FROM employees e, ( SELECT department_name , department_id
                             FROM departments ) d
WHERE e.department_id = d.department_id  AND e.first_name = 'Jack';

-- Steven의 부서명 -- 다중행 서브쿼리
SELECT e.first_name , d.department_name , e.department_id
FROM employees e, ( SELECT department_name , department_id
                           FROM departments ) d
WHERE e.department_id = d.department_id AND e.first_name = 'Steven';

-- 다중행 서브쿼리 
SELECT department_name 
FROM departments
WHERE department_id IN ( SELECT department_id 
                                  FROM employees 
                                  WHERE first_name = 'Steven');
    
-- Steven의 부서명, 부서코드, 사원명을 출력 - 인라인뷰
SELECT e.department_id , e.last_name, e.first_name , d.department_name
FROM employees e ,( SELECT department_id, department_name
                            FROM departments ) d
WHERE e.department_id = d.department_id
AND e.first_name = 'Steven';

-- 6. 서브쿼리를 이용하여 테이블을 생성하고, 테이블 조작하기 
-- 테이블 생성하고 복사 
select * from friend;

CREATE TABLE copyfriend
AS 
SELECT * FROM friend;

SELECT * FROM copyfriend;

-- 테이블 생성시 원하는 필드만 복사해서 생성 

SELECT * FROM copybank;

CREATE TABLE copybank
AS 
SELECT ID , NAME FROM bank;

-- 사원 테이블의 구조만 복사 
CREATE TABLE copyemp
AS
SELECT * FROM employees where 1 = 0;   -- 0 : 항상 거짓 

SELECT * FROM copyemp;
SELECT * FROM employees WHERE 1=1; -- 참 : 전체출력 
SELECT * FROM employees WHERE 1=0; -- 거짓 : 제목만 출력. 테이블 구조 복사할때 사용 

-- 테이블의 내용 추가 (복사)
INSERT INTO copyemp
SELECT * FROM employees;

SELECT * FROM copyemp;

-- 80인 부서코드를 1로 변경
-- Sales 부서명을 가진 부서코드를 1로 변경 
UPDATE copyemp
SET department_id = 1
WHERE department_id = (SELECT department_id FROM departments
                                  WHERE department_name='Sales');

-- IT 부서에 소속된 사원을 삭제 
SELECT department_id 
FROM departments
WHERE department_name='IT';

DELETE FROM copyemp
WHERE department_id=(SELECT department_id 
                                FROM departments
                                WHERE department_name='IT'
                                );














