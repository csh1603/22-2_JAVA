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

//JFrame을 상속받는 Student 정의 -> 이후 Student를 상속받는 모든 클래스에 JFrame이 자동으로 상속됨
//학생의 정보를 담는 클래스
class Student extends JFrame{
	//학생의 학번, 이름, 성별 (정수형), 성별 (문자열), 전공에 대한 정보를 담는 변수
	String id;
	String name;
	int gender;
	String g;
	String dept;
	//빈생성자 정의
	Student() {	}
	//name, gender, dept를 인자로 전달 받으면 초기화하는 생성자
	Student(String name, int gender, String dept) {
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		//정수형으로 전달 받은 성별을 문자열로 변환하여 g에 저장
		if (gender == 0) {
			g = "Male";
		} else {
			g = "Female";
		}
	}
	//id, name, gender, dept를 인자로 전달 받으면 초기화하는 생성자
	Student(String id, String name, int gender, String dept) {
		//위의 생성자를 불러옴
		this(name, gender, dept);
		this.id = id;
	}
}

//result를 눌렀을 때 지금까지 입력한 값을 띄우는 frame 정의
//Student 상속, JFrame 자동 상속
class Result extends Student {
	//String을 key로 가지고 Student 클래스를 value로 갖는 map hm 선언
	Map<String, Student> hm;
	//이후 Iterator로 받아올 때 value 값을 저장하기 위한 str 선언
	String str;
	//빈 생성자
	Result () {}
	//map을 인자로 받아 초기화하는 생성자
	Result (Map<String, Student> hm) {
		this.hm = hm;
		setSize(300, 200);
		setTitle("STUDENT LIST");
		//outputFrame을 닫는다고 코드가 종료되지 않아야 함
		
		//JLabel을 올리기 위한 panel 정의
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4));
		
		//맨 위에 어떤 열인지 나타내기 위한 label 붙이기
		makeLabel("ID", panel);
		makeLabel("NAME", panel);
		makeLabel("GENDER", panel);
		makeLabel("DEPARTMENT", panel);
		
		//key를 모아서 s라는 set에 저장
		Set s = hm.keySet();
		//순서가 없는 map에서 인자를 뽑아오기 위한 iterator 정의
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			str = it.next();
			Student n = hm.get(str);
			//가져온 student 객체에 id, 이름, 성별, 전공 값을 차례대로 panel에 붙임
			makeLabel(n.id, panel);
			makeLabel(n.name, panel);
			makeLabel(n.g, panel);
			makeLabel(n.dept, panel);
		}
		//Frame에 panel을 붙임
		add(panel);
		setVisible(true);
	}
	//label을 만드는 함수 정의
	public void makeLabel (String string, JPanel panel) {
		//인자로 전달받은 문자열을 가지고 label을 생성
		JLabel label = new JLabel(string);
		//인자로 전달받은 panel에 label을 붙임
		panel.add(label);
	}
}

//사용자로부터 input을 받을 클래스 StudentInfo
class StudentInfo extends Student implements ActionListener{
	//String을 key, Student를 value로 만든 map hm
	Map<String, Student> hm = new HashMap<String, Student>();
	//사용자로부터 입력을 받기 위한 textfield 정의
	JTextField j1 = new JTextField(15);
	JTextField j2 = new JTextField(15);
	JTextField j3 = new JTextField(15);
	//성별을 고르기 위한 radiobutton 정의
	JRadioButton M = new JRadioButton("M"); 
	JRadioButton F = new JRadioButton("F");
	StudentInfo() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("NEW STUDENT"); //container의 이름을 "student information"으로 설정
		
		JPanel p1 = new JPanel(); //"student information" label을 올릴 p1 선언
		JPanel p2 = new JPanel(); //"name", "gender", "ID", "department" label을 올릴 p2 선언
		JPanel p3 = new JPanel(); //텍스트 입력란, 성별 고르는 button을 올릴 p3 선언
		JPanel p4 = new JPanel(); //성별은 JRadioButton을 사용 -> 따로 이 버튼 두개를 올릴 p4 선언
		JPanel p5 = new JPanel(); //save, cancel, result 버튼을 붙일 panel
		
		//p4에 만든 버튼을 올림
		p4.add(M);
		p4.add(F);
		//그룹화 (둘 중 하나만 선택 가능하도록)
		ButtonGroup bg = new ButtonGroup();
		bg.add(M);
		bg.add(F);
		//기본으로 Female이 선택되도록 함
		F.setSelected(true);
		
		//위에서 정의했던 p1에 "student information" label 올림
		p1.add(new JLabel("New Student"));
		
		//GridLayout에서 column 수를 1로 설정하여 세로로 정렬되도록 함
		p2.setLayout(new GridLayout(0,1));
		p2.add(new JLabel("ID"));
		p2.add(new JLabel("NAME"));
		p2.add(new JLabel("GENDER"));
		p2.add(new JLabel("DEPT"));
		
		//GridLayout에서 column 수를 1로 설정하여 세로로 정렬되도록 함
		//입력란, 입력란, 성별 선택란, 입력란이 세로로 나타남
		p3.setLayout(new GridLayout(0,1));
		p3.add(j1);
		p3.add(j2);
		p3.add(p4);
		p3.add(j3);
		
		//event handling을 위한 save, cancel, result 버튼을 생성하고 listener를 붙임
		JButton j1 = new JButton("save");
		j1.addActionListener(this);
		JButton j2 = new JButton("cancel");
		j2.addActionListener(this);
		JButton j3 = new JButton("result");
		j3.addActionListener(this);
		
		//save, cancel, result를 p5에 올림
		p5.setLayout(new FlowLayout());
		p5.add(j1);
		p5.add(j2);
		p5.add(j3);
		
		//BorderLayout을 이용해 위, 왼쪽, 오른쪽에 각각의 panel을 붙임
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.EAST);
		add(p5, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//성별을 나타내는 정수 i를 1로 초기화 (male:0, female:1)
		int i = 1;
		// TODO Auto-generated method stub
		//만약 사용자가 누른 버튼이 save라면
		if (e.getActionCommand().equals("save")) {
			//j1에 있던 String을 ID에 저장
			String ID = j1.getText();
			//만약 radio button의 M(male)이 눌려있으면 i를 0으로 변경
			if (M.isSelected()) {
				i = 0;
			}
			//ID, name, 성별(정수형), 전공을 순서로 student 객체 초기화
			Student st = new Student(j1.getText(), j2.getText(), i, j3.getText());
			//ID를 key, student 객체 자체를 value를 갖도록 hm 안에 넣어줌 
			hm.put(ID, st);
			//text field는 초기화
			j1.setText("");
			j2.setText("");
			j3.setText("");
		}
		//만약 사용자가 누른 버튼이 cancel이라면 모든 textfield를 초기화, 저장하지 않음
		else if (e.getActionCommand().equals("cancel")) {
			j1.setText("");
			j2.setText("");
			j3.setText("");
		}
		//만약 사용자가 누른 버튼이 result라면 사용자가 입력한 모든 정보인 hm을 인자로 전달하여 새로운 창이 뜨도록 함
		else if (e.getActionCommand().equals("result")) {
			Result r = new Result(hm);
		}
	}
}

public class HW2_3_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		StudentInfo si = new StudentInfo();
	}

}
