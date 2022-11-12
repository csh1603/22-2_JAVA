import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

	String name; //학생의 이름을 저장하는 변수
	String ID; //학생의 학번을 저장하는 변수
	int age; //학생의 나이를 저장하는 변수
	
	Student() {} //빈생성자 정의
	
	Student(String name, String ID, int age){ //이름, 학번, 나이를 입력 받아서 초기화하는 생성자
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	
	public String toString() { //이름, 학번, 나이를 출력하는 메소드
		return name + "\t" + ID + "\t" + age;
	}
	
}

public class Week10_1_조승현 {
	static Scanner scanner = new Scanner(System.in); //static을 이용해서 Week10_1_조승현 내에 존재하는 모든 메소드에서 scanner 접근 가능 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		List<Student> student = new ArrayList<Student>();
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit"); //초기에 사용자로부터 학생정보에 대한 입력을 받음
		while(true) {
			String name = scanner.next();
			if (name.equalsIgnoreCase("0")) //만약 이름이 0이라면 무한루프 종료
				break;
			String ID = scanner.next();
			int age = scanner.nextInt();
			//사용자로부터 학생의 이름, 학번, 나이를 전달받고 이를 생성자에 전달하여 새로운 Student 만들기
			student.add(new Student(name, ID, age));
		}
		
		//입력받은 학생의 정보를 출력하는 메소드 실행
		printResult(student);
		
		//사용자가 4를 입력할 때까지 계속 반복, AA 레이블을 통해 4를 입력했을 시 루프문을 빠져나옴
		AA: while(true) {
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information  2.delete information  3.show list  4.Finish program");
			int input = scanner.nextInt(); //사용자가 원하는 번호를 입력받아서 이를 토대로 프로그램 실행
			switch (input) {
			case 1: //1을 입력했다면 -> 정보 추가
				System.out.println("Input new Student Name, ID, and age, and the location");
				addStudent(student); //학생 정보 추가
				printResult(student); //학생 정보 출력
				break;
			case 2: //2를 입력했다면 -> 정보 삭제
				System.out.println("Input Student Number to delete.");
				deleteStudent(student); //사용자로부터 지울 학생의 정보를 받고 삭제
				printResult(student); //학생 정보 출력
				break;
			case 3: //3을 입력했다면 -> 학생 정보 출력
				printResult(student);
				break;
			case 4: //4를 입력했다면 -> 프로그램 종료
				break AA; //while(true)문을 빠져나감
			default: //1~4가 아닌 다른 숫자를 입력했다면 잘못된 입력임을 보여줌
				System.out.println("Wrong input.");
				break;
			}
		}
		
	}
	public static void printResult(List<Student> student) { //학생 정보를 출력하는 메소드
		System.out.print("NUMBER" + "\tNAME" + "\tID" + "\tAGE\n");
		//존재하는 학생 정보만큼 for문 반복하고 배열의 위치와 학생의 정보 출력
		for (int i=0 ; i<student.size() ; i++) {
			System.out.println((i+1) + "\t" + student.get(i));
		}
	}
	public static void deleteStudent(List<Student> Stu) { //학생 정보를 지우는 메소드
		//array이기 때문에 사용자가 입력한 위치보다 1 작은 곳에 위치하는 정보를 삭제
		Stu.remove(scanner.nextInt()-1);
	}
	public static void addStudent(List<Student> Stu) { //학생 정보를 추가하는 메소드
		//이름(name), 학번(ID), 나이(age)와 들어갈 위치(loc)를 사용자로부터 입력받고 추가함
		String name = scanner.next();
		String ID = scanner.next();
		int age = scanner.nextInt();
		int loc = scanner.nextInt();
		//array이기 때문에 사용자가 입력한 위치보다 1 작은 곳에 들어가야 함
		Stu.add(loc-1, new Student(name, ID, age));
	}

}
