import java.util.Scanner;

public class Week1_3_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //Ű���� �Է��� �ޱ� ���� ��ĳ�� Ŭ���� ���
		
		System.out.print("ȭ���µ� �Է�: ");
		int F = keyboard.nextInt(); //F��� ������ Ű����� �Է¹��� ���� ����
		System.out.println(); //�� �� �� ����ϱ� ���� ���
		
		float C = (float)5/9*(F-32); //5��� ������ float������ ��ȯ�ؼ� �������� int�������� ����� ���� float���� �ǵ��� ��		
		System.out.println("ȭ���µ�: " + F);
		System.out.print("�����µ�: ");
		System.out.printf("%.1f", C);
		//c���� ����ϴ� print ����� �̿��ؼ� �Ҽ� ù°�ڸ����� ��� 
	}

}
