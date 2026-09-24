# Write your MySQL query statement below
select 
case 
-- if id is even swap previous seat
    when id % 2 = 0 then id - 1
-- if id is odd and it is the last row,keep it as is
    when id % 2 !=0 and id =(
    select max(id) from Seat) then id
-- if id is odd and not max last then swap wit next seat
    else id+1
end as id, student from Seat order by id asc;