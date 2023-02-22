
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.net.URL;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

public class addOption extends JFrame {

public class addOption extends JFrame {

	public static Container c;
	public static label lab, img, menu, cnt1, price, cnt2, cnt3, cnt4;
	public static button add1, add2, add3, add4, minus1, minus2, minus3, minus4, cancel, finish;
	public static toggleButton[] btnG1 = new toggleButton[2], btnG2 = new toggleButton[3];
	public static toggleButton[] btnG1 = new toggleButton[2], btnG2 = new toggleButton[3];
	public static ButtonGroup tempG, sizeG;
	public static int coffeePrice = 5000, optionPrice = 0;
	public static String[] menuName = { "아메리카노", "카푸치노", "카페라떼", "초콜릿모카", "돌체리떼", "콜드브루" };
	public static ImageIcon plus = new ImageIcon("imgs//plus.png"),
			minus = new ImageIcon("imgs//minus.png");
	public static String testtall = "";
	public addOption(int selectedMenu) {
		Image americanoimage = null;
    Image cafelatteimage = null;
    Image cappuccinoimage = null;
    Image chocolatemochaimage = null;
    Image coldbrewimage = null;
    Image dolcelatteimage = null;
		Image plusimage = null;
		Image minusimage = null;
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
		try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/plus.png?raw=true");
      plusimage = ImageIO.read(url);
    } catch (IOException e) {
		}
		try {
      URL url = new URL("https://github.com/JeonSangHoon0711/cafe-order-system-image/blob/main/minus.png?raw=true");
      minusimage = ImageIO.read(url);
    } catch (IOException e) {
		}
		ImageIcon[] menuImgs = { new ImageIcon(americanoimage),
				new ImageIcon(cafelatteimage),
				new ImageIcon(cappuccinoimage),
				new ImageIcon(chocolatemochaimage),
				new ImageIcon(coldbrewimage),
				new ImageIcon(dolcelatteimage) };
			plus = new ImageIcon(plusimage);
			minus = new ImageIcon(minusimage);

		setTitle("옵션을 선택해 주세요.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		setLayout(null);
		setSize(500, 800);
		setVisible(true);
		c.setBackground(Color.WHITE);

		menu = new label(menuName[selectedMenu], 200, 20, 200, 100);
		c.add(menu);
		menu.setFont(new Font("굴림", Font.BOLD, 20));
		img = new label("img", 50, 50, 130, 130, menuImgs[selectedMenu]);
		c.add(img);
		add1 = new button(200, 150, 30, 30, plus);
		c.add(add1);
		cnt1 = new label("1", 260, 150, 30, 30);
		c.add(cnt1);
		minus1 = new button(300, 150, 30, 30, minus);
		c.add(minus1);
		price = new label(coffeePrice + "", 350, 150, 100, 30);
		c.add(price);

		tempG = new ButtonGroup();
		btnG1[0] = new toggleButton("Ice", 70, 230, 150, 50);
		c.add(btnG1[0]);
		btnG1[1] = new toggleButton("hot", 280, 230, 150, 50);
		c.add(btnG1[1]);
		tempG.add(btnG1[0]);
		tempG.add(btnG1[1]);
		btnG1[0] = new toggleButton("Ice", 70, 230, 150, 50);
		c.add(btnG1[0]);
		btnG1[1] = new toggleButton("hot", 280, 230, 150, 50);
		c.add(btnG1[1]);
		tempG.add(btnG1[0]);
		tempG.add(btnG1[1]);
		btnG1[0].setSelected(true);


		sizeG = new ButtonGroup();
		lab = new label("사이즈", 30, 350, 50, 20);
		c.add(lab);
		btnG2[0] = new toggleButton("tall", 100, 320, 80, 80);
		c.add(btnG2[0]);
		btnG2[1] = new toggleButton("grande", 230, 320, 80, 80);
		c.add(btnG2[1]);
		btnG2[2] = new toggleButton("venti", 360, 320, 80, 80);
		c.add(btnG2[2]);
		sizeG.add(btnG2[0]);
		sizeG.add(btnG2[1]);
		sizeG.add(btnG2[2]);
		lab = new label("사이즈", 30, 350, 50, 20);
		c.add(lab);
		btnG2[0] = new toggleButton("tall", 100, 320, 80, 80);
		c.add(btnG2[0]);
		btnG2[1] = new toggleButton("grande", 230, 320, 80, 80);
		c.add(btnG2[1]);
		btnG2[2] = new toggleButton("venti", 360, 320, 80, 80);
		c.add(btnG2[2]);
		sizeG.add(btnG2[0]);
		sizeG.add(btnG2[1]);
		sizeG.add(btnG2[2]);
		btnG2[0].setSelected(true);

		lab = new label("휘핑 크림 추가", 30, 450, 100, 20);
		c.add(lab);
		lab = new label("600원", 200, 450, 100, 20);
		c.add(lab);
		add2 = new button(300, 445, 30, 30, plus);
		c.add(add2);
		cnt2 = new label("0", 365, 445, 30, 30);
		c.add(cnt2);
		minus2 = new button(410, 445, 30, 30, minus);
		c.add(minus2);
		lab = new label("시럽 추가", 30, 530, 100, 20);
		c.add(lab);
		lab = new label("300원", 200, 530, 100, 20);
		c.add(lab);
		add3 = new button(300, 525, 30, 30, plus);
		c.add(add3);
		cnt3 = new label("0", 365, 525, 30, 30);
		c.add(cnt3);
		minus3 = new button(410, 525, 30, 30, minus);
		c.add(minus3);
		lab = new label("샷 추가", 30, 610, 100, 20);
		c.add(lab);
		lab = new label("500원", 200, 610, 100, 20);
		c.add(lab);
		add4 = new button(300, 605, 30, 30, plus);
		c.add(add4);
		cnt4 = new label("0", 365, 605, 30, 30);
		c.add(cnt4);
		minus4 = new button(410, 605, 30, 30, minus);
		c.add(minus4);

		cancel = new button("취소", 70, 680, 150, 50);
		c.add(cancel);
		finish = new button("선택완료", 280, 680, 150, 50);
		c.add(finish);

		setLocationRelativeTo(null);
		
		loading = true;
	}
}