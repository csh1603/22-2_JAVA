class Fruit {
	int price;
	Fruit (int price){
		this.price = price;
	}
}
class Strawberry extends Fruit{
	Strawberry() {super(1000);}
	public String toString() {
		return "Strawberry";
	}
}
class Apple extends Fruit{
	Apple() {super(2000);}
	public String toString() {
		return "Apple";
	}
}
class Pear extends Fruit{
	Pear() {super(4000);}
	public String toString() {
		return "Pear";
	}
}
class Grape extends Fruit{
	Grape() {super(5000);}
	public String toString() {
		return "Grape";
	}
}
class Buyer {
	int money = 10000;
	void buy(Fruit f) {
		money = money - f.price;
	}
}

public class Week10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		Fruit[] myFruit = new Fruit[10];
		myFruit[0] = new Apple();
		myFruit[1] = new Grape();
		myFruit[2] = new Pear();
		myFruit[3] = new Pear();
		System.out.println("You have " + buyer.money + " won.");
		for (int i=0 ; i<4 ; i++) {
			buyer.buy(myFruit[i]);
		}
		System.out.println("\n<my Fruit_Basket>");
		for (int i=0 ; i<4 ; i++) {
			System.out.print(myFruit[i]+ "(" + myFruit[i].price + ")\t");
		}
		if (buyer.money<0) {
			System.out.println("\nYou need to pay " + -buyer.money + "won more.");
		} else
			System.out.println("\nYou have " + buyer.money + "won left.");
	}

}
