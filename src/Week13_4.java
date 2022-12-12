import javax.swing.JOptionPane;

class MyThread3 extends Thread {
	public void run() {
		for (int i=20 ; i>0 ; i--) {
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Time out");
	}
}

public class Week13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 th = new MyThread3();
		th.start();
		
		while(true) {
			String st = JOptionPane.showInputDialog("Enter a string");
			System.out.println("You entered <" + st +">");
			if (st.equalsIgnoreCase("bye")) break;
		}
	}

}