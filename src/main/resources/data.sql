use webShopping;

insert into user(account, password, username, phoneNumber, postNumber, address, email)
values ('test1', '1234', 'HJ', '010-00000', '44132', 'dgsw', 'test@gmail.com');

insert into category(id, name) values (1, 'top(m)') ,
  (2, 'bottom(m)'), (3, 'top(w)'),
  (4, 'bottom(w)'), (5,'shoes'),
  (6, 'bag'), (7,'prop');

insert into submenu(category_id, name) values(1, 't-shirt'), (1, 'short-t');
insert into submenu(category_id, name) values(2, 'short-pants'), (2, 'long-pants');
insert into submenu(category_id, name) values(3, 't-shirt'), (3, 'short-t');
insert into submenu(category_id, name) values(4, 'short-pants'), (4, 'long-pants');
insert into submenu(category_id, name) values(5, 'long-heal'), (5, 'short-heal');
insert into submenu(category_id, name) values(6, 'big-bag'), (6, 'short-bag');
insert into submenu(category_id, name) values(7, 'hair-band'), (7, 'sunglasses');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (1, 1, 't-shirt1', 'aaa', 0, 6000, 2000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (1, 2, 'short-t1', 'bbb', 0, 8000, 8000, 'test desc', 'hi');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (2, 3, 'short-pants1', 'aaa', 0, 12000, 6000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (2, 4, 'long-pants1', 'bbb', 0, 15000, 8000, 'test desc', 'hi');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (3, 5, 't-shirt2', 'aaa', 0, 6000, 2000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (3, 6, 'short-t2', 'bbb', 0, 12000, 8000, 'test desc', 'hi');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (4, 7, 'short-pants2', 'ccc', 0, 20000, 8000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (4, 8, 'long-pants2', 'ddd', 0, 15000, 8000, 'test desc', 'hi');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (5, 9, 'long-heal1', 'nike', 0, 60000, 20000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (5, 10, 'short-heal1', 'adidas', 0, 30000, 15000, 'test desc', 'hi');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (6, 11, 'big-bag1', 'fff', 0, 16000, 9000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (6, 12, 'short-bag2', 'ccc', 0, 12000, 3000, 'test desc', 'hi');

insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (7, 13, 'hair-band1', 'adidas', 0, 16000, 6000, 'test desc', 'hi');
insert into product(category_id, sub_id, name, manufacturer, mileage, original_price, price, description, information)
values (7, 14, 'sunglasses1', 'adidas', 0, 10000, 8000, 'test desc', 'hi'),
       (7, 14, 'sunglasses2', 'adidas', 0, 10000, 8000, 'test desc', 'hi')
       ;

insert into attachproduct(product_id, filename, filepath)
values (1, 't-shirts1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/t-shirts1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (2, 'short-shirts1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-shirts1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (3, 'short-pants1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-pants1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (4, 'short-pants2.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-pants2.jpg');
insert into attachproduct(product_id, filename, filepath)
values (5, 't-shirts2.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/t-shirts2.jpg');
insert into attachproduct(product_id, filename, filepath)
values (6, 'short-shirts2.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-shirts2.jpg');
insert into attachproduct(product_id, filename, filepath)
values (7, 'short-pants1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-pants1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (8, 'short-pants2.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-pants2.jpg');
insert into attachproduct(product_id, filename, filepath)
values (9, 'long-heal1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/long-heal1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (10, 'short-heal1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-heal1.jpg');
insert into attachproduct(product_id, filename, filepath)
 values (11, 'big-bag1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/big-bag1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (12, 'short-bag1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/short-bag1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (13, 'hair-band1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/hair-band1.jpg');
insert into attachproduct(product_id, filename, filepath)
values (14, 'sunglass1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/sunglass1.jpg'),
       (15, 'sunglass1.jpg', 'D:/school/3Grade/web/webShopping/Shopping_back/images/sunglass1.jpg');

insert into basket(id, user_id, product_id, orderNumber)
values (1,1,3,5);
insert into basket(id, user_id, product_id, orderNumber)
values (2,1,8,2);


insert into comment(user_id, product_id, title)
values (1,1,'comment1'), (1,1,'comment2');