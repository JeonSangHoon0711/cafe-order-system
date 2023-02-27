
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Orderhistoryframe extends JFrame {

	public static Container c;
  JTextArea orderhistoryTextArea = new JTextArea();
  JScrollPane orderhistoryPane = new JScrollPane();

	DB db = new DB();
	
	public Orderhistoryframe() throws SQLException {
		
		setTitle("");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		c = getContentPane();
		setLayout(null);
		setSize(400, 500);
		setVisible(true);
		c.setBackground(Color.WHITE);
		orderhistoryPane.setViewportView(orderhistoryTextArea);
    orderhistoryPane.setBounds(0, 0 ,490,500);
    orderhistoryTextArea.setText(db.gethistory());
    c.add(orderhistoryPane);
    
		setLocationRelativeTo(null);
		
	}
}