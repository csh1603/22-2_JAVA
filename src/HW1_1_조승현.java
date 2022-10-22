import java.util.Scanner;

class Time {
	private int hour;
	private int minute;
	
	private boolean isValid(int hour, int minute) {
		if (hour >= 0 && hour < 24 && minute >=0 && minute < 60) //시간이 0 이상 23 이하, 분이 0 이상 59이하임을 만족하면 아래의 명령문 실행
			return true;
		else //위의 조건 중에서 하나라도 만족하지 않으면 false 반환
			return false;
	}
	
	public void setTime(int hour, int minute) { //입력받은 시간과 분을 저장하는 setTime 메소드 정의 
		if (isValid(hour, minute) == true) { //시간과 분이 입력 가능한 값이라면 아래의 명령문 실행
			this.hour = hour;
			this.minute = minute;
		}
		else {
			System.out.println("Wrong Input");
		}
	}
	
	public int getHourOrMinute(char ch) {
		if (ch == 'H' || ch == 'h') {
			return hour;
		}
		else if (ch == 'M' || ch == 'm') {
			return minute;
		}
		return 0; //int 타입을 무조건 반환해야 함으로 return 0 추가 -> 위의 조건문에 걸리지 않으면 0을 반환하게 함
	}
}

public class HW1_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in);
		Time time = new Time(); //Time 클래스 time 이름으로 정의
		
		System.out.println("Hour:");
		int hour = scanner.nextInt(); //hour 변수에 사용자가 입력한 값 저장
		System.out.println("Minute:");
		int minute = scanner.nextInt(); //minute 변수에 사용자가 입력한 값 저장
		
		time.setTime(hour, minute); //사용자가 입력한 값을 time 클래스 내에 존재하는 setTime 메소드에 전달
		
		System.out.println(time.getHourOrMinute('h') + ":"  + time.getHourOrMinute('m'));
	}

}
