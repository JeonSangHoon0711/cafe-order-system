import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OrderListAction implements ActionListener{
	DB db = new DB();


	public void actionPerformed(ActionEvent e) {
    while (!OrderStack.OrderStack.isEmpty()) {
			db.insert(OrderStack.OrderStack.pop());
		}  

		UnderPanel.orderlistTextArea.setText("");
		}

	}
