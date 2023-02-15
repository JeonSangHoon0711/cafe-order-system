import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class addOption extends JFrame{
	public static Container c;
	public static label lab, img, menu, cnt1, price, cnt2, cnt3, cnt4;
	public static button add1, add2, add3, add4, minus1, minus2, minus3, minus4, cancel, finish;
	public static toggleButton[] btnG1 = new toggleButton[2], btnG2 = new toggleButton[3]; 
	public static ButtonGroup tempG, sizeG;
	public static ImageIcon plus = new ImageIcon("imgs//plus.png"), 
							minus = new ImageIcon("imgs//minus.png"); 
	public static int coffeePrice=5000, optionPrice=0;
	public static String[] menuName = {"�Ƹ޸�ī��", "īǪġ��", "ī���", "���ݸ���ī", "��ü����", "�ݵ���"};
	public static ImageIcon[] menuImgs = {new ImageIcon("imgs//coffeeSample.png"), 
										  new ImageIcon("imgs//coffeeSample.png"), 
										  new ImageIcon("imgs//coffeeSample.png"), 
										  new ImageIcon("imgs//coffeeSample.png"), 
										  new ImageIcon("imgs//coffeeSample.png"), 
										  new ImageIcon("imgs//coffeeSample.png")};
	
	public addOption(int selectedMenu) {
		setTitle("�ɼ��� ������ �ּ���.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		setLayout(null);
		setSize(500, 800);
		setVisible(true);
		c.setBackground(Color.WHITE);
		
		menu = new label(menuName[selectedMenu], 200, 20, 200, 100); c.add(menu);
		menu.setFont(new Font("����", Font.BOLD, 20));
		img = new label("img", 50, 50, 130, 130, menuImgs[selectedMenu]); c.add(img);
		add1 = new button(200, 150, 30, 30, plus); c.add(add1);
		cnt1 = new label("1", 260, 150, 30, 30); c.add(cnt1);
		minus1 = new button(300, 150, 30, 30, minus); c.add(minus1);
		price = new label(coffeePrice+"", 350, 150, 100, 30); c.add(price);
		
		tempG = new ButtonGroup();
		btnG1[0] = new toggleButton("Ice", 70, 230, 150, 50); c.add(btnG1[0]);
		btnG1[1] = new toggleButton("hot", 280, 230, 150, 50); c.add(btnG1[1]);
		tempG.add(btnG1[0]); tempG.add(btnG1[1]);
		btnG1[0].setSelected(true);
		
		sizeG = new ButtonGroup();
		lab = new label("������", 30, 350, 50, 20); c.add(lab);
		btnG2[0] = new toggleButton("tall", 100, 320, 80, 80); c.add(btnG2[0]);
		btnG2[1] = new toggleButton("grande", 230, 320, 80, 80); c.add(btnG2[1]);
		btnG2[2] = new toggleButton("venti", 360, 320, 80, 80); c.add(btnG2[2]);
		sizeG.add(btnG2[0]); sizeG.add(btnG2[1]); sizeG.add(btnG2[2]);
		btnG2[0].setSelected(true);
		
		lab = new label("���� ũ�� �߰�", 30, 450, 100, 20); c.add(lab);
		lab = new label("600��", 200, 450, 100, 20); c.add(lab);
		add2 = new button(300, 445, 30, 30, plus); c.add(add2);
		cnt2 = new label("0", 365, 445, 30, 30); c.add(cnt2);
		minus2 = new button(410, 445, 30, 30, minus); c.add(minus2);
		lab = new label("�÷� �߰�", 30, 530, 100, 20); c.add(lab);
		lab = new label("300��", 200, 530, 100, 20); c.add(lab);
		add3 = new button(300, 525, 30, 30, plus); c.add(add3);
		cnt3 = new label("0", 365, 525, 30, 30); c.add(cnt3);
		minus3 = new button(410, 525, 30, 30, minus); c.add(minus3);
		lab = new label("�� �߰�", 30, 610, 100, 20); c.add(lab);
		lab = new label("500��", 200, 610, 100, 20); c.add(lab);
		add4 = new button(300, 605, 30, 30, plus); c.add(add4);
		cnt4 = new label("0", 365, 605, 30, 30); c.add(cnt4);
		minus4 = new button(410, 605, 30, 30, minus); c.add(minus4);
		
		cancel = new button("���", 70, 680, 150, 50); c.add(cancel);
		finish = new button("���ÿϷ�", 280, 680, 150, 50); c.add(finish);
		
		setLocationRelativeTo(null);
	}
}