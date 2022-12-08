import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame{
	public Calc() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator"); //container�� �̸��� calculator�� ����
		
		//���ڸ� �Է��ϴ� textField ����
		JTextField t = new JTextField(25);
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel p1 = new JPanel(); //textField�� �߰��� p1 �г� ����
		JPanel p2 = new JPanel(); //������ ��ư���� �߰��� p2 �г� ����
		
		p1.add(t); //textField�� p1 �гο� �߰�
		
		p2.setLayout(new GridLayout(0,4)); //p2 �г��� column 4���� �ڵ� �迭�ǰ� ����
		
		//�� ���⿡ �����ϴ� ���� �� ���� �Է� ���θ� �������� (GridLayout���� ���� column�� 4���� �˾Ƽ� �з�)
		makeButton(p2, "ON");
		makeButton(p2, "AC");
		makeButton(p2, "C");
		makeButton(p2, "OFF");
		makeButton(p2, "7");
		makeButton(p2, "8");
		makeButton(p2, "9");
		makeButton(p2, "/");
		makeButton(p2, "4");
		makeButton(p2, "5");
		makeButton(p2, "6");
		makeButton(p2, "X");
		makeButton(p2, "1");
		makeButton(p2, "2");
		makeButton(p2, "3");
		makeButton(p2, "-");
		makeButton(p2, "0");
		makeButton(p2, ".");
		makeButton(p2, "=");
		makeButton(p2, "+");
		
		//component�� ���ݱ��� ���� �г� �߰�
		//p1�� BorderLayout�� north �κп�, p2�� BorderLayout�� center �κп�
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		
		//������ �ִ��� ���� pack
		pack();
		setVisible(true);
	}
	
	//��ư�� panel�� �߰��ϴ� �޼ҵ� makeButton
	private void makeButton(JPanel panel, String text) {
		//�Լ� ȣ��� ���޹��� text ���� ��ư���� �߰�
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class Week11_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Calc c = new Calc();
	}

}
