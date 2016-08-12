CREATE DATABASE electronicTable;

USE electronicTable;
CREATE TABLE productinfo
(
product_id INT(3) AUTO_INCREMENT PRIMARY KEY,
product_name CHAR(30),
parent_id INT(3)
);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Mobiles and tablets", NULL);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Computers", NULL);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Home Appliances", NULL);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Mobiles", 1);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Tablets", 1);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Accessories", 1);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Cases & Covers", 1);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Desktop", 2);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Laptop", 2);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Laptop Accessories", 2);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("TVs", 3);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Air Conditioners", 3);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Washing Machines", 3);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Smart Phones", 4);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Featured Phones", 4);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("2G", 5);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("3G", 5);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Keyboard", 10);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Mouse", 10);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Headphones", 10);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("LED", 11);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("LCD", 11);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Plasma", 11);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Full Automatic", 13);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Semi Automatic", 13);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Top Load", 24);

INSERT INTO productinfo(product_name, parent_id)
VALUES ("Front Load", 24);

CREATE VIEW Myview as SELECT p.product_id, p.product_name,
IFNULL(c.product_name,'TOP CATEGORY') AS ParentCategory
FROM productinfo p
LEFT JOIN productinfo c
ON p.parent_id=c.product_id;



SELECT product_id,product_name
FROM Myview
WHERE ParentCategory='TOP CATEGORY';
