
drop database if exists jointestdb;
create database jointestdb;
use jointestdb;
-- drop table customertbl;
create table customertbl( 
   custid char(5) not null primary key,
    cname varchar(100) not null,
    gender char(4),
    address varchar(100),
    phone varchar(20)
);
select * from customertbl;
insert into customertbl(custid, cname,gender,address,phone)
values('c1', '김미연','여','서울 관악','010-123-4567');
insert into customertbl values('c2','박보검','남','서울 송파','010-456-7890');
insert into customertbl values('c3','이승기','남','서울 동작', null);
insert into customertbl values('c4','정애란','여','서울 관악','010-134-4568');
insert into customertbl values('c5','윤태화','여','서울 동작','010-456-4569');
insert into customertbl values('c6','김태연','남','서울 송파', null);
insert into customertbl values('c7','최미경','여','서울 강남','010-284-4571');
insert into customertbl values('c8','이미란','여','서울 강남', null);
insert into customertbl values('c9','박지성','남','서울 관악','010-444-4573');
insert into customertbl values('c10','박세리','여','서울 송파',null);

select count(*) from customertbl;
-- drop table productTbl;
create table productTBL(  -- 부모2,   pordertbl테이블에서 참고할 것이라서
   pcode char(10) not null primary key,
    pname varchar(100) not null,
    price int not null,
    region varchar(100) not null
);
select * from productTBL;
select pcode, pname, price, region from productTBL;
-- 테이블에 데이터 입력 (삽입, insert 물건 담기, 책 꽂기)
-- insert into 테이블명(컬럼명, 컬럼명,....) values(값1, 값2,...);
insert into productTBL(pcode, pname, price, region) values('ba123','바나나',2300,'필리핀');
insert into productTBL(pcode, pname, price, region)  values('ap231','사과',1000,'대구');
insert into productTBL(pcode, pname, price, region)  values('or321','오렌지',500,'필라델피아');
insert into productTBL(pcode, pname, price, region)  values('st341','딸기',700,'논산');
insert into productTBL(pcode, pname, price, region)  values('ma456','망고',1500,'베트남');

-- drop table pordertbl;
create table pordertbl(  -- 자식, 외래키 설정하기 때문에 부모가 있어야 설정 가능
   orderid int auto_increment not null primary key ,
    orderdate date ,
    pcode char(10) not null,
    custid char(5) not null,
    amount smallint,
   foreign key(pcode) references productTBL(pcode),
    foreign key(custid) references customertbl(custid)
);

select * from pordertbl;
insert into pordertbl(orderdate, pcode, custid, amount) values(curdate(), 'ba123', 'c1', 30);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-1', 'ap231', 'c2', 45);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-03','or321','c1',67);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-25','st341','c2',34);
insert into pordertbl(orderdate, pcode, custid, amount) values(curdate(),'ma456','c1',30);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-11','ba123','c3',21);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-20','ap231','c4',57);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-03','or321','c5',59);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-06','st341','c2',30);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-06','ma456','c6',50);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-06','ba123','c5',45);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-07','ap231','c7',20);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-07','or321','c6',15);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-07','st341','c8',50);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-27','ma456','c9',30);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-27','ba123','c3',35);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-28','ap231','c4',23);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-28','ba123','c5',56);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-01','ap231','c2',8);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-01','ma456','c6',27);
insert into pordertbl(orderdate, pcode, custid, amount) values('2024-01-15','ba123','c8',3);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-02','ap231','c1',45);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-02','or321','c3',9);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-07','st341','c5',23);
insert into pordertbl(orderdate, pcode, custid, amount) values('2023-12-08','ma456','c7',10);

select * from pordertbl;
select * from producttbl;
select * from customertbl;
commit;