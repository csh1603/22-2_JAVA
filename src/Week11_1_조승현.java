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
		setTitle("Calculator"); //container의 이름을 calculator로 설정
		
		//숫자를 입력하는 textField 선언
		JTextField t = new JTextField(25);
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel p1 = new JPanel(); //textField를 추가할 p1 패널 정의
		JPanel p2 = new JPanel(); //계산기의 버튼들을 추가할 p2 패널 정의
		
		p1.add(t); //textField를 p1 패널에 추가
		
		p2.setLayout(new GridLayout(0,4)); //p2 패널을 column 4개로 자동 배열되게 선언
		
		//각 계산기에 존재하는 문자 및 숫자 입력 가로를 기준으로 (GridLayout으로 인해 column이 4개로 알아서 분류)
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
		
		//component에 지금까지 만든 패널 추가
		//p1은 BorderLayout의 north 부분에, p2는 BorderLayout의 center 부분에
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		
		//여백이 최대한 없게 pack
		pack();
		setVisible(true);
	}
	
	//버튼을 panel에 추가하는 메소드 makeButton
	private void makeButton(JPanel panel, String text) {
		//함수 호출시 전달받은 text 값을 버튼으로 추가
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class Week11_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Calc c = new Calc();
	}

}
