import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Week14_2_SenderThread extends Thread{
	Socket socket = null;
	Week14_2_SenderThread (Socket socket){
		this.socket = socket;
	}
	public void run() {
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			String strIn;
			while(true) {
				strIn = in.nextLine();
				if (strIn.equalsIgnoreCase("Bye")) break;
				out.println(strIn);
				out.flush();
			}
		} catch (Exception e) {
			System.out.println("End of Chatting");
		} try {
			socket.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
