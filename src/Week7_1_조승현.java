import java.util.Scanner;

abstract class Pet {
	public String species;
	public String name;
	public int age;
	
	abstract void move(); //자식 클래스에서 오버라이드 할 함수 정의
	
	Pet() {} //빈 생성자 정의
	Pet (String species, String name, int age){ //사용자로부터 species, name, age를 입력받아 초기화하는 생성자 정의
		this.species = species;
		this.name = name;
		this.age = age;
	}
}

class Dog extends Pet { //Pet을 상속받는 Dog 클래스 정의
	Dog () {} //빈 생성자 정의
	Dog (String name, int age){ //사용자로부터 name, age를 입력받아서 실행할 생성자 정의
		super("Dog", name, age); //부모클래스인 Pet에 Dog, name, age를 전달하여 3개를 초기화하는 생성자 호출
	}
	@Override //Pet이 abstract 클래스이므로 상속받아 메소드 오버라이딩을 필수로 해야함
	void move() {
		// TODO Auto-generated method stub
		System.out.println("run"); //Dog 클래스의 경우 move 메소드 실행시 run 출력
	}
}

class Cat extends Pet { //Pet을 상속받는 Cat 클래스 정의
	Cat () {} //빈 생성자 정의
	Cat (String name, int age){ //사용자로부터 name, age를 입력받아서 실행할 생성자 정의
		super("Cat", name, age); //부모클래스인 Pet에 Cat, name, age를 전달하여 3개의 인수를 초기화하는 생성자 호출
	}
	@Override //오버라이딩 필수
	void move() {
		// TODO Auto-generated method stub
		System.out.println("jump"); //Cat 클래스의 경우 move 메소드 실행시 jump 출력
	}
}

class Bird extends Pet { //Pet을 상속받는 Bird 클래스 정의
	Bird () {} //빈 생성자 정의
	Bird (String name, int age){ //사용자로부터 name, age를 입력받아서 실행할 생성자 정의
		super("Bird", name, age); //부모클래스인 Pet에 Bird, name, age를 전달하여 3개의 인수를 초기화하는 생성자 호출
	}
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("fly"); //Bird 클래스의 경우 move 메소드 실행시 fly 출력
	}
}

class Snake extends Pet { //Pet을 상속받는 Snake 클래스 정의
	Snake () {} //빈 생성자 정의
	Snake (String name, int age){ //사용자로부터 name, age를 입력받아서 실행할 생성자 정의
		super("Snake", name, age); //부모클래스인 Pet에 Snake, name, age를 전달하여 3개의 인수를 초기화하는 생성자 호출
	}
	@Override //메소드 오버라이딩 필수
	void move() {
		// TODO Auto-generated method stub
		System.out.println("crawl"); //Snake 클래스의 경우 move 메소드 실행시 crawl 출력
	}
}

public class Week7_1_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 Scanner 클래스 정의
		Pet[] list = new Pet[10]; //사용자가 입력한 동물들을 저장할 Pet타입 배열 선언
		
		//각 클래스들 선언 (아직 어떤 타입인지는 모름)
		Dog dog;
		Cat cat;
		Bird bird;
		Snake snake;
		
		//사용자로부터 입력받을 이름과 나이 변수를 선언
		String name; 
		int age;
		
		//반복문에 넣을 초기값 정의, input은 처음 원하는 작업을 저장할 변수, sp는 동물의 종을 저장하는 변수, i는 사용자가 입력했던 동물의 정보를 저장할 배열의 인덱스
		int input = 1;
		int sp = 1;
		int i = 0;
		
		
		//무한루프 (사용자가 3.exit를 누를 때까지 반복)
		AA: while(true) {
			System.out.println("원하는 작업은 무엇입니까?");
			System.out.println("1. New input   2. Output   3. Exit");
			input = scanner.nextInt(); //사용자가 누르는 번호를 저장
			scanner.nextLine(); //버퍼에 남아있는 enter 비우기
			switch (input) { //input에 따라 결과 수행
			case 1: //input이 1이라면 = New input을 선택했다면
				System.out.println("종은 무엇입니까?");
				System.out.println("1. Dog   2. Cat   3. Snake   4. Bird");
				sp = scanner.nextInt(); //sp에 사용자가 입력한 종의 번호 저장
				scanner.nextLine(); //버퍼에 남아있는 enter 비우기
				while (sp > 4 || sp < 1) { //사용자가 1~4 이외의 번호를 입력했을 때
					System.out.println("잘못된 입력입니다. 다시 입력하세요."); //잘못된 입력임을 알려주고
					System.out.println("종은 무엇입니까?");
					System.out.println("1. Dog   2. Cat   3. Snake   4. Bird");
					sp = scanner.nextInt(); //다시 입력을 받음
					scanner.nextLine();
				}
				System.out.print("Name:"); //이름 입력받고
				name = scanner.nextLine(); //name 변수에 저장
				System.out.print("Age:"); //나이도 입력받아서
				age = scanner.nextInt(); //age 변수에 저장
				scanner.nextLine();
				switch (sp) { //sp의 번호에 따라 switch문 실행
				case 1: dog = new Dog(name, age); list[i++] = dog; break; 
				//sp가 1이라면 = 고른 동물이 Dog라면 새로운 Dog 클래스에 사용자가 입력한 name, age를 생성자에 전달하여 생성
				//사용자가 입력한 정보를 list 배열에 넣고 후위연산자를 진행하여 i를 하나씩 늘림 -> 0번째 배열에 넣고 i는 1로 바뀜 
				case 2: cat = new Cat(name, age); list[i++] = cat; break;
				//sp가 2라면 = 고른 동물이 Cat이라면 새로운 Cat 클래스에 사용자가 입력한 name, age를 생성자에 전달하여 생성
				case 4: bird = new Bird(name, age); list[i++] = bird; break;
				//sp가 4라면 = 고른 동물이 Bird라면 새로운 Bird 클래스에 사용자가 입력한 name, age를 생성자에 전달하여 생성
				case 3: snake = new Snake(name, age); list[i++] = snake; break;
				//sp가 3라면 = 고른 동물이 Snake이라면 새로운 snake 클래스에 사용자가 입력한 name, age를 생성자에 전달하여 생성
				}
				System.out.println();
				break; //case 1 종료 (new input에 대한 상황 종료)
			case 2: //사용자가 2를 골랐다면 = Output
				System.out.println("Species   Name   Age     Movement");
				for (int j=0 ; j<i ; j++) { //배열의 크기를 하나씩 늘리면서 종, 이름, 나이, move 출력
					System.out.print(list[j].species + "      " + list[j].name + "     " + list[j].age + "       ");
					list[j].move();
				}
				System.out.println();
				break;
			case 3: //사용자가 3을 골랐다면 = exit
				System.out.println("종료"); break AA; //종료하고 위의 while 문 탈출 (AA 레이블 사용)
			default: //1~3 사이의 수가 아닌 것을 입력했다면 
				System.out.println("잘못된 입력입니다. 다시 입력하세요."); //다시 입력하라고 알려줌
				break;
			}
		}
	}

}
