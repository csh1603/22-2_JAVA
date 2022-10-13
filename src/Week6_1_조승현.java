import java.util.Scanner;

class Product { //모든 자식 클래스가 가지고 있는 속성을 Product 클래스로 정의
	int price; 
	int bonusPoint;
	Product(int price) { //price를 인자로 갖는 생성자
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100); //Product에 존재하는 price를 인자로 갖는 생성자에 100을 전달
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200); //Product에 존재하는 price를 인자로 갖는 생성자에 200을 전달
	}
	public String toString() {
		return "Computer";
	}
}

class Video extends Product {
	Video() {
		super(110); //Product에 존재하는 price를 인자로 갖는 생성자에 110을 전달
	}
	public String toString() {
		return "Video";
	}
}

class Audio extends Product {
	Audio() {
		super(50); //Product에 존재하는 price를 인자로 갖는 생성자에 50을 전달
	}
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		super(300); //Product에 존재하는 price를 인자로 갖는 생성자에 300을 전달
	}
	public String toString() {
		return "NoteBook";
	}
}

class Buyer { //구매자 정보
	int money, bonusPoint, i;
	Product item[] = new Product[10]; //사용자가 구입한 전자기기를 저장할 배열 선언
	
	void buy(Product pd) {
		if (pd.price > money) { //만약에 사용자가 가지고 있는 돈이 구매하려는 기기보다 적으면 (돈이 없으면)
			System.out.println("Money is not enough."); 
			summary(); //지금까지 구입한 상품들 출력
			System.exit(0); //밑에 있는 명령어들을 수행하지 않고 종료
		}
		System.out.println("You bought "+pd+"("+pd.price+").");
		money = money - pd.price; //사용자가 구입한 물품의 가격을 뺀 남은 금액 계산
		bonusPoint = bonusPoint + pd.bonusPoint; //사용자가 구입한 가격의 일부를 포인트로 저장
		item[i++] = pd; //배열의 위치를 하나씩 늘려가며 구입한 전자기기 저장
	}
	void summary() { //사용자가 구입한 물품과 남은 금액, 포인트를 출력하는 함수
		System.out.print("\nSHOPPING LIST: ");
		for (int j=0 ; j<i ; j++) {
			System.out.print(item[j] + " ");
		}
		System.out.println("\nMONEY LEFT: "+money);
		System.out.println("CURRENT BONUS POINT: "+bonusPoint);
	}
}

public class Week6_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자에게 입력을 받기 위한 Scanner 클래스 선언
		
		Buyer buyer = new Buyer();
		System.out.println("How much money do you have?");
		buyer.money = scanner.nextInt(); //사용자가 가지고 있는 돈을 buyer 객체 내에 money 변수에 저장
		
		Tv t = new Tv();
		Computer c = new Computer();
		Video v = new Video();
		Audio a = new Audio();
		NoteBook nt = new NoteBook();
		
		AA: while (true) { //사용자가 입력을 멈출 때까지 계속 입력을 받는 반복문
			System.out.println("What do you want to buy? Input 0 to quit.");
			System.out.println("1. TV(100)\t2. Computer(200)\t3. Video(110)\t4. Audio(50)\t5. NoteBook(300)");
			int input = scanner.nextInt(); //input 변수에 사용자가 입력한 번호 (전자기기의 번호) 저장
			switch (input) { //입력받은 전자기기의 번호에 따라 switch문을 이용해서 처리
			case 0: break AA; //0을 입력한 경우 무한루프를 탈출할 수 있도록 AA 제어문 사용
			case 1: buyer.buy(t); break;
			case 2: buyer.buy(c); break;
			case 3: buyer.buy(v); break;
			case 4: buyer.buy(a); break;
			case 5: buyer.buy(nt); break;
			default: System.out.println("No such item."); break; //0~5를 벗어난 숫자를 입력한다면 없는 아이템이라고 알려줌
			}
		}
		buyer.summary(); //buyer 클래스 안에 있는 summary 함수를 호출하여 사용자가 구매한 물품의 이름과 가격, 포인트 출력
	}
	
}
