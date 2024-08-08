SQL> CREATE OR REPLACE PROCEDURE UpdateSalary(
  2      p_employeeID IN NUMBER,
  3      p_percentage IN NUMBER
  4  ) AS
  5  BEGIN
  6      -- Update the salary
  7      UPDATE Employees
  8      SET Salary = Salary * (1 + p_percentage / 100)
  9      WHERE EmployeeID = p_employeeID;
 10  
 11      IF SQL%ROWCOUNT = 0 THEN
 12          RAISE_APPLICATION_ERROR(-20002, 'Employee ID does not exist.');
 13      END IF;
 14  
 15      COMMIT;
 16  
 17  EXCEPTION
 18      WHEN NO_DATA_FOUND THEN
 19          DBMS_OUTPUT.PUT_LINE('Employee ID does not exist.');
 20          ROLLBACK;
 21      WHEN OTHERS THEN
 22          DBMS_OUTPUT.PUT_LINE('An error occurred: ' || SQLERRM);
 23          ROLLBACK;
 24  END;
 25  /

Procedure created.

SQL> spool off
