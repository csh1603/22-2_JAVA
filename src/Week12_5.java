import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Week12_5 extends JFrame {
	JPanel p = new JPanel();
	JLabel myLabel;
	
	public Week12_5() {
		setTitle("Mouse Adapter Test");
		
		p.addMouseListener(new myMouseEvent());
		myLabel = new JLabel("Location of the mouse");
		myLabel.setSize(50, 20);
		myLabel.setLocation(30, 30);
		p.add(myLabel);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class myMouseEvent extends MouseAdapter {
		public void mousePressed (MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			myLabel.setText("x = " + x + ", y = " + y);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week12_5();
	}

}
