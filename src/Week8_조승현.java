import java.util.Scanner;

class Game {
	int com, you, yCount, cCount;
	//랜덤으로 생성한 수를 com, 사용자가 입력한 값(가위,바위보)을 you, 사용자가 이긴 횟수를 yCount, 컴퓨터가 이긴 횟수를 cCount에 저장
	void play() {
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		System.out.println("가위바위보 게임을 시작합니다.");
		
		while(true) { //사용자나 컴퓨터가 3번을 이길 때까지 계속 반복
			System.out.println("\n당신의 선택은?(You("+yCount+") - Com(" + cCount +"))"); //사용자가 이긴 횟수와 컴퓨터가 이긴 횟수를 출력
			System.out.println("가위 (1) 바위(2) 보(3)");
			input();
			if (yCount == 3 || cCount == 3) //누군가 3번을 이기게 되면 이 무한루프문 탈출
				break;
		}
		
		//모든 실행이 끝나고 결과를 출력
		System.out.println("\nYou("+yCount+")  Com("+cCount+")");
		if (yCount > cCount) //사용자가 이긴 횟수가 더 많으면 사용자가 이겼음을 알려줌
			System.out.println("당신이 이겼습니다.");
		else //그게 아니라면 컴퓨터가 이겼음을 알려줌
			System.out.println("컴퓨터가 이겼습니다.");
		
		System.out.println("게임을 종료합니다.");
	}
	void input() {
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 Scanner 클래스 선언
		com = (int)(Math.random() * 3)+1; //1~3 랜덤 숫자 출력 후 com 변수에 저장
		try {
			you = scanner.nextInt(); //사용자로부터는 1~3까지 해당하는 문자 입력을 받음 
			
			if (you < 1 || you > 3) //만약 사용자가 1~3 사이의 값을 입력하지 않았다면 예외 발생 처리 -> 아래 실행문 실행하지 않고 바로 catch문에 존재하는 명령문 실행
				throw new Exception();
			
			//사용자와 컴퓨터가 어떤 것을 선택했는지 출력
			System.out.println("<You>   <Com>");
			Change(you); //사용자가 입력한 숫자에 해당하는 가위, 바위, 보 출력
			Change(com); //com 변수에 할당된 랜덤변수에 해당하는 가위, 바위, 보 출력
			System.out.println();
			writeOutput(you, com); //비겼는지, 사용자가 이겼는지, 컴퓨터가 이겼는지 writeOutput 함수를 이용해서 출력 - you와 com을 인자로 전달하여 값을 츌력
		} catch(Exception e) {
			System.out.println("범위가 잘못되었습니다.");
		}
		
		
	}
	void writeOutput(int you, int com) {
		if (you == com) { //만약 컴퓨터와 사용자가 같은 것을 냈다면 비겼음을 알려줌
			System.out.println("비김");
		}
		//경우의 수를 따졌을 때, 보(3)는 바위(2)를 이기고, 바위(2)는 가위(1)를 이기므로 사용자가 낸 것의 숫자가 1이 더 크면 이김 or 가위(1)는 보(3)를 이기므로 사용자가 낸 것의 숫자에서 컴퓨터의 숫자를 빼서 -2가 나오면 됨
		//그 후에 사용자가 이겼으므로 yCount에 1을 추가
		else if (you-com == 1 || you-com == -2) {
			System.out.println("당신 승");
			yCount++;
		}
		//경우의 수를 따졌을 때, 바위(2)는 보(3)가 이기고, 가위(1)는 바위(2)로 이길 수 있으므로 사용자가 낸 것의 숫자에서 컴퓨터가 낸 숫자를 빼면 -1이 됨 or 보(3)는 가위(1)로 이길 수 있으므로 사용자의 숫자에서 컴퓨터의 숫자를 빼서 2가 나오면 컴퓨터가 이김
		//그 후에 컴퓨터가 이겼으므로 cCount에 1을 추가
		else if (you-com == 2 || you-com == -1) {
			System.out.println("컴퓨터 승");
			cCount++;
		}
	}
	void Change(int a) { //1, 2, 3에 해당하는 숫자에 맞춰서 가위, 바위, 보로 바꾸어 출력하는 함수
		if (a == 1) {
			System.out.print("가위     ");
		}
		else if (a == 2) {
			System.out.print("바위     ");
		}
		else if (a == 3) {
			System.out.print("보      ");
		}
	}
}

public class Week8_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		g.play();
	}

}
