-- 3. 그룹함수 : 전체 데이터를 그룹별로 구분하여 통계적인 결과를 구하기 위해서 자주 사용된다.
--                  단일행 함수는 14개의 행에 대해서 14개의 행으로 구해진다.
--                  그룹함수는 14개의 행에 대해서 그룹함수의 결과는 1개의 행으로 구해진다.
--                  NULL 값을 제외한다.
--                  중복행 사용 (SUM, AVG, COUNT, MIN, MAX)

SELECT salary
FROM employees;

-- 3-1) SUM
SELECT  sum(salary)
FROM employees;

SELECT sum(commission_pct)
FROM employees;

SELECT sum(salary)
FROM employees
WHERE department_id=100;

SELECT sum(salary)
FROM employees
WHERE job_id='IT_PROG';

-- 3-2) AVG
SELECT round(avg(salary),1)
FROM employees;

SELECT round(avg(commission_pct),2) -- NULL을 제외하고 계산
FROM employees;

SELECT round(avg(salary))
FROM employees
WHERE job_id='IT_PROG';

SELECT round(avg(salary))
FROM employees
WHERE job_id='IT_PROG' AND department_id=60;

-- 3-3) MAX,MIN
SELECT MAX(salary) , MIN(salary)
FROM employees;

SELECT MAX(salary) , MIN(salary)
FROM employees
WHERE job_id='IT_PROG';

SELECT MAX(hire_date) 
FROM employees;

SELECT MIN(hire_date)
FROM employees;

-- 3-4) COUNT -- 반드시 중복행 제거 
SELECT count(employee_id) as 사원수
FROM employees;

SELECT count(job_id)
FROM employees;

SELECT count(DISTINCT job_id)
FROM employees;

SELECT count(DISTINCT department_id) AS 부서수 
FROM employees;

SELECT count(DISTINCT job_id)
FROM employees
WHERE department_id=80;

SELECT MAX(salary), first_name -- 최대 연봉을 받는 사원과 연봉금액을 출력하면 error
FROM employees;                    -- 한개의 결과값만 나온다. ( 참고 SubQuery )

-- 3-5) GROUP BY
--       형식) select 컬럼명 from 테이블명 where 조건절 Group by 컬럼명

-- 부서별 연봉평균을 구하려면 우선 전체 사원을 부서별로 그룹화해야 한다.
SELECT round(avg(salary))
FROM employees
GROUP BY department_id;

SELECT nvl(department_id,0) , round(avg(salary))    -- 그룹으로 명시하지 않는 컬럼은 SELECT 절에 사용한다.
FROM employees
GROUP BY department_id;     -- 부서번호로 사원을 그룹짓기

--직군별 연봉합계와 평균을 구해라
SELECT job_id , sum(salary) AS 연봉합계, round(avg(salary),1) AS 연봉평균   -- group by 묶은 애만 그룹함수 쓰지않고 사용 가능 
FROM employees
GROUP BY job_id
ORDER BY job_id DESC;

SELECT department_id, count(*), count(commission_pct)    --(*) null 포함
FROM employees
GROUP BY department_id;

-- 3-6) HAVING 절 : GROUP BY 절에 의해 생성된 결과 값 중 원하는 조건 출력 
--                        GROUP BY 는 AS 사용 할 수 없고, GROUP BY가 없으면 HAVING을 사용 할 수 없다.

SELECT department_id, round(avg(salary)) as 연봉평균
FROM employees
GROUP BY department_id
HAVING round(avg(salary)) >= 6000;  -- having 은 select문의 쿼리와 같게 작성하여 조건을 줘야 함(?)

SELECT department_id , MAX(salary) 최대연봉
FROM employees
GROUP BY department_id
HAVING MAX(salary) >= 10000;

-- 각 직군별 평균 연봉과 인원수를 구하고, 직군별 인원이 2명 이상인 직군만 출력
SELECT job_id , round(avg(salary)) , count(*) 
FROM employees
GROUP BY job_id
HAVING count(job_id) >= 2
ORDER BY 2 DESC;   -- 뽑아낸 결과값의 1컬럼, 2컬럼, 3컬럼으로 작성 할 수 있음

--IT_PROG를 제외한 직군별 평균을 구한후, 평균 연봉이 8000이상인 직군 출력
SELECT job_id , round(avg(salary)) 
FROM employees
WHERE NOT job_id='IT_PROG'
GROUP BY job_id 
HAVING round(avg(salary)) >= 800
ORDER BY 2 DESC;


















