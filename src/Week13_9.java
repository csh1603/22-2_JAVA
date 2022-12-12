class TestThread extends Thread {
	public void run() {
		for (int i=0 ; i<10 ; i++) {
			System.out.println("Hello");
		}
	}
}
public class Week13_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread thread = new TestThread();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Bye bye");
	}

}
