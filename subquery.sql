-- 4. �������� : �ϳ��� ���̺��� �˻��� ����� �ٸ� ���̺� �����Ͽ� ���ο� ����� �˻��ϴ� ���

--4-1) ������ ���� ���� : ������ ���� ������ ������ ���� �ϳ��� �ο� (Row, ��) ���� ��ȯ�ϴ� ���������� ���� ���� ���Ѵ�.
-- �������� where �������� ������ �񱳿����� =,>,<,>=,<=�� ����ؾ߸� �Ѵ�.

-- Jack�� �μ��� ���ϱ�
SELECT department_id
FROM employees
WHERE first_name = 'Jack'; -- 80

SELECT department_id , department_name
FROM departments
WHERE department_id = 80;

SELECT department_name    -- ���� ���� 
FROM departments
WHERE department_id = (SELECT department_id     -- ���� ���� ( ���������� ���� ���� )
                                  FROM employees
                                  WHERE first_name='Jack');

-- Jack�� ������ ������ ���� ��� ��� 
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

-- Jack�� ������ �����ϰų� �� ���� �޴� ������ ���� ��� 
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

--Jack �������� ���� �ް� Lex�� �������� ���� �޴� ��� ��� 
-- Jack�� ������ Lex�� ������ �˱�

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


-- 4-2) ������������ �׷��Լ� ����ϱ�
SELECT MAX(salary)
FROM employees;   --24000

SELECT MAX(salary), first_name 
FROM employees;  -- error

SELECT first_name , salary
FROM employees
WHERE salary = 24000;

-- ������ �������������� Group by�� ��� ����
-- ���� ������ ���� �޴� ��� ��� 
SELECT first_name , salary
FROM employees
WHERE salary = (SELECT MAX(salary)
                      FROM employees);
                      
-- ���� ������ ���� �޴� ��� ���
SELECT first_name, salary
FROM employees
WHERE salary = (SELECT MIN(salary)
                      FROM employees);
                      
-- ��� �������� ���� �޴� ��� ��� 
SELECT first_name , salary
FROM employees
WHERE salary > (SELECT round(avg(salary)) 
                      FROM employees);
                      
-- 60�� �μ� ��ȣ�� ���� ��� �߿��� �ִ� ������ �޴� ����� ������ ������ �޴� ����� ���, �����, ���� ���
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

-- 4-3) ������ �������� : ������������ ��ȯ�ϴ� ����� �ϳ� �̻��� ���� ��
--       ������ ���������� �ݵ�� ���� �� ������(multiply row operator)�� �Բ� ���

--       IN : ���� ������ �� ������ ���� ������ ��� �߿� �ϳ��� ��ġ�ϸ� ��
--       ALL : ���� ������ �� ������ ���� ������ �˻� ����� ��� ���� ��ġ�ϸ� ��
--       ANY , SOME : ���� ������ �� ������ ���� ������ �˻� ����� �ϳ� �̻� ��ġ�ϸ� ��
--       EXISTS : ���������� ��� ���� ���� ������ ���� ������ ������� �����մϴ�. 

--       IN : ���� ������ �� ������ ���� ������ ��� �߿� �ϳ��� ��ġ�ϸ� ��
-- Steven ����� ���� �μ����� �ٹ��ϴ� ������� ������ �μ��ڵ� ��� 

SELECT first_name , department_id
FROM employees
WHERE department_id IN (SELECT department_id
                                  FROM employees
                                  WHERE first_name = 'Steven');

SELECT department_id
FROM employees
WHERE first_name = 'Steven';

-- ������ 12000�̻� �޴� ����� ������ �μ����� ���ϴ� ������� ������ ���� ��� 
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

-- Steven ����� ���� �μ��� �ִ� ������� �̸��� �Ի���, �μ��ڵ带 ����ϴµ� 
-- Adam�� ���� ���
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

-- �μ��� ��� ������ ������ ������ �޴� ��� ��� 
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


-- ALL : ���� ������ �� ������ ���� ������ �˻� ����� ��� ���� ��ġ�ϸ� �� ( �� �ִ밪 ���� ũ�� �� )

-- �����ȣ 150, 200 ���� ū �����ȣ ���
SELECT employee_id 
FROM employees
WHERE employee_id > ALL(150,200); -- = ���ü� ����

-- 30�� �μ��� �ִ� �������� ���� ������ �޴� ��� ��� 
-- ������ ��������
SELECT first_name , salary
FROM employees
WHERE salary > ALL ( SELECT salary
                           FROM employees
                           WHERE department_id = 30);

-- ������ �������� 

SELECT first_name , salary
FROM employees
WHERE salary > (SELECT MAX(salary) 
                       FROM employees
                       WHERE department_id=30);
  -- select ���� �÷� 1��  , ������ ���������� �����ڰ� �����Ǿ� �ִ�                     

--       ANY , SOME : ���� ������ �� ������ ���� ������ �˻� ����� �ϳ� �̻� ��ġ�ϸ� �� ( ��, ���� ���� �� ���� ũ�� �� ) 

--       ��� ��ȣ�� 150�� 200���� ū �����ȣ ���
SELECT employee_id 
FROM employees
WHERE employee_id > ANY(150, 200);

-- 30�� �μ��� �ּ� �������� ���� ������ �޴� ����� ���� ���
-- ���� ��������
SELECT first_name , salary
FROM employees
WHERE salary > ANY (SELECT salary 
                              FROM employees 
                              WHERE department_id=30);

SELECT salary
FROM employees
WHERE department_id = 30;

-- ���� ��������
SELECT salary
FROM employees
WHERE salary > (SELECT MIN(salary)
                       FROM employees
                       WHERE department_id = 30);

