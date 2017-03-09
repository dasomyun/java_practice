-- ����Ŭ �ֿ� �Լ���
-- dual ���̺� : from ������ ���̺��� ���� �� �� ����. �������� �� �ٿ� ������ ���ؼ�, ����Ŭ���� �����ϴ� ���̺�  �� ����� ���̺��� ���� ��� ���
SELECT SYSDATE FROM dual;

SELECT 10+20 AS "����" , 10-20 AS "�E��"
FROM dual;

-- 1. ���� �Լ�
-- 1-1 ) ROUND �ݿø� �Լ� : ���ڰ� ����̸� �Ҽ��� �Ʒ� , �����̸� �Ҽ��� ���� �ǹ�
SELECT round(1234.567) �ݿø� , round(1234.567 , 1) �ݿø� , round(1234.567 , 2) �ݿø� , round(1234.567 , -1) �ݿø� , round(1235.567 , -1) �ݿø� , round(1235.567 , -2) �ݿø�
FROM dual;

-- 1-2 ) TRUNC ���� �Լ� , ������ ROUND�� ���� 
SELECT trunc(1234.567) ����, trunc(1234.567 , 1) ���� , trunc(12345.567 , -1) ���� 
FROM dual;

-- 1-3 ) SIGN ���� -1, ��� 1, 0�� 0 ��ȯ 
SELECT sign(-10) , sign(20), sign(0)
FROM dual;

-- 1-4 ) MOD �־��� ���ڸ� ������ ���ڷ� ���� ������ ��
SELECT mod(1,3), mod(2,3), mod(3,3), mod(4,3)
FROM dual;

-- 1-5 ) POWER �־��� ������ ������ ����ŭ ������ �� ���� ��ȯ
SELECT POWER(2,10) , POWER(3,3)
FROM dual;

-- 1-6 ) SQRT �������� ��ȯ 
SELECT round(sqrt(2),5), round(sqrt(5),5)
FROM dual;

-- 1-7 ) ABS : ���밪
SELECT abs(10), abs(-10), abs(-10.123)
FROM dual;

-- 2. ���� �Լ� 
-- 2-1 ) UPPER �빮�ڷ� ��ȯ�ϴ� �Լ�
SELECT upper('Welcome to Oracle 10g') 
FROM dual;

SELECT upper(first_name), first_name
FROM employees;

-- 2-2) LOWER �ҹ��ڷ� ��ȯ�ϴ� �Լ�
SELECT lower('Welcome to Oracle 10g')
FROM dual;

SELECT lower(first_name), first_name
FROM employees;

-- 2-3) INITCAP ù���ڸ� �빮�ڷ� ��ȯ��Ų��.  -- ���� ��� 
SELECT initcap('welcome to oracle 10g') 
FROM dual;

SELECT initcap('yun dasom')
FROM dual;

-- 2-4) LENGTH ���ڿ��� ���̸� �˷��ش�. ( ������ ���� ) -- ���� ����  , ����Ŭ�� �ѱ۹��ڰ� 3byte
SELECT LENGTH('Welcome to Oracle 10g') , length('�� ��Ŭ') 
FROM dual;

SELECT first_name , LENGTH(first_name)
FROM employees;

-- 2-5) ���� ���� �Լ�
-- 1) INSTR Ư�������� ��ġ�� �˷��ش�. (������ġ�� 1����~~)
SELECT instr('Welcome to Oracle 10g' , 'o') 
FROM dual;

SELECT first_name , instr(first_name, 'a')
FROM employees
WHERE first_name LIKE '%a%';

-- ����) INSTR ('���ڿ� �Ǵ� �÷�' , 'ã�� ����', ������ġ , ���°����)  -- ���� ��� 
SELECT instr('Welcome to Oracle 10g' , 'o', 3, 2)
FROM dual;

SELECT instr('�����ͺ��̽�', '��' , 1, 1) , instrb('�����ͺ��̽�', '��' ,1,1) -- �ѱ� : 3byte ��: 10~13 
FROM dual;

-- 2) SUBSTR : ���� ������ŭ ���ڸ� �����Ѵ�. (������ġ 1����~) -- ���� ��� 
-- ���� : SUBSTR ('���ڿ� �Ǵ� �÷�' ������ġ, ������ ����)
SELECT substr('Welcome to Oracle 10g', 4, 3)
FROM dual;

