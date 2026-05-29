-- Last updated: 29/05/2026, 11:58:35
-- Write your PostgreSQL query statement below
select email as Email from Person group by email having count(email)>1;