import java.sql.*;

public class RestaurantManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS menu(id INT, itemName VARCHAR(50), price DOUBLE)");

        st.executeUpdate("INSERT INTO menu VALUES (1,'Burger',150)");

        ResultSet rs = st.executeQuery("SELECT * FROM menu WHERE price < 200");
        while(rs.next())
            System.out.println(rs.getString(2)+" "+rs.getDouble(3));

        st.executeUpdate("UPDATE menu SET price=180 WHERE id=1");

        st.executeUpdate("DELETE FROM menu WHERE id=1");

        con.close();
    }
}