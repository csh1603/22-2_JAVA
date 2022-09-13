import java.util.Scanner;

public class Week1_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //키보드 입력을 받기 위한 스캐너 클래스 사용
		
		System.out.print("Input base: "); //밑변을 입력하라는 문장 출력
		int a = keyboard.nextInt(); //삼각형 밑변의 길이를 입력받아 a라는 변수에 저장
		System.out.print("Input height: "); //높이를 입력하라는 문장 출력
		int b = keyboard.nextInt(); //삼각형 높이의 길이를 입력받아 b라는 변수에 저장
		
		float num = (float)a*b/2; //a의 자료형을 float로 변환한 후 int형인 b와 2를 연산하면 더 큰 수를 담을 수 있는 float형으로 계산이 되어 num에 저장
		
		System.out.print("The area: " + num); //넓이를 계산한 값을 알려주는 문장과 위에서 계산한 값 출력하는 명령
	}

}
