-- 03. SELECT ��������
--1 .
SELECT employee_id AS �����ȣ, last_name AS �̸� , job_id AS wlrdjq
FROM employees;

--2.
SELECT department_id AS "�μ�#", last_name AS �̸� , nvl(manager_id,0) AS "������#"
FROM employees;

--3.
SELECT last_name || '�� �޿��� ' || salary || '�Դϴ�.' as "����� �޿�"
FROM employees;

-- 02. SELECT - WHERE ��������
--1.
SELECT first_name AS �����, salary AS ����
FROM employees
WHERE department_id = 60;

-- 2.
SELECT first_name AS �����, salary AS ����
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



