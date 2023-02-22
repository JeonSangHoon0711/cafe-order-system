import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class outListener implements ActionListener{
	DB db = new DB();


	public void actionPerformed(ActionEvent e) {
      db.insert();
		}

	}
