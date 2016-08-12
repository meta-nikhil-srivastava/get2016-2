USE library;

/* display all columns of member table*/
SELECT * from members;

/* display member name, id and category of member table*/
SELECT mem_name, mem_id,category 
FROM members;

/* display member name , id and category of member belonging to category 'F' from member table*/
SELECT mem_name, mem_id,category 
FROM members
WHERE category="F";

/* display distinct category of member table*/
SELECT DISTINCT category
FROM members;

/*display member name and category in descening order of member table*/
SELECT mem_name, category
FROM members
ORDER BY mem_name desc;


/*display title id, name ,subject name and publisher name*/
SELECT t.tit_id, t.tit_name,s.sub_name, p.pub_name
FROM titles t
LEFT JOIN subjects s
ON s.sub_id=t.sub_id
LEFT JOIN publishers p
ON p.pub_id=t.pub_id;

/* count no. of member in each category*/
SELECT COUNT(mem_name), category
FROM members
GROUP BY category;

/* member name whose belong to category which ayushi belong to*/
SELECT m1.mem_name
FROM members m1
INNER JOIN members m2
ON m1.category = m2.category
WHERE m2.mem_name='Ayushi';

/* display issue date , access no , member id and return date if book is not return then leave it blank*/
SELECT bi.issue_date AS ISSUE_DATE, 
bi.access_no AS ACCESSION_NUMBER, 
bi.mem_id AS MEMBER_ID,
IFNULL(br.return_date," ") AS RETURN_DATE 
FROM book_issue bi 
LEFT JOIN book_return br
ON bi.access_no = br.access_no 
AND bi.mem_id = br.mem_id
AND bi.issue_date = br.issue_date ;

/*question 2*/
/*display results in ascending order of issue date and within issue date in ascending order of member's name */
SELECT bi.issue_date AS ISSUE_DATE, 
bi.access_no AS ACCESSION_NUMBER, 
members.mem_name AS MEMBER_NAME,
IFNULL(br.return_date," ") AS RETURN_DATE 
FROM book_issue bi
LEFT JOIN book_return br ON bi.access_no = br.access_no 
AND bi.mem_id = br.mem_id
AND bi.issue_date = br.issue_date 
LEFT JOIN members ON bi.mem_id = members.mem_id
ORDER BY ISSUE_DATE, MEMBER_NAME;