import java.util.Scanner;

class Song {
	public String title;
	public String singer;
	public int price;
	
	//� �뷡�� ������� ����ϴ� �Լ� ����
	public void play() {
		System.out.println("�뷡����: \"" + title + "\" by " + singer); //"�� ���ڿ��� ����ϱ� ���� �տ� \ �Է�
	}
	
	//�뷡�� ������ ����ϴ� �Լ� ����
	public void price() {
		System.out.println(price +"���Դϴ�.");
	}
}

public class Week3_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Song first = new Song(); //Song�̶�� Ŭ������ first ��ü�� ����
		Song second = new Song(); //Song�̶�� Ŭ������ second ��ü�� ����
		
		Scanner keyboard = new Scanner(System.in); //����ڿ��� ���� �Է¹ޱ� ���� Scanner Ŭ���� ����
		
		System.out.println("*Song 1*");
		System.out.print("����Է�: ");
		first.title = keyboard.nextLine(); //ù��° ���� �̸� �Է�
		System.out.print("�������Է�: "); 
		first.singer = keyboard.nextLine();//ù��° ���� ���� �Է�
		System.out.print("�����Է�: "); 
		first.price = keyboard.nextInt(); //ù��° ���� ���� �Է�
		keyboard.nextLine(); //���� �Է����� ���ۿ� �����ִ� ���� �� ����
		
		System.out.println("\n*Song 2*");
		System.out.print("����Է�: ");
		second.title = keyboard.nextLine(); //ù��° ���� �̸� �Է�
		System.out.print("�������Է�: ");
		second.singer = keyboard.nextLine(); //ù��° ���� ���� �Է�
		System.out.print("�����Է�: ");
		second.price = keyboard.nextInt(); //ù��° ���� ���� �Է�
		keyboard.nextLine(); //���� �Է����� ���ۿ� �����ִ� ���� �� ����
		
		System.out.println("\n�뷡�� ������");
		System.out.println("1:" + first.title + " 2:" + second.title);
		int num = keyboard.nextInt(); //num�̶�� ������ ����ڰ� �Է��� �뷡�� ��ȣ�� ����
		if (num == 1) { //����ڰ� ���� 1���� ����ٸ�
			first.play();
			first.price();
		}
		else if (num == 2) { //����ڰ� ���� 2���� ����ٸ�
			second.play();
			second.price();
		}
		System.out.println("�����մϴ�.");
	}

}
