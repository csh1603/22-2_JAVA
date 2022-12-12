import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Week10_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> mySet = new HashSet<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 5 Names");
		for (int i=0 ; i<5 ; i++) {
			mySet.add(scanner.next());
		}
		System.out.println("HashSet size: " + mySet.size());
		Iterator<String> it = mySet.iterator();
		String name;
		while(it.hasNext()) {
			name = it.next();
			System.out.println(name);
		}
	}

}
