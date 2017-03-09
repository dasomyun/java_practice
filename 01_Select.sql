-- 1. SELECT [�÷��� �Ǵ� ǥ����] FROM [���̺�� �Ǵ� ���] WHERE ������

-- db�� ��ҹ��ڸ� �������� �ʴ´�. ��ҹ��ڸ� �������� ���� ��� ���� �빮�ڷ� �ۼ��Ѵ�. ����-ȯ�漳������ ���� 
-- select �ʵ� �̾Ƴ��� , where ������� �̾Ƴ���
-- db�� �׻� ������ �ؾ� �Ѵ�

-- 1) ��ü ���ڵ� ��ȸ

SELECT * 
FROM employees;

--2) ���ϴ� �ʵ常 ��ȸ
select first_name from employees;

SELECT first_name
FROM employees;

SELECT employee_id, last_name, email
FROM employees;

--3) ���������

SELECT employee_id, salary, commission_pct
FROM employees;

SELECT employee_id, salary, salary+100, salary-100, salary*12, salary/2
FROM employees;
-- ������+null = null�� ��� 
SELECT employee_id, salary, commission_pct, salary+commission_pct
FROM employees;

--4) NULL ��Ȯ�� �Ǵ� �˼� ���� ���� �ǹ��Ѵ�. �׷��Ƿ� ����, �Ҵ�, �񱳰� �Ұ���
-- nvl : NULL ó�� �Լ� 
-- nvl ���� : nvl ( �÷� �Ǵ� �ʵ�, ġȯ�� �� ) 

SELECT last_name, nvl(commission_pct , 0) -- nvl(���� �÷� �Ǵ� �ʵ�, '����')
FROM employees;

SELECT last_name, salary, commission_pct, salary*commission_pct, salary*nvl(commission_pct,0)
FROM employees;

SELECT last_name, manager_id, nvl(manager_id, 0)
FROM employees;

--5) ��Ī Alias

SELECT employee_id as �����ȣ
FROM employees;

SELECT employee_id, salary*12+nvl(commission_pct,0) as ���� 
FROM employees;

SELECT employee_id AS "SawonNumber"  -- Ư������, ����, �빮�ڷ� ������ �ϰ������ ""�� ���α�
FROM employees;

SELECT employee_id "***bunho***" -- as�� ���� ���� 
FROM employees;

SELECT employee_id, salary, salary+100 AS "hap", salary-100 AS ����, salary*12 AS ����, salary/2 AS "div"
FROM employees;

--6) Concatenation (�ռ�����) : ���� �ٸ� �÷��� ��ġ �ϳ��� �÷��� �� ó�� �����ؼ� ��� 

SELECT first_name, last_name
FROM employees;

SELECT first_name || last_name AS �̸�
FROM employees;

SELECT last_name || '(' || first_name || ')' AS �̸�     -- ���ͳ� ������ �Ѵ�.
FROM employees;

SELECT first_name || ' �̸� ' || last_name || ' ���Դϴ�' AS �̸� 
FROM employees;

SELECT employee_id || '(' || nvl (manager_id,0) || ')' AS "���(������)"
FROM employees;

--7) Distinct : �ߺ��� ���� �����ϰ� ��� 

SELECT department_id
FROM employees;

SELECT DISTINCT nvl(department_id,0)
FROM employees;

SELECT job_id
FROM employees;

SELECT DISTINCT job_id
FROM employees;


-- like _a : ���ڸ��� 1�ڸ��ְ� a�� �����ϴ� ���� 

--8) Where �� : �������� �´� �ش� ���ڵ� ��� 
-- 8-1) �� ������ : =(����) , > , >= , <= , <>(�����ʴ�)

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
WHERE last_name = 'Smith';    --  ����Ŭ ��ɾ�� ��ҹ��ڸ� �������� ������ �����ʹ� ��ҹ��ڸ� ��Ȯ�� �����Ѵ� 

SELECT employee_id, hire_date
FROM employees
WHERE hire_date<='1990-01-01';

--8-2) �񱳿����� : LIKE, IN, BETWEEN AND ������ 
-- LIKE �����ڴ� Ư���� ������ ������ �ִ� ������ �˻� 

-- K�� �����ϴ� �̸��� ���� ����� �̸��� �˻� 
SELECT last_name
FROM employees
WHERE last_name LIKE 'K%';

--  n���� ������ ����� �̸��� �˻� 
SELECT last_name
FROM employees
WHERE last_name LIKE '%n';

-- h�� ���ڿ� ��򰡿� �ִ� ����� �̸� 
SELECT last_name
FROM employees
WHERE last_name LIKE '%h%';

-- �̸� �� �ι�° ���ڿ� a�� ����� �̸� �˻� 
SELECT last_name
FROM employees
WHERE last_name LIKE '_a%';

-- ���ڿ� ����° ���ڿ� a�� ����� �̸� �˻� 
SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';

-- IN(a,b,c) ������ : a�̰ų� b�̰ų� c�� ���� �˻� 
SELECT employee_id , commission_pct
FROM employees
WHERE commission_pct IN(0.3, 0.1, 0.25);

SELECT employee_id , job_id
FROM employees
WHERE job_id IN ('IT_PTOG' , 'HR_REP' , 'SH_CLERK' , 'MK_REP');

-- BETWEEN a AND b : a�� b���̿� �ִ� ���� ���� ��� �˻� 

SELECT first_name, salary
FROM employees
WHERE salary BETWEEN 2000 AND 6000;    -- 2000 �� 6000 ������ �� (2000 ,6000 ����)

SELECT first_name , hire_date
FROM employees
WHERE hire_date BETWEEN '1990-01-01' AND '1995-01-01';

-- 8-3) �������� : AND , OR, NOT

SELECT employee_id AS �����ȣ, job_id AS ����, department_id AS �μ��ڵ�
FROM employees
WHERE job_id='IT_PROG' AND department_id = 60;

SELECT employee_id AS �����ȣ, salary AS ����, department_id AS �μ��ڵ�
FROM employees
WHERE salary >= 3000 AND department_id = 100;

SELECT employee_id AS �����ȣ , hire_date as �Ի���
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
WHERE commission_pct IS NULL ;  -- commission_pct = null �̶�� ���� �ȵȴ�

SELECT employee_id , commission_pct
FROM employees
WHERE commission_pct IS NOT NULL;

-- 9) ORDER BY �� : ���� 

SELECT first_name
FROM employees
ORDER BY first_name ASC;   -- ASC(��������) ���� ���� 

SELECT first_name
FROM employees
ORDER BY first_name DESC;   -- DESC �������� 

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













