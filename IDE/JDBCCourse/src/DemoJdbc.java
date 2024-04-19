import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
            import package : done
            load and register : done
            create connection : done
            create statement
            execute statement
            process the results
            close
         */

        /* Connect Database */
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "1202";

        /* SQL */
        String sql = "select * from student";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected Database");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);

//        Get Data from Database
        while (rs.next()){
            System.out.print(rs.getInt(1) + " : ");
            System.out.print(rs.getString(2) + " : ");
            System.out.println(rs.getInt(3));
        }
        System.out.println("Connection Closed");
        con.close();

    }
}
