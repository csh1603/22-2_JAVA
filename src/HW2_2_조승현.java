import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame implements ActionListener{
	//숫자 입력과 출력을 담당하는 textField 선언
	JTextField t = new JTextField(25);
	public Calc() {
		//JFrame 기본 설정에 관한 부분
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator"); //container의 이름을 calculator로 설정
		
		//숫자를 입력하는 textField 선언
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel p1 = new JPanel(); //textField를 추가할 p1 패널 정의
		JPanel p2 = new JPanel(); //계산기의 버튼들을 추가할 p2 패널 정의
		
		p1.add(t); //textField를 p1 패널에 추가
		
		p2.setLayout(new GridLayout(0,4)); //p2 패널을 column 4개로 자동 배열되게 선언
		
		//각 계산기에 존재하는 문자 및 숫자 입력 가로를 기준으로 (GridLayout으로 인해 column이 4개로 알아서 분류)
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
		//event handling을 위한 listener 추가
		button.addActionListener(this);
		//인자로 전달받은 패널에 버튼 추가
		panel.add(button);
	}
	
	//계산을 위한 메소드 cal, 정수 2개와 연산자에 해당하는 문자 1개를 인자로 전달받음
	public String cal(int a, int b, char op) {
		//연산자에 따라 계산한 결과를 String으로 변환하여 반환
		switch(op) {
		case '+': return Integer.toString(a+b); 
		case '-': return Integer.toString(a-b);
		case '*': return Integer.toString(a*b);
		case '/': return Double.toString((double)a/b);
		default: return "";
		}
	}

	//event handling 부분
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//눌린 버튼에 쓰여있는 문자열을 btn에 저장
		String btn = e.getActionCommand();
		//메소드 안이기 때문에 초기화 필요, 두 변수를 0으로, 기본 연산자는 +로 초기화
		int a = 0;
		char op = '+';
		int b = 0;
		
		//만약 사용자가 누른 버튼이 NEW라면 textfield를 비움
		if (btn.equals("NEW")) {
			t.setText("");
			a = 0;
			op = '+';
			b = 0;
		} //만약 = 을 눌렀다면 계산 결과를 반환해야함
		else if (btn.equals("=")) {
			//textfield에 있는 내용은 문자열이므로 input이라는 변수에 저장
			String input = t.getText();
			//숫자, 연산자, 숫자의 순서로 있으니 하나씩 떼어내면서 a, op, b에 저장
			for (int i = 0; i < 3; i++) {
				char ch = input.charAt(i);
				if (i == 0) {
					//char 형을 int로 변환하면 아스키코드 값이 출력됨, 0을 문자로 인식한 아스키코드 값을 빼주어야 원래 숫자 값이 나옴 
					a = ch - '0';
				} else if (i == 1) {
					op = ch;
				} else {
					b = ch - '0';
				}
			}
			//그 변수들을 cal 메소드에 전달하고 받은 결과를 textfield에 출력함
			t.setText(cal(a, b, op));
		} else {
			//NEW, = 이 아닌 다른 버튼이 눌렸다면 textfield에 추가하여 출력
			t.setText(t.getText() + e.getActionCommand());
		}
	}
}

public class HW2_2_조승현 {

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
