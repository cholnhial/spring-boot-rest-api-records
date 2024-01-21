CREATE TABLE department (
                            id INT PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            location VARCHAR(255)
);

CREATE TABLE employee (
                          id INT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          salary DECIMAL(10, 2) NOT NULL,
                          department_id INT,
                          CONSTRAINT unique_name UNIQUE (name),
                          FOREIGN KEY (department_id) REFERENCES department(id)
);



