import java.util.Scanner;

public class Week2_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		double C;
		int F;
		String con = "Y";
		
		Scanner keyboard = new Scanner(System.in);
		
		while (con.equalsIgnoreCase("Y")) { //��ҹ��ڸ� �������� �ʰ� con�̶�� ������ Y���
		System.out.print("�����ǰ��'C', ȭ���ǰ�� 'F' �Է�:"); 
		String letter = keyboard.nextLine(); //�����µ��� ȭ���µ��� letter��� ������ ���� �Է¹���
		if (letter.equalsIgnoreCase("C")) { //��ҹ��ڸ� �������� �ʰ� letter�̶�� ������ C���
			System.out.print("�����µ� �Է�:");
			C = keyboard.nextDouble(); //C��� ������ double������ �����µ��� �Է¹�������
			F = (int)(9*C/5) + 32;
			System.out.println("����µ��� ���� "+ C + "��, ȭ�� " + F + "���Դϴ�.");
			keyboard.nextLine(); //buffer�� �����ִ� enter ����
		}
		else if (letter.equalsIgnoreCase("F")){ //��ҹ��ڸ� �������� �ʰ� letter�̶�� ������ F���
			System.out.print("ȭ���µ� �Է�:");
			F = keyboard.nextInt(); //F��� ������ int������ ȭ���µ��� �Է� ��������
			C = (double)5*(F-32)/9;
			System.out.print("����µ��� ȭ�� "+ F + "��, ���� ");
			System.out.printf("%.1f", C); //ȭ���µ��� ����� �����µ��� �Ҽ��� 1�ڸ����� ���
			System.out.println("���Դϴ�.");
			keyboard.nextLine(); //buffer�� �����ִ� enter ����
		}
		else { //letter��� ������ C, F�� �ƴ� ���� ������
			System.out.println("�߸��� �Է�"); 
		}
		
		System.out.print("����Ͻðڽ��ϱ�?(y/n)");
		con = keyboard.nextLine(); //con�̶�� ������ ���ڿ� �Է¹���
		
		if(con.equalsIgnoreCase("Y")) { 
			continue; //con�̶�� ������ ��ҹ��� ������� y��� ��� ����
		}
		else { //con�̶�� ������ y�� �ƴ� ���� �ԷµǸ� ���α׷� ����
			System.out.println("���α׷�����"); 
			break;
		}
		} 
	}

}
