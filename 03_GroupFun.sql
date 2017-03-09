-- 3. �׷��Լ� : ��ü �����͸� �׷캰�� �����Ͽ� ������� ����� ���ϱ� ���ؼ� ���� ���ȴ�.
--                  ������ �Լ��� 14���� �࿡ ���ؼ� 14���� ������ ��������.
--                  �׷��Լ��� 14���� �࿡ ���ؼ� �׷��Լ��� ����� 1���� ������ ��������.
--                  NULL ���� �����Ѵ�.
--                  �ߺ��� ��� (SUM, AVG, COUNT, MIN, MAX)

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

SELECT round(avg(commission_pct),2) -- NULL�� �����ϰ� ���
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

-- 3-4) COUNT -- �ݵ�� �ߺ��� ���� 
SELECT count(employee_id) as �����
FROM employees;

SELECT count(job_id)
FROM employees;

SELECT count(DISTINCT job_id)
FROM employees;

SELECT count(DISTINCT department_id) AS �μ��� 
FROM employees;

SELECT count(DISTINCT job_id)
FROM employees
WHERE department_id=80;

SELECT MAX(salary), first_name -- �ִ� ������ �޴� ����� �����ݾ��� ����ϸ� error
FROM employees;                    -- �Ѱ��� ������� ���´�. ( ���� SubQuery )

-- 3-5) GROUP BY
--       ����) select �÷��� from ���̺�� where ������ Group by �÷���

-- �μ��� ��������� ���Ϸ��� �켱 ��ü ����� �μ����� �׷�ȭ�ؾ� �Ѵ�.
SELECT round(avg(salary))
FROM employees
GROUP BY department_id;

SELECT nvl(department_id,0) , round(avg(salary))    -- �׷����� ������� �ʴ� �÷��� SELECT ���� ����Ѵ�.
FROM employees
GROUP BY department_id;     -- �μ���ȣ�� ����� �׷�����

--������ �����հ�� ����� ���ض�
SELECT job_id , sum(salary) AS �����հ�, round(avg(salary),1) AS �������   -- group by ���� �ָ� �׷��Լ� �����ʰ� ��� ���� 
FROM employees
GROUP BY job_id
ORDER BY job_id DESC;

SELECT department_id, count(*), count(commission_pct)    --(*) null ����
FROM employees
GROUP BY department_id;

-- 3-6) HAVING �� : GROUP BY ���� ���� ������ ��� �� �� ���ϴ� ���� ��� 
--                        GROUP BY �� AS ��� �� �� ����, GROUP BY�� ������ HAVING�� ��� �� �� ����.

SELECT department_id, round(avg(salary)) as �������
FROM employees
GROUP BY department_id
HAVING round(avg(salary)) >= 6000;  -- having �� select���� ������ ���� �ۼ��Ͽ� ������ ��� ��(?)

SELECT department_id , MAX(salary) �ִ뿬��
FROM employees
GROUP BY department_id
HAVING MAX(salary) >= 10000;

-- �� ������ ��� ������ �ο����� ���ϰ�, ������ �ο��� 2�� �̻��� ������ ���
SELECT job_id , round(avg(salary)) , count(*) 
FROM employees
GROUP BY job_id
HAVING count(job_id) >= 2
ORDER BY 2 DESC;   -- �̾Ƴ� ������� 1�÷�, 2�÷�, 3�÷����� �ۼ� �� �� ����

--IT_PROG�� ������ ������ ����� ������, ��� ������ 8000�̻��� ���� ���
SELECT job_id , round(avg(salary)) 
FROM employees
WHERE NOT job_id='IT_PROG'
GROUP BY job_id 
HAVING round(avg(salary)) >= 800
ORDER BY 2 DESC;


















