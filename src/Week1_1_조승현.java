import java.util.Scanner;

public class Week1_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //Ű���� �Է��� �ޱ� ���� ��ĳ�� Ŭ���� ���
		
		System.out.print("Input base: "); //�غ��� �Է��϶�� ���� ���
		int a = keyboard.nextInt(); //�ﰢ�� �غ��� ���̸� �Է¹޾� a��� ������ ����
		System.out.print("Input height: "); //���̸� �Է��϶�� ���� ���
		int b = keyboard.nextInt(); //�ﰢ�� ������ ���̸� �Է¹޾� b��� ������ ����
		
		float num = (float)a*b/2; //a�� �ڷ����� float�� ��ȯ�� �� int���� b�� 2�� �����ϸ� �� ū ���� ���� �� �ִ� float������ ����� �Ǿ� num�� ����
		
		System.out.print("The area: " + num); //���̸� ����� ���� �˷��ִ� ����� ������ ����� �� ����ϴ� ���
	}

}
