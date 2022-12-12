import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Week11_8 extends JFrame{

	private JTextField textField;
	private JRadioButton RB1;
	private JRadioButton RB2;
	private JRadioButton RB3;
	private JRadioButton RB4;
	
	public Week11_8() {
		super("RadioButton Test");
		setLayout(new FlowLayout());
		textField = new JTextField("Radio Button Example", 25);
		add(textField);
		RB1 = new JRadioButton("RB1");
		RB2 = new JRadioButton("RB2");
		RB3 = new JRadioButton("RB3");
		RB4 = new JRadioButton("RB4");
		
		add(RB1);
		add(RB2);
		add(RB3);
		add(RB4);
		ButtonGroup bg = new ButtonGroup();
		bg.add(RB1);
		bg.add(RB2);
		bg.add(RB3);
		bg.add(RB4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week11_8 radio = new Week11_8();
		radio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radio.setSize(300, 100);
		radio.setVisible(true);
	}

}
