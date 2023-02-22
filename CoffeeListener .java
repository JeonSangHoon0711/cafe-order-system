import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CoffeeListener implements ActionListener {
  int number = 0;

  public CoffeeListener(int number){
    this.number = number;
  }

	public void actionPerformed(ActionEvent e) {
		// new addOption(number);
    UnderPanel.orderlistTextArea.append(""+number+"\n");
    new addOption(number);
    
}

}