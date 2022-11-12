import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {

	String name; //�л��� �̸��� �����ϴ� ����
	String ID; //�л��� �й��� �����ϴ� ����
	int age; //�л��� ���̸� �����ϴ� ����
	
	Student() {} //������� ����
	
	Student(String name, String ID, int age){ //�̸�, �й�, ���̸� �Է� �޾Ƽ� �ʱ�ȭ�ϴ� ������
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	
	public String toString() { //�̸�, �й�, ���̸� ����ϴ� �޼ҵ�
		return name + "\t" + ID + "\t" + age;
	}
	
}

public class Week10_1_������ {
	static Scanner scanner = new Scanner(System.in); //static�� �̿��ؼ� Week10_1_������ ���� �����ϴ� ��� �޼ҵ忡�� scanner ���� ���� 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		List<Student> student = new ArrayList<Student>();
		
		System.out.println("Input Student Name, ID, and age. 0 for name to quit"); //�ʱ⿡ ����ڷκ��� �л������� ���� �Է��� ����
		while(true) {
			String name = scanner.next();
			if (name.equalsIgnoreCase("0")) //���� �̸��� 0�̶�� ���ѷ��� ����
				break;
			String ID = scanner.next();
			int age = scanner.nextInt();
			//����ڷκ��� �л��� �̸�, �й�, ���̸� ���޹ް� �̸� �����ڿ� �����Ͽ� ���ο� Student �����
			student.add(new Student(name, ID, age));
		}
		
		//�Է¹��� �л��� ������ ����ϴ� �޼ҵ� ����
		printResult(student);
		
		//����ڰ� 4�� �Է��� ������ ��� �ݺ�, AA ���̺��� ���� 4�� �Է����� �� �������� ��������
		AA: while(true) {
			System.out.println("\nChoose the operation you want.");
			System.out.println("1.add information  2.delete information  3.show list  4.Finish program");
			int input = scanner.nextInt(); //����ڰ� ���ϴ� ��ȣ�� �Է¹޾Ƽ� �̸� ���� ���α׷� ����
			switch (input) {
			case 1: //1�� �Է��ߴٸ� -> ���� �߰�
				System.out.println("Input new Student Name, ID, and age, and the location");
				addStudent(student); //�л� ���� �߰�
				printResult(student); //�л� ���� ���
				break;
			case 2: //2�� �Է��ߴٸ� -> ���� ����
				System.out.println("Input Student Number to delete.");
				deleteStudent(student); //����ڷκ��� ���� �л��� ������ �ް� ����
				printResult(student); //�л� ���� ���
				break;
			case 3: //3�� �Է��ߴٸ� -> �л� ���� ���
				printResult(student);
				break;
			case 4: //4�� �Է��ߴٸ� -> ���α׷� ����
				break AA; //while(true)���� ��������
			default: //1~4�� �ƴ� �ٸ� ���ڸ� �Է��ߴٸ� �߸��� �Է����� ������
				System.out.println("Wrong input.");
				break;
			}
		}
		
	}
	public static void printResult(List<Student> student) { //�л� ������ ����ϴ� �޼ҵ�
		System.out.print("NUMBER" + "\tNAME" + "\tID" + "\tAGE\n");
		//�����ϴ� �л� ������ŭ for�� �ݺ��ϰ� �迭�� ��ġ�� �л��� ���� ���
		for (int i=0 ; i<student.size() ; i++) {
			System.out.println((i+1) + "\t" + student.get(i));
		}
	}
	public static void deleteStudent(List<Student> Stu) { //�л� ������ ����� �޼ҵ�
		//array�̱� ������ ����ڰ� �Է��� ��ġ���� 1 ���� ���� ��ġ�ϴ� ������ ����
		Stu.remove(scanner.nextInt()-1);
	}
	public static void addStudent(List<Student> Stu) { //�л� ������ �߰��ϴ� �޼ҵ�
		//�̸�(name), �й�(ID), ����(age)�� �� ��ġ(loc)�� ����ڷκ��� �Է¹ް� �߰���
		String name = scanner.next();
		String ID = scanner.next();
		int age = scanner.nextInt();
		int loc = scanner.nextInt();
		//array�̱� ������ ����ڰ� �Է��� ��ġ���� 1 ���� ���� ���� ��
		Stu.add(loc-1, new Student(name, ID, age));
	}

}
