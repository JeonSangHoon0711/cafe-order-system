import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;

class CoffeeListener implements ActionListener {
  int number = 0;
  static JFrame optionFrame;
  
  public CoffeeListener(int number){
    this.number = number;
  }
  
  public void actionPerformed(ActionEvent e) {
    try {
      optionFrame = new addOption(number);
    } catch (SQLException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }
}