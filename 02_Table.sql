--1 ����Ŭ �ڷ��� 

--  1-1) ����, ���ڿ� ������ Ÿ�� 
-- char(n) : 4000 byte �������� ���� ������ ó�� 
-- varchar2(n) : 4000 byte �������� ���� ������ ó�� 

-- 1-2) ���� (������ , �Ǽ���) 
-- int , float , long, double : �������� ���� ������ ó�� 
-- number(n) , number(p,s) : (p�� ��ü�ڸ��� s�� �Ҽ��� ���� �ڸ���) �������� ���� ������ ó�� 

-- 1-3) date : ��, ��, ��, �ð�, ��

-- 2. DDL, DML
-- 2-1) DDL (Data Definition Language : ������ ���Ǿ�) : ���̺� ���� �� ���� 
--  1) ���̺� ���� : ���� ) create table ���̺�� (�÷��� ������Ÿ��)

CREATE TABLE abc (
 bunho NUMBER(4),
 irum VARCHAR2(20),
 ki NUMBER (5,1)
);

CREATE TABLE su (
 su1 NUMBER(2), 
 bunho VARCHAR2(3), 
 su2 NUMBER(2)
 );

CREATE TABLE addr (
 irum VARCHAR2(15),
 phone VARCHAR2(15),
 address VARCHAR2(50),
 email VARCHAR2 (15)
); 

-- ���� �������ִ� db (java) �ȿ��ִ� ���̺��� ������
SELECT *
FROM tab;

-- 2) ���̺� ���� 
DROP TABLE addr;    -- ���������� �Ѿ��
FLASHBACK TABLE addr TO BEFORE DROP;  -- �ǻ츮�� 
DROP TABLE su;
DROP TABLE abc;
PURGE RECYCLEBIN; -- ������ ����
DROP TABLE addr PURGE;  -- �����뿡 �����ʰ� ����

-- 3) ���̺� ���� ���� : �ʵ�(�÷�)�� ���� �߰�, ���� , ����  *�߿�*
ALTER TABLE addr ADD (tel VARCHAR2(15));   -- �߰� (���� ����)
SELECT * FROM addr;

ALTER TABLE addr MODIFY (tel VARCHAR2(30));  -- ������ Ÿ�� ���� 
ALTER TABLE addr RENAME COLUMN tel TO telphone; -- �÷��� ����
ALTER TABLE addr DROP COLUMN telphone;  -- �÷��� ����

-- 2-2) DML (Data Manipulation Language : ������ ���۾�)  : ���ڵ� �߰�, ����, ����, �˻�  

SELECT * FROM abc;

-- 1) insert : ����) insert into  ���̺��(�÷���) values(��, ��..)
INSERT INTO abc VALUES(1, 'ȫ�浿', 180);
INSERT INTO abc VALUES(2, '�̿���', 168.8);
INSERT INTO abc VALUES(3, '���ټ�', 166);
INSERT INTO abc VALUES(4, '���μ�', 177.9);
INSERT INTO abc VALUES(5, '������', 199.9);

INSERT INTO abc VALUES (5, 170.5);  -- error
INSERT INTO abc(bunho, ki) VALUES(6, 177.8);
INSERT INTO abc(bunho, irum,ki) VALUES(7 , '������', 170.2);

-- 2) update : ����) update ���̺�� set �÷���=������ �� where ������
UPDATE abc SET ki = 185.5 WHERE bunho=1;
UPDATE abc SET bunho = 7777 WHERE irum = '���ټ�';
UPDATE abc SET irum='������' , ki = '170' WHERE bunho =2;
UPDATE abc SET irum='���ټ�' ;  -- where�� ������ ������ ��ü ���� 

-- 3) delete : ����) delete from ���̺�� where ������
DELETE FROM abc WHERE bunho = 1;
DELETE FROM abc WHERE ki > 180;
DELETE FROM abc;   -- where�� ������ ������ ��ü ����

CREATE TABLE sungjuk(
  bunho NUMBER(2),
  irum VARCHAR2(20),
  kor NUMBER(3),
  eng NUMBER(3),
  mat NUMBER(3),
  total NUMBER(3),
  average NUMBER(5,1)
);

select * from sungjuk;

INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (1, '���ټ�' , 100, 100, 100);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (2, '���μ�' , 78, 59, 93);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (3, '������' , 45, 100, 98);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (4, '������' , 84, 79, 43);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (5, '������' , 94, 99, 83);

UPDATE sungjuk SET total = kor+eng+mat;
UPDATE sungjuk SET average = total/3;

-- ��¥ ���̺� �ۼ�
CREATE TABLE today (
  bunho NUMBER(3),
  irum VARCHAR2(20),
  day1 DATE,
  dat2 TIMESTAMP
);

SELECT * FROM today;

INSERT INTO today VALUES(1, 'ȫ�浿', SYSDATE, SYSTIMESTAMP);
INSERT INTO today (bunho, irum, day1) VALUES (2, '���μ�' , '1980-12-25');

-- 3. �������� : ����Ŭ���� �����ϴ� ������ ���Ἲ ��������
-- not null : �ش� �÷������� null�� ������� ���� 
-- unique : �ش� ���̺� ������ �׻� ���Ϲ����� �� (�ߺ����� ������)
-- primary key : �ش� �÷� ���� �ݵ�� �����ؾ� �ϰ� �����ؾ� �Ѵٴ� ����
--                   primary key = not null + unique 
-- foreign key
-- check : �������� ������ ���� �Է��� ���

CREATE TABLE TEST( 
  one NUMBER(3),
  two NUMBER(3) NOT NULL,
  three NUMBER(3) UNIQUE -- �ߺ��� ��� x
);

SELECT *
FROM TEST;

INSERT INTO TEST VALUES(1, 1, 1);
INSERT INTO TEST (two, three) VALUES (2, 2);
INSERT INTO TEST (one, three) VALUES (3, 3);  -- error : two�� null ���� ������� ����
INSERT INTO TEST (one, two) VALUES (3, 3); -- unique�� null�� ���� ����
INSERT INTO TEST VALUES (1, 1, 1);  -- error : unique�� �ߺ��� �ȵ�

CREATE TABLE exam(
  one NUMBER(3) PRIMARY KEY,
  age NUMBER(3),
  two NUMBER(1),
  CHECK (age BETWEEN 1 AND 120),
  CHECK (two IN(1, 2))
);

SELECT * 
FROM exam;

INSERT INTO exam VALUES (77, 23, 1);
INSERT INTO exam VALUES (77, 23, 1); -- error primaey key �ߺ����� ��� ���� 
INSERT INTO exam VALUES (88, 23, 1);
INSERT INTO exam(one) VALUES (99);
INSERT INTO exam(age, two) VALUES (24, 2);  -- error primary key�� null���� ��� ���� 
INSERT INTO exam VALUES (66, 25, 3);  -- error check two
INSERT INTO exam VALUES(66, 125, 1);  -- error check one

-- 4. sequence : ���̺��� ������ ���ڸ� �ڵ����� �����ϴ� �ڵ���ȣ �߻����̴�.
CREATE TABLE msg(
  num NUMBER(2) PRIMARY KEY,
  message VARCHAR2(20) NOT NULL
);

-- ����
CREATE SEQUENCE msg_num_sql --  ���̺��_�÷���_�ĺ���
START WITH 10   -- ���۹�ȣ
INCREMENT BY 5;  -- ����

-- ����
DROP SEQUENCE msg_num_sql;

-- �߰�
INSERT INTO msg VALUES(mgs_num_sql.nextval, '�ȳ��ϼ���');
INSERT INTO msg VALUES(msg_num_sql.nextval, '�ݰ����ϴ�');
INSERT INTO msg VALUES(msg_num_sql.nextval, '����Ŵϴ�');

SELECT * FROM msg;

CREATE TABLE friend (
  num NUMBER(2) PRIMARY KEY,
  irum VARCHAR(20) NOT NULL,
  phone VARCHAR(20) NOT NULL
);

CREATE SEQUENCE friend_num_seq
START WITH 1
INCREMENT BY 1;

SELECT * 
FROM friend;

CREATE TABLE person(
  num NUMBER(3),
  irum VARCHAR2(20),
  phone VARCHAR2(20),
  jumin VARCHAR2(20),
  city VARCHAR2(15),
  birthday DATE
);

CREATE SEQUENCE person_num_seq
START WITH 1
INCREMENT BY 1;

