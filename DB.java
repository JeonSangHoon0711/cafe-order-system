
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

  private Connection conn;
  private static final String USERNAME = "newuser";
  private static final String PASSWORD = "1q2w3e4r!";
  private static final String URL = "jdbc:mysql://192.168.0.124/cafe_db";
  ResultSet rs;
  Statement stmt;

  public DB() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (Exception e) {
      System.out.println("드라이버 로딩 실패");
      try {
        conn.close();
      } catch (SQLException e1) {
      }
    }
  }

  public int getcoffee(String coffee, int num) throws SQLException {
    try {
      stmt = conn.createStatement();
      String str = "SELECT * FROM coffee WHERE Name = '"+coffee+"'";
      rs = stmt.executeQuery(str);
      rs.next();
    } catch (Exception e) {
      System.out.println("Board 데이터 삽입 실패!");
    }
    return rs.getInt(num);
  }


}