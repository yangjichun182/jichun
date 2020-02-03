hr.employees  


grant select on employees to scott;  -- 赋予 scott 用户查询权限
grant insert on employees to scott;  -- 赋予 scott 用户插入数据权限


insert into hr.Employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, 
HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
values (100, 'Steven', 'King', 'SKING', '515.123.4567',
to_date('17-06-2003', 'dd-mm-yyyy'), 'AD_PRES', 24000.00, null, null, 90);
