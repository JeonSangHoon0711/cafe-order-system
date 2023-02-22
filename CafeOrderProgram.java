import java.sql.SQLException;

public class CafeOrderProgram {
    public static void main(String[] args) throws SQLException {
      DB db = new DB();
      db.getcoffee("'아메리카노'",2);
      db.insert("테스트");
      
      // OrderPage OrderPage = new OrderPage();
  }
  
}
