import java.util.Scanner;

import javax.swing.JOptionPane;

//스레드가 같은 값을 공유할 수 있도록 SharedArea2 클래스 선언 (13-1에서 같은 이름을 써서 2를 붙임)
//여기서는 랜덤으로 출력한 단어를 공유
class SharedArea2 {
	String word;
}

class MyThread extends Thread {
	//문자열 20개를 담고 있는 배열 a 선언 및 초기화
	String a[] = {"good", "suit", "slide", "dog", "phone", "water", "university", "bag", "mouse", "computer", "hair", "chocolate", "ring", "ear", "button", "fly", "neck", "shirt", "band", "speaker"};
	SharedArea2 sh;
	//스레드의 연산 작동을 조절하는 stop 변수 선언
	boolean stop;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	//스레드가 작동하기 시작하면 실행될 메소드
	public void run() {
		for (int i=0 ; i<20 ; i++) {
			if (stop == true) break;
			//랜덤으로 추출한 배열의 인덱스를 저장할 m 변수 선언 -> 0~19 사이의 정수 값이 무작위로 생성
			int m = (int)(Math.random()*20);
			//해당 인덱스에 존재하는 문자열 값 출력
			System.out.println(a[m]);
			//그 문자열을 공유하는 클래스에 저장 -> 사용자가 입력한 값과 같은지 비교하기 위함
			sh.word = a[m];
			try {
				//1초에 한 단어씩 나타나도록 시간 조절
				sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		//위에서 if문을 다 돌았음에도 불구하고 stop이 계속 false로 설정되어있다면 실패를 의미
		if (stop == false) {
			System.out.println("실패!");
		}
	}
}

public class Week13_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		//사용자로부터 입력을 받기 위한 scanner 선언
		Scanner scanner = new Scanner(System.in);
		
		SharedArea2 sh = new SharedArea2();
		
		//main thread와 MyThread가 같은 정보를 공유할 수 있도록 선언
		MyThread th = new MyThread();
		th.sh = sh;
		//스레드 시작
		th.start();
		
		//무한루프문 -> 사용자가 입력한 단어가 출력된 단어와 같다면 탈출
		while(true) {
			String st = JOptionPane.showInputDialog("문자열 입력");
			System.out.println("<" + st + ">을 입력하셨습니다.");
			//사용자가 입력한 단어가 출력된 단어와 같은지 확인
			if (st.equalsIgnoreCase(sh.word)) {
				th.setStop(true); //화면에 단어가 그만 출력되도록 설정
				System.out.println("성공!");
				System.out.println("Timer is stopped.");
				break;
			}
		}
	}

}
