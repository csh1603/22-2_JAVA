import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//JFrame�� ��ӹ޴� Student ���� -> ���� Student�� ��ӹ޴� ��� Ŭ������ JFrame�� �ڵ����� ��ӵ�
//�л��� ������ ��� Ŭ����
class Student extends JFrame{
	//�л��� �й�, �̸�, ���� (������), ���� (���ڿ�), ������ ���� ������ ��� ����
	String id;
	String name;
	int gender;
	String g;
	String dept;
	//������� ����
	Student() {	}
	//name, gender, dept�� ���ڷ� ���� ������ �ʱ�ȭ�ϴ� ������
	Student(String name, int gender, String dept) {
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		//���������� ���� ���� ������ ���ڿ��� ��ȯ�Ͽ� g�� ����
		if (gender == 0) {
			g = "Male";
		} else {
			g = "Female";
		}
	}
	//id, name, gender, dept�� ���ڷ� ���� ������ �ʱ�ȭ�ϴ� ������
	Student(String id, String name, int gender, String dept) {
		//���� �����ڸ� �ҷ���
		this(name, gender, dept);
		this.id = id;
	}
}

//result�� ������ �� ���ݱ��� �Է��� ���� ���� frame ����
//Student ���, JFrame �ڵ� ���
class Result extends Student {
	//String�� key�� ������ Student Ŭ������ value�� ���� map hm ����
	Map<String, Student> hm;
	//���� Iterator�� �޾ƿ� �� value ���� �����ϱ� ���� str ����
	String str;
	//�� ������
	Result () {}
	//map�� ���ڷ� �޾� �ʱ�ȭ�ϴ� ������
	Result (Map<String, Student> hm) {
		this.hm = hm;
		setSize(300, 200);
		setTitle("STUDENT LIST");
		//outputFrame�� �ݴ´ٰ� �ڵ尡 ������� �ʾƾ� ��
		
		//JLabel�� �ø��� ���� panel ����
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4));
		
		//�� ���� � ������ ��Ÿ���� ���� label ���̱�
		makeLabel("ID", panel);
		makeLabel("NAME", panel);
		makeLabel("GENDER", panel);
		makeLabel("DEPARTMENT", panel);
		
		//key�� ��Ƽ� s��� set�� ����
		Set s = hm.keySet();
		//������ ���� map���� ���ڸ� �̾ƿ��� ���� iterator ����
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			str = it.next();
			Student n = hm.get(str);
			//������ student ��ü�� id, �̸�, ����, ���� ���� ���ʴ�� panel�� ����
			makeLabel(n.id, panel);
			makeLabel(n.name, panel);
			makeLabel(n.g, panel);
			makeLabel(n.dept, panel);
		}
		//Frame�� panel�� ����
		add(panel);
		setVisible(true);
	}
	//label�� ����� �Լ� ����
	public void makeLabel (String string, JPanel panel) {
		//���ڷ� ���޹��� ���ڿ��� ������ label�� ����
		JLabel label = new JLabel(string);
		//���ڷ� ���޹��� panel�� label�� ����
		panel.add(label);
	}
}

//����ڷκ��� input�� ���� Ŭ���� StudentInfo
class StudentInfo extends Student implements ActionListener{
	//String�� key, Student�� value�� ���� map hm
	Map<String, Student> hm = new HashMap<String, Student>();
	//����ڷκ��� �Է��� �ޱ� ���� textfield ����
	JTextField j1 = new JTextField(15);
	JTextField j2 = new JTextField(15);
	JTextField j3 = new JTextField(15);
	//������ ���� ���� radiobutton ����
	JRadioButton M = new JRadioButton("M"); 
	JRadioButton F = new JRadioButton("F");
	StudentInfo() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("NEW STUDENT"); //container�� �̸��� "student information"���� ����
		
		JPanel p1 = new JPanel(); //"student information" label�� �ø� p1 ����
		JPanel p2 = new JPanel(); //"name", "gender", "ID", "department" label�� �ø� p2 ����
		JPanel p3 = new JPanel(); //�ؽ�Ʈ �Է¶�, ���� ���� button�� �ø� p3 ����
		JPanel p4 = new JPanel(); //������ JRadioButton�� ��� -> ���� �� ��ư �ΰ��� �ø� p4 ����
		JPanel p5 = new JPanel(); //save, cancel, result ��ư�� ���� panel
		
		//p4�� ���� ��ư�� �ø�
		p4.add(M);
		p4.add(F);
		//�׷�ȭ (�� �� �ϳ��� ���� �����ϵ���)
		ButtonGroup bg = new ButtonGroup();
		bg.add(M);
		bg.add(F);
		//�⺻���� Female�� ���õǵ��� ��
		F.setSelected(true);
		
		//������ �����ߴ� p1�� "student information" label �ø�
		p1.add(new JLabel("New Student"));
		
		//GridLayout���� column ���� 1�� �����Ͽ� ���η� ���ĵǵ��� ��
		p2.setLayout(new GridLayout(0,1));
		p2.add(new JLabel("ID"));
		p2.add(new JLabel("NAME"));
		p2.add(new JLabel("GENDER"));
		p2.add(new JLabel("DEPT"));
		
		//GridLayout���� column ���� 1�� �����Ͽ� ���η� ���ĵǵ��� ��
		//�Է¶�, �Է¶�, ���� ���ö�, �Է¶��� ���η� ��Ÿ��
		p3.setLayout(new GridLayout(0,1));
		p3.add(j1);
		p3.add(j2);
		p3.add(p4);
		p3.add(j3);
		
		//event handling�� ���� save, cancel, result ��ư�� �����ϰ� listener�� ����
		JButton j1 = new JButton("save");
		j1.addActionListener(this);
		JButton j2 = new JButton("cancel");
		j2.addActionListener(this);
		JButton j3 = new JButton("result");
		j3.addActionListener(this);
		
		//save, cancel, result�� p5�� �ø�
		p5.setLayout(new FlowLayout());
		p5.add(j1);
		p5.add(j2);
		p5.add(j3);
		
		//BorderLayout�� �̿��� ��, ����, �����ʿ� ������ panel�� ����
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.EAST);
		add(p5, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//������ ��Ÿ���� ���� i�� 1�� �ʱ�ȭ (male:0, female:1)
		int i = 1;
		// TODO Auto-generated method stub
		//���� ����ڰ� ���� ��ư�� save���
		if (e.getActionCommand().equals("save")) {
			//j1�� �ִ� String�� ID�� ����
			String ID = j1.getText();
			//���� radio button�� M(male)�� ���������� i�� 0���� ����
			if (M.isSelected()) {
				i = 0;
			}
			//ID, name, ����(������), ������ ������ student ��ü �ʱ�ȭ
			Student st = new Student(j1.getText(), j2.getText(), i, j3.getText());
			//ID�� key, student ��ü ��ü�� value�� ������ hm �ȿ� �־��� 
			hm.put(ID, st);
			//text field�� �ʱ�ȭ
			j1.setText("");
			j2.setText("");
			j3.setText("");
		}
		//���� ����ڰ� ���� ��ư�� cancel�̶�� ��� textfield�� �ʱ�ȭ, �������� ����
		else if (e.getActionCommand().equals("cancel")) {
			j1.setText("");
			j2.setText("");
			j3.setText("");
		}
		//���� ����ڰ� ���� ��ư�� result��� ����ڰ� �Է��� ��� ������ hm�� ���ڷ� �����Ͽ� ���ο� â�� �ߵ��� ��
		else if (e.getActionCommand().equals("result")) {
			Result r = new Result(hm);
		}
	}
}

public class HW2_3_������ {

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
