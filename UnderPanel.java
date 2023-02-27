import java.awt.Color;
import java.awt.Font;
import java.net.http.WebSocket.Listener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UnderPanel {
  static JPanel underpanel = new JPanel();
  static JTextArea orderlistTextArea = new JTextArea();
  static JScrollPane orderlistPane = new JScrollPane();
  static JButton orderbutton = new JButton("주문하기");
  static int price = 0;
  static JLabel pricelabel = new JLabel("가격 : " + price);

  public UnderPanel(){
    underpanel.setLayout(null);
    underpanel.setBounds(10, 580, 465, 170);
    underpanel.setBackground(new Color(100,100,100));
    
    orderlistPane.setViewportView(orderlistTextArea);
    orderlistPane.setBounds(20, 590 ,300,100);
    
    
    orderbutton.setBounds(330,590,135,135);
    orderbutton.addActionListener(new MenuOrderAction());
    pricelabel.setBounds(20,700,300,50);
    pricelabel.setFont(new Font("맑은 고딕", Font.BOLD,20));
  }

  




  public JScrollPane getorderlist(){
    return orderlistPane;
  }
  public JPanel getUnderpanel(){
    return underpanel;
  }
  public JButton getorderButton(){
    return orderbutton;
  }
  public JLabel getpricelabel(){
    return pricelabel;
  }


}
