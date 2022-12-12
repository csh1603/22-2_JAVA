import java.net.ServerSocket;
import java.net.Socket;

public class Week14_2_Server{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			socket = serverSocket.accept();
			
			Thread thread1 = new Week14_2_SenderThread(socket);
			Thread thread2 = new Week14_2_ReceiverThread(socket);
			thread1.start();
			thread2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serverSocket.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
