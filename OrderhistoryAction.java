import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;

class OrderhistoryAction implements ActionListener {
  int number = 0;
  JFrame historyframe;
  
  
  public void actionPerformed(ActionEvent e) {
    try {
      historyframe = new Orderhistoryframe();
    } catch (SQLException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }
}