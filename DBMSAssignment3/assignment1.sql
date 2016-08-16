USE library;

/*display information of those books which has been issued for moew than 2 months */

CREATE VIEW myVIEW
AS
(SELECT  books.access_no, titles.tit_name 
FROM books 
LEFT JOIN titles 
ON books.tit_id = titles.tit_id);

SELECT * FROM myVIEW;

CREATE VIEW book_view 
AS 
(SELECT members.mem_name, 
book_issue.mem_id,
myVIEW.tit_name,
book_issue.access_no,
book_issue.issue_date, 
book_issue.due_date 
FROM book_issue 
LEFT JOIN members 
ON book_issue.mem_id = members.mem_id
LEFT JOIN myVIEW 
ON book_issue.access_no = myVIEW.access_no 
);

SELECT *,DATEDIFF(due_date,issue_date) 
AS issue_duration
FROM book_view
WHERE  DATEDIFF(due_date,issue_date) > 60;

/*show the name of member having maximum length*/

SELECT mem_name 
AS Name, 
LENGTH(mem_name) 
AS LengthOfName
FROM members 
where LENGTH(mem_name) = 
(SELECT MAX(LENGTH(mem_name)) 
FROM members);

/*number of books issued so far*/
SELECT COUNT(
DISTINCT access_no)
AS BooksIssuedSoFar 
FROM book_issue;