SELECT substr('Welcome to Oracle 10g' , -3,2)
FROM dual;

-- SUBSTRB
SELECT substrb('Welcome to Oracle 10g' , 4 , 3)
FROM dual;

SELECT substr('����Ŭ �Դϴ�', 2, 2)
FROM dual;

SELECT substrb('����Ŭ �Դϴ�', 4, 6)
FROM dual;

-- 3) LPAD ������ ���� �� ���ʿ� ���� �� ������ Ư�����ڷ� ä���.
SELECT lpad('Oracle 10g', 20, '#') -- 20�ڸ��� ������ �� �����ʺ��� ä����
FROM dual;

-- RPAD ���� ���� �� �����ʿ� ���� �� ���鿡 Ư�� ���ڸ� ä���.
SELECT rpad('Oracle 10g', 20 , '#') -- 20�ڸ��� ������ �� ���ʺ��� ä����
FROM dual;

-- 4) LTRIM : ���ʿ� Ư�� ���ڸ� �����Ѵ�.
SELECT ltrim('aaa Oracle 10g aaa' , 'a')
FROM dual;

SELECT ltrim('      Oracle 10g        ') , ('         Oracle 10g          ')
FROM dual;

-- RTRIM : ������ Ư�� ���ڸ� �����Ѵ�.
SELECT rtrim('aaa Oracle 10g aaa', 'a') 
FROM dual;

SELECT rtrim('         Oracle 10g          ') , ('         Oracle 10g          ')
FROM dual;

-- TRIM : �յڿ��� Ư�� ���ڸ� �����Ѵ�. -- ���� �����Ҷ� ���� ��� 
SELECT trim('a' FROM 'aaa Oracle 10g aaa')
FROM dual;

SELECT trim( ' ' FROM '           Oracle 10g          ') 
FROM dual;

-- ASCII : ���ڸ� ASCII �ڵ��
SELECT ascii('A') 
FROM dual;

-- CHR : ASCII�� ���ڷ�
SELECT chr(65) 
FROM dual;

-- 3. ��¥ �Լ� : DATE������ ����ϴ� �Լ��̸� ��� ������ ��¥ �Ǵ� �Ⱓ�� ��´�. �ַ� �ϴ���, ������ ���
-- 3-1 ) ��¥ ���� : ���ϱ⳪ ����� ���� ������ �� �� �ִ�.

SELECT SYSDATE, SYSDATE+1, SYSDATE-1 -- ���ó�¥, ���ϳ�¥, ������¥
FROM dual;

-- ������� �ٹ� �ϼ� ��� -- ���̻��
SELECT employee_id �����ȣ, hire_date �Ի�⵵, trunc(SYSDATE-hire_date) �ٹ��ϼ�
FROM employees;

-- 3-2) MONTH_BETWEEN ���� ���� ���ϴ� �Լ�
-- ������� �ٹ� ����
SELECT employee_id, hire_date, trunc(SYSDATE-hire_date) �ٹ��ϼ�, trunc(months_between(SYSDATE, hire_date)) �ٹ����� , trunc(months_between(SYSDATE, hire_date)/12) �ٹ����
FROM employees;

-- 3-3) ADD_MONTHS Ư�� ���� ���� ���� ��¥�� ���ϴ� �Լ� -- ���̻��
SELECT employee_id, hire_date, add_months(hire_date, 6) �������߰�
FROM employees;

-- 3-4) LAST_DAY �־��� ��¥�� ���� ���� ���� ������ ��¥�� ���ϴ� �Լ�
SELECT employee_id, hire_date ,last_day(hire_date) �Ի��Ѵ��Ǹ�������¥, last_day(sysdate) �̴��Ǹ�������¥
FROM employees;

-- 3-5) NEXT-DAY �־��� ��¥�� �������� ���ƿ��� ���� �ֱٿ���
SELECT employee_id , next_day(hire_date,'��') �ݿ���, next_day(SYSDATE, '��') ���ƿ��±ݿ��� , next_day(sysdate ,'��') �����ϱݿ���
FROM employees;

SELECT employee_id, hire_date, add_months(hire_date, 7), next_day(add_months(hire_date, 7),'��') ���ƿ��¿�����, add_months(SYSDATE, 1), next_day(add_months(sysdate,1),'��') ���ƿ��¼�����
FROM employees;

-- 4. ����ȯ �Լ� : ����(����, �Ǽ�) , ����(����, ���ڿ�) , ��¥

