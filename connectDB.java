
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectDB {
	public Connection conn = null;
	public ResultSet rs = null;
	public Statement st = null;
	public PreparedStatement ps = null;
	static int price = 0;
	
	public connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "newuser";
			String pw = "1q2w3e4r!";
			String url = "jdbc:mysql://192.168.0.124/cafe_db";
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
	}
	
	public void dbClose() {
		try {
			if (rs != null) rs.close();
			if (st != null) st.close();
			if (ps != null) ps.close();
		} catch (Exception e) {
			System.out.println(e + "=> dbClose fail");
		}
	}
	
	public int readCoffeePrice(String name) {
		System.out.println(price);
		try {
			st = conn.createStatement();
			String sql = "SELECT * FROM addoption ORDER BY "+name+" ASC";
			rs = st.executeQuery(sql);
			price = rs.getInt(2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return price;
	}
}