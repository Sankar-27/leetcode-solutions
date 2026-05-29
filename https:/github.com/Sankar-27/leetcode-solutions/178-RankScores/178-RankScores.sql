-- Last updated: 29/05/2026, 11:58:38
-- Write your PostgreSQL query statement below
SELECT score,
DENSE_RANK() OVER (ORDER BY score DESC) AS rank
FROM Scores;