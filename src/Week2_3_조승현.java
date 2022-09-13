import java.util.Scanner;

public class Week2_3_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in);
		
		int num = 1;
		
		System.out.println("Factorial을 계산할 정수 입력");
		int n = keyboard.nextInt(); //n에 정수값 입력받음
			while(!(n>0 && n<11)) { //n값이 0 초과, 11 미만이 아니면 -> 1 이하 또는 10 이상이라면
			System.out.println("정수 재입력(1~10):"); 
			n = keyboard.nextInt(); //n 다시 입력 받기
			}
		System.out.print(n + "! = ");
		for (int i=n ; i>=1 ; i--) { //n부터 1까지 1씩 줄여나가면서 
			System.out.print(i + " "); //i 값을 출력하고 (곱셈식으로 쓰기 위해)
			num *= i; //num이라는 변수에 1부터 n까지의 곱 저장
			if(i != 1) //i라는 변수가 n에서 1까지 내려가는데 1이 아니면 곱하기 기호 출력 
				System.out.print("X ");
		}
		System.out.print("= "+num);
	}

}
