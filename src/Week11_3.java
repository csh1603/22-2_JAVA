import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame3 extends JFrame {
	MyFrame3(){
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello?");
		JButton button = new JButton("BUTTON");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}

public class Week11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame3 f = new MyFrame3();
	}

}
