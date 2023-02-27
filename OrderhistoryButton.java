import javax.swing.JButton;

public class OrderhistoryButton {
  static JButton orderlistbutton = new JButton("주문 내역");

  public OrderhistoryButton(){
    orderlistbutton.setBounds(385,5,95,30);
    orderlistbutton.addActionListener(new OrderhistoryAction());
  }
}
