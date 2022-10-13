import java.util.Scanner;

class Emergency {
	int i; //�迭�� ������ ��Ÿ���� ���� i ����
	public Car emgList[] = new Car[10]; //Car Ÿ�� 10���� ���� �迭 emgList ���� -> ����ڰ� �Է��� ���޻�Ȳ ���� 
	public void EM_Call(Car c) {
		System.out.println("Call "+c.getNumber()); //����ڰ� �Է��� ���޻�Ȳ�� �´� ��ȣ�� ���
		emgList[i++] = c; //�� ���޻�Ȳ, ��ȣ, �� ����, �ʿ��� ����� �����ϴ� �迭
	}
	public void EM_record() { //����ڰ� 4�� record�� �����ϸ� ��Ͽ� ���� �����ֱ� ���� �޼ҵ�
		System.out.println("Emergency\tNumber\tCar_Type\tRequired");
		for (int j=0 ; j<i ; j++) {
			System.out.println(emgList[j]);
		}
	}
}

class Car {
	Car() {	} //�⺻ ������ ����
	Car(String emgType, int number, String carType, String reqPerson) { //���޻�Ȳ, ��ȣ, �� ����, �ʿ��� ����� ������ �ʱ�ȭ �ϴ� ������
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
	public String getStr() { //���޻�Ȳ, ��ȣ, �� ����, �ʿ��� ��� ���̿� ���⸦ �Ͽ� ��ȯ�ϴ� �޼ҵ�
		return getEmgType() +"   "+ getNumber() +"   "+ getCarType() +"   "+ getReqPerson();
	}
}

class FireEngine extends Car { //Car Ÿ���� ��� �޴� FireEngine Ŭ���� ����
	FireEngine () { //�⺻ ������
		super("Fire", 119, "FireEngine", "FireFighter"); 
		//Car Ÿ�Կ� �����ϴ� 4���� ������ ������ �ʱ�ȭ�ϴ� ������ ȣ��
		//���޻�Ȳ - Fire, ��ȭ��ȣ - 119, �� ���� - FireEngine, �ʿ��� ��� - FireFighter ����
	}
	public String toString() { //Object Ŭ���� ���� �����ϴ� toString �޼ҵ� �������̵� -> Car���� ������ getStr �޼ҵ� ���
		return getStr();
	}
}

class Ambulance extends Car {
	Ambulance () {
		super("Patient", 119, "Ambulance", "Doctor");
		//Car Ÿ�Կ� �����ϴ� 4���� ������ ������ �ʱ�ȭ�ϴ� ������ ȣ��
		//���޻�Ȳ - Patient, ��ȭ��ȣ - 119, �� ���� - Ambulance, �ʿ��� ��� - Doctor ����
	}
	public String toString() {
		return getStr();
	}
}

class PoliceCar extends Car {
	PoliceCar () {
		super("Thief", 112, "PoliceCar", "PoliceOfficer"); 
		//Car Ÿ�Կ� �����ϴ� 4���� ������ ������ �ʱ�ȭ�ϴ� ������ ȣ��
		//���޻�Ȳ - Thief, ��ȭ��ȣ - 112, �� ���� - PoliceCar, �ʿ��� ��� - PoliceOfficer ����
	}
	public String toString() {
		return getStr();
	}
}

public class Week6_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� ��ĳ�� Ŭ���� ����
		
		Emergency e = new Emergency(); //e��� �̸��� ���� Emergency ��ü ����
		FireEngine fe = new FireEngine(); //fe��� �̸��� ���� FireEngine ��ü ����
		Ambulance a = new Ambulance(); //a��� �̸��� ���� Ambulance ��ü ����
		PoliceCar pc = new PoliceCar(); //pc��� �̸��� ���� PoliceCar ��ü ����
		 
		AA: while (true) { //����ڰ� 5�� �Է��� ������ �ݺ��ϴ� ���ѷ���
			System.out.println("What kind of Emergency?");
			System.out.println("1.Fire    2.Patient    3.Thief    4.Record    5.End");
			int input = scanner.nextInt(); //����ڰ� �Է��� ��ȣ�� input ������ ����
			switch(input) { //input�� ���ڿ� ���� ���ǹ� ����
			case 1: e.EM_Call(fe); break; //fe�� ��ü�� �����Ͽ� e Ŭ���� ���� EM_Call �޼ҵ� ȣ��
			case 2: e.EM_Call(a); break;
			case 3: e.EM_Call(pc); break;
			case 4: e.EM_record(); break;
			case 5: System.out.println("Finished"); break AA; //����ڰ� 5�� �Է��ϸ� ���ѷ��� ���� Ż��
			default: System.out.println("Wrong Input"); //1~5 �̿��� �Է��� �����ϸ� Wrong Input�̶�� ���� ���
			}
		}
	}

}
