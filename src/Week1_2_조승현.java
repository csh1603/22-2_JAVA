import java.util.Scanner;

public class Week1_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //Ű���� �Է��� �ޱ� ���� ��ĳ�� Ŭ���� ���
		
		System.out.println("���� �� �� �Է�");
		int a = keyboard.nextInt(); //a��� ������ �Է¹��� ���� �� ����
		int b = keyboard.nextInt(); //b��� ������ �Է¹��� ���� �� ����
		int c = keyboard.nextInt(); //c��� ������ �Է¹��� ���� �� ����
		
		System.out.print("���: ");
		System.out.printf("%.2f", (float)(a+b+c)/3); 
		//�Է¹��� �� ������ ���� float������ ��ȯ�� �� �ӽ� �����ϰ� 3���� ���� -> float�� int�� �����̹Ƿ� float������ ����
		//c���� ����ϴ� print ����� �̿��ؼ� �Ҽ� ��°�ڸ����� ��� 
	}

}
