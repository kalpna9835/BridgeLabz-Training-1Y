import java.sql.*;

public class MovieManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS movies(id INT, name VARCHAR(50), seats INT)");

        st.executeUpdate("INSERT INTO movies VALUES (1,'Avengers',50)");

        ResultSet rs = st.executeQuery("SELECT * FROM movies WHERE seats > 0");
        while(rs.next())
            System.out.println(rs.getString(2)+" Seats:"+rs.getInt(3));

        st.executeUpdate("UPDATE movies SET seats = seats - 1 WHERE id=1");

        st.executeUpdate("DELETE FROM movies WHERE id=1");

        con.close();
    }
}