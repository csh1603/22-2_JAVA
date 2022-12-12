import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Week12_9 extends JFrame implements ActionListener {
	Color color = new Color(0, 0, 0);
	JButton button;
	Week12_9() {
		setTitle("Color Change Test");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel buttonPanel = new JPanel();
		button = new JButton("Color Change");
		button.addActionListener(this);
		buttonPanel.add(button);
		add(buttonPanel, BorderLayout.NORTH);
		MyPanel p = new MyPanel();
		add(p, "Center");
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillRect(10, 0, 260, 210);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week12_9();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		repaint();
	}

}
