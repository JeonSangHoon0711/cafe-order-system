import java.io.IOException;
import java.net.URL;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Color;

public class OrderPage {
  static JFrame OrderFrame = new JFrame();
  UnderPanel underpanel = new UnderPanel();
  // AmericanoButton americanoButton = new AmericanoButton();
  
  public OrderPage() {

    
    OrderFrame.setSize(500, 800);
    OrderFrame.setVisible(true);
    OrderFrame.setDefaultCloseOperation(OrderFrame.EXIT_ON_CLOSE);
    OrderFrame.setLayout(null);
    
    Image americanoimage = null;
    Image cafelatteimage = null;
    Image cappuccinoimage = null;
    Image chocolatemochaimage = null;
    Image coldbrewimage = null;
    Image dolcelatteimage = null;


    try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/Americano.jpg?raw=true");
      americanoimage = ImageIO.read(url);
    } catch (IOException e) {
    }
    try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/Cafelatte.jpg?raw=true");
      cafelatteimage = ImageIO.read(url);
    } catch (IOException e) {
    }
    try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/Cappuccino.jpg?raw=true");
      cappuccinoimage = ImageIO.read(url);
    } catch (IOException e) {
    }
    try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/ChocolateMocha.jpg?raw=true");
      chocolatemochaimage = ImageIO.read(url);
    } catch (IOException e) {
    }
    try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/ColdBrew.jpg?raw=true");
      coldbrewimage = ImageIO.read(url);
    } catch (IOException e) {
    }
    try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/DolceLatte.jpg?raw=true");
      dolcelatteimage = ImageIO.read(url);
    } catch (IOException e) {
    }
    
    JButton americanoButton = new JButton(new ImageIcon(americanoimage));
    JButton cafelatteButton = new JButton(new ImageIcon(cafelatteimage));
    JButton cappuccinoButton = new JButton(new ImageIcon(cappuccinoimage));
    JButton chocolatemochaButton = new JButton(new ImageIcon(chocolatemochaimage));
    JButton coldbrewButton = new JButton(new ImageIcon(coldbrewimage));
    JButton dolcelatteButton = new JButton(new ImageIcon(dolcelatteimage));

    americanoButton.addActionListener(new CoffeeListener(0));
    cafelatteButton.addActionListener(new CoffeeListener(1));
    cappuccinoButton.addActionListener(new CoffeeListener(2));
    chocolatemochaButton.addActionListener(new CoffeeListener(3));
    coldbrewButton.addActionListener(new CoffeeListener(4));
    dolcelatteButton.addActionListener(new CoffeeListener(5));

    americanoButton.setBounds(80, 10, 130, 130);
    cafelatteButton.setBounds(260, 10, 130, 130);
    cappuccinoButton.setBounds(80, 190, 130, 130);
    chocolatemochaButton.setBounds(260, 190, 130, 130);
    coldbrewButton.setBounds(80, 370, 130, 130);
    dolcelatteButton.setBounds(260, 370, 130, 130);
    
    OrderFrame.add(UnderPanel.pricelabel);
    OrderFrame.add(UnderPanel.orderlistPane);
    OrderFrame.add(UnderPanel.underpanel);
    OrderFrame.add(UnderPanel.orderbutton);
    OrderFrame.add(OrderListButton.orderlistbutton);
    OrderFrame.getContentPane().add(americanoButton);
    OrderFrame.getContentPane().add(cafelatteButton);
    OrderFrame.getContentPane().add(cappuccinoButton);
    OrderFrame.getContentPane().add(chocolatemochaButton);
    OrderFrame.getContentPane().add(coldbrewButton);
    OrderFrame.getContentPane().add(dolcelatteButton);
    
    
    while(true){
      OrderFrame.repaint();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      UnderPanel.orderlistTextArea.append("test\n");
    }

  }

}
