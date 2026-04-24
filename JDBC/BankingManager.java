import java.sql.*;

public class BankingManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS accounts(accNo INT, name VARCHAR(50), balance DOUBLE)");

        st.executeUpdate("INSERT INTO accounts VALUES (1,'Ravi',15000)");

        ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE balance > 10000");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));

        st.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE accNo=1");

        st.executeUpdate("DELETE FROM accounts WHERE accNo=1");

        con.close();
    }
}