import java.util.ArrayList;
import java.util.Scanner;

class Buyer2 {
	public Buyer2 (int money) {
		this.money = money;
	}
	ArrayList<Fruit> myFruit = new ArrayList<Fruit>();
	int money;
	void buy(Fruit f) {
		myFruit.add(f);
		money = money - f.price;
	}
	void pay() {
		System.out.println("\n<My Fruit Basket>");
		for (int j = 0 ; j<myFruit.size() ; j++) {
			System.out.println(myFruit.get(j) + "(" + myFruit.get(j).price + ")\t");
		}
		if (money < 0) {
			System.out.println("\nYou need to pay " + -money +"won more");
		} else
			System.out.println("\nYou have " + -money +"won left");
	}
}
public class Week10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you have?");
		int money = scanner.nextInt();
		
		System.out.println("You have " + money + "won.");
		Buyer2 b = new Buyer2(money);
		Apple a = new Apple();
		Grape g = new Grape();
		Pear p = new Pear();
		Strawberry s = new Strawberry();
		b.buy(a);
		b.buy(s);
		b.buy(p);
		b.pay();
	}

}
