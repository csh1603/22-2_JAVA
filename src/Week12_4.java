import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame7 extends JFrame implements ActionListener {
	JPanel panel;
	Cards cards;
	
	public MyFrame7() {
		setTitle("CardLayoutTest");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", panel);
		addButton("<<", panel);
		addButton("<<", panel);
		addButton("<<", panel);
		addButton("<<", panel);
		add(panel, "North");
		cards = new Cards();
		add(cards, "Center");
		setVisible(true);
	}
	
	void addButton(String text, JPanel panel) {
		JButton button = new JButton(text);
		button.addActionListener(this);
		panel.add(button);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("End")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
		} else if (e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		} else if (e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		} else if (e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}
	private class Cards extends JPanel {
		CardLayout layout;
		public Cards() {
			layout = new CardLayout();
			setLayout(layout);
			for (int i=0 ; i<=10 ; i++) {
				add(new JButton("Current card number is " + i + "."), "Center");
			}
		}
	}
}
public class Week12_4 {
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();
	}
}
