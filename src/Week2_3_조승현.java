import java.util.Scanner;

public class Week2_3_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in);
		
		int num = 1;
		
		System.out.println("Factorial�� ����� ���� �Է�");
		int n = keyboard.nextInt(); //n�� ������ �Է¹���
			while(!(n>0 && n<11)) { //n���� 0 �ʰ�, 11 �̸��� �ƴϸ� -> 1 ���� �Ǵ� 10 �̻��̶��
			System.out.println("���� ���Է�(1~10):"); 
			n = keyboard.nextInt(); //n �ٽ� �Է� �ޱ�
			}
		System.out.print(n + "! = ");
		for (int i=n ; i>=1 ; i--) { //n���� 1���� 1�� �ٿ������鼭 
			System.out.print(i + " "); //i ���� ����ϰ� (���������� ���� ����)
			num *= i; //num�̶�� ������ 1���� n������ �� ����
			if(i != 1) //i��� ������ n���� 1���� �������µ� 1�� �ƴϸ� ���ϱ� ��ȣ ��� 
				System.out.print("X ");
		}
		System.out.print("= "+num);
	}

}
