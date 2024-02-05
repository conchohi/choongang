-- 데이터베이스 구축 순서
-- 요구사항 수집/분석 -> 설계 (개념적 모델링 -> 논리적 모델링 -> 물리적 모델링) -> 데이터베이스 구현

-- 1. 데이터베이스 생성
drop database if exists prod_db; -- 만약 prod_db가 있으면 삭제
create database prod_db;
show databases; -- 데이터베이스의 이름들 보여줌
show tables; -- 사용중인 db의 테이블 보여줌


-- 2. db 접속 
use prod_db;

-- 3. order 테이블 생성
-- drop table orderTBL; -- 테이블 삭제
drop table if exists orderTBL; -- 있으면 테이블 삭제, 없으면 그대로
create table orderTBL(
	orderid int primary key,
    dateOrder date not null,
    pcode char(10), -- 생략시 null 값 허용
    custid char(10),
    amount int not null,
    -- 외래키 설정
	Foreign key(pcode) references productTBL(pcode),
	Foreign key(custid) references customerTBL(custid)
);

-- 테이블 내용 확인
select * from orderTBL;

-- 4. product 테이블 생성
create table productTBL(
	pcode char(10) primary key, -- 중복 x, null 값 x
    pname varchar(100) not null,
    price int not null,
    region varchar(100) not null
);

insert into productTBL values("ba123","바나나",2300,"필리핀");
insert into productTBL values("ap231","사과",1000,"대구");
insert into productTBL values("or321","오렌지",500,"필라델피아");
insert into productTBL values("st341","딸기",700,"논산");
insert into productTBL values("ma456","망고",1500,"베트남");

select * from productTBL;
-- 5. customer 테이블 생성
drop table if exists customerTBL;
create table customerTBL(
	custid char(5) primary key,
    cname varchar(100) not null,
    gender char(4),
    address varchar(100),
    phone varchar(20)
);

insert into customerTBL values("c1","김미연","여","서울 관악", "010-123-4567");
insert into customerTBL values("c2","박보검","남","서울 송파", "010-456-7890");
insert into customerTBL values("c3","이승기","남","서울 동작", "010-234-5678");
insert into customerTBL values("c4","정애란","여","서울 관악", "010-134-4568");
insert into customerTBL values("c5","윤태화","여","서울 동작", "010-456-4569");
insert into customerTBL values("c6","김태연","남","서울 송파", "010-237-4570");
insert into customerTBL values("c7","최미경","여","서울 강남", "010-284-4571");
insert into customerTBL values("c8","이미란","여","서울 강남", "010-333-4567");
insert into customerTBL values("c9","박지성","남","서울 관악", "010-444-4573");
insert into customerTBL(custid,cname,gender,address) values("c10","박세리","여","서울 송파");

select * from customerTBL;




