import java.util.Scanner;

public class Week2_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		double C;
		int F;
		String con = "Y";
		
		Scanner keyboard = new Scanner(System.in);
		
		while (con.equalsIgnoreCase("Y")) { //대소문자를 구별하지 않고 con이라는 변수가 Y라면
		System.out.print("섭씨의경우'C', 화씨의경우 'F' 입력:"); 
		String letter = keyboard.nextLine(); //섭씨온도와 화씨온도를 letter라는 변수를 통해 입력받음
		if (letter.equalsIgnoreCase("C")) { //대소문자를 구별하지 않고 letter이라는 변수가 C라면
			System.out.print("섭씨온도 입력:");
			C = keyboard.nextDouble(); //C라는 변수에 double값으로 섭씨온도를 입력받을거임
			F = (int)(9*C/5) + 32;
			System.out.println("현재온도는 섭씨 "+ C + "도, 화씨 " + F + "도입니다.");
			keyboard.nextLine(); //buffer에 남아있는 enter 비우기
		}
		else if (letter.equalsIgnoreCase("F")){ //대소문자를 구별하지 않고 letter이라는 변수가 F라면
			System.out.print("화씨온도 입력:");
			F = keyboard.nextInt(); //F라는 변수에 int값으로 화씨온도를 입력 받을거임
			C = (double)5*(F-32)/9;
			System.out.print("현재온도는 화씨 "+ F + "도, 섭씨 ");
			System.out.printf("%.1f", C); //화씨온도로 계산한 섭씨온도를 소수점 1자리까지 출력
			System.out.println("도입니다.");
			keyboard.nextLine(); //buffer에 남아있는 enter 비우기
		}
		else { //letter라는 변수에 C, F가 아닌 값이 들어오면
			System.out.println("잘못된 입력"); 
		}
		
		System.out.print("계속하시겠습니까?(y/n)");
		con = keyboard.nextLine(); //con이라는 변수에 문자열 입력받음
		
		if(con.equalsIgnoreCase("Y")) { 
			continue; //con이라는 변수에 대소문자 관계없이 y라면 계속 진행
		}
		else { //con이라는 변수에 y가 아닌 값이 입력되면 프로그램 종료
			System.out.println("프로그램종료"); 
			break;
		}
		} 
	}

}
