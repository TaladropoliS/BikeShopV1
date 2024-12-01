-- Poblar customers
INSERT INTO customers (first_name, last_name, phone, email, street, city, state, zip_code)
VALUES ('John', 'Doe', '123456789', 'john.doe@example.com', '123 Elm Street', 'Springfield', 'Illinois', '62701'),
       ('Jane', 'Smith', '987654321', 'jane.smith@example.com', '456 Maple Ave', 'Chicago', 'Illinois', '60601'),
       ('Paul', 'Brown', '456789123', 'paul.brown@example.com', '789 Oak Blvd', 'Peoria', 'Illinois', '61602');

-- Poblar stores
INSERT INTO stores (store_name, phone, email, street, city, state, zip_code)
VALUES ('Central Store', '111222333', 'central.store@example.com', '100 Main St', 'Springfield', 'Illinois', '62701'),
       ('North Branch', '444555666', 'north.branch@example.com', '200 North St', 'Chicago', 'Illinois', '60601');

-- Poblar staffs
INSERT INTO staffs (first_name, last_name, email, phone, active, store_id)
VALUES ('Alice', 'Johnson', 'alice.johnson@example.com', '222333444', TRUE, 1),
       ('Bob', 'Williams', 'bob.williams@example.com', '333444555', TRUE, 1),
       ('Emma', 'Davis', 'emma.davis@example.com', '444555666', TRUE, 2);

-- Poblar categories
INSERT INTO categories (category_name)
VALUES ('Electronics'),
       ('Home Appliances'),
       ('Clothing');

-- Poblar brands
INSERT INTO brands (brand_name)
VALUES ('Sony'),
       ('Samsung'),
       ('Nike');

-- Poblar products
INSERT INTO products (product_name, brand_id, category_id, model_year, list_price)
VALUES ('PlayStation 5', 1, 1, 2023, 499.99),
       ('Samsung Refrigerator', 2, 2, 2022, 1200.00),
       ('Nike Running Shoes', 3, 3, 2024, 120.00),
       ('Smartphone A', 2, 1, 2023, 299.99),
       ('Smartphone B', 2, 1, 2023, 499.99),
       ('Laptop X', 1, 1, 2024, 999.99),
       ('Laptop Y', 1, 1, 2024, 1499.99),
       ('Headphones Z', 1, 1, 2023, 199.99),
       ('Television Q', 2, 1, 2022, 799.99),
       ('Refrigerator Cool', 2, 2, 2022, 1200.00),
       ('Microwave Heat', 2, 2, 2021, 300.00),
       ('Washing Machine Pro', 2, 2, 2023, 750.00),
       ('Smartwatch S', 3, 1, 2024, 250.00),
       ('Running Shoes', 3, 3, 2024, 120.00),
       ('Tennis Shoes', 3, 3, 2024, 100.00),
       ('Jacket Winter', 3, 3, 2023, 80.00),
       ('T-shirt Casual', 3, 3, 2023, 25.00),
       ('Gaming Console', 1, 1, 2023, 499.99),
       ('Bluetooth Speaker', 1, 1, 2022, 150.00),
       ('Desktop PC', 1, 1, 2024, 1200.00),
       ('Camera Pro', 1, 1, 2024, 999.99),
       ('Smart Bulb', 2, 1, 2023, 30.00),
       ('Electric Scooter', 2, 1, 2024, 800.00),
       ('Fan Cooler', 2, 2, 2023, 200.00),
       ('Air Conditioner', 2, 2, 2024, 1000.00),
       ('Oven Electric', 2, 2, 2024, 500.00),
       ('Toaster', 2, 2, 2023, 50.00),
       ('Blender', 2, 2, 2023, 80.00),
       ('Coffee Maker', 2, 2, 2024, 100.00),
       ('Iron', 2, 2, 2024, 40.00),
       ('Vacuum Cleaner', 2, 2, 2023, 150.00),
       ('Hair Dryer', 2, 2, 2023, 60.00),
       ('Straightener', 2, 2, 2024, 70.00),
       ('Curling Iron', 2, 2, 2024, 75.00),
       ('Hair Trimmer', 2, 2, 2023, 30.00),
       ('Shaver', 2, 2, 2023, 40.00),
       ('Toothbrush Electric', 2, 2, 2024, 50.00),
       ('Water Filter', 2, 2, 2024, 100.00),
       ('Water Heater', 2, 2, 2023, 200.00),
       ('Heater Electric', 2, 2, 2023, 150.00),
       ('Heater Gas', 2, 2, 2024, 250.00),
       ('Blender Smoothies', 2, 2, 2024, 100.00),
       ('Juicer', 2, 2, 2023, 80.00),
       ('Food Processor', 2, 2, 2023, 120.00),
       ('Microwave Oven', 2, 2, 2024, 200.00),
       ('Dishwasher', 2, 2, 2024, 500.00),
       ('Washing Machine', 2, 2, 2023, 750.00),
       ('Dryer', 2, 2, 2023, 600.00);

