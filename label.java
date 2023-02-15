import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class label extends JLabel{
	String name;
	int x, y, w, h;
	ImageIcon img;
	
	public label(String name, int x, int y, int w, int h){
		this.name=name; this.x=x; this.y=y; this.w=w; this.h=h;
		
		setText(name);
		setBounds(x, y, w, h);
	}
	
	public label(String name, int x, int y, int w, int h, ImageIcon img){
		this(name, x, y, w, h);
		this.img = img;
		
		setBounds(x, y, w, h);
		setIcon(img);
	}
}