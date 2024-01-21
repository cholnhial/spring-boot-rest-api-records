-- Insert data into the department table
INSERT INTO department (id, name, location) VALUES
                                                (1, 'Human Resources', 'Building A'),
                                                (2, 'Finance', 'Building B'),
                                                (3, 'Marketing', 'Building C');

-- Insert data into the employee table
INSERT INTO employee (id, name, salary, department_id) VALUES
                                                           (1, 'John Doe', 60000.00, 1),
                                                           (2, 'Jane Smith', 75000.50, 2),
                                                           (3, 'Bob Johnson', 50000.75, 1),
                                                           (4, 'Alice Brown', 80000.25, 3);