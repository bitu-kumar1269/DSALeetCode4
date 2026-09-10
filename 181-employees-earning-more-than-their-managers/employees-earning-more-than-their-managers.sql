# Write your MySQL query statement below
select e.name as employee
from Employee as e
join Employee as m on e.managerId = m.id
where e.salary > m.salary;