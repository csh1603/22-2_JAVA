import java.util.Scanner;

class StudentInformation {
	
	private String name, id; //�л��� �̸��� �й��� String Ÿ���� private ������ ����
	
	public void display() { //�л��� �̸��� �й��� ����ϴ� �޼ҵ�
		System.out.println(getName() +"   " + getID());
	}
	
	public void setName(String name) { //����ڿ��� �Է¹��� �̸��� name ������ ����
		this.name = name;
	}
	public void setID(String id) { //����ڿ��� �Է¹��� �й��� id ������ ����
		this.id = id;
	}
	public String getName() { //private ���� name�� ��ȯ�ϴ� �޼ҵ�
		return name;
	}
	public String getID() { //private ���� id�� ��ȯ�ϴ� �޼ҵ�
		return id;
	}
}

class StudentScore extends StudentInformation { //StudentInformation�� ��ӹ޴� StudentScore Ŭ����
	private int korean, math, english; //����, ����, ���� ������ �����ϴ� korean, math, english ���� ����

	public void display() { //�̸�, �й�, ��������, ��������, ���������� ����ϴ� �޼ҵ� - �θ� Ŭ������ �����ϴ� display �������̵�
		System.out.print(getName() +"   "+ getID() +"        "+getKorean()+"        "+getMath()+"       "+getEnglish());
	}
	
	public void setKorean(int korean) { //private ���� korean�� �����Ͽ� ���� �����ϴ� �޼ҵ�
		this.korean = korean;
	}
	public void setMath(int math) { //private ���� math�� �����Ͽ� ���� �����ϴ� �޼ҵ�
		this.math = math;
	}
	public void setEnglish(int english) { //private ���� english�� �����Ͽ� ���� �����ϴ� �޼ҵ�
		this.english = english;
	}
	
	public int getKorean() { //private ���� korean�� ��ȯ�ϴ� �޼ҵ�
		return korean;
	}
	public int getMath() { //private ���� math�� ��ȯ�ϴ� �޼ҵ�
		return math;
	}
	public int getEnglish() { //private ���� english�� ��ȯ�ϴ� �޼ҵ�
		return english;
	}
}

public class HW1_4_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many students are there?");
		int c = scanner.nextInt(); //c�� �л����� �Է¹޾� ����
		scanner.nextLine(); //���ۿ� �����ִ� enter ����
		
		StudentScore[] ss = new StudentScore[c]; //StudentScore Ÿ���� ss ��ü �迭 c�� ��ŭ ����
		System.out.println("Input the information.");
		int sum[] = new int[c]; //�� �л��� ����, ����, ���� ������ �� ���ؼ� �����ϴ� sum �迭 ����
		int korean = 0, math = 0, english = 0; //���� ������ ������ korean, math, english ����, �ʱⰪ 0���� ����
		
		for (int i=0 ; i<c ; i++) {
			ss[i] = new StudentScore(); //ss[i]�� StudentScore ��ü �Ҵ�
			System.out.print("\nID:");
			ss[i].setID(scanner.nextLine()); //�Է¹��� ID �� ����
			System.out.print("Name:");
			ss[i].setName(scanner.nextLine()); //�Է¹��� Name �� ����
			System.out.print("Korean:");
			ss[i].setKorean(scanner.nextInt()); //�Է¹��� ���� ���� ����
			scanner.nextLine();
			System.out.print("Math:");
			ss[i].setMath(scanner.nextInt()); //�Է¹��� ���� ���� ����
			scanner.nextLine();
			System.out.print("English:");
			ss[i].setEnglish(scanner.nextInt()); //�Է¹��� ���� ���� ����
			scanner.nextLine();
			sum[i] = ss[i].getEnglish()+ss[i].getKorean()+ss[i].getMath(); //sum�迭�� �� �л��� ���� ����, ����, ���� ���� �� ���ؼ� ����
		}
		
		System.out.println("\nName            ID     KOREAN     MATH     ENGLISH     SUM     AVERAGE");
		for (int j=0 ; j<c ; j++) {
			ss[j].display(); //�� �л��� �̸�, �й�, ��������, ��������, �������� ���
			System.out.printf("      " + sum[j]+"     %.2f", (float)sum[j]/3); //�� �л��� ����, �Ҽ� ��° �ڸ����� ��� ���
			System.out.println();
			korean += ss[j].getKorean(); //j��° �л��� ���� ������ korean ������ ����
			math += ss[j].getMath(); //j��° �л��� ���� ������ math ������ ����
			english += ss[j].getEnglish(); //j��° �л��� ���� ������ english ������ ����
		}
		//�� ���� ����� ���, ������ �����ߴ� korean, math, english�� �л� ���� ������ �Ҽ� ��° �ڸ����� ���
		System.out.printf("Subject Avg             %.2f       %.2f     %.2f", (float)korean/c, (float)math/c, (float)english/c);
	}

}
