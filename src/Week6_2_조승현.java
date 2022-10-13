import java.util.Scanner;

class Emergency {
	int i; //배열의 순서를 나타내는 변수 i 선언
	public Car emgList[] = new Car[10]; //Car 타입 10개가 들어가는 배열 emgList 선언 -> 사용자가 입력한 응급상황 저장 
	public void EM_Call(Car c) {
		System.out.println("Call "+c.getNumber()); //사용자가 입력한 응급상황에 맞는 번호를 출력
		emgList[i++] = c; //그 응급상황, 번호, 차 종류, 필요한 사람을 저장하는 배열
	}
	public void EM_record() { //사용자가 4번 record를 선택하면 기록에 대해 보여주기 위한 메소드
		System.out.println("Emergency\tNumber\tCar_Type\tRequired");
		for (int j=0 ; j<i ; j++) {
			System.out.println(emgList[j]);
		}
	}
}

class Car {
	Car() {	} //기본 생성자 선언
	Car(String emgType, int number, String carType, String reqPerson) { //응급상황, 번호, 차 종류, 필요한 사람을 가지고 초기화 하는 생성자
		this.emgType = emgType;
		this.number = number;
		this.carType = carType;
		this.reqPerson = reqPerson;
	}
	
	private String emgType;
	private int number;
	private String carType;
	private String reqPerson;
	
	public String getEmgType() {
		return emgType;
	}
	public int getNumber() {
		return number;
	}
	public String getCarType() {
		return carType;
	}
	public String getReqPerson() {
		return reqPerson;
	}
	public String getStr() { //응급상황, 번호, 차 종류, 필요한 사람 사이에 띄어쓰기를 하여 반환하는 메소드
		return getEmgType() +"   "+ getNumber() +"   "+ getCarType() +"   "+ getReqPerson();
	}
}

class FireEngine extends Car { //Car 타입을 상속 받는 FireEngine 클래스 선언
	FireEngine () { //기본 생성자
		super("Fire", 119, "FireEngine", "FireFighter"); 
		//Car 타입에 존재하는 4가지 변수를 가지고 초기화하는 생성자 호출
		//응급상황 - Fire, 전화번호 - 119, 차 종류 - FireEngine, 필요한 사람 - FireFighter 전달
	}
	public String toString() { //Object 클래스 내에 존재하는 toString 메소드 오버라이딩 -> Car에서 정의한 getStr 메소드 사용
		return getStr();
	}
}

class Ambulance extends Car {
	Ambulance () {
		super("Patient", 119, "Ambulance", "Doctor");
		//Car 타입에 존재하는 4가지 변수를 가지고 초기화하는 생성자 호출
		//응급상황 - Patient, 전화번호 - 119, 차 종류 - Ambulance, 필요한 사람 - Doctor 전달
	}
	public String toString() {
		return getStr();
	}
}

class PoliceCar extends Car {
	PoliceCar () {
		super("Thief", 112, "PoliceCar", "PoliceOfficer"); 
		//Car 타입에 존재하는 4가지 변수를 가지고 초기화하는 생성자 호출
		//응급상황 - Thief, 전화번호 - 112, 차 종류 - PoliceCar, 필요한 사람 - PoliceOfficer 전달
	}
	public String toString() {
		return getStr();
	}
}

public class Week6_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 스캐너 클래스 선언
		
		Emergency e = new Emergency(); //e라는 이름을 가진 Emergency 객체 선언
		FireEngine fe = new FireEngine(); //fe라는 이름을 가진 FireEngine 객체 선언
		Ambulance a = new Ambulance(); //a라는 이름을 가진 Ambulance 객체 선언
		PoliceCar pc = new PoliceCar(); //pc라는 이름을 가진 PoliceCar 객체 선언
		 
		AA: while (true) { //사용자가 5을 입력할 때까지 반복하는 무한루프
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire    2.Patient    3.Thief    4.Record    5.End");
			int input = scanner.nextInt(); //사용자가 입력한 번호를 input 변수에 저장
			switch(input) { //input의 숫자에 따른 조건문 실행
			case 1: e.EM_Call(fe); break; //fe를 객체로 전달하여 e 클래스 내부 EM_Call 메소드 호출
			case 2: e.EM_Call(a); break;
			case 3: e.EM_Call(pc); break;
			case 4: e.EM_record(); break;
			case 5: System.out.println("Finished"); break AA; //사용자가 5를 입력하면 무한루프 문을 탈출
			default: System.out.println("Wrong Input"); //1~5 이외의 입력을 실행하면 Wrong Input이라는 문구 출력
			}
		}
	}

}
