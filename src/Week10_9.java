import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> myMap = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		String ID, name, str;
		System.out.println("Input 5 IDs and Names");
		for (int i=0 ; i<5 ; i++) {
			ID = scanner.next();
			name = scanner.next();
			myMap.put(ID, name);
		}
		System.out.println("HashMap size: " + myMap.size());
		System.out.println("Input ID to search:");
		ID = scanner.next();
		System.out.println(myMap.get(ID));
		System.out.println(myMap);
		Set s = myMap.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			str = it.next();
			System.out.println("<" + str + ", " + myMap.get(str) + ">");
		}
	}

}
