import java.sql.*;

public class TaskManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS tasks(id INT, title VARCHAR(100), status VARCHAR(20))");

        st.executeUpdate("INSERT INTO tasks VALUES (1,'Study JDBC','Pending')");

        ResultSet rs = st.executeQuery("SELECT * FROM tasks WHERE status='Pending'");
        while(rs.next())
            System.out.println(rs.getString(2));

        st.executeUpdate("UPDATE tasks SET status='Completed' WHERE id=1");

        st.executeUpdate("DELETE FROM tasks WHERE status='Completed'");

        con.close();
    }
}