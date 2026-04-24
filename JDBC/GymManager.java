import java.sql.*;

public class GymManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS members(id INT, name VARCHAR(50), type VARCHAR(20), months INT)");

        st.executeUpdate("INSERT INTO members VALUES (1,'Aman','Premium',6)");

        ResultSet rs = st.executeQuery("SELECT * FROM members WHERE type='Premium'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("UPDATE members SET months=months+3 WHERE id=1");

        st.executeUpdate("DELETE FROM members WHERE id=1");

        con.close();
    }
}