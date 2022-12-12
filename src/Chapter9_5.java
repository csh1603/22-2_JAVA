import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ClickEx extends JFrame{
	JLabel label = new JLabel("c");
	ClickEx() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("클릭 연습");
		label.setLocation(50, 50);
		EventHandling eh = new EventHandling();
		label.addMouseListener(eh);
		add(label);
		setVisible(true);
	}
	class EventHandling extends MouseAdapter {
		public void mouseClicked (MouseEvent e) {
			if (e.getSource() == label) {
				label.setLocation((int)(Math.random()*200), (int)(Math.random()*100));
			}
		}
	}
}

public class Chapter9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickEx();
	}

}
