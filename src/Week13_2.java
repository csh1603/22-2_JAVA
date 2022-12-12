class MyThread2 implements Runnable {
	public void run() {
		for (int i=0 ; i<=9 ; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Week13_2 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new MyThread2());
		thread.start();
		for (char ch = '!' ; ch<= '/' ; ch++) {
			System.out.print(ch);
			try {
				sleep(100); //Thread.sleep(100)µµ °¡´É
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
