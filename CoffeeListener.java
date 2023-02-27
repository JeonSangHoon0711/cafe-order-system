import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class CoffeeListener implements ActionListener {
  int number = 0;
  static JFrame optionFrame;
  
  public CoffeeListener(int number){
    this.number = number;
  }
  
  public void actionPerformed(ActionEvent e) {
	optionFrame = new addOption(number);
  }
}