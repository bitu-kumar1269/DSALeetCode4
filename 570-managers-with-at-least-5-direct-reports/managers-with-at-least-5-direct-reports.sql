# Write your MySQL query statement below
select e1.name
from Employee e1
-- self join again with different notation
join Employee e2  
-- e1.id is same e2.managerId common
on e1.id = e2.managerId
-- make group of return column
group by e1.id, e1.name
-- fillter e2 id which more than equal to appear in managerId column
having count(e2.id) >= 5;