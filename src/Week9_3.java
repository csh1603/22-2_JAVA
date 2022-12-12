import java.util.Scanner;
import java.util.StringTokenizer;

//StringTokenizer È°¿ë

public class Week9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input String with',' and ' '");
		String str = scanner.nextLine();
		
		StringTokenizer token = new StringTokenizer(str, ", ");
		
		System.out.println("There are " + token.countTokens() + " tokens.");
		System.out.println("The tokens are ...");
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}