CREATE TABLE bank(
  num NUMBER(2) ,   -- �ڵ�������ȣ
  ID VARCHAR2(10),    -- ���¹�ȣ
  NAME VARCHAR2(10),  -- �̸�
  balance NUMBER(8),    -- �ܾ�
  PRIMARY KEY(num)   
);

CREATE SEQUENCE bank_num_sql
START WITH 1
INCREMENT BY 1;

SELECT * 
FROM bank;

CREATE TABLE practice(
  id NUMBER(10),
  NAME VARCHAR2(10),
  kor NUMBER(3),
  eng NUMBER(3),
  mat NUMBER(3),
  PRIMARY KEY (id)
);

DROP TABLE practice;

SELECT *
FROM practice;


CREATE SEQUENCE practice_id_sql
START WITH 20170001
INCREMENT BY 1;

DROP TABLE sungjuk PURGE;

SELECT * FROM tab;

---- ����ǥ

CREATE TABLE sungjuk(
  num NUMBER(4) PRIMARY KEY,
  NAME VARCHAR2(20) NOT NULL, -- �����ϰ� �־��ֱ�
  kor NUMBER(3) NOT NULL,
  eng NUMBER(3) NOT NULL,
  mat NUMBER(3) NOT NULL,
  society NUMBER(3) NOT NULL,                                                                                                                                                                                                                                                                                                                                                                                                                                                      
  history NUMBER(3) NOT NULL,
  music NUMBER(3) NOT NULL,
  art NUMBER(3) NOT NULL,
  PHYSICAL NUMBER(3) NOT NULL,
  total NUMBER(3) DEFAULT 0,
  average NUMBER(5, 2) DEFAULT 0.0
);

SELECT * FROM sungjuk;

CREATE SEQUENCE sungjuk_num_sql
START WITH 1;
-- increment by �Ⱦ��� ����Ʈ ������ 1�� ���� 

INSERT INTO sungjuk(num, NAME, kor, eng, mat, society, history, music, art, PHYSICAL) 
VALUES(sungjuk_num_sql.nextval, '���ټ�', 10, 20, 30, 40, 50, 60, 70, 80);

-- ������Ʈ 
CREATE TABLE population (
 dong NUMBER(10),
 ho NUMBER(10),
 menChild	NUMBER(10),
 womenChild NUMBER(10),
 menTeen	NUMBER(10),
 womenTeen NUMBER(10),
 menAdult NUMBER(10),
 womenAdult NUMBER(10),
 menMid NUMBER(10),
 womenMid NUMBER(10),
 menMidOld	 NUMBER(10),
 womenMidOld NUMBER(10),
 menOld	NUMBER(10),
 womenOld NUMBER(10),
 menTotal NUMBER(10),
 womenTotal NUMBER(10),
 total NUMBER(10),
 average NUMBER(10)
);

SELECT * 
FROM population;

UPDATE population SET mentotal = menchild+menteen+menadult+menmid+menmidold+menold;
UPDATE population SET womentotal = womenchild+womenteen+womenadult+womenmidold+womenold;
UPDATE population SET total = mentotal+womentotal;
UPDATE population SET average = total/12;

INSERT INTO population (dong , ho , menchild , womenchild , menteen , womenteen , menadult , womenadult , menmid , womenmid , menmidold , womenmidold , menold , womenold)
VALUES (101,10,1,1,1,1,1,1,1,1,1,1,1,1);

INSERT INTO population (dong , ho , menchild , womenchild , menteen , womenteen , menadult , womenadult , menmid , womenmid , menmidold , womenmidold , menold , womenold)
VALUES (3,102,2,2,2,2,2,2,2,2,2,2,2,2);

INSERT INTO population (dong , ho , menchild , womenchild , menteen , womenteen , menadult , womenadult , menmid , womenmid , menmidold , womenmidold , menold , womenold)
VALUES (3,101,0,0,0,0,0,0,0,0,0,0,0,0);

INSERT INTO population (dong , ho , menchild , womenchild , menteen , womenteen , menadult , womenadult , menmid , womenmid , menmidold , womenmidold , menold , womenold)
VALUES (3,103,0,0,0,0,0,0,0,0,0,0,0,0);

SELECT mentotal,womentotal 
FROM population 
ORDER BY dong ASC, ho ASC;

