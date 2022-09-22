import java.util.Scanner;

class MenuOrder {
	private int cokePrice;
	private int lemonadePrice;
	private int coffeePrice;
	private int inputMoney;
	private String drinkSelected;
	
	public void setPrice(String drinkSelected, int price) {
		if (drinkSelected.equals("Coke")) { //���ݿ� �����Ϸ��� ������ �̸��� Coke���
			this.cokePrice = price; //�Է¹��� ������ cokePrice ������ ����
		}
		else if (drinkSelected.equals("Lemonade")) { //���ݿ� �����Ϸ��� ������ �̸��� Lemonade���
			this.lemonadePrice = price; //�Է¹��� ������ LemonadePrice ������ ����
		}
		else if (drinkSelected.equals("Coffee")) { //���ݿ� �����Ϸ��� ������ �̸��� Coffee���
			this.coffeePrice = price; //�Է¹��� ������ CoffeePrice ������ ����
		}
	}
	
	public void showMenu() { //������ �� ������ ������ ����ϴ� �޼ҵ�
		System.out.println("--- ���Ḧ �����ϼ��� ---");
		System.out.println("1. Coke: " + cokePrice);
		System.out.println("2. Lemonade: " + lemonadePrice);
		System.out.println("3. Coffee: " + coffeePrice);
	}
	
	public void RecMoeny(int money) {
		inputMoney = money;
	}
	
	public void showResult(int choice) {
		if (choice == 1) { //�޴� ���� �� ����ڰ� 1��, coke�� �����ߴٸ�
	         System.out.println("Coke�� �����ϼ̽��ϴ�.");
	         if(inputMoney >= cokePrice) //���� ���� ũ�Ⱑ ��ǰ�� ������ ���ų� ũ�ٸ�
	        	 System.out.println("�ܵ��� " + (inputMoney - cokePrice) + "���Դϴ�."); //�ܵ��� ������ �˷��ִ� ��¹�
	         else //�װ� �ƴ϶�� (��ǰ�� ���� ���� ������ ũ�ٸ�)
	        	 System.out.println((cokePrice-inputMoney) + "���� �� �־��ּ���."); //�� �ʿ��� �ݾ��� ������ �˷��ִ� ��¹�
		}
	    else if (choice == 2) { //�޴� ���� �� ����ڰ� 2��, lemonade�� �����ߴٸ�
	         System.out.println("Lemonade�� �����ϼ̽��ϴ�.");
	         if(inputMoney >= lemonadePrice) 
	        	 System.out.println("�ܵ��� " + (inputMoney - lemonadePrice));
	         else
	        	 System.out.println((lemonadePrice-inputMoney) + "���� �� �־��ּ���.");
	    }
	    else if (choice == 3) { //�޴� ���� �� ����ڰ� 3��, coffee�� �����ߴٸ�
	         System.out.println("Coffee�� �����ϼ̽��ϴ�.");
	         if(inputMoney >= cokePrice) 
	        	 System.out.println("�ܵ��� " + (inputMoney - coffeePrice));
	         else
	        	 System.out.println((coffeePrice-inputMoney) + "���� �� �־��ּ���.");
	    }
	    else
	         System.out.println("���� �޴��� �����ϼ̽��ϴ�."); //����ڰ� ���⿡ ���� �޴��� ����ٸ� ���� �޼��� ���
	}
}

public class Week3_4_������ {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� scanner Ŭ���� ����
		MenuOrder menu = new MenuOrder(); //MenuOrder Ŭ������ menu��� ��ü�� ����
		String con = "Y"; //����ڷκ��� ���α׷��� ��� �������� ����� ���� �����ϴ� ���ڿ� ���� (ó���� y�� �����Ͽ� con�� ���� y�϶����� ��� �ݺ��ϵ��� ��)
		int money, choice; //����ڰ� ������ ���� ���� �޴��� ��ȣ�� �����ϱ� ���� ����
		
		System.out.println("--- ���ᰡ�� ���� ---");
		System.out.print("Coke����:");
		int cokeP = scanner.nextInt();
		scanner.nextLine();
		menu.setPrice("Coke", cokeP); //menu ��ü �ȿ� �����ϴ� setPrice �޼ҵ带 �̿��� �ݶ��� ���� �Է¹ް� �����ϱ� 
		System.out.print("Lemonade����:");
		int lemP = scanner.nextInt(); //menu ��ü �ȿ� �����ϴ� setPrice �޼ҵ带 �̿��� �����̵��� ���� �Է¹ް� �����ϱ�
		scanner.nextLine();
		menu.setPrice("Lemonade", lemP);
		System.out.print("Coffee����:");
		int cofP = scanner.nextInt(); //menu ��ü �ȿ� �����ϴ� setPrice �޼ҵ带 �̿��� Ŀ���� ���� �Է¹ް� �����ϱ�
		scanner.nextLine(); //���� �Է� ���� �� ���ۿ� �����ִ� ���� ����
		menu.setPrice("Coffee", cofP);
		
		while (con.equalsIgnoreCase("Y")) { //����ڰ� �׸��ϰ� ������ y�̿��� ���ڸ� �Է��ϸ� �ǵ��� ����
			System.out.println("\n--- ���� �������� ---");
			money = scanner.nextInt();
			scanner.nextLine();
			menu.RecMoeny(money); //menu ��ü �ȿ� RecMoney �Լ��� �̿��Ͽ� ����ڰ� ���� �ݾ� ����
			menu.showMenu(); //menu ��ü �ȿ� �����ϴ� showMenu�� �̿��Ͽ� �޴��� �̸��� ���� ���
			choice = scanner.nextInt();
			scanner.nextLine();
			
			menu.showResult(choice); //menu ��ü �ȿ� �����ϴ� showResult�� �̿��Ͽ� �ܵ��� �����ѱݾ� Ȥ�� �߸��� �Է����� �˷���
			
			System.out.println("����Ͻðڽ��ϱ�?(y/n)");
			con = scanner.nextLine();
		}
	}

}
