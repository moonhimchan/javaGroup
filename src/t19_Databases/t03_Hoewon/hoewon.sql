show tables;

create table hoewon (
  idx		  int  			  not null  auto_increment primary key,	/* 고유번호 */
  name    varchar(30)  not null,				/* 이름 */
  age     int   			  default 20,			/* 나이 */
  gender  char(2)			  default '여자',		/* 성별 */
  joinday datetime		  default now(),	/* 생년월일(yyyy-MM-dd) */
  address varchar(20)
);

desc hoewon;
drop table hoewon;
-- delete from hoewon;

insert into hoewon (name, age, gender, address) values ('홍길동',23,'남자','서울');		-- 레코드 삽입
insert into hoewon values (default,'김말숙',30,'여자',default,'청주');
insert into hoewon values (default,'오하늘',default,default,default,'');
insert into hoewon (name) values ('이사랑');
insert into hoewon values (default,'가나다',30,'여자','2000-1-5','청주');
insert into hoewon values (default,'아톰',35,'남자','1999-10-25','제주');
insert into hoewon values (default,'강감찬',42,'남자','2005-05-07','인천');
insert into hoewon values (default,'이사랑',21,'여자','2020-5-2','서울');
insert into hoewon values (default,'강소연',19,'여자',default,'청주');
insert into hoewon values (default,'고릴라',38,'여자','2024-4-3','제주');
insert into hoewon values (default,'김감자',41,'남자','2022-10-10','서울');
insert into hoewon values (default,'이자바',39,'남자',default,'청주');
insert into hoewon values (default,'오로지',40,'여자','2022-02-2','청주');
insert into hoewon values (default,'김자월',30,'여자',default,'제주');
insert into hoewon values (default,'오자월',22,'여자','2023-3-1','제주');
insert into hoewon values (default,'오이자월',29,'여자',default,'청주');
insert into hoewon values (default,'김자월화',36,'여자','2021-6-30','청주');

select * from hoewon;