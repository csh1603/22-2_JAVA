import java.util.ArrayList;
import java.util.Scanner;

public class Week10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times do you want to generate?");
		int n = scanner.nextInt();
		
		ArrayList <Time> t = new ArrayList<Time>();
		int i;
		for(i = 0 ; i < n ; i++) {
			t.add(new Time(randNum(24), randNum(60), randNum(60)));
		}
		for (i = 0 ; i < t.size() ; i++) {
			System.out.print("<Time " + (i+1) + "> ");
			System.out.println(t.get(i));
		}
	}
	public static int randNum(int n) {
		return (int)(Math.random()*n);
	}
}
