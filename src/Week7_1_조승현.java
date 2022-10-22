import java.util.Scanner;

abstract class Pet {
	public String species;
	public String name;
	public int age;
	
	abstract void move(); //�ڽ� Ŭ�������� �������̵� �� �Լ� ����
	
	Pet() {} //�� ������ ����
	Pet (String species, String name, int age){ //����ڷκ��� species, name, age�� �Է¹޾� �ʱ�ȭ�ϴ� ������ ����
		this.species = species;
		this.name = name;
		this.age = age;
	}
}

class Dog extends Pet { //Pet�� ��ӹ޴� Dog Ŭ���� ����
	Dog () {} //�� ������ ����
	Dog (String name, int age){ //����ڷκ��� name, age�� �Է¹޾Ƽ� ������ ������ ����
		super("Dog", name, age); //�θ�Ŭ������ Pet�� Dog, name, age�� �����Ͽ� 3���� �ʱ�ȭ�ϴ� ������ ȣ��
	}
	@Override //Pet�� abstract Ŭ�����̹Ƿ� ��ӹ޾� �޼ҵ� �������̵��� �ʼ��� �ؾ���
	void move() {
		// TODO Auto-generated method stub
		System.out.println("run"); //Dog Ŭ������ ��� move �޼ҵ� ����� run ���
	}
}

class Cat extends Pet { //Pet�� ��ӹ޴� Cat Ŭ���� ����
	Cat () {} //�� ������ ����
	Cat (String name, int age){ //����ڷκ��� name, age�� �Է¹޾Ƽ� ������ ������ ����
		super("Cat", name, age); //�θ�Ŭ������ Pet�� Cat, name, age�� �����Ͽ� 3���� �μ��� �ʱ�ȭ�ϴ� ������ ȣ��
	}
	@Override //�������̵� �ʼ�
	void move() {
		// TODO Auto-generated method stub
		System.out.println("jump"); //Cat Ŭ������ ��� move �޼ҵ� ����� jump ���
	}
}

class Bird extends Pet { //Pet�� ��ӹ޴� Bird Ŭ���� ����
	Bird () {} //�� ������ ����
	Bird (String name, int age){ //����ڷκ��� name, age�� �Է¹޾Ƽ� ������ ������ ����
		super("Bird", name, age); //�θ�Ŭ������ Pet�� Bird, name, age�� �����Ͽ� 3���� �μ��� �ʱ�ȭ�ϴ� ������ ȣ��
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("fly"); //Bird Ŭ������ ��� move �޼ҵ� ����� fly ���
	}
}

class Snake extends Pet { //Pet�� ��ӹ޴� Snake Ŭ���� ����
	Snake () {} //�� ������ ����
	Snake (String name, int age){ //����ڷκ��� name, age�� �Է¹޾Ƽ� ������ ������ ����
		super("Snake", name, age); //�θ�Ŭ������ Pet�� Snake, name, age�� �����Ͽ� 3���� �μ��� �ʱ�ȭ�ϴ� ������ ȣ��
	}
	@Override //�޼ҵ� �������̵� �ʼ�
	void move() {
		// TODO Auto-generated method stub
		System.out.println("crawl"); //Snake Ŭ������ ��� move �޼ҵ� ����� crawl ���
	}
}

