WITH primary_dept AS (
    SELECT employee_id, department_id
    FROM Employee
    WHERE primary_flag = 'Y'
)
SELECT employee_id, department_id
FROM primary_dept

UNION

SELECT employee_id, department_id
FROM Employee
WHERE employee_id NOT IN (SELECT employee_id FROM primary_dept);
