import java.util.Scanner;

public class Week1_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //키보드 입력을 받기 위한 스캐너 클래스 사용
		
		System.out.println("정수 세 개 입력");
		int a = keyboard.nextInt(); //a라는 변수에 입력받은 정수 값 저장
		int b = keyboard.nextInt(); //b라는 변수에 입력받은 정수 값 저장
		int c = keyboard.nextInt(); //c라는 변수에 입력받은 정수 값 저장
		
		System.out.print("평균: ");
		System.out.printf("%.2f", (float)(a+b+c)/3); 
		//입력받은 세 정수의 합을 float형으로 변환한 후 임시 저장하고 3으로 나눔 -> float와 int의 연산이므로 float형으로 저장
		//c언어에서 사용하던 print 방법을 이용해서 소수 둘째자리까지 출력 
	}

}
