-- 오라클 주요 함수들
-- dual 테이블 : from 절에는 테이블을 생략 할 수 없다. 연산결과를 한 줄에 얻어오기 위해서, 오라클에서 제공하는 테이블  즉 기술할 테이블이 없는 경우 사용
SELECT SYSDATE FROM dual;

SELECT 10+20 AS "덧셈" , 10-20 AS "뺼셈"
FROM dual;

-- 1. 숫자 함수
-- 1-1 ) ROUND 반올림 함수 : 숫자가 양수이면 소수점 아래 , 음수이면 소수점 위를 의미
SELECT round(1234.567) 반올림 , round(1234.567 , 1) 반올림 , round(1234.567 , 2) 반올림 , round(1234.567 , -1) 반올림 , round(1235.567 , -1) 반올림 , round(1235.567 , -2) 반올림
FROM dual;

-- 1-2 ) TRUNC 버림 함수 , 사용법은 ROUND와 유사 
SELECT trunc(1234.567) 버림, trunc(1234.567 , 1) 버림 , trunc(12345.567 , -1) 버림 
FROM dual;

-- 1-3 ) SIGN 음수 -1, 양수 1, 0은 0 반환 
SELECT sign(-10) , sign(20), sign(0)
FROM dual;

-- 1-4 ) MOD 주어진 숫자를 지정된 숫자로 나눈 나머지 값
SELECT mod(1,3), mod(2,3), mod(3,3), mod(4,3)
FROM dual;

-- 1-5 ) POWER 주어진 숫자의 지정된 수만큼 제곱을 한 값을 반환
SELECT POWER(2,10) , POWER(3,3)
FROM dual;

-- 1-6 ) SQRT 제곱근을 반환 
SELECT round(sqrt(2),5), round(sqrt(5),5)
FROM dual;

-- 1-7 ) ABS : 절대값
SELECT abs(10), abs(-10), abs(-10.123)
FROM dual;

-- 2. 문자 함수 
-- 2-1 ) UPPER 대문자로 변환하는 함수
SELECT upper('Welcome to Oracle 10g') 
FROM dual;

SELECT upper(first_name), first_name
FROM employees;

-- 2-2) LOWER 소문자로 변환하는 함수
SELECT lower('Welcome to Oracle 10g')
FROM dual;

SELECT lower(first_name), first_name
FROM employees;

-- 2-3) INITCAP 첫글자만 대문자로 변환시킨다.  -- 많이 사용 
SELECT initcap('welcome to oracle 10g') 
FROM dual;

SELECT initcap('yun dasom')
FROM dual;

-- 2-4) LENGTH 문자열의 길이를 알려준다. ( 글자의 개수 ) -- 공백 포함  , 오라클은 한글문자가 3byte
SELECT LENGTH('Welcome to Oracle 10g') , length('오 라클') 
FROM dual;

SELECT first_name , LENGTH(first_name)
FROM employees;

-- 2-5) 문자 조작 함수
-- 1) INSTR 특정문자의 위치를 알려준다. (시작위치는 1부터~~)
SELECT instr('Welcome to Oracle 10g' , 'o') 
FROM dual;

SELECT first_name , instr(first_name, 'a')
FROM employees
WHERE first_name LIKE '%a%';

-- 형식) INSTR ('문자열 또는 컬럼' , '찾는 글자', 시작위치 , 몇번째인지)  -- 많이 사용 
SELECT instr('Welcome to Oracle 10g' , 'o', 3, 2)
FROM dual;

SELECT instr('데이터베이스', '베' , 1, 1) , instrb('데이터베이스', '베' ,1,1) -- 한글 : 3byte 베: 10~13 
FROM dual;

-- 2) SUBSTR : 문자 개수만큼 문자를 추출한다. (시작위치 1부터~) -- 많이 사용 
-- 형식 : SUBSTR ('문자열 또는 컬럼' 시작위치, 추출할 개수)
SELECT substr('Welcome to Oracle 10g', 4, 3)
FROM dual;

SELECT substr('Welcome to Oracle 10g' , -3,2)
FROM dual;

