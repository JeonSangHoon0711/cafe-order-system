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
  OrderListButton temporder = new OrderListButton();
  label lab;
  
  public OrderPage() {
    
    OrderFrame.setSize(500, 800);
    OrderFrame.setVisible(true);
    OrderFrame.setDefaultCloseOperation(OrderFrame.EXIT_ON_CLOSE);
    OrderFrame.setLayout(null);
    OrderFrame.setBackground(Color.WHITE);
    
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

    americanoButton.setBounds(80, 40, 130, 130);
    cafelatteButton.setBounds(260, 40, 130, 130);
    cappuccinoButton.setBounds(80, 220, 130, 130);
    chocolatemochaButton.setBounds(260, 220, 130, 130);
    coldbrewButton.setBounds(80, 400, 130, 130);
    dolcelatteButton.setBounds(260, 400, 130, 130); 
    
    lab = new label("아메리카노 4100원", 90, 170, 110, 20);
    OrderFrame.getContentPane().add(lab);
    lab = new label("카페라떼 4600원", 275, 170, 110, 20);
    OrderFrame.getContentPane().add(lab);
    lab = new label("카푸치노 4600원", 95, 350, 110, 20);
    OrderFrame.getContentPane().add(lab);
    lab = new label("초콜릿모카 5600원", 270, 350, 110, 20);
    OrderFrame.getContentPane().add(lab);
    lab = new label("콜드브루 4400원", 95, 530, 110, 20);
    OrderFrame.getContentPane().add(lab);
    lab = new label("돌체라떼 5600원", 275, 530, 110, 20);
    OrderFrame.getContentPane().add(lab);
    
    OrderFrame.getContentPane().setBackground(Color.white);
    
    OrderFrame.add(UnderPanel.pricelabel);
    OrderFrame.add(UnderPanel.orderlistPane);
    OrderFrame.add(UnderPanel.orderbutton);
    OrderFrame.add(UnderPanel.underpanel);
    OrderFrame.add(OrderListButton.orderlistbutton);
    OrderFrame.getContentPane().add(americanoButton);
    OrderFrame.getContentPane().add(cafelatteButton);
    OrderFrame.getContentPane().add(cappuccinoButton);
    OrderFrame.getContentPane().add(chocolatemochaButton);
    OrderFrame.getContentPane().add(coldbrewButton);
    OrderFrame.getContentPane().add(dolcelatteButton); 
  }
}
