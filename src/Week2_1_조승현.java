import java.util.Scanner;

public class Week2_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in); //����ڿ��� �Է��� �ޱ� ���� ��ĳ�� ����
		
		System.out.print("�� �Է�:");
		int month = keyboard.nextInt(); //'��'�� Ű���带 �̿��� ������ �Է¹�������
		
		switch(month) { //month ������ ����ġ ���� �����ϴ� ����
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: //1, 3, 5, 7, 8, 10, 12���� 
			System.out.println(month+"������ 31���� �ֽ��ϴ�."); //31���� ����
			break; //switch���� break�� ������� ������ switch���� ������ ���� ������ ��� ��ɹ��� ����
		case 4: case 6: case 9: case 11: //4, 6, 9, 11���� 
			System.out.println(month+"������ 30���� �ֽ��ϴ�."); //30���� ����
			break;
		case 2: //2����
			System.out.println(month+"������ 28���� �ֽ��ϴ�."); //28���� ����
			break;
		default: //1~12���� �ƴ� ���� �Է����� ��
			System.out.println("�Է� ����");
			break;
		}
	}

}