-- SUBSTRB
SELECT substrb('Welcome to Oracle 10g' , 4 , 3)
FROM dual;

SELECT substr('오라클 입니다', 2, 2)
FROM dual;

SELECT substrb('오라클 입니다', 4, 6)
FROM dual;

-- 3) LPAD 오른쪽 정렬 후 왼쪽에 생긴 빈 공백을 특정문자로 채운다.
SELECT lpad('Oracle 10g', 20, '#') -- 20자리를 마련한 후 오른쪽부터 채워짐
FROM dual;

-- RPAD 왼쪽 정렬 후 오른쪽에 생긴 빈 공백에 특정 문자를 채운다.
SELECT rpad('Oracle 10g', 20 , '#') -- 20자리를 마련한 후 왼쪽부터 채워짐
FROM dual;

-- 4) LTRIM : 왼쪽에 특정 문자를 삭제한다.
SELECT ltrim('aaa Oracle 10g aaa' , 'a')
FROM dual;

SELECT ltrim('      Oracle 10g        ') , ('         Oracle 10g          ')
FROM dual;

-- RTRIM : 오른쪽 특정 문자를 삭제한다.
SELECT rtrim('aaa Oracle 10g aaa', 'a') 
FROM dual;

SELECT rtrim('         Oracle 10g          ') , ('         Oracle 10g          ')
FROM dual;

-- TRIM : 앞뒤에서 특정 문자를 삭제한다. -- 공백 제거할때 많이 사용 
SELECT trim('a' FROM 'aaa Oracle 10g aaa')
FROM dual;

SELECT trim( ' ' FROM '           Oracle 10g          ') 
FROM dual;

-- ASCII : 문자를 ASCII 코드로
SELECT ascii('A') 
FROM dual;

-- CHR : ASCII를 문자로
SELECT chr(65) 
FROM dual;

-- 3. 날짜 함수 : DATE형에서 사용하는 함수이며 결과 값으로 날짜 또는 기간을 얻는다. 주로 일단위, 월단위 계산
-- 3-1 ) 날짜 연산 : 더하기나 빼기와 같은 연산을 할 수 있다.

SELECT SYSDATE, SYSDATE+1, SYSDATE-1 -- 오늘날짜, 내일날짜, 어제날짜
FROM dual;

-- 사원들의 근무 일수 출력 -- 많이사용
SELECT employee_id 사원번호, hire_date 입사년도, trunc(SYSDATE-hire_date) 근무일수
FROM employees;

-- 3-2) MONTH_BETWEEN 개월 수를 구하는 함수
-- 사원들의 근무 개월
SELECT employee_id, hire_date, trunc(SYSDATE-hire_date) 근무일수, trunc(months_between(SYSDATE, hire_date)) 근무개월 , trunc(months_between(SYSDATE, hire_date)/12) 근무년수
FROM employees;

-- 3-3) ADD_MONTHS 특정 개월 수를 더한 날짜를 구하는 함수 -- 많이사용
SELECT employee_id, hire_date, add_months(hire_date, 6) 개월수추가
FROM employees;

-- 3-4) LAST_DAY 주어진 날짜가 속한 달의 가장 마지막 날짜를 구하는 함수
SELECT employee_id, hire_date ,last_day(hire_date) 입사한달의마지막날짜, last_day(sysdate) 이달의마지막날짜
FROM employees;

-- 3-5) NEXT-DAY 주어진 날짜를 기준으로 돌아오는 가장 최근요일
SELECT employee_id , next_day(hire_date,'금') 금요일, next_day(SYSDATE, '금') 돌아오는금요일 , next_day(sysdate ,'월') 월요일금요일
FROM employees;

SELECT employee_id, hire_date, add_months(hire_date, 7), next_day(add_months(hire_date, 7),'월') 돌아오는월요일, add_months(SYSDATE, 1), next_day(add_months(sysdate,1),'수') 돌아오는수요일
FROM employees;

-- 4. 형변환 함수 : 숫자(정수, 실수) , 문자(문자, 문자열) , 날짜

