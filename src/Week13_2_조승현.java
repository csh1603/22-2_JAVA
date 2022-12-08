import java.util.Scanner;

import javax.swing.JOptionPane;

//�����尡 ���� ���� ������ �� �ֵ��� SharedArea2 Ŭ���� ���� (13-1���� ���� �̸��� �Ἥ 2�� ����)
//���⼭�� �������� ����� �ܾ ����
class SharedArea2 {
	String word;
}

class MyThread extends Thread {
	//���ڿ� 20���� ��� �ִ� �迭 a ���� �� �ʱ�ȭ
	String a[] = {"good", "suit", "slide", "dog", "phone", "water", "university", "bag", "mouse", "computer", "hair", "chocolate", "ring", "ear", "button", "fly", "neck", "shirt", "band", "speaker"};
	SharedArea2 sh;
	//�������� ���� �۵��� �����ϴ� stop ���� ����
	boolean stop;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	//�����尡 �۵��ϱ� �����ϸ� ����� �޼ҵ�
	public void run() {
		for (int i=0 ; i<20 ; i++) {
			if (stop == true) break;
			//�������� ������ �迭�� �ε����� ������ m ���� ���� -> 0~19 ������ ���� ���� �������� ����
			int m = (int)(Math.random()*20);
			//�ش� �ε����� �����ϴ� ���ڿ� �� ���
			System.out.println(a[m]);
			//�� ���ڿ��� �����ϴ� Ŭ������ ���� -> ����ڰ� �Է��� ���� ������ ���ϱ� ����
			sh.word = a[m];
			try {
				//1�ʿ� �� �ܾ ��Ÿ������ �ð� ����
				sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		//������ if���� �� ���������� �ұ��ϰ� stop�� ��� false�� �����Ǿ��ִٸ� ���и� �ǹ�
		if (stop == false) {
			System.out.println("����!");
		}
	}
}

public class Week13_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		//����ڷκ��� �Է��� �ޱ� ���� scanner ����
		Scanner scanner = new Scanner(System.in);
		
		SharedArea2 sh = new SharedArea2();
		
		//main thread�� MyThread�� ���� ������ ������ �� �ֵ��� ����
		MyThread th = new MyThread();
		th.sh = sh;
		//������ ����
		th.start();
		
		//���ѷ����� -> ����ڰ� �Է��� �ܾ ��µ� �ܾ�� ���ٸ� Ż��
		while(true) {
			String st = JOptionPane.showInputDialog("���ڿ� �Է�");
			System.out.println("<" + st + ">�� �Է��ϼ̽��ϴ�.");
			//����ڰ� �Է��� �ܾ ��µ� �ܾ�� ������ Ȯ��
			if (st.equalsIgnoreCase(sh.word)) {
				th.setStop(true); //ȭ�鿡 �ܾ �׸� ��µǵ��� ����
				System.out.println("����!");
				System.out.println("Timer is stopped.");
				break;
			}
		}
	}

}
