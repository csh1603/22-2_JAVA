import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input string with ',' and ' '");
		String str = scanner.nextLine();
		
		StringTokenizer token = new StringTokenizer(str, ", ");
		
		System.out.println("There are " + token.countTokens() + " tokens.");
		System.out.println("The tokens are .. ");
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}
