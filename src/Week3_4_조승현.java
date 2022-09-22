import java.util.Scanner;

class MenuOrder {
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setPrice(String drinkSelected, int price) {
		if (drinkSelected.equals("Coke")) { //가격울 설정하려는 음료의 이름이 Coke라면
			this.cokePrice = price; //입력받은 가격은 cokePrice 변수에 저장
		}
		else if (drinkSelected.equals("Lemonade")) { //가격울 설정하려는 음료의 이름이 Lemonade라면
			this.lemonadePrice = price; //입력받은 가격은 LemonadePrice 변수에 저장
		}
		else if (drinkSelected.equals("Coffee")) { //가격울 설정하려는 음료의 이름이 Coffee라면
			this.coffeePrice = price; //입력받은 가격은 CoffeePrice 변수에 저장
		}
	}
	
	public void showMenu() { //저장한 각 음료의 가격을 출력하는 메소드
		System.out.println("--- 음료를 선택하세요 ---");
		System.out.println("1. Coke: " + cokePrice);
		System.out.println("2. Lemonade: " + lemonadePrice);
		System.out.println("3. Coffee: " + coffeePrice);
	}
	
	public void RecMoeny(int money) {
		inputMoney = money;
	}
	
	public void showResult(int choice) {
		if (choice == 1) { //메뉴 공지 후 사용자가 1번, coke를 선택했다면
	         System.out.println("Coke를 선택하셨습니다.");
	         if(inputMoney >= cokePrice) //넣은 돈의 크기가 상품의 값보다 같거나 크다면
	        	 System.out.println("잔돈은 " + (inputMoney - cokePrice) + "원입니다."); //잔돈이 얼마인지 알려주는 출력문
	         else //그게 아니라면 (상품의 값이 넣은 돈보다 크다면)
	        	 System.out.println((cokePrice-inputMoney) + "원을 더 넣어주세요."); //더 필요한 금액이 얼마인지 알려주는 출력문
		}
	    else if (choice == 2) { //메뉴 공지 후 사용자가 2번, lemonade를 선택했다면
	         System.out.println("Lemonade를 선택하셨습니다.");
	         if(inputMoney >= lemonadePrice) 
	        	 System.out.println("잔돈은 " + (inputMoney - lemonadePrice));
	         else
	        	 System.out.println((lemonadePrice-inputMoney) + "원을 더 넣어주세요.");
	    }
	    else if (choice == 3) { //메뉴 공지 후 사용자가 3번, coffee를 선택했다면
	         System.out.println("Coffee를 선택하셨습니다.");
	         if(inputMoney >= cokePrice) 
	        	 System.out.println("잔돈은 " + (inputMoney - coffeePrice));
	         else
	        	 System.out.println((coffeePrice-inputMoney) + "원을 더 넣어주세요.");
	    }
	    else
	         System.out.println("없는 메뉴를 선택하셨습니다."); //사용자가 보기에 없는 메뉴를 골랐다면 오류 메세지 출력
	}
}

public class Week3_4_조승현 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 scanner 클래스 선언
		MenuOrder menu = new MenuOrder(); //MenuOrder 클래스를 menu라는 객체로 선언
		String con = "Y"; //사용자로부터 프로그램을 계속 진행할지 물어보아 답을 저장하는 문자열 선언 (처음에 y로 정의하여 con의 값이 y일때동안 계속 반복하도록 함)
		int money, choice; //사용자가 주입한 돈과 고르는 메뉴의 번호를 저장하기 위한 변수
		
		System.out.println("--- 음료가격 설정 ---");
		System.out.print("Coke가격:");
		int cokeP = scanner.nextInt();
		scanner.nextLine();
		menu.setPrice("Coke", cokeP); //menu 객체 안에 존재하는 setPrice 메소드를 이용해 콜라의 가격 입력받고 저장하기 
		System.out.print("Lemonade가격:");
		int lemP = scanner.nextInt(); //menu 객체 안에 존재하는 setPrice 메소드를 이용해 레몬에이드의 가격 입력받고 저장하기
		scanner.nextLine();
		menu.setPrice("Lemonade", lemP);
		System.out.print("Coffee가격:");
		int cofP = scanner.nextInt(); //menu 객체 안에 존재하는 setPrice 메소드를 이용해 커피의 가격 입력받고 저장하기
		scanner.nextLine(); //정수 입력 받은 후 버퍼에 남아있는 엔터 비우기
		menu.setPrice("Coffee", cofP);
		
		while (con.equalsIgnoreCase("Y")) { //사용자가 그만하고 싶으면 y이외의 문자를 입력하면 되도록 설정
			System.out.println("\n--- 돈을 넣으세요 ---");
			money = scanner.nextInt();
			scanner.nextLine();
			menu.RecMoeny(money); //menu 객체 안에 RecMoney 함수를 이용하여 사용자가 넣은 금액 전달
			menu.showMenu(); //menu 객체 안에 존재하는 showMenu를 이용하여 메뉴의 이름과 가격 출력
			choice = scanner.nextInt();
			scanner.nextLine();
			
			menu.showResult(choice); //menu 객체 안에 존재하는 showResult를 이용하여 잔돈과 부족한금액 혹은 잘못된 입력임을 알려줌
			
			System.out.println("계속하시겠습니까?(y/n)");
			con = scanner.nextLine();
		}
	}

}