--       EXISTS : ���������� ��� ���� ���� ������ ���� ������ ������� �����մϴ�. 
--       ���� ������ ���� �����մϴ�. ������ ���ΰ� ����� �ƹ��� ���谡 ����.
--       ���������� ���������� INNER JOIN���� ���� ������ ������, �׷��� �������� ���� �����Ҷ� ��μ� ���������� ������� ���ϵȴ�.

SELECT first_name
FROM employees
WHERE EXISTS (SELECT * 
                      FROM employees
                      WHERE department_id = 90);


-- 5. �ζ��� ��
-- �ζ��� ��� ������������ �ٱ��� select�� from�� ���ο� ���� ������������ ���Ѵ�.
-- ���ο� ���Ǵ� ���������� ��Ī�� �ο��ȴ�.

-- �ְ� ������ �޴� ��� ��� / ������ ��������
SELECT first_name , salary
FROM employees
WHERE salary = (SELECT MAX(salary)
                      FROM employees);

-- �ְ� ������ �޴� ��� ��� / ������ �������� 
SELECT first_name , salary
FROM employees
WHERE salary >= ALL (SELECT salary FROM employees);

-- �ְ� ������ �޴� ��� ��� / �ζ��� �� 
SELECT emp.first_name , emp.salary , yee.subsalary
FROM employees emp, (SELECT MAX(salary) AS subsalary
                                FROM employees) yee
WHERE emp.salary = yee.subsalary;

-- ���� ������ �޴� ��� ��� / ������ �������� 
SELECT MIN(salary)
FROM employees emp;

SELECT first_name , salary 
FROM employees
WHERE salary = (SELECT MIN(salary) 
                       FROM employees);
                       
-- ���� ������ �޴� ��� / ������ �������� 
SELECT first_name , salary
FROM employees
WHERE salary <= ALL (SELECT salary FROM employees);

-- ���� ������ �޴� ��� ��� / �ζ��� ��  
SELECT emp.first_name , emp.salary , yee.sub
FROM employees emp , (SELECT MIN(salary) AS sub 
                                 FROM employees) yee
WHERE emp.salary = yee.sub;

-- �μ��� �ְ� ������ �޴� ��� ��� 
SELECT e.department_id, e.first_name, e.salary, s.max_salary
FROM employees e , (SELECT department_id, MAX(salary) AS max_salary
                             FROM employees
                             GROUP BY department_id) s 
WHERE e.department_id = s.department_id  and e.salary = s.max_salary
ORDER BY 1 DESC;

-- �μ��� ���� ������ �޴� ��� ���
SELECT e.department_id, e.first_name , e.salary, d.min_salary
FROM employees e , ( SELECT department_id, MIN(salary) min_salary
                              FROM employees 
                              GROUP BY department_id) d
WHERE e.department_id = d.department_id AND e.salary = d.min_salary
ORDER BY 1 ASC;

-- Jack �μ����� ���
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
                                  WHERE first_name ='Jack'); -- Jack�� �̸��� ��� �ȵ� - �ζ��� �� ���
      
SELECT e.first_name , e.department_id , d.department_name
FROM employees e, ( SELECT department_name , department_id
                             FROM departments ) d
WHERE e.department_id = d.department_id  AND e.first_name = 'Jack';

-- Steven�� �μ��� -- ������ ��������
SELECT e.first_name , d.department_name , e.department_id
FROM employees e, ( SELECT department_name , department_id
                           FROM departments ) d
WHERE e.department_id = d.department_id AND e.first_name = 'Steven';

-- ������ �������� 
SELECT department_name 
FROM departments
WHERE department_id IN ( SELECT department_id 
                                  FROM employees 
                                  WHERE first_name = 'Steven');
    
-- Steven�� �μ���, �μ��ڵ�, ������� ��� - �ζ��κ�
SELECT e.department_id , e.last_name, e.first_name , d.department_name
FROM employees e ,( SELECT department_id, department_name
                            FROM departments ) d
WHERE e.department_id = d.department_id
AND e.first_name = 'Steven';

-- 6. ���������� �̿��Ͽ� ���̺��� �����ϰ�, ���̺� �����ϱ� 
-- ���̺� �����ϰ� ���� 
select * from friend;

CREATE TABLE copyfriend
AS 
SELECT * FROM friend;

SELECT * FROM copyfriend;

-- ���̺� ������ ���ϴ� �ʵ常 �����ؼ� ���� 

SELECT * FROM copybank;

CREATE TABLE copybank
AS 
SELECT ID , NAME FROM bank;

-- ��� ���̺��� ������ ���� 
CREATE TABLE copyemp
AS
SELECT * FROM employees where 1 = 0;   -- 0 : �׻� ���� 

SELECT * FROM copyemp;
SELECT * FROM employees WHERE 1=1; -- �� : ��ü��� 
SELECT * FROM employees WHERE 1=0; -- ���� : ���� ���. ���̺� ���� �����Ҷ� ��� 

-- ���̺��� ���� �߰� (����)
INSERT INTO copyemp
SELECT * FROM employees;

SELECT * FROM copyemp;

-- 80�� �μ��ڵ带 1�� ����
-- Sales �μ����� ���� �μ��ڵ带 1�� ���� 
UPDATE copyemp
SET department_id = 1
WHERE department_id = (SELECT department_id FROM departments
                                  WHERE department_name='Sales');

-- IT �μ��� �Ҽӵ� ����� ���� 
SELECT department_id 
FROM departments
WHERE department_name='IT';

DELETE FROM copyemp
WHERE department_id=(SELECT department_id 
                                FROM departments
                                WHERE department_name='IT'
                                );














