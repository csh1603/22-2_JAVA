import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter number of donuts.");
			int donut = scanner.nextInt();
			
			System.out.println("Enter number of glasses of milk.");
			int milkCount = scanner.nextInt();
			
			if (milkCount < 1)
				throw new Exception("Exception: No milk!");
			
			double donutsPerGlass = donut / (double)milkCount;
			System.out.println(donut + " donuts.");
			System.out.println(milkCount + " glsses of milk.");
			System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Go buy some milk.");
		}
		System.out.println("End of program.");
	}

}
