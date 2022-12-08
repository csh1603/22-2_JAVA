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
		setTitle("Student Information"); //container의 이름을 "student information"으로 설정
		
		JPanel p1 = new JPanel(); //"student information" label을 올릴 p1 선언
		JPanel p2 = new JPanel(); //"name", "gender", "ID", "department" label을 올릴 p2 선언
		JPanel p3 = new JPanel(); //텍스트 입력란, 성별 고르는 button을 올릴 p3 선언
		JPanel p4 = new JPanel(); //성별은 JRadioButton을 사용 -> 따로 이 버튼 두개를 올릴 p4 선언
		
		//성별을 올릴 p4부터 시작
		//GENDER에 해당하는 Male과 Female 버튼을 각각 M, F로 정의
		JRadioButton M = new JRadioButton("Male"); 
		JRadioButton F = new JRadioButton("Female");
		
		//p4에 만든 버튼을 올림
		p4.add(M);
		p4.add(F);
		ButtonGroup bg = new ButtonGroup();
		//그룹화 (둘 중 하나만 선택 가능하도록)
		bg.add(M);
		bg.add(F);
		//기본으로 Female이 선택되도록 함
		F.setSelected(true);
		
		//위에서 정의했던 p1에 "student information" label 올림
		p1.add(new JLabel("STUDENT INFORMATION"));
		
		//GridLayout에서 column 수를 1로 설정하여 세로로 정렬되도록 함
		p2.setLayout(new GridLayout(0,1));
		p2.add(new JLabel("NAME"));
		p2.add(new JLabel("GENDER"));
		p2.add(new JLabel("ID"));
		p2.add(new JLabel("DEPARTMENT"));
		
		//GridLayout에서 column 수를 1로 설정하여 세로로 정렬되도록 함
		//입력란, 성별 선택란, 입력란, 입력란이 세로로 나타남
		p3.setLayout(new GridLayout(0,1));
		p3.add(new JTextField());
		p3.add(p4);
		p3.add(new JTextField());
		p3.add(new JTextField());
		
		//BorderLayout을 이용해 위, 왼쪽, 오른쪽에 각각의 panel을 붙임
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.EAST);
		
		setVisible(true);
	}
}

public class Week11_2_조승현 {

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
