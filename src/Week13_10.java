class Myth extends Thread {
	boolean stop;
	public void setStop(boolean s) {
		stop = s;
	}
	public void run() {
		for (char c = 'A' ; c <= 'Z' ; c++) {
			if (stop == true) break;
			System.out.print(c);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Week13_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myth th1 = new Myth();
		th1.start();
		for (int i=0 ; i<10 ; i++) {
			System.out.print(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		th1.setStop(true);
	}

}
