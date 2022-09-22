import java.util.Scanner;

class Song {
	public String title;
	public String singer;
	public int price;
	
	//어떤 노래를 듣는지에 출력하는 함수 선언
	public void play() {
		System.out.println("노래들어요: \"" + title + "\" by " + singer); //"를 문자열로 취급하기 위해 앞에 \ 입력
	}
	
	//노래의 가격을 출력하는 함수 선언
	public void price() {
		System.out.println(price +"원입니다.");
	}
}

public class Week3_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Song first = new Song(); //Song이라는 클래스를 first 객체로 선언
		Song second = new Song(); //Song이라는 클래스를 second 객체로 선언
		
		Scanner keyboard = new Scanner(System.in); //사용자에게 값을 입력받기 위한 Scanner 클래스 선언
		
		System.out.println("*Song 1*");
		System.out.print("곡명입력: ");
		first.title = keyboard.nextLine(); //첫번째 곡의 이름 입력
		System.out.print("가수명입력: "); 
		first.singer = keyboard.nextLine();//첫번째 곡의 가수 입력
		System.out.print("가격입력: "); 
		first.price = keyboard.nextInt(); //첫번째 곡의 가격 입력
		keyboard.nextLine(); //숫자 입력으로 버퍼에 남아있는 엔터 값 비우기
		
		System.out.println("\n*Song 2*");
		System.out.print("곡명입력: ");
		second.title = keyboard.nextLine(); //첫번째 곡의 이름 입력
		System.out.print("가수명입력: ");
		second.singer = keyboard.nextLine(); //첫번째 곡의 가수 입력
		System.out.print("가격입력: ");
		second.price = keyboard.nextInt(); //첫번째 곡의 가격 입력
		keyboard.nextLine(); //숫자 입력으로 버퍼에 남아있는 엔터 값 비우기
		
		System.out.println("\n노래를 고르세요");
		System.out.println("1:" + first.title + " 2:" + second.title);
		int num = keyboard.nextInt(); //num이라는 변수에 사용자가 입력한 노래의 번호를 저장
		if (num == 1) { //사용자가 만약 1번을 골랐다면
			first.play();
			first.price();
		}
		else if (num == 2) { //사용자가 만약 2번을 골랐다면
			second.play();
			second.price();
		}
		System.out.println("감사합니다.");
	}

}
