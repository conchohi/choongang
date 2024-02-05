drop database prod_db;
show databases;
drop database if exists shopdb; -- Ctrl + Enter : 현재 커서 있는 구문만 실행
								-- Ctrl + Shift + Enter : 범위 설정한 부분을 한번에 실행
create database shopdb;
use shopdb;

drop table if exists productTBL;
create table productTBL(
	pcode char(10) not null,
    pname varchar(100) not null, -- 오라클 : varchar2(100)
    price int not null, -- 오라클 : number, number(크기), int
    region varchar(100) not null,
    primary key(pcode) -- 밑에서 primary key 정의 가능
);

select * from productTBL;

drop table if exists porderTBL;

create table porderTBL(
	orderid int not null primary key,
    dataOrder date not null,
    pcode char(10), -- foreign key (외래키) 설정
	custid char(5), -- foreign key (외래키) 설정
    amount int not null,
    foreign key(pcode) references productTBL(pcode) -- 제약조건명은 알아서 설정됨
   --  constraint pcode_FK foreign key(pcode) references productTBL(pcode)
);

select * from porderTBL;

drop table if exists customerTBL;

create table customerTBL(
	custid char(5) not null primary key,
    cname varchar(100) not null,
    gender char(4),
    address varchar(100) not null,
    phone char(20)
);

select * from customerTBL;

-- 제약 조건 추가 - custid 에 외래키 제약 설정
alter table porderTBL 
			add constraint custid_FK foreign key(custid) 
            references customerTBL(custid) 
            on delete cascade; -- 부모가 삭제되면 자식도 함꼐 삭제
		 -- on delete set null; -- null로 채우기

-- 자료 삽입 테이블명 (컬럼명, ... ) 
insert into productTBL(pcode, pname, price, region)
				--    (값, ... ) 		컬럼명 개수와 값의 개수와 위치가 일치해야 함
				values('ba123','바나나',2300,'필리핀');
insert into productTBL values('ap231','사과',1000,'대구');

select * from productTBL;

commit; -- mysql은 자동 커밋 기능 있음, 오라클은 반드시 commit; 해야 함