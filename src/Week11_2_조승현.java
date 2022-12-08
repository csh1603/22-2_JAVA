import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class StudentInfo extends JFrame {
	StudentInfo() {
		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Student Information"); //container�� �̸��� "student information"���� ����
		
		JPanel p1 = new JPanel(); //"student information" label�� �ø� p1 ����
		JPanel p2 = new JPanel(); //"name", "gender", "ID", "department" label�� �ø� p2 ����
		JPanel p3 = new JPanel(); //�ؽ�Ʈ �Է¶�, ���� ���� button�� �ø� p3 ����
		JPanel p4 = new JPanel(); //������ JRadioButton�� ��� -> ���� �� ��ư �ΰ��� �ø� p4 ����
		
		//������ �ø� p4���� ����
		//GENDER�� �ش��ϴ� Male�� Female ��ư�� ���� M, F�� ����
		JRadioButton M = new JRadioButton("Male"); 
		JRadioButton F = new JRadioButton("Female");
		
		//p4�� ���� ��ư�� �ø�
		p4.add(M);
		p4.add(F);
		ButtonGroup bg = new ButtonGroup();
		//�׷�ȭ (�� �� �ϳ��� ���� �����ϵ���)
		bg.add(M);
		bg.add(F);
		//�⺻���� Female�� ���õǵ��� ��
		F.setSelected(true);
		
		//������ �����ߴ� p1�� "student information" label �ø�
		p1.add(new JLabel("STUDENT INFORMATION"));
		
		//GridLayout���� column ���� 1�� �����Ͽ� ���η� ���ĵǵ��� ��
		p2.setLayout(new GridLayout(0,1));
		p2.add(new JLabel("NAME"));
		p2.add(new JLabel("GENDER"));
		p2.add(new JLabel("ID"));
		p2.add(new JLabel("DEPARTMENT"));
		
		//GridLayout���� column ���� 1�� �����Ͽ� ���η� ���ĵǵ��� ��
		//�Է¶�, ���� ���ö�, �Է¶�, �Է¶��� ���η� ��Ÿ��
		p3.setLayout(new GridLayout(0,1));
		p3.add(new JTextField());
		p3.add(p4);
		p3.add(new JTextField());
		p3.add(new JTextField());
		
		//BorderLayout�� �̿��� ��, ����, �����ʿ� ������ panel�� ����
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.EAST);
		
		setVisible(true);
	}
}

public class Week11_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		StudentInfo si = new StudentInfo();
	}

}
