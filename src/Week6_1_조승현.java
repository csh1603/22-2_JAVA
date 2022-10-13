import java.util.Scanner;

class Product { //��� �ڽ� Ŭ������ ������ �ִ� �Ӽ��� Product Ŭ������ ����
	int price; 
	int bonusPoint;
	Product(int price) { //price�� ���ڷ� ���� ������
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 100�� ����
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 200�� ����
	}
	public String toString() {
		return "Computer";
	}
}

class Video extends Product {
	Video() {
		super(110); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 110�� ����
	}
	public String toString() {
		return "Video";
	}
}

class Audio extends Product {
	Audio() {
		super(50); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 50�� ����
	}
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product {
	NoteBook() {
		super(300); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 300�� ����
	}
	public String toString() {
		return "NoteBook";
	}
}

class Buyer { //������ ����
	int money, bonusPoint, i;
	Product item[] = new Product[10]; //����ڰ� ������ ���ڱ�⸦ ������ �迭 ����
	
	void buy(Product pd) {
		if (pd.price > money) { //���࿡ ����ڰ� ������ �ִ� ���� �����Ϸ��� ��⺸�� ������ (���� ������)
			System.out.println("Money is not enough."); 
			summary(); //���ݱ��� ������ ��ǰ�� ���
			System.exit(0); //�ؿ� �ִ� ��ɾ���� �������� �ʰ� ����
		}
		System.out.println("You bought "+pd+"("+pd.price+").");
		money = money - pd.price; //����ڰ� ������ ��ǰ�� ������ �� ���� �ݾ� ���
		bonusPoint = bonusPoint + pd.bonusPoint; //����ڰ� ������ ������ �Ϻθ� ����Ʈ�� ����
		item[i++] = pd; //�迭�� ��ġ�� �ϳ��� �÷����� ������ ���ڱ�� ����
	}
	void summary() { //����ڰ� ������ ��ǰ�� ���� �ݾ�, ����Ʈ�� ����ϴ� �Լ�
		System.out.print("\nSHOPPING LIST: ");
		for (int j=0 ; j<i ; j++) {
			System.out.print(item[j] + " ");
		}
		System.out.println("\nMONEY LEFT: "+money);
		System.out.println("CURRENT BONUS POINT: "+bonusPoint);
	}
}

public class Week6_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڿ��� �Է��� �ޱ� ���� Scanner Ŭ���� ����
		
		Buyer buyer = new Buyer();
		System.out.println("How much money do you have?");
		buyer.money = scanner.nextInt(); //����ڰ� ������ �ִ� ���� buyer ��ü ���� money ������ ����
		
		Tv t = new Tv();
		Computer c = new Computer();
		Video v = new Video();
		Audio a = new Audio();
		NoteBook nt = new NoteBook();
		
		AA: while (true) { //����ڰ� �Է��� ���� ������ ��� �Է��� �޴� �ݺ���
			System.out.println("What do you want to buy? Input 0 to quit.");
			System.out.println("1. TV(100)\t2. Computer(200)\t3. Video(110)\t4. Audio(50)\t5. NoteBook(300)");
			int input = scanner.nextInt(); //input ������ ����ڰ� �Է��� ��ȣ (���ڱ���� ��ȣ) ����
			switch (input) { //�Է¹��� ���ڱ���� ��ȣ�� ���� switch���� �̿��ؼ� ó��
			case 0: break AA; //0�� �Է��� ��� ���ѷ����� Ż���� �� �ֵ��� AA ��� ���
			case 1: buyer.buy(t); break;
			case 2: buyer.buy(c); break;
			case 3: buyer.buy(v); break;
			case 4: buyer.buy(a); break;
			case 5: buyer.buy(nt); break;
			default: System.out.println("No such item."); break; //0~5�� ��� ���ڸ� �Է��Ѵٸ� ���� �������̶�� �˷���
			}
		}
		buyer.summary(); //buyer Ŭ���� �ȿ� �ִ� summary �Լ��� ȣ���Ͽ� ����ڰ� ������ ��ǰ�� �̸��� ����, ����Ʈ ���
	}
	
}
