import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class buttonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn  = (JButton)e.getSource();
		
		if (btn == addOption.add1) {
			addOption.cnt1.setText(Integer.parseInt(addOption.cnt1.getText())+1+"");
			addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
					Integer.parseInt(addOption.cnt1.getText())+"");
		}else if(btn == addOption.add2) {
			addOption.cnt2.setText(Integer.parseInt(addOption.cnt2.getText())+1+"");
			addOption.optionPrice+=600;
			addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
					Integer.parseInt(addOption.cnt1.getText())+"");
		}else if(btn == addOption.add3) {
			addOption.cnt3.setText(Integer.parseInt(addOption.cnt3.getText())+1+"");
			addOption.optionPrice+=300;
			addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
					Integer.parseInt(addOption.cnt1.getText())+"");
		}else if(btn == addOption.add4) {
			addOption.cnt4.setText(Integer.parseInt(addOption.cnt4.getText())+1+"");
			addOption.optionPrice+=500;
			addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
					Integer.parseInt(addOption.cnt1.getText())+"");
		}else if(btn == addOption.minus1) {if(Integer.parseInt(addOption.cnt1.getText()) > 1) {
				addOption.cnt1.setText(Integer.parseInt(addOption.cnt1.getText())-1+"");
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");}
		}else if(btn == addOption.minus2) {if(Integer.parseInt(addOption.cnt2.getText()) > 0) {
				addOption.cnt2.setText(Integer.parseInt(addOption.cnt2.getText())-1+"");
				addOption.optionPrice-=600;
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");}
		}else if(btn == addOption.minus3) {if(Integer.parseInt(addOption.cnt3.getText()) > 0) {
				addOption.cnt3.setText(Integer.parseInt(addOption.cnt3.getText())-1+"");
				addOption.optionPrice-=300;
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");}
		}else if(btn == addOption.minus4) {if(Integer.parseInt(addOption.cnt4.getText()) > 0) {
				addOption.cnt4.setText(Integer.parseInt(addOption.cnt4.getText())-1+"");
				addOption.optionPrice-=500;
				addOption.price.setText((addOption.coffeePrice+addOption.optionPrice)*
						Integer.parseInt(addOption.cnt1.getText())+"");}
		}else if(btn.getText()=="취소") {
			System.exit(0);
		}else if(btn.getText()=="선택완료") {
			
		}
	}
}
