import java.util.Scanner;

public class Week2_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //사용자에게 입력을 받기 위해 스캐너 선언
		
		System.out.print("월 입력:");
		int month = keyboard.nextInt(); //'월'을 키보드를 이용해 정수로 입력받을거임
		
		switch(month) { //month 변수가 스위치 문을 결정하는 요인
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: //1, 3, 5, 7, 8, 10, 12월은 
			System.out.println(month+"월에는 31일이 있습니다."); //31일이 존재
			break; //switch문은 break를 사용하지 않으면 switch문이 끝나기 전에 만나는 모든 명령문을 실행
		case 4: case 6: case 9: case 11: //4, 6, 9, 11월은 
			System.out.println(month+"월에는 30일이 있습니다."); //30일이 존재
			break;
		case 2: //2월은
			System.out.println(month+"월에는 28일이 있습니다."); //28일이 존재
			break;
		default: //1~12월이 아닌 것을 입력했을 때
			System.out.println("입력 오류");
			break;
		}
	}

}
