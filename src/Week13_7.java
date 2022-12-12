class SharedArea3 {
	Account Acc1;
	Account Acc2;
	
	void transfer(int money) {
		synchronized(this) {
			int money1 = Acc1.withdraw(money);
			System.out.println("1000 draw from Acc1");
			Acc2.deposit(money1);
			System.out.println("1000 deposit in Acc2");
		}
	}
	int getTotal() {
		synchronized(this) {
			return Acc1.balance + Acc2.balance;
		}
	}
}

class TransferThread2 extends Thread {
	int money1;
	SharedArea3 sharedArea;
	TransferThread2(SharedArea3 area){
		sharedArea = area;
	}
	public void run() {
		for (int month = 1;month <= 12 ; month++) {
			sharedArea.transfer(1000);
		}
	}
}

class PrintThread3 extends Thread {
	SharedArea3 sharedArea;
	PrintThread3 (SharedArea3 area){
		sharedArea = area;
	}
	public void run() {
		for (int i=0 ; i<50 ; i++) {
			int money_sum = sharedArea.getTotal();
			System.out.println("Sum of money: " + money_sum);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Week13_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea3 sharedArea = new SharedArea3();
		
		sharedArea.Acc1 = new Account("Tom", "123", 300000000);
		sharedArea.Acc2 = new Account("Jane", "456", 100000000);
		
		TransferThread2 thread1 = new TransferThread2(sharedArea);
		PrintThread3 thread2 = new PrintThread3(sharedArea);
		
		thread1.start();
		thread2.start();
	}

}
