-- Last updated: 29/05/2026, 11:58:37
-- Write your PostgreSQL query statement below
SELECT DISTINCT num AS ConsecutiveNums
FROM Logs
WHERE (id + 1, num) IN (SELECT id, num FROM Logs)
AND (id + 2, num) IN (SELECT id, num FROM Logs);