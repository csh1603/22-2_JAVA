class SharedArea4 {
	double result;
	boolean isWritten;
}

public class Week13_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeThread2 thread1 = new ComputeThread2();
		PrintThread4 thread2 = new PrintThread4();
		SimplePrintThread thread3 = new SimplePrintThread();
		CutePrintThread thread4 = new CutePrintThread();
		
		SharedArea4 sh = new SharedArea4();
		thread1.sharedArea = sh;
		thread2.sharedArea = sh;
		thread3.sharedArea = sh;
		thread4.sharedArea = sh;
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}

class ComputeThread2 extends Thread {
	SharedArea4 sharedArea;
	public void run() {
		double res = 0.0;
		for(int i=1 ; i<100000000 ; i+=2) {
			if (i/2%2 == 0) res += 1.0/i;
			else res -= 1.0/i;
		}
		sharedArea.result = res*4;
		sharedArea.isWritten = true;
		synchronized(sharedArea) {
			sharedArea.notifyAll();
		}
	}
}

class PrintThread4 extends Thread {
	SharedArea4 sharedArea;
	public void run() {
		if (sharedArea.isWritten!=true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} System.out.println(sharedArea.result);
	}
}

class SimplePrintThread extends Thread{
	SharedArea4 sharedArea;
	public void run() {
		if (sharedArea.isWritten != true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("%.2f \n", sharedArea.result);
	}
}

class CutePrintThread extends Thread {
	SharedArea4 sharedArea;
	public void run() {
		if (sharedArea.isWritten != true) {
			try {
				synchronized(sharedArea) {
					sharedArea.wait();
				}
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} System.out.println("<<< ÆÄÀÌ = " + sharedArea.result + ">>>");
	}
}