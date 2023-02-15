import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class buttonGroupHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		JButton btn  = (JButton)e.getSource();
		
		if(btn.getText() == "tall") {
			
		}else if(btn.getText() == "grande") {
			
		}else if(btn.getText() == "venti") {
			
		}
	}

}
