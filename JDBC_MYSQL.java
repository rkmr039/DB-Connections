import java.sql.*;
class JDBC_MYSQL {
 public static void main(String args[]) {
  try {
   Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/training", "root", "rkmr039@mysqL");
   Statement stmt = con.createStatement();
   ResultSet rs = stmt.executeQuery("select * from students");
   while (rs.next())
    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
   con.close();
  } catch (Exception e) {
   System.out.println(e);
  }
 }
}
