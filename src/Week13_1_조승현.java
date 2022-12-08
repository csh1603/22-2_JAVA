import java.util.Scanner;

class SharedArea{ //스레드끼리 공유할 값을 SharedArea 클래스에 저장
	double ratio; //앞면의 비율을 저장하는 변수
	boolean isReady; //스레드 작동 순서를 조작하기 위해 한 스레드의 연산이 다 끝났는지 확인하는 변수, false로 초기화
}

class SimulThread extends Thread {
	SharedArea sh;
	int n = 0, front = 0; //반복할 횟수 n, 앞면이 나오는 경우의 수 front
	SimulThread (int n){ //사용자로부터 변수를 입력받아 n에 초기화하는 생성자
		this.n = n;
	}
	public void run() { //스레드가 시작되면 실행될 메소드
			for (int i=0 ; i<n ; i++) {
				int random = (int)(Math.random()*2); //0 또는 1을 random 값에 저장
				if (random == 0) //0이라면 앞면이 나오는 것이라고 간주함
					front++; //앞면이 나온 횟수 증가
			}
			sh.ratio = ((double)front/n)*100; //앞면이 나올 확률을 계산하여 공유하는 클래스인 SharedArea의 ratio 변수에 저장
			sh.isReady = true; //연산이 모두 끝났으므로 isReady 변수를 true로 바꿈
			synchronized(sh) {
				sh.notify(); //wait하고 있는 다른 스레드를 깨움
		}
	}
}

class PrintThread extends Thread {
	SharedArea sh;
	public void run() {
		if (sh.isReady!=true) { //만약 다른 스레드의 연산이 끝나지 않았다면 wait 상태 유지
			try {
				synchronized(sh) {
					sh.wait();
				}
			}
			catch(InterruptedException e) { //스레드가 계속 wait 상태라면 exception handle
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("Front Ratio: %.2f", sh.ratio);
		System.out.print("%");
	}
}

public class Week13_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 scanner 선언
		
		System.out.println("Input the number of coin toss");
		SimulThread st = new SimulThread(scanner.nextInt()); //사용자로부터 입력을 받은 정수를 SimulThread에게 전해주어 연산 진행
		PrintThread pt = new PrintThread();
		
		//main thread와 다른 스레드가 같은 공유 클래스를 볼 수 있도록 설정
		SharedArea SH = new SharedArea();
		st.sh = SH;
		pt.sh = SH;
		
		st.start();
		pt.start();
	}

}
