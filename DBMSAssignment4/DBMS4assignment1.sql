USE library;

/*select name of those members which belong to category which JON SNOW belong to*/
SELECT mem_name
AS Name
FROM members
WHERE category=(
SELECT category 
FROM members 
WHERE mem_name='JON SNOW');

/*display information of those book, member and title which are not return till date*/
SELECT book_issue.issue_date AS issueDate, 
titles.tit_name AS title,
members.mem_name AS member,
book_issue.due_date AS dueDate
FROM book_issue
INNER JOIN members ON book_issue.mem_id=members.mem_id
INNER JOIN books ON book_issue.access_no=books.access_no
INNER JOIN titles ON books.tit_id=titles.tit_id
WHERE(book_issue.issue_date, book_issue.access_no, book_issue.mem_id)
NOT IN(SELECT book_return.issue_date, book_return.access_no, book_return.mem_id FROM book_return);

/*display information of those book, member and title which are not return ever after due date*/
SELECT book_issue.issue_date AS issueDate, 
titles.tit_name AS title,
members.mem_name AS member,
book_issue.due_date AS dueDate
FROM book_issue
INNER JOIN members ON book_issue.mem_id=members.mem_id
INNER JOIN books ON book_issue.access_no=books.access_no
INNER JOIN titles ON books.tit_id=titles.tit_id
WHERE(book_issue.issue_date, book_issue.access_no, book_issue.mem_id)
IN(SELECT book_return.issue_date, book_return.access_no, book_return.mem_id FROM book_return
WHERE DATEDIFF(book_issue.due_date,book_return.return_date) > 0);

/*display information of those book which are equal to most expensive book*/
SELECT tit_name AS title 
FROM titles 
WHERE tit_id
IN (SELECT tit_id FROM books 
WHERE price=
(SELECT max(price) FROM books)
);

/*display second max price of the book */
SELECT MAX(price) 
FROM books 
WHERE price 
NOT IN (SELECT MAX(price) FROM books);