import java.util.Scanner;

public class Week2_4_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the height of the triangle : ");
		int height = keyboard.nextInt(); //���̸� height��� ������ �̿��ؼ� ����ڸ� ���� �Է� ����
		int blank = height; //* �տ� ���⸦ �� Ƚ���� blank��� ������ �̿��� ����
		
		for (int i=1 ; i<=height ; i++) {
			for (int j=1 ; j<blank ; j++) {
				System.out.print(" ");
			}
			blank--; //�� �� ���������� ��ĭ�� ���� �ϳ��� �پ��� -> ���ҿ����� ���
			for (int k=0; k<2*i-1 ; k++) { 
				// *�� ������ ù��° �ٿ� 1��, �ι�° �ٿ� 3��, ����° �ٿ� 5�� .. ���������� ��Ÿ���� (2n-1)
				// k�� �� �� ���������� ���� ������ 2���� �����ϵ��� ��Ÿ���� �ݺ���
				System.out.print("*");
			}
			System.out.println(); // �� �� ��������
		}
	}

}
