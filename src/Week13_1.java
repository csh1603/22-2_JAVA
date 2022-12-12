class MyThread extends Thread {
	public void run() {
		for (int i=0 ; i<10 ; i++) {
			System.out.print(i);
		}
	}
}

public class Week13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m = new MyThread();
		m.start();
		for (char ch = 'A' ; ch <= 'Z' ; ch++) {
			System.out.print(ch);
		}
	}

}
