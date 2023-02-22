
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

  private Connection conn; // DB 커넥션 연결 객체
  private static final String USERNAME = "root";// DBMS접속 시 아이디
  private static final String PASSWORD = "";// DBMS접속 시 비밀번호
  private static final String URL = "jdbc:mysql://localhost/cafe_db";// DBMS접속할 db명
  ResultSet rs;
  Statement stmt;

  public DB() {
    try {
      System.out.println("생성자");
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      System.out.println("드라이버 로딩 성공");
    } catch (Exception e) {
      System.out.println("드라이버 로딩 실패 ");
      try {
        conn.close();
      } catch (SQLException e1) {
      }
    }
    

  }

  public String getcoffee(String coffee , int num) throws SQLException {
    // 쿼리문 준비
    try {
      stmt = conn.createStatement();
      String str = "SELECT * FROM coffee WHERE Name = " + coffee;
      rs = stmt.executeQuery(str);
      rs.next();
    } catch (Exception e) {
      System.out.println("Board데이터 삽입 실패!");
    }
    addOption.testtall = rs.getString("Tall");
    System.out.println(rs.getString(num));
    return rs.getString(num);
  }


}