import java.util.Scanner;

public class Week5_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 scanner 클래스 선언
		
		Dog[] dog = new Dog[3]; //배열로 Dog 클래스 선언
		Cat[] cat = new Cat[3]; //배열로 Cat 클래스 선언
		
		for (int i=0 ; i<dog.length ; i++) { //선언한 Dog 클래스의 배열 수만큼 반복
			dog[i] = new Dog(); //배열의 수를 하나씩 늘려가면서 Dog 클래스를 가진 dog 객체 선언
			System.out.println("<<Dog "+(i+1)+">>");
			System.out.print("Name :");
			dog[i].setName(scanner.next()); //i번째 dog 객체 안에 있는 이름 설정
			System.out.print("Age :");
			dog[i].setAge(scanner.nextInt()); //i번째 dog 클래스의 나이 설정
			System.out.print("Weight :");
			dog[i].setWeight(scanner.nextDouble()); //i번째 dog 클래스의 무게 설정
			System.out.print("BossterShot(y/n) :");
			String a = scanner.next(); //사용자가 y나 n으로 입력하는데 Dog 클래스 내의 예방접종여부를 저장하는 변수는 참과 거짓만을 저장할 수 있기 때문에 a에 임시 저장
			if (a.equalsIgnoreCase("y")) //만약 사용자가 입력한 값이 y라면
				dog[i].setBossterShot(true); //i번째 dog 객체 내의 BossterShot 변수에 true 저장 
			else //사용자가 입력한 값이 y가 아니라면 -> n이라면
				dog[i].setBossterShot(false); //i번째 dog 객체 내의 BossterShot 변수에 false 저장
			System.out.println();
		}
		for (int i=0 ; i<cat.length ; i++) { //선언한 Cat 클래스의 배열 수만큼 반복
			cat[i] = new Cat(); //배열의 수를 하나씩 늘려가면서 Cat 클래스를 가진 cat 클래스 선언
			System.out.println("<<Cat "+(i+1)+">>");
			System.out.print("Name :");
			cat[i].setName(scanner.next()); //i번째 cat 객체 안에 있는 이름 설정
			System.out.print("Age :");
			cat[i].setAge(scanner.nextInt()); //i번째 cat 객체의 나이 설정
			System.out.print("Weight :");
			cat[i].setWeight(scanner.nextDouble()); //i번째 cat 객체의 무게 설정
			System.out.print("Color :");
			cat[i].setColor(scanner.next()); //i번째 cat 객체의 색깔 설정
			System.out.println();
		}
		
		System.out.println("<<Dog List>>");
		for (int i=0 ; i<dog.length ; i++) { //존재하는 dog 배열의 수만큼 반복
			dog[i].writeOutput(); //dog 객체의 이름, 나이, 무게, 예방접종여부 출력
			dog[i].move(); //Dog 클래스 내에서 move 출력
			System.out.println();
		}
		
		System.out.println("<<Cat List>>");
		for (int i=0 ; i<cat.length ; i++) { //존재하는 cat 배열의 수만큼 반복
			cat[i].writeOutput(); //cat 객체의 이름, 나이, 무게, 색깔 출력
			cat[i].move();
			System.out.println();
		}
		
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for (int i=0 ; i<dog.length ; i++) { //존재하는 dog 배열의 수만큼 반복
			if (dog[i].getAge() > 2) { //만약 i번째 dog 객체의 나이가 2보다 크다면
				if (dog[i].getBossterShot() == false) { //만약 예방접종을 맞지 않았다면
					System.out.print(dog[i].getName()+" "); //이름 출력
				}
			}
		}
		System.out.println();
		System.out.println("* Black cats weighs more than 3Kg are...");
		for (int i=0 ; i<cat.length ; i++) { //존재하는 cat 배열의 수만큼 반복
			if (cat[i].getColor().equals("black")) { //만약 i번째 cat 객체의 색이 black이라면
				if (cat[i].getWeight() > 3) { //만약 i번째 cat 객체의 무게가 3보다 크다면
					System.out.print(cat[i].getName()+" "); //이름 출력
				}
			}
		}
		
	}

}
