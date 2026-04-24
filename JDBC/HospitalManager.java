import java.sql.*;

public class HospitalManager {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
        Statement st = con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS patients(id INT, name VARCHAR(50), disease VARCHAR(50))");

        st.executeUpdate("INSERT INTO patients VALUES (1,'Amit','Fever')");

        ResultSet rs = st.executeQuery("SELECT * FROM patients WHERE disease='Fever'");
        while(rs.next())
            System.out.println(rs.getString(2)+" "+rs.getString(3));

        st.executeUpdate("UPDATE patients SET disease='Cold' WHERE id=1");

        st.executeUpdate("DELETE FROM patients WHERE id=1");

        con.close();
    }
}