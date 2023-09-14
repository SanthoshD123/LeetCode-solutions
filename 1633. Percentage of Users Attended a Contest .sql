WITH ContestUserCounts AS (
    SELECT
        r.contest_id,
        COUNT(DISTINCT r.user_id) AS registered_users
    FROM Register r
    GROUP BY r.contest_id
),
TotalUsers AS (
    SELECT
        COUNT(DISTINCT user_id) AS total_users
    FROM Users
)

SELECT
    cuc.contest_id,
    ROUND((cuc.registered_users * 100.0) / NULLIF(tu.total_users, 0), 2) AS percentage
FROM ContestUserCounts cuc
CROSS JOIN TotalUsers tu
ORDER BY percentage DESC, cuc.contest_id ASC;
