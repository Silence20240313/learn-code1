
-- 创建一个数据库
CREATE database practice;

-- 使用这个数据库
use practice;

-- 创建一张员工表
-- AUTO_INCREMENT：id自动递增   PRIMARY KEY：主键  NOT NULL：不能为空
-- DECIMAL(10, 2)：总共可以存储10位数字，其中2位为小数
CREATE TABLE employees (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
age INT NOT NULL,
department_id INT,
salary DECIMAL(10, 2),
hire_date DATE,
email VARCHAR(100) UNIQUE
);

-- 员工表中插入一些测试数据
INSERT INTO employees (name, age, department_id, salary, hire_date, email) VALUES
('Alice', 25, 1, 5000.00, '2023-01-15', 'alice@example.com'),
('Bob', 30, 2, 8000.00, '2021-03-20', 'bob@example.com'),
('Charlie', 28, 2, 7500.00, '2022-07-10', 'charlie@example.com'),
('David', 35, 3, 6000.00, '2019-10-05', 'david@example.com'),
('Eve', 27, 1, 5200.00, '2023-05-12', 'eve@example.com');

-- 创建一张部门表
CREATE TABLE departments (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
location VARCHAR(100)
);

-- 部门表中插入一些测试数据
INSERT INTO departments (name, location) VALUES
('HR', 'Tokyo'),
('Engineering', 'Osaka'),
('Marketing', 'Kyoto');


-- 1.查询所有员工的姓名和薪水。
SELECT name,salary from employees;
-- 2.查询年龄在30岁以上的员工信息。
SELECT * from employees where age > 30;
-- 3.查询薪水大于6000且所在部门为 "Engineering" 的员工信息。
-- 第一步先查出Engineering所对应的id
SELECT id from departments where name = 'Engineering';
SELECT * from employees where salary > 6000 and department_id = 2 ;

-- 4.查询每个部门的员工平均薪水
SELECT department_id,avg(salary) from employees GROUP BY department_id;
-- 5.查询薪水最高的员工姓名和薪水
SELECT name,salary from employees order by salary desc limit 1;

-- 6.按薪水从高到低排序，显示前 3 名员工的信息。
SELECT * from employees order by salary desc limit 3;

-- 7.查询每个员工的姓名、部门名称和部门所在地。
SELECT e.name AS employee_name, d.name AS department_name, d.location 
FROM employees e
JOIN departments d ON e.department_id = d.id;

-- 8.查询薪水高于所有 "HR" 部门员工薪水的员工信息。
SELECT * FROM employees 
WHERE salary > (SELECT MAX(salary) FROM employees WHERE department_id = 1);

-- 9.更新 "Marketing" 部门所有员工的薪水，增加 10%。
-- 第一步先查出Marketing所对应的id
SELECT id from departments where name = 'Marketing';
UPDATE employees set salary = salary*1.1 where department_id = 3;
-- 10.删除薪水低于 5500 的员工。
DELETE from employees where salary < 5500;

-- 11.在 employees 表中添加 phone_number 列，类型为 VARCHAR(15)，允许为空。
ALTER TABLE employees ADD phone_number VARCHAR(15);
-- 12.删除 departments 表中的 location 列。
ALTER TABLE departments DROP COLUMN location;
