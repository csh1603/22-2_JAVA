class Mythread_num extends Thread {
	public void run() {
		for (int i=0 ; i<10 ; i++) {
			System.out.print(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class Mythread_ch extends Thread {
	public void run() {
		for (char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Week13_3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread_num thread1 = new Mythread_num();
		Mythread_ch thread2 = new Mythread_ch();
		thread1.start();
		thread2.start();
	}

}
