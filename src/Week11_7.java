import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Week11_7 extends JFrame{
	public Week11_7() {
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel, "Button1");
		makeButton(panel, "Button2");
		makeButton(panel, "Button3");
		makeButton(panel, "B4");
		makeButton(panel, "Long Button5");
		add(panel);
		pack();
		setVisible(true);
	}
	public void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week11_7();
	}

}
