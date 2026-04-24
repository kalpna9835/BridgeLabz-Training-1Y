import java.sql.*;

public class SalesManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS sales(id INT, bookName VARCHAR(100), quantity INT, price DOUBLE)");

        st.executeUpdate("INSERT INTO sales VALUES (1,'Java Book',2,500)");

        ResultSet rs = st.executeQuery("SELECT * FROM sales WHERE quantity > 1");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("UPDATE sales SET quantity=3 WHERE id=1");

        st.executeUpdate("DELETE FROM sales WHERE id=1");

        con.close();
    }
}