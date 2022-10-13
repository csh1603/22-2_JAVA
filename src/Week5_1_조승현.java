import java.util.Scanner;

public class Week5_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자에게 입력받기 위한 스캐너 클래스 선언
		Play play = new Play(); //Play 클래스를 play라는 이름으로 선언하여 객체 생성
		Film film = new Film(); //File 클래스를 film이라는 이름으로 선언하여 객체 생성
		
		System.out.println("Input Title for Play");
		play.setTitle(scanner.nextLine()); //play 객체 내에 존재하는 setTitle이라는 메소드로 사용자에게 연극의 이름 입력받기
		System.out.println("Input Director for Play");
		play.setDirector(scanner.nextLine()); //play 객체 내에 존재하는 setDirector이라는 메소드로 사용자에게 연극의 감독 입력받기
		System.out.println("Input Writer for Play");
		play.setWriter(scanner.nextLine()); //play 객체 내에 존재하는 setWriter이라는 메소드로 사용자에게 연극의 작가 입력받기
		
		System.out.println("Input Title for Film");
		film.setTitle(scanner.nextLine()); //film 객체 내에 존재하는 setTitle이라는 메소드로 사용자에게 영화의 이름 입력받기
		System.out.println("Input Director for Film");
		film.setDirector(scanner.nextLine()); //film 객체 내에 존재하는 setDirector이라는 메소드로 사용자에게 영화의 감독 입력받기
		System.out.println("Input Writer for Film");
		film.setWriter(scanner.nextLine()); //film 객체 내에 존재하는 setWriter이라는 메소드로 사용자에게 영화의 작가 입력받기
		
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(scanner.nextInt()); //play 객체 내에 존재하는 setPerformanceCost이라는 메소드로 사용자에게 연극의 가격 입력받기
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(scanner.nextInt()); //film 객체 내에 존재하는 setBoxOfficeGross이라는 메소드로 사용자에게 영화의 가격 입력받기
		
		play.display(); //연극의 이름, 감독, 작가, 가격을 출력하는 메소드 실행
		System.out.println();
		film.display(); //영화의 이름, 감독, 작가, 가격을 출력하는 메소드 실행
	}

}
