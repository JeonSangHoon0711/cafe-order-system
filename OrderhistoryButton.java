import javax.swing.JButton;

public class OrderhistoryButton {
  static JButton orderlistbutton = new JButton("전체주문내역");
  
  

  public OrderhistoryButton(){
    
    orderlistbutton.setBounds(0,0,70,40);
    orderlistbutton.addActionListener(new OrderhistoryAction());
  }

  
}
