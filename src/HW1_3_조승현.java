import java.util.Scanner;

class Product { //��� �ڽ� Ŭ������ ������ �ִ� �Ӽ��� Product Ŭ������ ����
	int price; //��ǰ�� ������ �����ϴ� ����
	int bonusPoint; //��ǰ�� ����Ʈ�� �����ϴ� ����
	Product(int price) { //price�� ���ڷ� ���� ������
		this.price = price; //�ڽ� Ŭ�������� ��ӹ޾� �����ڸ� �̿��� ��ǰ�� ������ �ʱ�ȭ ��
		bonusPoint = (int)(price/10.0); //��ǰ ������ 10%�� bonusPoint ������ ����
	}
}

class Tv extends Product { //Product Ŭ������ ��ӹ޴� Tv Ŭ����
	Tv() { //������
		super(100); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 100�� ����
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product { //Product Ŭ������ ��ӹ޴� Computer Ŭ����
	Computer() { //������
		super(200); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 200�� ����
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product { //Product Ŭ������ ��ӹ޴� Audio Ŭ����
	Audio() { //������
		super(50); //Product�� �����ϴ� price�� ���ڷ� ���� �����ڿ� 50�� ����
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer { //������ ����
	private int money; //�����ڰ� ������ �ִ� ��
	public int bonusPoint, i; //�������� bonusPoint�� �����ϴ� ����, i�� �����ڰ� ������ ��ǰ�� ��ȣ�� ��Ÿ���� ����
	Product item[] = new Product[10]; //�����ڰ� ������ ���ڱ�⸦ ������ �迭 ����
	
	public boolean setMoney(int money) { //money ������ �Է� �޾� ����Ǵ� setMoney �޼ҵ�, ����ڰ� �Է��� ���� �������� Ȯ����
			if (money < 1) { //0 ������ ���ڸ� �Է��ߴٸ� 
				System.out.println("Money should be positive"); //����� �Է��϶�� �˷��ְ�
				return false; //false ��ȯ
			}
			else {
				this.money = money; //1 �̻��� ���� �Է��ߴٸ� ����ڰ� �Է��� ���� �����ڰ� ������ �ִ� ������ ����
				return true; //true ��ȯ
			}
	}
	
	public int getMoney() { //private ������ ��ȯ�ϴ� getMoney �޼ҵ�
		return money;
	}
	
	void buy(Product pd) {
		if (pd.price > getMoney()) { //���࿡ �����ڰ� ������ �ִ� ���� �����Ϸ��� ��⺸�� ������ (���� ������)
			System.out.println("Money is not enough.\n"); 
		}
		else {
			System.out.println("You bought "+pd+"("+pd.price+").");
			money = money - pd.price; //����ڰ� ������ ��ǰ�� ������ �� ���� �ݾ� ���
			bonusPoint = bonusPoint + pd.bonusPoint; //����ڰ� ������ ������ �Ϻθ� ����Ʈ�� ����
			item[i++] = pd; //�迭�� ��ġ�� �ϳ��� �÷����� ������ ���ڱ�� ����
		}
	}
	void summary() { //����ڰ� ������ ��ǰ�� ���� �ݾ�, ����Ʈ�� ����ϴ� �Լ�
		System.out.print("- Shopping list: ");
		for (int j=0 ; j<i ; j++) {
			System.out.print(item[j] + " "); //�����ڰ� ������ ��ǰ�� ����ϴ� for��
		}
		System.out.println("\n- Money left: "+money);
		System.out.println("- Current bonus point: "+bonusPoint);
	}
}

public class HW1_3_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڿ��� �Է��� �ޱ� ���� Scanner Ŭ���� ����
		
		System.out.print("How many buyers? ");
		int cus = scanner.nextInt(); //cus ������ ����ڰ� �Է��� �������� ���� ����
		
		Buyer buyer[] = new Buyer[cus];
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		for (int s = 0; s < cus ; s++) { //0��°���� cus-1���� ��� �迭�� �����Ͽ� �Ʒ��� ��ɹ� ����
			System.out.println("\n<Buyer"+(s+1)+">");
			buyer[s] = new Buyer(); //��ü �Ҵ�
			System.out.println("How much money do you have?");
			int money = scanner.nextInt(); //money ������ ����ڰ� �Է��� �������� �ʱ� �ڻ��� ����
			while (buyer[s].setMoney(money) == false) { //setMoney �޼ҵ尡 false��� = ����ڰ� 0 ������ ���� �Է��ߴٸ� �Ʒ��� ���ѷ��� ����
				System.out.println("How much money do you have?");
				money = scanner.nextInt(); //�ٽ� �Է� �ޱ�
			}
			buyer[s].setMoney(money); //false Ż�� ��, setMoney �޼ҵ带 �̿��Ͽ� �������� money �� ����
		
			AA: while (true) { //����ڰ� �Է��� ���� ������ ��� �Է��� �޴� �ݺ���
				System.out.println("Choose the item. You have "+ buyer[s].getMoney() +"won left. Input 0 to quit."); //�������� ���� �󸶳� ���Ҵ��� �˷��ִ� ��ɹ�
				System.out.println("1. TV(100)\t2. Computer(200)\t3. Audio(50)");
				int input = scanner.nextInt(); //input ������ ����ڰ� �Է��� ��ȣ (���ڱ���� ��ȣ) ����
				switch (input) { //�Է¹��� ���ڱ���� ��ȣ�� ���� switch���� �̿��ؼ� ó��
				case 0: break AA; //0�� �Է��� ��� ���ѷ����� Ż���� �� �ֵ��� AA ��� ���
				case 1: buyer[s].buy(t); break; //1�� �Է��ϸ� tv�� ������
				case 2: buyer[s].buy(c); break; //2�� �Է��ϸ� computer�� ������
				case 3: buyer[s].buy(a); break; //3�� �Է��ϸ� audio�� ������
				default: System.out.println("Wrong input"); break; //0~3�� ��� ���ڸ� �Է��Ѵٸ� �߸��� �Է����� �˷���
				}
			}
		}
		System.out.println("\n<Shopping Result>");
		for (int k=0 ; k<cus ; k++) { //�������� �� ��ŭ �ݺ��Ͽ� �Ʒ��� ��ɹ� ����
			System.out.println("<Buyer "+ (k+1) + ">");
			buyer[k].summary(); //buyer Ŭ���� �ȿ� �ִ� summary �Լ��� ȣ���Ͽ� �����ڰ� ������ ��ǰ�� �̸��� ����, ����Ʈ ���
		}
	}
}
