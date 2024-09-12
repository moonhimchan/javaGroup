-- sql 주석
show tables; --테이블 보여주기(DDL)

create table test (
	name    varchar(30) not null,    /*성명*/
	age     int default 20,          /*나이*/
	gender  char(2) default '여자',   /*성별*/
	address varchar(10)              /*주소*/
);

desc test;    --생성된 테이블의 구조보기

drop table test;  --테이블 삭제처리
delete from test; /*test테이블의 모든 레코드를 삭제 알맹이만 지운다.*/

--DML
insert into test (name, age, gender, address) values ('홍길동',23,'남자','서울');  --레코드 삽입
insert into test values ('김말숙',30,'여자','청주');  
insert into test values ('오하늘',default,default,'');  
insert into test (name) values ('이사랑');  
insert into test values ('가나다',30,'여자','청주');  
insert into test values ('아톰',35,'남자','제주');  
insert into test values ('강감찬',42,'남자','인천');  
insert into test values ('이사랑',21,'여자','서울');  
insert into test values ('강소연',19,'여자','제주');  
insert into test values ('고릴라',38,'여자','청주');  
insert into test values ('김감자',41,'남자','서울');  
insert into test values ('이자바',39,'남자','청주');  
insert into test values ('오로지',40,'여자','청주');  
insert into test values ('김자월',30,'여자','제주');  
insert into test values ('오자월',22,'여자','제주'); 
insert into test values ('오이자월',29,'여자','제주'); 
insert into test values ('김자월화',36,'여자','청주');  

update test set age=35 where name='김말숙';
update test set address='제주' where name='김말숙';


select * from test;  /*테이블의 내용 확인하기*/

-- 서울에 사는 사람들 조회 
select * from test where address='서울';

-- 남자만 출력
select * from test where gender='남자';

-- 나이가 35세 이상만 출력
select * from test where age >= 35;	

-- 남자이면서 서울에 사는 사람
select * from test where gender='남자' and address='서울';

-- 25세 이상인 여자.
select * from test where age>=25 and gender='여자';

-- 서울에 살거나 청주에 거주하는 사람?
select * from test where address='서울' or address='청주';

-- 여자중에서 서울에 살거나 청주에 거주하는 사람?
select * from test where (address='서울' or address='청주') and gender='여자';

-- 여자 20대중에서 서울에 살거나 청주에 거주하는 사람?
select * from test where (address='서울' or address='청주') and gender='여자'and (age>=20 and age<30);

-- 30대 를 출력하세요?
select * from test where age>=30 and age<40;
select * from test where age between 30 and 39; 

-- 서울/청주에 거주하는?
select * from test where address='서울' or address='청주';
select * from test where address in ('서울','청주');
select * from test where address in ('서','주');

-- 성이 '김'씨만 출력?
select * from test where name like '김%';

-- 이름중에서 '자'로 긑나는 사람만 출력?
select * from test where name like '%자';

-- 이름중에서 '자'를 포함하는 사람들 모두 출력?
select * from test where name like '%자%';

-- 이름중에서 두번째 글자가 '자'를 포함하는 사람들 모두 출력?
select * from test where name like '_자%';

-- 서울이나 제주에 사는 사람들의 나이를 1살씩 증가시켜주세요?
update test set age = age + 1 where address = '서울' or address = '청주';
update test set age = age + 1 where address = in ('서울','청주');

-- 모든 사람들의 나이를 1살씩 증가시켜주시오.
update test set age = age - 1;

-- 청주에 사는 남자들을 삭제처리하시오.
delete from test where address='청주' and gender='남자';
select * from test where address='청주' and gender='남자';

-- 서울 사는 사람들의 '성명/나이/성별'만 출력하시오.
select name,age,gender from test where address='서울';

-- 이름순으로 오름차순 출력하세요.
select * from test order by name;
select * from test order by name desc;

-- 나이 내림차순으로 출력하되, 나이가 같으면 이름 오름차순으로 출력하세요.
select * from test order by age desc, name;
