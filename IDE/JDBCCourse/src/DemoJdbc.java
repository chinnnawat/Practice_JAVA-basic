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
/*        String sql = "select * from student";     /* Select User */
//        String sql = "insert into student values (3, 'Jane', 48 )" ;        /* Create User */
//        String sql = "update student set sname='Max' where sid=3 ";     /* Update info User by sid */
        String sql = "delete from student where sid=3";     /* Delete User */
//        *************************************************************************************************************************
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected Database");
        Statement st = con.createStatement();

        /* Get Data from Database */
/*        while (rs.next()){
//            System.out.print(rs.getInt(1) + " : ");
//            System.out.print(rs.getString(2) + " : ");
//            System.out.println(rs.getInt(3));
//        }
 */

        /* Create Student
        boolean status = st.execute(sql);
        System.out.println(status);
        */

        /* Update info User */
//        st.execute(sql);

        /* Delete User */
        st.execute(sql);


        con.close();

    }
}
