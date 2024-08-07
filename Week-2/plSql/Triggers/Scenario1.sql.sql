SQL> CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
  2  BEFORE UPDATE ON Customers
  3  FOR EACH ROW
  4  BEGIN
  5      :NEW.LastModified := SYSDATE;
  6  END;
  7  /

