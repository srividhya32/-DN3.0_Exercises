SQL> CREATE OR REPLACE PROCEDURE AddNewCustomer(
  2      p_customer_id IN NUMBER,
  3      p_name IN VARCHAR2,
  4      p_email IN VARCHAR2
  5  ) AS
  6  BEGIN
  7      BEGIN
  8          -- Attempt to insert the new customer
  9          INSERT INTO Customers (id, name, email)
 10          VALUES (p_customer_id, p_name, p_email);
 11  
 12          COMMIT; 
 13  
 14      EXCEPTION
 15          WHEN DUP_VAL_ON_INDEX THEN
 16              -- Log the error if the customer ID already exists
 17              INSERT INTO ErrorLogs (message, log_time)
 18              VALUES ('Customer ID ' || p_customer_id || ' already exists', SYSDATE);
 19              ROLLBACK; 
 20          WHEN OTHERS THEN
 21              
 22              INSERT INTO ErrorLogs (message, log_time)
 23              VALUES ('Error: ' || SQLERRM, SYSDATE);
 24              ROLLBACK; -- Rollback the transaction
 25      END;
 26  END AddNewCustomer;
 27  /

