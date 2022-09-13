import java.util.Scanner;

public class Week2_4_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle : ");
		int height = keyboard.nextInt(); //높이를 height라는 변수를 이용해서 사용자를 통해 입력 받음
		int blank = height; //* 앞에 띄어쓰기를 할 횟수를 blank라는 변수를 이용해 선언
		
		for (int i=1 ; i<=height ; i++) {
			for (int j=1 ; j<blank ; j++) {
				System.out.print(" ");
			}
			blank--; //한 줄 내려갈수록 빈칸의 수도 하나씩 줄어든다 -> 감소연산자 사용
			for (int k=0; k<2*i-1 ; k++) { 
				// *의 개수가 첫번째 줄에 1개, 두번째 줄에 3개, 세번째 줄에 5개 .. 등차수열로 나타내면 (2n-1)
				// k가 한 줄 내려갈수록 별의 개수도 2개씩 증가하도록 나타내는 반복문
				System.out.print("*");
			}
			System.out.println(); // 한 줄 내려가기
		}
	}

}
