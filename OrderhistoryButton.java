import javax.swing.JButton;

public class OrderhistoryButton {
  static JButton orderlistbutton = new JButton("�ֹ� ����");

  public OrderhistoryButton(){
    orderlistbutton.setBounds(385,5,95,30);
    orderlistbutton.addActionListener(new OrderhistoryAction());
  }
}
