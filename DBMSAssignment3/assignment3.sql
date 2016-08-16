USE library;

/*DISPLAY TOTAL NUMBER OF STUDENT AND FACULTY in 1 row*/
SELECT GROUP_CONCAT( DISTINCT m.category),
GROUP_CONCAT(m.membercount) 
FROM (SELECT category,count(category) 
AS membercount 
FROM members 
GROUP BY category) AS m;

/*display title of those book which are issued more than 2 times*/
CREATE VIEW view_issue_count
AS(
SELECT access_no,
COUNT(*) AS counter 
FROM book_issue 
GROUP BY access_no 
HAVING counter > 2); 

CREATE VIEW book_title_view 
AS 
(SELECT books.access_no, 
titles.tit_name 
FROM books 
LEFT JOIN titles 
ON books.tit_id = titles.tit_id);

SELECT book_title_view.tit_name 
FROM book_title_view 
INNER JOIN view_issue_count 
ON book_title_view.access_no = view_issue_count.access_no;

/*display infromation of books issued by category other than 'F'*/
CREATE VIEW members_book_view 
AS
(SELECT book_issue.access_no,
book_issue.issue_date,
book_issue.due_date, 
members.category 
FROM book_issue 
LEFT JOIN members
ON book_issue.mem_id=members.mem_id);

SELECT * FROM members_book_view
WHERE category NOT IN ('F');

/*display authors whos book are purchased atleast once*/
CREATE VIEW title_author_view 
AS 
(SELECT title_author.tit_id, 
authors.aur_name 
FROM title_author
LEFT JOIN authors
ON title_author.aur_id=authors.aur_id);

SELECT DISTINCT title_author_view.aur_name 
FROM title_author_view
RIGHT JOIN books ON 
title_author_view.tit_id=books.tit_id;