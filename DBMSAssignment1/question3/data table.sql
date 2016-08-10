USE library;

/*
insert data into each tables
*/
INSERT INTO members
VALUES ("E16/0770","Ayushi","Chandpole","Mumbai","S");

INSERT INTO members
VALUES ("E16/0771","Naman","Murlipura","Delhi","F");

INSERT INTO subject
VALUES ("sub101","literature");

INSERT INTO subject
VALUES ("sub102","auto biography");

INSERT INTO publisher
VALUES ("pub201","Mordern Library");

INSERT INTO publisher
VALUES ("pub202","Columbian Magazine");

INSERT INTO author
VALUES ("aur761","Paula Hawkins");

INSERT INTO author
VALUES ("aur762","Benjamin Franklin");

INSERT INTO titles
VALUES("tit301","sub101","pub201","The Girl On the Train");

INSERT INTO titles
VALUES("tit302","sub102","pub202","Autobiography Of Benjamin Franklin");

INSERT INTO title_author
VALUES ("tit301","aur761");

INSERT INTO title_author
VALUES ("tit302","aur762");

INSERT INTO books(access_no, tit_id, price, status)
VALUES (10021,"tit301",750,"Avl");

INSERT INTO books(access_no, tit_id, price, status)
VALUES (10022,"tit302",490,"nAvl");

INSERT INTO book_issue(access_no,mem_id)
VALUES (10021,"E16/0770");

INSERT INTO book_issue(access_no,mem_id)
VALUES (10022,"E16/0771");

INSERT INTO book_return(access_no,mem_id,issue_date)
VALUES (10021,"E16/0770",'2016-08-10 16:13:21');

INSERT INTO book_return(access_no,mem_id,issue_date)
VALUES (10022,"E16/0771",'2016-08-10 16:13:21');

SET SQL_SAFE_UPDATES = 0;
/*
change the address line 2 of all members
*/
UPDATE members
SET addressLine2="Jaipur";

/*
Change the addressLine 1 Members with value “EPIP, Sitapura” for the members belonging to category “F”
*/
UPDATE members
SET addressLine1="EPIP, Sitapura"
WHERE category="F";

/*Delete rows publisher table*/
SET foreign_key_checks = 0;
DELETE FROM publisher;
SET foreign_key_checks = 1;

/* 
Inserting the data back to the publisher table using substitution variables 
*/
SET @id = 'pub201';
SET @name = 'Mordern Library';
INSERT INTO publisher VALUES ( @id, @name );

SET @id = 'pub202';
SET @name = 'Columbian Magazine';
INSERT INTO publisher VALUES ( @id, @name );

/* 
Delete those rows of Titles table belonging to Publisher with publisher_id = 1
*/
select * from publisher;
SET foreign_key_checks = 0;
DELETE FROM titles 
WHERE pub_id="pub201";
SET foreign_key_checks = 1;