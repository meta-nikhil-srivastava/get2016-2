CREATE DATABASE library;

USE library;

CREATE TABLE members
(
mem_id VARCHAR(10) PRIMARY KEY, 
mem_name CHAR(50) NOT NULL,
addressLine1 VARCHAR(50),
addressLine2 VARCHAR(50),
category CHAR(1)
);

CREATE TABLE subject
(
sub_id VARCHAR(10)PRIMARY KEY,
sub_name CHAR(20)
);

CREATE TABLE publisher
(
pub_id VARCHAR(10) PRIMARY KEY, 
pub_name CHAR(50)
);

CREATE TABLE author(
aur_id VARCHAR(10) PRIMARY KEY, 
aur_name CHAR(50)
);

CREATE TABLE titles(
tit_id VARCHAR(10) PRIMARY KEY, 
sub_id VARCHAR(10), 
pub_id VARCHAR(10), 
tit_name CHAR(50), 
FOREIGN KEY(sub_id) REFERENCES subject(sub_id), 
FOREIGN KEY(pub_id) REFERENCES publisher(pub_id)
);

CREATE TABLE title_author
(
tit_id VARCHAR(10), 
aur_id VARCHAR(10), 
FOREIGN KEY(tit_id) REFERENCES titles(tit_id),
FOREIGN KEY(aur_id) REFERENCES author(aur_id), 
PRIMARY KEY(tit_id,aur_id)
);

CREATE TABLE books
(
access_no INT(10) PRIMARY KEY, 
tit_id VARCHAR(10), 
pur_date TIMESTAMP, 
price INT(5), 
status CHAR(5), 
FOREIGN KEY(tit_id) REFERENCES titles(tit_id)
);

CREATE TABLE book_issue
(
issue_date TIMESTAMP, 
access_no INT(10), 
mem_id VARCHAR(10), 
due_date TIMESTAMP, 
FOREIGN KEY(access_no) REFERENCES books(access_no), 
CONSTRAINT FK_1 FOREIGN KEY(mem_id) REFERENCES members(mem_id), 
PRIMARY KEY(issue_date, access_no, mem_id)
);

CREATE TABLE book_return
(
return_date TIMESTAMP, 
access_no INT(10), 
mem_id VARCHAR(10), 
issue_date TIMESTAMP, 
FOREIGN KEY(access_no) REFERENCES books(access_no), 
CONSTRAINT FK_2 FOREIGN KEY(mem_id) REFERENCES members(mem_id), 
FOREIGN KEY(issue_date) REFERENCES book_issue(issue_date), 
PRIMARY KEY(return_date, access_no, mem_id)
);

/*
to show all tables
*/
SHOW TABLES;

/*
drop member table by altering book return and book issue date 
*/
ALTER TABLE book_return
DROP FOREIGN KEY FK_2;

ALTER TABLE book_issue
DROP FOREIGN KEY FK_1;

DROP TABLE members;

/* 
create member table
*/
CREATE TABLE members
(
mem_id VARCHAR(10) PRIMARY KEY, 
mem_name CHAR(50) NOT NULL,
addressLine1 VARCHAR(50),
addressLine2 VARCHAR(50),
category CHAR(1)
);

/*
alter table book return
*/
ALTER TABLE book_return
ADD FOREIGN KEY (mem_id)
REFERENCES members(mem_id);

/*
alter table book issue
*/
ALTER TABLE book_issue
ADD FOREIGN KEY (mem_id)
REFERENCES members(mem_id);