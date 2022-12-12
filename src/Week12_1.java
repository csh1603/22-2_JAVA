import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ButtonActionListener implements ActionListener {
	JTextField text;
	JLabel label;
	
	public ButtonActionListener(JTextField text, JLabel label) {
		// TODO Auto-generated constructor stub
		this.text = text;
		this.label = label;
	}
	public void actionPerformed(ActionEvent e) {
		label.setText("Hello! " + text.getText());
	}
}

public class Week12_1 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Hello Test");
		f.setSize(250,100);
		JTextField text = new JTextField(10);
		JButton button = new JButton("Confirm");
		JLabel label = new JLabel("Hello!");
		
		JPanel panel = new JPanel();
		panel.add(text);
		panel.add(button);
		panel.add(label);
		f.add(panel);
		ActionListener listener = new ButtonActionListener(text, label);
		button.addActionListener(listener);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