-- ���ڳ� ��¥�� ���������� ��ȯ
-- 4-1) TO_CHAR : ��¥�� ���ڷ� �ٲٱ�
SELECT SYSDATE ���ó�¥, to_char(SYSDATE, 'YY/MM/DD') ��¥1, to_char(SYSDATE,'YYYY.MM.DD') ��¥2, 
to_char(SYSDATE, 'Month DD, YYYY') ��¥3 , to_char(SYSDATE, 'DY DD MON YY') ��¥4 , to_char(SYSDATE,'Day Mon dd') ��¥5, to_char(SYSDATE, 'YYYY"��" MM"��" DD"��" DY') ��¥6 -- ��¥3: Junuary, Fabuary ��¥4: jun , fab, ��¥5 : Day : Sunday
FROM dual;

SELECT  employee_id, hire_date, to_char(hire_date, 'MM') ��, to_char(hire_date, 'YYYY') �⵵
FROM employees;

-- 3���� �Ի��� ����� ��� 
SELECT employee_id, hire_date
FROM employees
WHERE to_char(hire_date,'MM')=03;

-- 2000�� ���Ŀ� �Ի��� ��� ��� -- ���蹮���� ���� ����
SELECT employee_id, hire_date
FROM employees
WHERE to_char(hire_date, 'YYYY') >= 2000;

-- 4-2) TO_CHAR : ���ڸ� ���ڷ� ����ȯ
SELECT to_char(1234, '9999') ����1, 
           to_char(1234, '9,9999') ����2, -- ������ ���� ä����
           to_char(1234, '9,999') ����3,
           to_char(1234, '0,9999') ����4,
           to_char(1234.56, '99,999.999') ����5,
           to_char(1234, '$999,999') ����6,
           to_char(1234, 'L999,999') ����7 -- L : �����ڵ忡 �´� ȭ����� ǥ��
FROM dual;

-- �������� ���ڷ� ��ȯ
-- TO_NUMBER : �������� ���������� ��ȯ
SELECT 77+to_number('1') 
FROM dual;

-- �������� ��¥�� ��ȯ 
-- ' ' - ����
SELECT to_date('2012/01/04','YYYY-MM-DD HH:MI:SS'), to_date('2012/01/01', 'YYYY-MM-DD')
FROM dual;

SELECT trunc(SYSDATE-to_date('1994/03/02','YYYY/MM/DD')) ��������ϼ�,
           trunc(months_between(SYSDATE,to_date('2017/01/11', 'YYYY/MM/DD'))) ������
FROM dual;

SELECT hire_date
FROM employees
WHERE hire_date >= to_date('2000-04-21' , 'YYYY-MM-DD');

-- 5. ������ ���� DECODE �Լ�
-- �ڹ��� Switch Case �� ��ɰ� ����
-- ����) DECODE (ǥ���� , ����1, ���1, ����2, ���2 ... )

SELECT first_name, department_id, decode(department_id-10, 10, '�渮��' , 20, '�λ��' , 30 , '������' , 40, '�����', '��Ÿ�յ�') as depname
FROM employees
ORDER BY 2 ASC;

-- 6. ���ǿ� ���� ���� �ٸ� ó���� ������ CASE �Լ�
-- �ڹ��� if-else�� ������ ����. decode�Լ��� ������ġ(=�񱳿���)�ϴ� ��쿡 ���ؼ��� ����Ǵ� �ݸ�, case�Լ��� �پ��� �񱳿����ڸ� �̿��Ͽ� ������ ����

SELECT first_name, department_id, CASE WHEN department_id=10 THEN '�渮��' 
                                                     WHEN department_id=20 THEN '�λ��' 
                                                     WHEN department_id=30 THEN '������' 
                                                     WHEN department_id=40 THEN '�����' 
                                                     ELSE '��Ÿ�յ�' END AS depname
FROM employees
ORDER BY 2 ASC;

SELECT first_name, department_id, CASE WHEN department_id>=10 AND department_id<=30 THEN '�渮��'
                                                     WHEN department_id>=40 AND department_id<=60 THEN '�λ��'
                                                     WHEN department_id>=70 AND department_id<=80 THEN '������'
                                                     WHEN department_id>=90 AND department_id<=100 THEN '�����'
                                                     ELSE '��Ÿ���'
                                                     END AS depname
FROM employees
ORDER BY 2 ASC;

                                                