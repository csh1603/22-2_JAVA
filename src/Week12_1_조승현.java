import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//화면에 출력할 JFrame, RunFrame 정의, 마우스 이벤트를 처리할 것 -> MouseListener 구현
class RunFrame extends JFrame implements MouseListener {
	private JButton button; //도망다닐 버튼 button 선언
	public RunFrame() {
		this.setSize(300, 300);
		this.setResizable(false); //사이즈 조절이 불가능하게 설정
		this.setTitle("나 잡아봐~라! - 조승현");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //화면이 닫히면 모든 프로그램이 꺼지도록 설정
		JPanel panel = new JPanel(); //버튼을 올릴 Panel 정의
		button = new JButton("Click!"); //버튼의 문구는 "Click!"
		button.addMouseListener(this); //이벤트를 감지할 listener 설정
		panel.add(button); //panel에 button 올리기
		this.add(panel); //Frame에 panel 올리기
		this.setVisible(true);
	}
	//implement 했기 때문에 모든 메소드 오버라이딩 해야함
	//사용할 이벤트는 mouseClicked & mouseEnetered
	@Override
	public void mouseClicked(MouseEvent e) { //버튼이 잡혔을 때 사용할 메소드
		System.out.println("윽,,,잡혔다ㅠㅠ");
		int x = (int)(Math.random()*240); //0~240 사이 임의의 값 생성
		int y = (int)(Math.random()*240);
		button.setLocation(x, y); //위에서 생성한 임의의 x, y 좌표로 button 이동
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) { //버튼 위에 마우스가 있을 때 실행되는 메소드
			int x = (int)(Math.random()*240);
			int y = (int)(Math.random()*240);
			button.setLocation(x, y); //button의 위치를 위에서 생성한 임의의 좌표 x, y로 이동
			System.out.println("x=" + x + "\ty=" + y);
	}
	@Override
	public void mouseExited(MouseEvent e) {}
}

public class Week12_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		new RunFrame();
	}

}
