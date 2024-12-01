CREATE TABLE customers
(
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name  VARCHAR(50) NOT NULL,
    last_name   VARCHAR(50) NOT NULL,
    phone       VARCHAR(15),
    email       VARCHAR(100),
    street      VARCHAR(100),
    city        VARCHAR(50),
    state       VARCHAR(50),
    zip_code    VARCHAR(10)
);

CREATE TABLE staffs
(
    staff_id   INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name  VARCHAR(50) NOT NULL,
    email      VARCHAR(100),
    phone      VARCHAR(15),
    active     BOOLEAN     NOT NULL DEFAULT TRUE,
    store_id   INT,
    manager_id INT,
    FOREIGN KEY (store_id) REFERENCES stores (store_id),
    FOREIGN KEY (manager_id) REFERENCES staffs (staff_id)
);

CREATE TABLE stores
(
    store_id   INT AUTO_INCREMENT PRIMARY KEY,
    store_name VARCHAR(100) NOT NULL,
    phone      VARCHAR(15),
    email      VARCHAR(100),
    street     VARCHAR(100),
    city       VARCHAR(50),
    state      VARCHAR(50),
    zip_code   VARCHAR(10)
);

CREATE TABLE orders
(
    order_id      INT AUTO_INCREMENT PRIMARY KEY,
    customer_id   INT,
    order_status  VARCHAR(20),
    order_date    DATE NOT NULL,
    required_date DATE,
    shipped_date  DATE,
    store_id      INT,
    staff_id      INT,
    FOREIGN KEY (customer_id) REFERENCES customers (customer_id),
    FOREIGN KEY (store_id) REFERENCES stores (store_id),
    FOREIGN KEY (staff_id) REFERENCES staffs (staff_id)
);

CREATE TABLE order_items
(
    order_id   INT,
    item_id    INT,
    product_id INT,
    quantity   INT            NOT NULL,
    list_price DECIMAL(10, 2) NOT NULL,
    discount   DECIMAL(5, 2) DEFAULT 0,
    PRIMARY KEY (item_id),
    FOREIGN KEY (order_id) REFERENCES orders (order_id),
    FOREIGN KEY (product_id) REFERENCES products (product_id)
);

CREATE TABLE categories
(
    category_id   INT AUTO_INCREMENT PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL
);

CREATE TABLE brands
(
    brand_id   INT AUTO_INCREMENT PRIMARY KEY,
    brand_name VARCHAR(50) NOT NULL
);

CREATE TABLE products
(
    product_id   INT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(100)   NOT NULL,
    brand_id     INT,
    category_id  INT,
    model_year   INT            NOT NULL,
    list_price   DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (brand_id) REFERENCES brands (brand_id),
    FOREIGN KEY (category_id) REFERENCES categories (category_id)
);

CREATE TABLE stocks
(
    stock_id   INT AUTO_INCREMENT PRIMARY KEY,
    store_id   INT,
    product_id INT,
    quantity   INT NOT NULL,
    PRIMARY KEY (store_id, product_id),
    FOREIGN KEY (store_id) REFERENCES stores (store_id),
    FOREIGN KEY (product_id) REFERENCES products (product_id)
);
