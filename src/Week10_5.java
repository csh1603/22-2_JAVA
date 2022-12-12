import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Pet{
	String name;
	public String toString() {
		return name;
	}
}
class Dog extends Pet{
	Dog() {}
	Dog(String str){name = str;}
}
class Cat extends Pet{
	Cat() {}
	Cat(String str){name = str;}
}
class Bird extends Pet{
	Bird() {}
	Bird(String str){name = str;}
}
class Hamster extends Pet{
	Hamster() {}
	Hamster(String str){name = str;}
}

public class Week10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> petList = new LinkedList<Pet>();
		petList.add(new Dog("Doggy1"));
		petList.add(new Dog("Doggy2"));
		petList.add(new Cat("Kitty"));
		output(petList);
		Bird b = new Bird();
		petList.add(b);
		output(petList);
		petList.add(2, new Cat("Kitty2"));
		petList.add(new Bird("Birdy"));
		output(petList);
		petList.remove(1);
		output(petList);
	}
	public static void output(List<Pet>p) {
		System.out.println("<OUTPUT>");
		/*for (int i=0 ; i<p.size() ; i++) {
			System.out.println("Pet " + (i+1) + ":" + p.get(i));
		}*/
		int i=1;
		Iterator<Pet> it = p.iterator();
		while(it.hasNext()) {
			System.out.println("Pet " + (i++) + ":" + it.next());
		}
	}

}
