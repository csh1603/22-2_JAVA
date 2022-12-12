class Myth2 extends Thread {
	public void run() {
		for (char c = 'A' ; c <= 'Z' ; c++) {
			System.out.print(c);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Week13_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myth2 th1 = new Myth2();
		th1.setDaemon(true);
		th1.start();
		for (int i=0 ; i<10 ; i++) {
			System.out.print(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
