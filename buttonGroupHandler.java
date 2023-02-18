import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class buttonGroupHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		addOption.coffeePrice = 5000;
		addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
				Integer.parseInt(addOption.cnt1.getText())+"");
		if(addOption.loading) {
			if(addOption.btnG2[0].isSelected()) {
				addOption.coffeePrice = 5000;
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");
			}else if(addOption.btnG2[1].isSelected()) {
				addOption.coffeePrice = 5500;
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");
			}else if(addOption.btnG2[2].isSelected()) {
				addOption.coffeePrice = 6000;
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");
			}
		}
	}

}
