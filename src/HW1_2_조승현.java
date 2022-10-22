import java.util.Scanner;

class DiceGame {
	private int diceFace;
	private int userGuess;
	
	private int rollDice() { //랜덤으로 1~6까지의 숫자 생성
		return (int)(Math.random() * 5 + 1); //계산을 모두 한 후에 int 타입으로 변경
	}
	private void setUserInput() { //사용자로부터 예상하는 주사위의 숫자를 받는 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dice is rolled!!!");
		System.out.println("Guess the number! What do you think?");
		while(true) { //사용자가 1~6사이의 값을 입력할 때까지 계속 반복
			userGuess = scanner.nextInt(); //userGuess에 사용자가 입력한 값을 저장
			 scanner.nextLine(); //버퍼에 남아있는 enter 하나 비우기
			if (userGuess > 6 || userGuess < 1) // 1~6 사이의 값을 입력한 것이 아니라면 아래의 문구 출력 후 다시 입력 받음
				System.out.println("Input number between 1~6");
			else //1~6 사이의 값을 제대로 입력했다면 무한루프문 탈출
				break;
		}
	}
	private void checkUserGuess() { //dice의 값과 사용자가 예상한 값이 같은지 확인하는 메소드
		if(userGuess == diceFace) //만약 두 숫작 같다면 아래의 문구 출력
			System.out.println("Bingo!!!");
		else { //틀렸다면 Wrong 출력 후 주사위의 숫자가 무엇이었는지 알려줌
			System.out.println("Wrong!");
			System.out.println("The face was "+diceFace);
		}
	}
	public void startPlaying() {
		System.out.println("<< GAME START >>");
		diceFace = rollDice(); //diceFace 변수에 랜덤숫자 저장해주고
		setUserInput(); //예상한 숫자를 받고
		checkUserGuess(); //같은지 확인하는 작업 수행
	}
}

public class HW1_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in);
		DiceGame dg = new DiceGame(); //DiceGame클래스의 dg라는 새로운 객체 생성
		String input = "y"; 
		//사용자에게 게속 게임을 할건지 물어봤을 때 대답을 저장하는 input 변수 선언
		//기본 입력을 y로 만들어줌 (y일때는 계속 주사위 게임을 실행)
		
		while (input.equalsIgnoreCase("y")) { //input이 y일 때 동안 계속 반복
			dg.startPlaying(); //dg 객체 안에 존재하는 startPlaying 메소드 실행
			System.out.println("Try again?(y/n)");
			input = scanner.nextLine(); //input에 새로운 사용자의 입력을 저장함
			System.out.println();
		}
		
		System.out.println("Game finished.");
		
	}

}
