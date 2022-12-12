import java.util.LinkedList;
import java.util.Scanner;

public class Week10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myQueue = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		String name;
		while (true) {
			System.out.print("Input a name to queue in('0' to quit):");
			name = scanner.next();
			if(name.equalsIgnoreCase("0")) break;
			myQueue.offer(name);
		}
		System.out.println("<Reuslt>");
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.poll());
		}
	}

}
