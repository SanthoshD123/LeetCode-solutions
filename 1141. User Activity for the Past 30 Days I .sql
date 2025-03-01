WITH FilteredActivity AS (
    SELECT DISTINCT activity_date, user_id
    FROM Activity
    WHERE activity_date BETWEEN DATE_SUB('2019-07-27', INTERVAL 29 DAY) AND '2019-07-27'
)
SELECT activity_date AS day, COUNT(user_id) AS active_users
FROM FilteredActivity
GROUP BY activity_date;
