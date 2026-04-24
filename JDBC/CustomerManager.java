import java.sql.*;

public class CustomerManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS customers(id INT, name VARCHAR(50), phone VARCHAR(15))");

        st.executeUpdate("INSERT INTO customers VALUES (1,'Riya','9999999999')");

        ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE name LIKE '%Ri%'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("UPDATE customers SET phone='8888888888' WHERE id=1");

        st.executeUpdate("DELETE FROM customers WHERE id=1");

        con.close();
    }
}