-- 03. SELECT 연습문제
--1 .
SELECT employee_id AS 사원번호, last_name AS 이름 , job_id AS wlrdjq
FROM employees;

--2.
SELECT department_id AS "부서#", last_name AS 이름 , nvl(manager_id,0) AS "관리자#"
FROM employees;

--3.
SELECT last_name || '의 급여는 ' || salary || '입니다.' as "사원의 급여"
FROM employees;

-- 02. SELECT - WHERE 연습문제
--1.
SELECT first_name AS 사원명, salary AS 연봉
FROM employees
WHERE department_id = 60;

-- 2.
SELECT first_name AS 사원명, salary AS 연봉
FROM employees
WHERE salary >=5000;

-- 3.
SELECT employee_id , first_name
FROM employees
WHERE first_name = 'Diana';

-- 4.
SELECT employee_id, first_name , salary
FROM employees
WHERE salary BETWEEN 5000 AND 10000;

-- 5.
SELECT department_id , first_name
FROM employees
WHERE department_id IN(90,60);

-- 6.
SELECT first_name, salary , department_id
FROM employees
WHERE department_id = 50 AND salary <= 5000;

--7.
SELECT first_name , salary, department_id
FROM employees
WHERE department_id = 50 OR salary >=7000;

--8.
SELECT first_name
FROM employees
WHERE first_name BETWEEN 'H%' AND 'J%' 
ORDER BY first_name DESC;



