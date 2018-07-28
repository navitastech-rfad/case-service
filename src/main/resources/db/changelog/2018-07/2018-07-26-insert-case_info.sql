--liquibase formatted sql
--changeset Jonathan.Solomon:2018-07-26-jonathan-02
INSERT INTO case_info (created_by, benefit_applied, title, first_name, last_name, address, city, state, updated_by) VALUES
(1000, 'ABC123', 'Case-1000100', 'Adams', 'Morgan', '12345 Colombia Blvd', 'Washington', 'DC', 1000),
(2000, 'DEF123', 'Case-1000200', 'Lucy', 'Franklin', '23432 Telagraph Road', 'Alexandria', 'VA', 2000),
(3000, 'GHI123', 'Case-1000300', 'Betty', 'Lawton', '33221 Poplar Tree', 'Chantilly', 'VA', 3000),
(4000, 'JKL123', 'Case-1000400', 'Frank', 'Cousins', '56787 Northern Close', 'Ashburn', 'MD', 4000);
