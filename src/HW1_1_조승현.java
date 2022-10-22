import java.util.Scanner;

class Time {
	private int hour;
	private int minute;
	
	private boolean isValid(int hour, int minute) {
		if (hour >= 0 && hour < 24 && minute >=0 && minute < 60) //�ð��� 0 �̻� 23 ����, ���� 0 �̻� 59�������� �����ϸ� �Ʒ��� ��ɹ� ����
			return true;
		else //���� ���� �߿��� �ϳ��� �������� ������ false ��ȯ
			return false;
	}
	
	public void setTime(int hour, int minute) { //�Է¹��� �ð��� ���� �����ϴ� setTime �޼ҵ� ���� 
		if (isValid(hour, minute) == true) { //�ð��� ���� �Է� ������ ���̶�� �Ʒ��� ��ɹ� ����
			this.hour = hour;
			this.minute = minute;
		}
		else {
			System.out.println("Wrong Input");
		}
	}
	
	public int getHourOrMinute(char ch) {
		if (ch == 'H' || ch == 'h') {
			return hour;
		}
		else if (ch == 'M' || ch == 'm') {
			return minute;
		}
		return 0; //int Ÿ���� ������ ��ȯ�ؾ� ������ return 0 �߰� -> ���� ���ǹ��� �ɸ��� ������ 0�� ��ȯ�ϰ� ��
	}
}

public class HW1_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in);
		Time time = new Time(); //Time Ŭ���� time �̸����� ����
		
		System.out.println("Hour:");
		int hour = scanner.nextInt(); //hour ������ ����ڰ� �Է��� �� ����
		System.out.println("Minute:");
		int minute = scanner.nextInt(); //minute ������ ����ڰ� �Է��� �� ����
		
		time.setTime(hour, minute); //����ڰ� �Է��� ���� time Ŭ���� ���� �����ϴ� setTime �޼ҵ忡 ����
		
		System.out.println(time.getHourOrMinute('h') + ":"  + time.getHourOrMinute('m'));
	}

}