-- Poblar orders
INSERT INTO orders (customer_id, order_status, order_date, required_date, shipped_date, store_id, staff_id)
VALUES (1, 'Shipped', '2024-11-15', '2024-11-20', '2024-11-18', 1, 1),
       (2, 'Pending', '2024-11-16', '2024-11-22', '2024-10-12', 2, 2),
       (3, 'Shipped', '2024-11-17', '2024-11-23', '2024-11-19', 1, 1),
       (1, 'Shipped', '2024-11-18', '2024-11-24', '2024-11-20', 2, 2),
       (2, 'Pending', '2024-11-19', '2024-11-25', '2024-10-11', 1, 1),
       (3, 'Shipped', '2024-11-20', '2024-11-26', '2024-11-22', 2, 2);

-- Poblar order_items
INSERT INTO order_items (order_id, item_id, product_id, quantity, list_price, discount)
VALUES (1, 1, 1, 1, 499.99, 0.00),
       (1, 2, 2, 1, 1200.00, 50.00),
       (2, 3, 3, 2, 120.00, 10.00),
       (3, 4, 4, 1, 299.99, 0.00),
       (3, 5, 5, 1, 499.99, 0.00),
       (4, 6, 6, 1, 999.99, 0.00),
       (4, 7, 7, 1, 1499.99, 0.00),
       (5, 8, 8, 1, 199.99, 0.00),
       (5, 9, 9, 1, 799.99, 0.00),
       (6, 10, 10, 1, 1200.00, 0.00),
       (6, 11, 11, 1, 300.00, 0.00),
       (5, 12, 12, 1, 750.00, 0.00),
       (4, 13, 13, 1, 250.00, 0.00),
       (3, 14, 14, 1, 120.00, 0.00),
       (2, 15, 15, 2, 120.00, 0.00),
       (1, 16, 16, 1, 80.00, 0.00),
       (2, 17, 17, 1, 25.00, 0.00),
       (3, 18, 18, 1, 499.99, 0.00),
       (4, 19, 19, 1, 150.00, 0.00),
       (5, 20, 20, 1, 999.99, 0.00),
       (6, 21, 21, 1, 1200.00, 0.00),
       (6, 22, 22, 1, 30.00, 0.00),
       (5, 23, 23, 1, 800.00, 0.00),
       (4, 24, 24, 1, 200.00, 0.00),
       (3, 25, 25, 1, 150.00, 0.00);

-- Poblar stocks
INSERT INTO stocks (store_id, product_id, quantity)
VALUES (1, 1, 50),
       (1, 2, 30),
       (2, 3, 100),
       (1, 4, 40),
       (1, 5, 60),
       (1, 6, 20),
       (1, 7, 10),
       (1, 8, 70),
       (1, 9, 90),
       (1, 10, 50),
       (1, 11, 30),
       (1, 12, 40),
       (1, 13, 20),
       (1, 14, 10),
       (1, 15, 70),
       (1, 16, 90),
       (1, 17, 50),
       (1, 18, 30),
       (1, 19, 40),
       (1, 20, 20),
       (1, 21, 10),
       (1, 22, 70),
       (1, 23, 90),
       (1, 24, 50),
       (1, 25, 30),
       (2, 26, 40),
       (2, 27, 60),
       (2, 28, 20),
       (2, 29, 10),
       (2, 30, 70),
       (2, 31, 90),
       (2, 32, 50),
       (2, 33, 30),
       (2, 34, 40),
       (2, 35, 20),
       (2, 36, 10),
       (2, 37, 70),
       (2, 38, 90),
       (2, 39, 50),
       (2, 40, 30),
       (2, 41, 40),
       (2, 42, 20),
       (2, 43, 10),
       (2, 44, 70),
       (2, 45, 90),
       (2, 46, 50),
       (2, 47, 30),
       (2, 48, 40);
