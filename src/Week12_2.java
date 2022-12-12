import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame5 extends JFrame {
	private JButton button;
	
	public MyFrame5() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Test");
		JPanel panel = new JPanel();
		button = new JButton("Press the Button");
		button.addActionListener(new MyListener());
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
	private class MyListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			if (e.getSource() == button) {
				button.setText("Button Pressed");
			}
		}
	}
}

public class Week12_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 f = new MyFrame5();
	}
}