-- 주석
/* 여러줄 주석 */
-- 1.shopDB, 대소문자 구분 하지 않음
	-- create 객체종류 객체이름 : 생성
	-- CREATE DATABASE db명;
create database shopDB; -- shopDB 라는 데이터베이스 생성
	-- DB안으로 들어오기(열기) 
    -- 1. DB명 더블클릭, 볼드체로 
    -- 2. USE shopDB
use shopDB;
-- 2. 테이블 생성
	/* create table 테이블명(
		속성명 타입 제약조건,
        속성명 타입 제약조건
    );
    */
create table memberTBL(
	id		int		not null,
    name	char(20) 	not null,
    email	varchar(30)
);

select * from membertbl;

insert into membertbl(id,name,email) values(123,"홍길동","aa@a.com");

drop table membertbl;

drop database shopdb;

create table product(
	productNum int primary key,
    name char(20) not null,
    color char(20),
    price int not null
);

insert into product values(1, "신발", "검정", 99000);

select * from product;

