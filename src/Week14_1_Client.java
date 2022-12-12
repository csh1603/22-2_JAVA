import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Week14_1_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		try {
			socket = new Socket("###.###.###.###", 9000);
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("Hello Server!");
			out.flush();
			
			String strIn = in.nextLine();
			System.out.println(strIn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
