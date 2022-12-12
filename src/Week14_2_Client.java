import java.net.Socket;

public class Week14_2_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("###.###.###.###", 9001);
			Thread th1 = new Week14_2_SenderThread(socket);
			Thread th2 = new Week14_2_ReceiverThread(socket);
			th1.start();
			th2.start();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
