import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.xml.crypto.Data;

/*
public class connectDB {
	Connection conn = null;
	ResultSet rs = null;
	Statement st = null;
	PreparedStatement ps = null;
	
	public connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "newuser";
			String pw = "1q2w3e4r!";
			String url = "jdbc:mysql://localhost:3306/cafe_db";
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
	
	public void insert(Data data) {
		try {
			String sql = "INSERT INTO //CRUD_TABLE(name, age) values(?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, data.menu);
			ps.setInt(2, data.age);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
	}
	
	public ArrayList<Data> read() {
		ArrayList<Data> arr = new ArrayList<Data>();
		System.out.println(arr);
		try {
			st = conn.createStatement();
			String sql = "SELECT * FROM //CRUD_TABLE ORDER BY AGE ASC";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				arr.add(new Data(rs.getString(1), rs.getInt(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return arr;
	}
	
}
*/