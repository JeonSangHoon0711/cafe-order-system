import javax.swing.ImageIcon;
import javax.swing.JButton;

class button extends JButton{
	String name;
	int x, y, w, h;
	ImageIcon img;
	
	public button(String name, int x, int y, int w, int h){
		this.name=name;
		this.x=x; this.y=y; this.w=w; this.h=h;
		
		setText(name);
		setBounds(x, y, w, h);
		addActionListener(new buttonHandler());
	}
	
	public button(int x, int y, int w, int h, ImageIcon img){
		this.x=x; this.y=y; this.w=w; this.h=h;
		this.img = img;
		
		setIcon(img);
		setBounds(x, y, w, h);
		setBorderPainted(false);
		setContentAreaFilled(false);
		addActionListener(new buttonHandler());
	}
}
