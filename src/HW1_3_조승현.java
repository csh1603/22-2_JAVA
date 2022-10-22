import java.util.Scanner;

class Product { //모든 자식 클래스가 가지고 있는 속성을 Product 클래스로 정의
	int price; //제품의 가격을 저장하는 변수
	int bonusPoint; //제품의 포인트를 저장하는 변수
	Product(int price) { //price를 인자로 갖는 생성자
		this.price = price; //자식 클래스에서 상속받아 생성자를 이용해 제품의 가격을 초기화 함
		bonusPoint = (int)(price/10.0); //제품 가격의 10%를 bonusPoint 변수에 저장
	}
}

class Tv extends Product { //Product 클래스를 상속받는 Tv 클래스
	Tv() { //생성자
		super(100); //Product에 존재하는 price를 인자로 갖는 생성자에 100을 전달
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product { //Product 클래스를 상속받는 Computer 클래스
	Computer() { //생성자
		super(200); //Product에 존재하는 price를 인자로 갖는 생성자에 200을 전달
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product { //Product 클래스를 상속받는 Audio 클래스
	Audio() { //생성자
		super(50); //Product에 존재하는 price를 인자로 갖는 생성자에 50을 전달
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer { //구매자 정보
	private int money; //구매자가 가지고 있는 돈
	public int bonusPoint, i; //구매자의 bonusPoint를 저장하는 변수, i는 구매자가 구매한 상품의 번호를 나타내는 변수
	Product item[] = new Product[10]; //구매자가 구입한 전자기기를 저장할 배열 선언
	
	public boolean setMoney(int money) { //money 변수를 입력 받아 실행되는 setMoney 메소드, 사용자가 입력한 돈이 음수인지 확인함
			if (money < 1) { //0 이하의 숫자를 입력했다면 
				System.out.println("Money should be positive"); //양수를 입력하라고 알려주고
				return false; //false 반환
			}
			else {
				this.money = money; //1 이상의 수를 입력했다면 사용자가 입력한 돈을 구매자가 가지고 있는 돈으로 저장
				return true; //true 반환
			}
	}
	
	public int getMoney() { //private 변수를 반환하는 getMoney 메소드
		return money;
	}
	
	void buy(Product pd) {
		if (pd.price > getMoney()) { //만약에 구매자가 가지고 있는 돈이 구매하려는 기기보다 적으면 (돈이 없으면)
			System.out.println("Money is not enough.\n"); 
		}
		else {
			System.out.println("You bought "+pd+"("+pd.price+").");
			money = money - pd.price; //사용자가 구입한 물품의 가격을 뺀 남은 금액 계산
			bonusPoint = bonusPoint + pd.bonusPoint; //사용자가 구입한 가격의 일부를 포인트로 저장
			item[i++] = pd; //배열의 위치를 하나씩 늘려가며 구입한 전자기기 저장
		}
	}
	void summary() { //사용자가 구입한 물품과 남은 금액, 포인트를 출력하는 함수
		System.out.print("- Shopping list: ");
		for (int j=0 ; j<i ; j++) {
			System.out.print(item[j] + " "); //구매자가 구매한 물품을 출력하는 for문
		}
		System.out.println("\n- Money left: "+money);
		System.out.println("- Current bonus point: "+bonusPoint);
	}
}

public class HW1_3_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자에게 입력을 받기 위한 Scanner 클래스 선언
		
		System.out.print("How many buyers? ");
		int cus = scanner.nextInt(); //cus 변수에 사용자가 입력한 구매자의 수를 저장
		
		Buyer buyer[] = new Buyer[cus];
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		for (int s = 0; s < cus ; s++) { //0번째부터 cus-1까지 모든 배열에 접근하여 아래의 명령문 실행
			System.out.println("\n<Buyer"+(s+1)+">");
			buyer[s] = new Buyer(); //객체 할당
			System.out.println("How much money do you have?");
			int money = scanner.nextInt(); //money 변수에 사용자가 입력한 구매자의 초기 자산을 저장
			while (buyer[s].setMoney(money) == false) { //setMoney 메소드가 false라면 = 사용자가 0 이하의 돈을 입력했다면 아래의 무한루프 실행
				System.out.println("How much money do you have?");
				money = scanner.nextInt(); //다시 입력 받기
			}
			buyer[s].setMoney(money); //false 탈출 후, setMoney 메소드를 이용하여 구매자의 money 값 설정
		
			AA: while (true) { //사용자가 입력을 멈출 때까지 계속 입력을 받는 반복문
				System.out.println("Choose the item. You have "+ buyer[s].getMoney() +"won left. Input 0 to quit."); //구매자의 돈이 얼마나 남았는지 알려주는 명령문
				System.out.println("1. TV(100)\t2. Computer(200)\t3. Audio(50)");
				int input = scanner.nextInt(); //input 변수에 사용자가 입력한 번호 (전자기기의 번호) 저장
				switch (input) { //입력받은 전자기기의 번호에 따라 switch문을 이용해서 처리
				case 0: break AA; //0을 입력한 경우 무한루프를 탈출할 수 있도록 AA 제어문 사용
				case 1: buyer[s].buy(t); break; //1을 입력하면 tv를 구매함
				case 2: buyer[s].buy(c); break; //2를 입력하면 computer를 구매함
				case 3: buyer[s].buy(a); break; //3을 입력하면 audio를 구매함
				default: System.out.println("Wrong input"); break; //0~3를 벗어난 숫자를 입력한다면 잘못된 입력임을 알려줌
				}
			}
		}
		System.out.println("\n<Shopping Result>");
		for (int k=0 ; k<cus ; k++) { //구매자의 수 만큼 반복하여 아래의 명령문 실행
			System.out.println("<Buyer "+ (k+1) + ">");
			buyer[k].summary(); //buyer 클래스 안에 있는 summary 함수를 호출하여 구매자가 구매한 물품의 이름과 가격, 포인트 출력
		}
	}
}
