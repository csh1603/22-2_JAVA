import java.util.Scanner;

class SharedArea{ //�����峢�� ������ ���� SharedArea Ŭ������ ����
	double ratio; //�ո��� ������ �����ϴ� ����
	boolean isReady; //������ �۵� ������ �����ϱ� ���� �� �������� ������ �� �������� Ȯ���ϴ� ����, false�� �ʱ�ȭ
}

class SimulThread extends Thread {
	SharedArea sh;
	int n = 0, front = 0; //�ݺ��� Ƚ�� n, �ո��� ������ ����� �� front
	SimulThread (int n){ //����ڷκ��� ������ �Է¹޾� n�� �ʱ�ȭ�ϴ� ������
		this.n = n;
	}
	public void run() { //�����尡 ���۵Ǹ� ����� �޼ҵ�
			for (int i=0 ; i<n ; i++) {
				int random = (int)(Math.random()*2); //0 �Ǵ� 1�� random ���� ����
				if (random == 0) //0�̶�� �ո��� ������ ���̶�� ������
					front++; //�ո��� ���� Ƚ�� ����
			}
			sh.ratio = ((double)front/n)*100; //�ո��� ���� Ȯ���� ����Ͽ� �����ϴ� Ŭ������ SharedArea�� ratio ������ ����
			sh.isReady = true; //������ ��� �������Ƿ� isReady ������ true�� �ٲ�
			synchronized(sh) {
				sh.notify(); //wait�ϰ� �ִ� �ٸ� �����带 ����
		}
	}
}

class PrintThread extends Thread {
	SharedArea sh;
	public void run() {
		if (sh.isReady!=true) { //���� �ٸ� �������� ������ ������ �ʾҴٸ� wait ���� ����
			try {
				synchronized(sh) {
					sh.wait();
				}
			}
			catch(InterruptedException e) { //�����尡 ��� wait ���¶�� exception handle
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("Front Ratio: %.2f", sh.ratio);
		System.out.print("%");
	}
}

public class Week13_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� scanner ����
		
		System.out.println("Input the number of coin toss");
		SimulThread st = new SimulThread(scanner.nextInt()); //����ڷκ��� �Է��� ���� ������ SimulThread���� �����־� ���� ����
		PrintThread pt = new PrintThread();
		
		//main thread�� �ٸ� �����尡 ���� ���� Ŭ������ �� �� �ֵ��� ����
		SharedArea SH = new SharedArea();
		st.sh = SH;
		pt.sh = SH;
		
		st.start();
		pt.start();
	}

}
