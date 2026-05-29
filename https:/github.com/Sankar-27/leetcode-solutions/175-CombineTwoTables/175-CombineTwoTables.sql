-- Last updated: 29/05/2026, 11:58:40
-- Write your PostgreSQL query statement below
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;