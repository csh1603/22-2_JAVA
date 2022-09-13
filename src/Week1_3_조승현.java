import java.util.Scanner;

public class Week1_3_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //키보드 입력을 받기 위한 스캐너 클래스 사용
		
		System.out.print("화씨온도 입력: ");
		int F = keyboard.nextInt(); //F라는 변수에 키보드로 입력받은 정수 저장
		System.out.println(); //한 줄 띄어서 출력하기 위해 사용
		
		float C = (float)5/9*(F-32); //5라는 정수를 float형으로 변환해서 나머지가 int형이지만 계산한 값이 float형이 되도록 함		
		System.out.println("화씨온도: " + F);
		System.out.print("섭씨온도: ");
		System.out.printf("%.1f", C);
		//c언어에서 사용하던 print 방법을 이용해서 소수 첫째자리까지 출력 
	}

}