-- 숫자나 날짜를 문자형으로 변환
-- 4-1) TO_CHAR : 날짜를 문자로 바꾸기
SELECT SYSDATE 오늘날짜, to_char(SYSDATE, 'YY/MM/DD') 날짜1, to_char(SYSDATE,'YYYY.MM.DD') 날짜2, 
to_char(SYSDATE, 'Month DD, YYYY') 날짜3 , to_char(SYSDATE, 'DY DD MON YY') 날짜4 , to_char(SYSDATE,'Day Mon dd') 날짜5, to_char(SYSDATE, 'YYYY"년" MM"월" DD"일" DY') 날짜6 -- 날짜3: Junuary, Fabuary 날짜4: jun , fab, 날짜5 : Day : Sunday
FROM dual;

SELECT  employee_id, hire_date, to_char(hire_date, 'MM') 월, to_char(hire_date, 'YYYY') 년도
FROM employees;

-- 3월에 입사한 사람만 출력 
SELECT employee_id, hire_date
FROM employees
WHERE to_char(hire_date,'MM')=03;

-- 2000년 이후에 입사한 사원 출력 -- 시험문제에 많이 나옴
SELECT employee_id, hire_date
FROM employees
WHERE to_char(hire_date, 'YYYY') >= 2000;

-- 4-2) TO_CHAR : 숫자를 문자로 형변환
SELECT to_char(1234, '9999') 숫자1, 
           to_char(1234, '9,9999') 숫자2, -- 오른쪽 부터 채워짐
           to_char(1234, '9,999') 숫자3,
           to_char(1234, '0,9999') 숫자4,
           to_char(1234.56, '99,999.999') 숫자5,
           to_char(1234, '$999,999') 숫자6,
           to_char(1234, 'L999,999') 숫자7 -- L : 국가코드에 맞는 화폐단위 표시
FROM dual;

-- 문자형을 숫자로 변환
-- TO_NUMBER : 문자형을 숫자형으로 변환
SELECT 77+to_number('1') 
FROM dual;

-- 문자형을 날짜로 변환 
-- ' ' - 문자
SELECT to_date('2012/01/04','YYYY-MM-DD HH:MI:SS'), to_date('2012/01/01', 'YYYY-MM-DD')
FROM dual;

SELECT trunc(SYSDATE-to_date('1994/03/02','YYYY/MM/DD')) 현재부터일수,
           trunc(months_between(SYSDATE,to_date('2017/01/11', 'YYYY/MM/DD'))) 개월수
FROM dual;

SELECT hire_date
FROM employees
WHERE hire_date >= to_date('2000-04-21' , 'YYYY-MM-DD');

-- 5. 선택을 위한 DECODE 함수
-- 자바의 Switch Case 문 기능과 같음
-- 형식) DECODE (표현식 , 조건1, 결과1, 조건2, 결과2 ... )

SELECT first_name, department_id, decode(department_id-10, 10, '경리과' , 20, '인사과' , 30 , '영업부' , 40, '전산부', '기타둥둥') as depname
FROM employees
ORDER BY 2 ASC;

-- 6. 조건에 따라 서로 다른 처리가 가능한 CASE 함수
-- 자바의 if-else와 유사한 구조. decode함수는 조건일치(=비교연산)하는 경우에 대해서만 적용되는 반면, case함수는 다양한 비교연사자를 이용하여 조건을 제시

SELECT first_name, department_id, CASE WHEN department_id=10 THEN '경리과' 
                                                     WHEN department_id=20 THEN '인사과' 
                                                     WHEN department_id=30 THEN '영업부' 
                                                     WHEN department_id=40 THEN '전산부' 
                                                     ELSE '기타둥둥' END AS depname
FROM employees
ORDER BY 2 ASC;

SELECT first_name, department_id, CASE WHEN department_id>=10 AND department_id<=30 THEN '경리과'
                                                     WHEN department_id>=40 AND department_id<=60 THEN '인사과'
                                                     WHEN department_id>=70 AND department_id<=80 THEN '영업부'
                                                     WHEN department_id>=90 AND department_id<=100 THEN '전산부'
                                                     ELSE '기타등등'
                                                     END AS depname
FROM employees
ORDER BY 2 ASC;

                                                