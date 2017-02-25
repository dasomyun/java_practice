--1 오라클 자료형 

--  1-1) 문자, 문자열 데이터 타입 
-- char(n) : 4000 byte 고정길이 문자 데이터 처리 
-- varchar2(n) : 4000 byte 가변길이 문자 데이터 처리 

-- 1-2) 숫자 (정수형 , 실수형) 
-- int , float , long, double : 고정길이 숫자 데이터 처리 
-- number(n) , number(p,s) : (p는 전체자리수 s는 소수점 이하 자리수) 가변길이 숫자 데이터 처리 

-- 1-3) date : 년, 월, 일, 시간, 분

-- 2. DDL, DML
-- 2-1) DDL (Data Definition Language : 데이터 정의어) : 테이블 생성 및 변경 
--  1) 테이블 생성 : 형식 ) create table 테이블명 (컬럼명 데이터타입)

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

-- 현재 속해져있는 db (java) 안에있는 테이블을 보여줘
SELECT *
FROM tab;

-- 2) 테이블 삭제 
DROP TABLE addr;    -- 휴지통으로 넘어간다
FLASHBACK TABLE addr TO BEFORE DROP;  -- 되살리기 
DROP TABLE su;
DROP TABLE abc;
PURGE RECYCLEBIN; -- 휴지통 비우기
DROP TABLE addr PURGE;  -- 휴지통에 넣지않고 삭제

-- 3) 테이블 구조 변경 : 필드(컬럼)에 관한 추가, 삭제 , 변경  *중요*
ALTER TABLE addr ADD (tel VARCHAR2(15));   -- 추가 (끝에 붙음)
SELECT * FROM addr;

ALTER TABLE addr MODIFY (tel VARCHAR2(30));  -- 데이터 타입 변경 
ALTER TABLE addr RENAME COLUMN tel TO telphone; -- 컬럼명 변경
ALTER TABLE addr DROP COLUMN telphone;  -- 컬럼명 삭제

-- 2-2) DML (Data Manipulation Language : 데이터 조작어)  : 레코드 추가, 삭제, 수정, 검색  

SELECT * FROM abc;

-- 1) insert : 형식) insert into  테이블명(컬럼명) values(값, 값..)
INSERT INTO abc VALUES(1, '홍길동', 180);
INSERT INTO abc VALUES(2, '이영자', 168.8);
INSERT INTO abc VALUES(3, '윤다솜', 166);
INSERT INTO abc VALUES(4, '조인성', 177.9);
INSERT INTO abc VALUES(5, '강동원', 199.9);

INSERT INTO abc VALUES (5, 170.5);  -- error
INSERT INTO abc(bunho, ki) VALUES(6, 177.8);
INSERT INTO abc(bunho, irum,ki) VALUES(7 , '전지현', 170.2);

-- 2) update : 형식) update 테이블명 set 컬럼명=변경할 값 where 조건절
UPDATE abc SET ki = 185.5 WHERE bunho=1;
UPDATE abc SET bunho = 7777 WHERE irum = '윤다솜';
UPDATE abc SET irum='김태희' , ki = '170' WHERE bunho =2;
UPDATE abc SET irum='윤다솜' ;  -- where을 써주지 않으면 전체 변경 

-- 3) delete : 형식) delete from 테이블명 where 조건절
DELETE FROM abc WHERE bunho = 1;
DELETE FROM abc WHERE ki > 180;
DELETE FROM abc;   -- where을 써주지 않으면 전체 삭제

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

INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (1, '윤다솜' , 100, 100, 100);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (2, '조인성' , 78, 59, 93);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (3, '전지현' , 45, 100, 98);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (4, '김태희' , 84, 79, 43);
INSERT INTO sungjuk(bunho, irum, kor, eng, mat) VALUES (5, '강동원' , 94, 99, 83);

UPDATE sungjuk SET total = kor+eng+mat;
UPDATE sungjuk SET average = total/3;

-- 날짜 테이블 작성
CREATE TABLE today (
  bunho NUMBER(3),
  irum VARCHAR2(20),
  day1 DATE,
  dat2 TIMESTAMP
);

SELECT * FROM today;

INSERT INTO today VALUES(1, '홍길동', SYSDATE, SYSTIMESTAMP);
INSERT INTO today (bunho, irum, day1) VALUES (2, '조인성' , '1980-12-25');

-- 3. 제약조건 : 오라클에서 제공하는 데이터 무결성 제약조건
-- not null : 해당 컬럼값으로 null을 허용하지 않음 
-- unique : 해당 테이블 내에서 항상 유일무일한 값 (중복값을 허용안함)
-- primary key : 해당 컬럼 값은 반드시 존재해야 하고 유일해야 한다는 조건
--                   primary key = not null + unique 
-- foreign key
-- check : 조건으로 설정된 값만 입력을 허용

CREATE TABLE TEST( 
  one NUMBER(3),
  two NUMBER(3) NOT NULL,
  three NUMBER(3) UNIQUE -- 중복값 허용 x
);

SELECT *
FROM TEST;

INSERT INTO TEST VALUES(1, 1, 1);
INSERT INTO TEST (two, three) VALUES (2, 2);
INSERT INTO TEST (one, three) VALUES (3, 3);  -- error : two는 null 값을 허용하지 않음
INSERT INTO TEST (one, two) VALUES (3, 3); -- unique는 null과 관련 없음
INSERT INTO TEST VALUES (1, 1, 1);  -- error : unique는 중복값 안됨

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
INSERT INTO exam VALUES (77, 23, 1); -- error primaey key 중복값을 허용 안함 
INSERT INTO exam VALUES (88, 23, 1);
INSERT INTO exam(one) VALUES (99);
INSERT INTO exam(age, two) VALUES (24, 2);  -- error primary key는 null값을 허용 안함 
INSERT INTO exam VALUES (66, 25, 3);  -- error check two
INSERT INTO exam VALUES(66, 125, 1);  -- error check one

-- 4. sequence : 테이블내의 유일한 숫자를 자동으로 생성하는 자동번호 발생기이다.
CREATE TABLE msg(
  num NUMBER(2) PRIMARY KEY,
  message VARCHAR2(20) NOT NULL
);

-- 생성
CREATE SEQUENCE msg_num_sql --  테이블명_컬럼명_식별자
START WITH 10   -- 시작번호
INCREMENT BY 5;  -- 증가

-- 삭제
DROP SEQUENCE msg_num_sql;

-- 추가
INSERT INTO msg VALUES(mgs_num_sql.nextval, '안녕하세요');
INSERT INTO msg VALUES(msg_num_sql.nextval, '반갑습니다');
INSERT INTO msg VALUES(msg_num_sql.nextval, '배고픕니다');

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
  num NUMBER(2) ,   -- 자동증가번호
  ID VARCHAR2(10),    -- 계좌번호
  NAME VARCHAR2(10),  -- 이름
  balance NUMBER(8),    -- 잔액
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

---- 성적표

CREATE TABLE sungjuk(
  num NUMBER(4) PRIMARY KEY,
  NAME VARCHAR2(20) NOT NULL, -- 낭낭하게 넣어주기
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
-- increment by 안쓰면 디폴트 값으로 1씩 증가 

INSERT INTO sungjuk(num, NAME, kor, eng, mat, society, history, music, art, PHYSICAL) 
VALUES(sungjuk_num_sql.nextval, '윤다솜', 10, 20, 30, 40, 50, 60, 70, 80);

-- 프로젝트 
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

