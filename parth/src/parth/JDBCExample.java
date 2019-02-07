
package parth;

import java.sql.*;


public class JDBCExample {
    public static void main(String[] args) {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "argusadmin");
         //   System.out.println("Successfully connected");
            Statement stmt = conn.createStatement();
            String sql;
        /*    sql = "CREATE TABLE COMPANY " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " SALARY         REAL)";
            stmt.executeUpdate(sql); */
          /*  String insertQuery = "INSERT INTO COMPANY VALUES(3, 'GOPEN', 20, 'RAJKOT', 9000)";
            int x = stmt.executeUpdate(insertQuery);
            System.out.println(x + " record inserted");*/
            ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY");
            
            while (rs.next()) {
                System.out.print(rs.getString(1) + " ");
                System.out.print(rs.getString(2) + "   ");
                System.out.print(rs.getString(3) + "    ");
                System.out.print(rs.getString(4));
                System.out.println("");
            }
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //System.out.println("Successfully connected");
    }
}
