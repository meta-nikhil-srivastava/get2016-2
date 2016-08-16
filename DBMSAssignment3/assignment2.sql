USE library;

/*display subject wise information of book purchased*/

CREATE VIEW view_book_sub_title 
AS (
SELECT titles.tit_id,
 subjects.sub_id, 
subjects.sub_name 
FROM titles 
LEFT JOIN subjects 
ON titles.sub_id = subjects.sub_id
);


SELECT view_book_sub_title.sub_id,
view_book_sub_title.sub_name, 
COUNT(view_book_sub_title.sub_name)
AS noOfbooksPurchasedSoFar
FROM view_book_sub_title 
RIGHT JOIN books 
ON view_book_sub_title.tit_id = books.tit_id 
GROUP BY view_book_sub_title.sub_name
ORDER BY view_book_sub_title.sub_name;

/*display those book which can be return after two months*/

SELECT * FROM book_issue 
where DATEDIFF(due_date,issue_date) > 60;

/*display book more than minimum price of book*/
CREATE VIEW title_view 
AS 
(SELECT titles.tit_name, 
books.price 
FROM books 
LEFT JOIN titles 
ON books.tit_id = titles.tit_id);

SELECT * FROM title_view 
WHERE title_view.price > 
(SELECT MIN(price) 
FROM books);