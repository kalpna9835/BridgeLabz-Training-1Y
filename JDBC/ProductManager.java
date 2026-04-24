import java.sql.*;

public class ProductManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS product(pid INT, pname VARCHAR(50), qty INT)");

        st.executeUpdate("INSERT INTO product VALUES (1,'Pen',5),(2,'Book',20),(3,'Pencil',8)");

        ResultSet rs = st.executeQuery("SELECT * FROM product WHERE qty < 10");
        while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

        st.executeUpdate("UPDATE product SET qty = qty+10 WHERE pid=1");

        st.executeUpdate("DELETE FROM product WHERE pid=3");

        con.close();
    }
}