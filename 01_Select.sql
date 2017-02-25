-- 1. SELECT [컬럼명 또는 표현식] FROM [테이블명 또는 뷰명] WHERE 조건절

-- db는 대소문자를 구분하지 않는다. 대소문자를 구분하지 않을 경우 보통 대문자로 작성한다. 도구-환경설정에서 설정 
-- select 필드 뽑아내기 , where 행단위로 뽑아내기
-- db는 항상 저장을 해야 한다

-- 1) 전체 레코드 조회

SELECT * 
FROM employees;

--2) 원하는 필드만 조회
select first_name from employees;

SELECT first_name
FROM employees;

SELECT employee_id, last_name, email
FROM employees;

--3) 산술연산자

SELECT employee_id, salary, commission_pct
FROM employees;

SELECT employee_id, salary, salary+100, salary-100, salary*12, salary/2
FROM employees;
-- 정수형+null = null값 출력 
SELECT employee_id, salary, commission_pct, salary+commission_pct
FROM employees;

--4) NULL 미확정 또는 알수 없는 값을 의미한다. 그러므로 연산, 할당, 비교가 불가능
-- nvl : NULL 처리 함수 
-- nvl 형식 : nvl ( 컬럼 또는 필드, 치환할 값 ) 

SELECT last_name, nvl(commission_pct , 0) -- nvl(문자 컬럼 또는 필드, '없음')
FROM employees;

SELECT last_name, salary, commission_pct, salary*commission_pct, salary*nvl(commission_pct,0)
FROM employees;

SELECT last_name, manager_id, nvl(manager_id, 0)
FROM employees;

--5) 별칭 Alias

SELECT employee_id as 사원번호
FROM employees;

SELECT employee_id, salary*12+nvl(commission_pct,0) as 연봉 
FROM employees;

SELECT employee_id AS "SawonNumber"  -- 특수문자, 공백, 대문자로 나오게 하고싶으면 "'로 감싸기
FROM employees;

SELECT employee_id "***bunho***" -- as는 생략 가능 
FROM employees;

SELECT employee_id, salary, salary+100 AS "hap", salary-100 AS 뺄셈, salary*12 AS 곱셈, salary/2 AS "div"
FROM employees;

--6) Concatenation (합성문자) : 서로 다른 컬럼을 마치 하나의 컬럼인 것 처럼 연결해서 출력 

SELECT first_name, last_name
FROM employees;

SELECT first_name || last_name AS 이름
FROM employees;

SELECT last_name || '(' || first_name || ')' AS 이름     -- 리터널 상수라고 한다.
FROM employees;

SELECT first_name || ' 이름 ' || last_name || ' 성입니다' AS 이름 
FROM employees;

SELECT employee_id || '(' || nvl (manager_id,0) || ')' AS "사원(관리자)"
FROM employees;

--7) Distinct : 중복된 값을 제거하고 출력 

SELECT department_id
FROM employees;

SELECT DISTINCT nvl(department_id,0)
FROM employees;

SELECT job_id
FROM employees;

SELECT DISTINCT job_id
FROM employees;


-- like _a : 앞자리가 1자리있고 a로 시작하는 글자 

--8) Where 절 : 조건절에 맞는 해당 레코드 출력 
-- 8-1) 비교 연산자 : =(같다) , > , >= , <= , <>(같지않다)

SELECT *
FROM employees
WHERE department_id=90;

SELECT employee_id, salary , department_id
FROM employees
WHERE department_id=90;

SELECT employee_id, first_name , last_name , salary
FROM employees
WHERE salary > 3500;

SELECT employee_id, first_name , last_name
FROM employees
WHERE last_name = 'Smith';    --  오라클 명령어는 대소문자를 구분하지 않지만 데이터는 대소문자를 명확히 구분한다 

SELECT employee_id, hire_date
FROM employees
WHERE hire_date<='1990-01-01';

--8-2) 비교연산자 : LIKE, IN, BETWEEN AND 연산자 
-- LIKE 연산자는 특정한 패턴을 가지고 있는 조건을 검색 

-- K로 시작하는 이름을 가진 사원의 이름을 검색 
SELECT last_name
FROM employees
WHERE last_name LIKE 'K%';

--  n으로 끝나는 사원의 이름을 검색 
SELECT last_name
FROM employees
WHERE last_name LIKE '%n';

-- h가 문자열 어딘가에 있는 사원의 이름 
SELECT last_name
FROM employees
WHERE last_name LIKE '%h%';

-- 이름 중 두번째 문자에 a인 사원의 이름 검색 
SELECT last_name
FROM employees
WHERE last_name LIKE '_a%';

-- 문자열 세번째 문자에 a인 사원의 이름 검색 
SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';

-- IN(a,b,c) 연산자 : a이거나 b이거나 c인 조건 검색 
SELECT employee_id , commission_pct
FROM employees
WHERE commission_pct IN(0.3, 0.1, 0.25);

SELECT employee_id , job_id
FROM employees
WHERE job_id IN ('IT_PTOG' , 'HR_REP' , 'SH_CLERK' , 'MK_REP');

-- BETWEEN a AND b : a와 b사이에 있는 범위 값을 모두 검색 

SELECT first_name, salary
FROM employees
WHERE salary BETWEEN 2000 AND 6000;    -- 2000 과 6000 사이의 값 (2000 ,6000 포함)

SELECT first_name , hire_date
FROM employees
WHERE hire_date BETWEEN '1990-01-01' AND '1995-01-01';

-- 8-3) 논리연산자 : AND , OR, NOT

SELECT employee_id AS 사원번호, job_id AS 직무, department_id AS 부서코드
FROM employees
WHERE job_id='IT_PROG' AND department_id = 60;

SELECT employee_id AS 사원번호, salary AS 연봉, department_id AS 부서코드
FROM employees
WHERE salary >= 3000 AND department_id = 100;

SELECT employee_id AS 사원번호 , hire_date as 입사년월
FROM employees
WHERE salary >= 3000 AND hire_date <'1990-01-01';

SELECT employee_id , job_id, hire_date
FROM employees
WHERE job_id ='IT_PROG' OR hire_date > '2000-01-01';

SELECT DISTINCT department_id 
FROM employees
WHERE NOT department_id =90;

SELECT DISTINCT department_id
FROM employees
WHERE department_id NOT IN (10,90);

SELECT employee_id , commission_pct
FROM employees
WHERE commission_pct IS NULL ;  -- commission_pct = null 이라고 쓰면 안된다

SELECT employee_id , commission_pct
FROM employees
WHERE commission_pct IS NOT NULL;

-- 9) ORDER BY 절 : 정렬 

SELECT first_name
FROM employees
ORDER BY first_name ASC;   -- ASC(오름차순) 생략 가능 

SELECT first_name
FROM employees
ORDER BY first_name DESC;   -- DESC 내림차순 

SELECT employee_id , hire_date
FROM employees
ORDER BY hire_date ASC;

SELECT employee_id , first_name , salary
FROM employees
ORDER BY salary DESC , first_name ASC;

SELECT employee_id , salary
FROM employees
WHERE salary > 5000
ORDER BY salary DESC;

SELECT employee_id, salary
FROM employees
WHERE salary >= 3000 AND salary <= 4000
ORDER BY salary DESC, employee_id ASC;













