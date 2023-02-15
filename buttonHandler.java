
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class buttonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn  = (JButton)e.getSource();
		String menu, temp="", size="";
		int num, whipping, syrup, shot, price;
		Data history;
		
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
		}else if(btn.getText()=="Ãë¼Ò") {
			System.exit(0);
		}else if(btn.getText()=="¼±ÅÃ¿Ï·á") {
			menu = addOption.menuName[addOption.menuNum];
			num = Integer.parseInt(addOption.cnt1.getText());
			for(int i=0; i<2; i++) {
				if(addOption.btnG1[i].isSelected()) temp = addOption.btnG1[i].getText();
			}
			for(int j=0; j<3; j++) {
				if(addOption.btnG2[j].isSelected()) size = addOption.btnG2[j].getText();
			}
			whipping = Integer.parseInt(addOption.cnt2.getText());
			syrup = Integer.parseInt(addOption.cnt3.getText());
			shot = Integer.parseInt(addOption.cnt4.getText());
			price = Integer.parseInt(addOption.price.getText());
			history = new Data(menu, num, temp, size, whipping, syrup, shot, price);
			//UnderPanel.orderlistTextArea.append(menu+" "+num+" "+price+"\n");
			System.exit(0);
		}
	}
}
