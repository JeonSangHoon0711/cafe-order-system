
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class toggleButton extends JToggleButton {
	String name;
	int x, y, w, h;
	ImageIcon img;
	
	public toggleButton(String name, int x, int y, int w, int h){
		this.name=name;
		this.x=x; this.y=y; this.w=w; this.h=h;
		
		setText(name);
		setBounds(x, y, w, h);
		addItemListener(new buttonGroupHandler());
	}
}
