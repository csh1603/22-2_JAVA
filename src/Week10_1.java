import java.util.Scanner;

class Time {
	int hour;
	int minute;
	int second;
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toString() {
		return "Hour: " + hour + "\tMinute: " + minute + "\tSecond" + second;
	}
}
public class Week10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many times do you want to generate?");
		int n = scanner.nextInt();
		Time[] t = new Time[n];
		int i;
		for (i = 0 ; i< t.length ; i++) {
			t[i] = new Time(randNum(24), randNum(60), randNum(60));
		}
		for (i = 0 ; i<n ; i++) {
			System.out.print("<Time " + (i+1) + "> ");
			System.out.println(t[i]);
		}
	}
	public static int randNum(int n) {
		return(int)(Math.random()*n);
	}

}
