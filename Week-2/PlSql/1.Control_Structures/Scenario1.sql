DECLARE
    CURSOR c_customers IS
        SELECT c.CustomerID, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE TRUNC((SYSDATE - c.DOB) / 365) > 60; -- Simplified age calculation
BEGIN
    FOR rec IN c_customers LOOP
        UPDATE Loans
        SET InterestRate = rec.InterestRate * 0.99 -- Applying 1% discount
        WHERE LoanID = rec.LoanID;
    END LOOP;
    COMMIT;
END;

