import java.util.Scanner;

public class Week5_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� scanner Ŭ���� ����
		
		Dog[] dog = new Dog[3]; //�迭�� Dog Ŭ���� ����
		Cat[] cat = new Cat[3]; //�迭�� Cat Ŭ���� ����
		
		for (int i=0 ; i<dog.length ; i++) { //������ Dog Ŭ������ �迭 ����ŭ �ݺ�
			dog[i] = new Dog(); //�迭�� ���� �ϳ��� �÷����鼭 Dog Ŭ������ ���� dog ��ü ����
			System.out.println("<<Dog "+(i+1)+">>");
			System.out.print("Name :");
			dog[i].setName(scanner.next()); //i��° dog ��ü �ȿ� �ִ� �̸� ����
			System.out.print("Age :");
			dog[i].setAge(scanner.nextInt()); //i��° dog Ŭ������ ���� ����
			System.out.print("Weight :");
			dog[i].setWeight(scanner.nextDouble()); //i��° dog Ŭ������ ���� ����
			System.out.print("BossterShot(y/n) :");
			String a = scanner.next(); //����ڰ� y�� n���� �Է��ϴµ� Dog Ŭ���� ���� �����������θ� �����ϴ� ������ ���� �������� ������ �� �ֱ� ������ a�� �ӽ� ����
			if (a.equalsIgnoreCase("y")) //���� ����ڰ� �Է��� ���� y���
				dog[i].setBossterShot(true); //i��° dog ��ü ���� BossterShot ������ true ���� 
			else //����ڰ� �Է��� ���� y�� �ƴ϶�� -> n�̶��
				dog[i].setBossterShot(false); //i��° dog ��ü ���� BossterShot ������ false ����
			System.out.println();
		}
		for (int i=0 ; i<cat.length ; i++) { //������ Cat Ŭ������ �迭 ����ŭ �ݺ�
			cat[i] = new Cat(); //�迭�� ���� �ϳ��� �÷����鼭 Cat Ŭ������ ���� cat Ŭ���� ����
			System.out.println("<<Cat "+(i+1)+">>");
			System.out.print("Name :");
			cat[i].setName(scanner.next()); //i��° cat ��ü �ȿ� �ִ� �̸� ����
			System.out.print("Age :");
			cat[i].setAge(scanner.nextInt()); //i��° cat ��ü�� ���� ����
			System.out.print("Weight :");
			cat[i].setWeight(scanner.nextDouble()); //i��° cat ��ü�� ���� ����
			System.out.print("Color :");
			cat[i].setColor(scanner.next()); //i��° cat ��ü�� ���� ����
			System.out.println();
		}
		
		System.out.println("<<Dog List>>");
		for (int i=0 ; i<dog.length ; i++) { //�����ϴ� dog �迭�� ����ŭ �ݺ�
			dog[i].writeOutput(); //dog ��ü�� �̸�, ����, ����, ������������ ���
			dog[i].move(); //Dog Ŭ���� ������ move ���
			System.out.println();
		}
		
		System.out.println("<<Cat List>>");
		for (int i=0 ; i<cat.length ; i++) { //�����ϴ� cat �迭�� ����ŭ �ݺ�
			cat[i].writeOutput(); //cat ��ü�� �̸�, ����, ����, ���� ���
			cat[i].move();
			System.out.println();
		}
		
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for (int i=0 ; i<dog.length ; i++) { //�����ϴ� dog �迭�� ����ŭ �ݺ�
			if (dog[i].getAge() > 2) { //���� i��° dog ��ü�� ���̰� 2���� ũ�ٸ�
				if (dog[i].getBossterShot() == false) { //���� ���������� ���� �ʾҴٸ�
					System.out.print(dog[i].getName()+" "); //�̸� ���
				}
			}
		}
		System.out.println();
		System.out.println("* Black cats weighs more than 3Kg are...");
		for (int i=0 ; i<cat.length ; i++) { //�����ϴ� cat �迭�� ����ŭ �ݺ�
			if (cat[i].getColor().equals("black")) { //���� i��° cat ��ü�� ���� black�̶��
				if (cat[i].getWeight() > 3) { //���� i��° cat ��ü�� ���԰� 3���� ũ�ٸ�
					System.out.print(cat[i].getName()+" "); //�̸� ���
				}
			}
		}
		
	}

}
