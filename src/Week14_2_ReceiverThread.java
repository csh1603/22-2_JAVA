import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Week14_2_ReceiverThread extends Thread{
	Socket socket = null;
	Week14_2_ReceiverThread(Socket socket){
		this.socket = socket;
	}
	public void run() {
		try {
			Scanner in = new Scanner(socket.getInputStream());
			while(true) {
				String str = in.nextLine();
				if (str == null) break;
				System.out.println("Rec>" + str);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Chatting Finished");
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
