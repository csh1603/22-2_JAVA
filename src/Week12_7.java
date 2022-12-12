import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Week12_7 extends JFrame{
	public Week12_7() {
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint(Graphics g) {
		Color c = new Color(0, 255, 255);
		g.setColor(c);
		g.fillRect(10, 20, 400, 500);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week12_7();
	}

}