public class Week7_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� Scanner Ŭ���� ����
		Pet[] list = new Pet[10]; //����ڰ� �Է��� �������� ������ PetŸ�� �迭 ����
		
		//�� Ŭ������ ���� (���� � Ÿ�������� ��)
		Dog dog;
		Cat cat;
		Bird bird;
		Snake snake;
		
		//����ڷκ��� �Է¹��� �̸��� ���� ������ ����
		String name; 
		int age;
		
		//�ݺ����� ���� �ʱⰪ ����, input�� ó�� ���ϴ� �۾��� ������ ����, sp�� ������ ���� �����ϴ� ����, i�� ����ڰ� �Է��ߴ� ������ ������ ������ �迭�� �ε���
		int input = 1;
		int sp = 1;
		int i = 0;
		
		
		//���ѷ��� (����ڰ� 3.exit�� ���� ������ �ݺ�)
		AA: while(true) {
			System.out.println("���ϴ� �۾��� �����Դϱ�?");
			System.out.println("1. New input   2. Output   3. Exit");
			input = scanner.nextInt(); //����ڰ� ������ ��ȣ�� ����
			scanner.nextLine(); //���ۿ� �����ִ� enter ����
			switch (input) { //input�� ���� ��� ����
			case 1: //input�� 1�̶�� = New input�� �����ߴٸ�
				System.out.println("���� �����Դϱ�?");
				System.out.println("1. Dog   2. Cat   3. Snake   4. Bird");
				sp = scanner.nextInt(); //sp�� ����ڰ� �Է��� ���� ��ȣ ����
				scanner.nextLine(); //���ۿ� �����ִ� enter ����
				while (sp > 4 || sp < 1) { //����ڰ� 1~4 �̿��� ��ȣ�� �Է����� ��
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���."); //�߸��� �Է����� �˷��ְ�
					System.out.println("���� �����Դϱ�?");
					System.out.println("1. Dog   2. Cat   3. Snake   4. Bird");
					sp = scanner.nextInt(); //�ٽ� �Է��� ����
					scanner.nextLine();
				}
				System.out.print("Name:"); //�̸� �Է¹ް�
				name = scanner.nextLine(); //name ������ ����
				System.out.print("Age:"); //���̵� �Է¹޾Ƽ�
				age = scanner.nextInt(); //age ������ ����
				scanner.nextLine();
				switch (sp) { //sp�� ��ȣ�� ���� switch�� ����
				case 1: dog = new Dog(name, age); list[i++] = dog; break; 
				//sp�� 1�̶�� = �� ������ Dog��� ���ο� Dog Ŭ������ ����ڰ� �Է��� name, age�� �����ڿ� �����Ͽ� ����
				//����ڰ� �Է��� ������ list �迭�� �ְ� ���������ڸ� �����Ͽ� i�� �ϳ��� �ø� -> 0��° �迭�� �ְ� i�� 1�� �ٲ� 
				case 2: cat = new Cat(name, age); list[i++] = cat; break;
				//sp�� 2��� = �� ������ Cat�̶�� ���ο� Cat Ŭ������ ����ڰ� �Է��� name, age�� �����ڿ� �����Ͽ� ����
				case 4: bird = new Bird(name, age); list[i++] = bird; break;
				//sp�� 4��� = �� ������ Bird��� ���ο� Bird Ŭ������ ����ڰ� �Է��� name, age�� �����ڿ� �����Ͽ� ����
				case 3: snake = new Snake(name, age); list[i++] = snake; break;
				//sp�� 3��� = �� ������ Snake�̶�� ���ο� snake Ŭ������ ����ڰ� �Է��� name, age�� �����ڿ� �����Ͽ� ����
				}
				System.out.println();
				break; //case 1 ���� (new input�� ���� ��Ȳ ����)
			case 2: //����ڰ� 2�� ����ٸ� = Output
				System.out.println("Species   Name   Age     Movement");
				for (int j=0 ; j<i ; j++) { //�迭�� ũ�⸦ �ϳ��� �ø��鼭 ��, �̸�, ����, move ���
					System.out.print(list[j].species + "      " + list[j].name + "     " + list[j].age + "       ");
					list[j].move();
				}
				System.out.println();
				break;
			case 3: //����ڰ� 3�� ����ٸ� = exit
				System.out.println("����"); break AA; //�����ϰ� ���� while �� Ż�� (AA ���̺� ���)
			default: //1~3 ������ ���� �ƴ� ���� �Է��ߴٸ� 
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���."); //�ٽ� �Է��϶�� �˷���
				break;
			}
		}
	}

}
