CREATE DATABASE accenture_sql;                        --COMMANDS TO CREATE TABLE
USE accenture_sql;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL
);

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50) NOT NULL,
    department_id INT,
    manager_id INT,
    salary DECIMAL(10,2),
    hire_date DATE,
    city VARCHAR(50),
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    city VARCHAR(50),
    email VARCHAR(100) UNIQUE
);

CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    category VARCHAR(50),
    price DECIMAL(10,2),
    stock INT UNSIGNED
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_date DATE,
    status VARCHAR(20),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

CREATE TABLE order_items (
    order_item_id INT PRIMARY KEY,
    order_id INT,
    product_id INT,
    quantity INT UNSIGNED,
    FOREIGN KEY (order_id) REFERENCES orders(order_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    age INT,
    grade VARCHAR(10),
    city VARCHAR(50)
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(50),
    fee DECIMAL(10,2)
);

CREATE TABLE enrollments (
    enrollment_id INT PRIMARY KEY,
    student_id INT,
    course_id INT,
    enrollment_date DATE,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);







INSERT INTO departments VALUES  
(1,'IT'),(2,'HR'),(3,'Finance'),(4,'Sales'),(5,'Marketing');

INSERT INTO employees VALUES
(101,'Rahul',1,NULL,70000,'2022-01-10','Delhi'),
(102,'Priya',1,101,55000,'2023-03-15','Noida'),
(103,'Amit',2,NULL,60000,'2021-07-20','Delhi'),
(104,'Neha',3,NULL,80000,'2020-05-12','Mumbai'),
(105,'Ravi',4,NULL,50000,'2024-01-05','Noida'),
(106,'Anita',1,101,45000,'2024-06-10','Delhi'),
(107,'Karan',4,105,40000,'2024-08-15','Pune');

INSERT INTO customers VALUES
(1,'Rahul','Delhi','rahul@gmail.com'),
(2,'Priya','Noida','priya@gmail.com'),
(3,'Amit','Delhi','amit@gmail.com'),
(4,'Neha','Mumbai','neha@gmail.com'),
(5,'Ravi','Pune','ravi@gmail.com');

INSERT INTO products VALUES
(101,'Laptop','Electronics',60000,10),
(102,'Mouse','Electronics',800,50),
(103,'Keyboard','Electronics',1500,30),
(104,'Chair','Furniture',5000,20),
(105,'Desk','Furniture',10000,5),
(106,'Notebook','Stationery',100,100);

INSERT INTO orders VALUES
(1001,1,'2026-01-10','Delivered'),
(1002,2,'2026-01-12','Pending'),
(1003,1,'2026-02-01','Delivered'),
(1004,3,'2026-02-10','Cancelled'),
(1005,4,'2026-03-05','Delivered');

INSERT INTO order_items VALUES
(1,1001,101,1),
(2,1001,102,2),
(3,1002,103,2),
(4,1003,104,1),
(5,1003,106,5),
(6,1004,105,1),
(7,1005,101,1);

INSERT INTO students VALUES
(1,'Rahul',22,'A','Delhi'),
(2,'Priya',21,'B','Noida'),
(3,'Amit',23,'A','Delhi'),
(4,'Neha',20,'C','Mumbai'),
(5,'Ravi',24,'B','Pune'),
(6,'Karan',19,'A','Delhi');

INSERT INTO courses VALUES
(1,'Java',5000),
(2,'SQL',4000),
(3,'Python',4500),
(4,'Web Development',6000);

INSERT INTO enrollments VALUES
(1,1,1,'2026-01-01'),
(2,1,2,'2026-01-02'),
(3,2,2,'2026-01-03'),
(4,3,1,'2026-01-04'),
(5,3,3,'2026-01-05'),
(6,4,4,'2026-01-06'),
(7,5,2,'2026-01-07');
