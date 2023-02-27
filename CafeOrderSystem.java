import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class MyFrame extends JFrame{
	JTextField id, title, p , year,price, author;
	JButton previousButton, nextButton, InsertButton, deleteButton, searchButton;
	ResultSet rs;
	Statement stmt;
	public MyFrame() throws SQLException{
		super("Database Viewer");
		Connection con = makeConnection();
		stmt = con.createStatement();


		String str = "SELECT * FROM coffee WHERE Name = '아메리카노'";
		rs = stmt.executeQuery(str);

		setLayout(new GridLayout(0, 2));
		add(new JLabel("ID", JLabel.CENTER));
		add(id = new JTextField(""));
		add(new JLabel("TITLE", JLabel.CENTER));
		add(title = new JTextField(""));
		add(new JLabel("PUBLISHER", JLabel.CENTER));
		add(p = new JTextField(""));
		add(new JLabel("YEAR", JLabel.CENTER));
		add(year = new JTextField(""));
		add(new JLabel("PRICE", JLabel.CENTER));
		add(price = new JTextField(""));	
		add(new JLabel("���옄 寃��깋", JLabel.CENTER));
		add(author = new JTextField(""));
		
		previousButton = new JButton("Previous");
		previousButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					rs.previous();
					System.out.println(rs.getString("Tall"));
					System.out.println(rs.getString("Tall"));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					rs.next();
					System.out.println(rs.getString("Tall"));
					System.out.println(rs.getString("Tall"));
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		add(nextButton);
		add(previousButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,800);
		setSize(500,800);
		setVisible(true);
		
	}
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/cafe_db";
		String id = "root";
		String password = "";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버적재성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("db연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를찾을수없음");
		} catch (SQLException e) {
			System.out.println("연결실패");
		}
		return con;
	}
	
}


public class CafeOrderSystem {
	public static void main(String[] args) throws SQLException{
		OrderPage OrderPage = new OrderPage();
	}
}
