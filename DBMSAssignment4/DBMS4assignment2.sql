USE library;

/*view to store member name and issue detail*/
CREATE VIEW issued_BookDetails AS
(
SELECT members.mem_name, 
book_issue.access_no,
books.tit_id,tit_name 
FROM members ,book_issue ,books ,titles 
WHERE members.mem_id=book_issue.mem_id 
&& book_issue.access_no=books.access_no 
&& books.tit_id=titles.tit_id
);

SELECT * from issued_BookDetails;


/*view to store detail of category*/
CREATE VIEW membersView AS
(
SELECT mem_id,mem_name,
CASE 
WHEN category="F" THEN 'Faculty'
WHEN category="S" THEN 'Student'
ELSE "Others" END 
AS Full_Description FROM members
);

SELECT * from membersView;


/*View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date.*/

CREATE VIEW BooksIssueDetails 
AS (
SELECT subjects.sub_name AS Subject,
titles.tit_name AS Title,
members.mem_name AS Member,
members.category AS Category,
book_issue.issue_date AS Issue_Date,
book_issue.due_date AS Due_Date 
FROM members,book_issue ,books ,titles ,subjects 
WHERE members.mem_id=book_issue.mem_id 
&& book_issue.access_no=books.access_no 
&& books.tit_id=titles.tit_id 
&& titles.sub_id=subjects.sub_id
);

SELECT * from BooksIssueDetails;