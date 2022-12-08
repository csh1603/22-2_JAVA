import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame implements ActionListener{
	//���� �Է°� ����� ����ϴ� textField ����
	JTextField t = new JTextField(25);
	public Calc() {
		//JFrame �⺻ ������ ���� �κ�
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator"); //container�� �̸��� calculator�� ����
		
		//���ڸ� �Է��ϴ� textField ����
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel p1 = new JPanel(); //textField�� �߰��� p1 �г� ����
		JPanel p2 = new JPanel(); //������ ��ư���� �߰��� p2 �г� ����
		
		p1.add(t); //textField�� p1 �гο� �߰�
		
		p2.setLayout(new GridLayout(0,4)); //p2 �г��� column 4���� �ڵ� �迭�ǰ� ����
		
		//�� ���⿡ �����ϴ� ���� �� ���� �Է� ���θ� �������� (GridLayout���� ���� column�� 4���� �˾Ƽ� �з�)
		makeButton(p2, "7");
	    makeButton(p2, "8");
	    makeButton(p2, "9");
	    makeButton(p2, "/");
	    makeButton(p2, "4");
	    makeButton(p2, "5");
	    makeButton(p2, "6");
	    makeButton(p2, "*");
	    makeButton(p2, "1");
	    makeButton(p2, "2");
	    makeButton(p2, "3");
	    makeButton(p2, "-");
	    makeButton(p2, "NEW");
	    makeButton(p2, "0");
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
		//event handling�� ���� listener �߰�
		button.addActionListener(this);
		//���ڷ� ���޹��� �гο� ��ư �߰�
		panel.add(button);
	}
	
	//����� ���� �޼ҵ� cal, ���� 2���� �����ڿ� �ش��ϴ� ���� 1���� ���ڷ� ���޹���
	public String cal(int a, int b, char op) {
		//�����ڿ� ���� ����� ����� String���� ��ȯ�Ͽ� ��ȯ
		switch(op) {
		case '+': return Integer.toString(a+b); 
		case '-': return Integer.toString(a-b);
		case '*': return Integer.toString(a*b);
		case '/': return Double.toString((double)a/b);
		default: return "";
		}
	}

	//event handling �κ�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//���� ��ư�� �����ִ� ���ڿ��� btn�� ����
		String btn = e.getActionCommand();
		//�޼ҵ� ���̱� ������ �ʱ�ȭ �ʿ�, �� ������ 0����, �⺻ �����ڴ� +�� �ʱ�ȭ
		int a = 0;
		char op = '+';
		int b = 0;
		
		//���� ����ڰ� ���� ��ư�� NEW��� textfield�� ���
		if (btn.equals("NEW")) {
			t.setText("");
			a = 0;
			op = '+';
			b = 0;
		} //���� = �� �����ٸ� ��� ����� ��ȯ�ؾ���
		else if (btn.equals("=")) {
			//textfield�� �ִ� ������ ���ڿ��̹Ƿ� input�̶�� ������ ����
			String input = t.getText();
			//����, ������, ������ ������ ������ �ϳ��� ����鼭 a, op, b�� ����
			for (int i = 0; i < 3; i++) {
				char ch = input.charAt(i);
				if (i == 0) {
					//char ���� int�� ��ȯ�ϸ� �ƽ�Ű�ڵ� ���� ��µ�, 0�� ���ڷ� �ν��� �ƽ�Ű�ڵ� ���� ���־�� ���� ���� ���� ���� 
					a = ch - '0';
				} else if (i == 1) {
					op = ch;
				} else {
					b = ch - '0';
				}
			}
			//�� �������� cal �޼ҵ忡 �����ϰ� ���� ����� textfield�� �����
			t.setText(cal(a, b, op));
		} else {
			//NEW, = �� �ƴ� �ٸ� ��ư�� ���ȴٸ� textfield�� �߰��Ͽ� ���
			t.setText(t.getText() + e.getActionCommand());
		}
	}
}

public class HW2_2_������ {

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
