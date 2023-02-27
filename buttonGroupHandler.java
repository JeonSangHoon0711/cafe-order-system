import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class buttonGroupHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		DB db = new DB();
		
		try {
			addOption.coffeePrice = db.getcoffee(addOption.name, 2);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
				Integer.parseInt(addOption.cnt1.getText())+"");
		
		if(addOption.loading) {
			if(addOption.btnG2[0].isSelected()) {
				try {
					addOption.coffeePrice = db.getcoffee(addOption.name, 2);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");
			}else if(addOption.btnG2[1].isSelected()) {
				try {
					addOption.coffeePrice = db.getcoffee(addOption.name, 3);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");
			}else if(addOption.btnG2[2].isSelected()) {
				try {
					addOption.coffeePrice = db.getcoffee(addOption.name, 4);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");
			}
		}	
	}
}
