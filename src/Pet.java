//���̹��������� 2171081 ������
public class Pet {
	private String name; //Pet�� �̸�
	private int age; //Pet�� ����
	private double weight; //Pet�� ����
	
	public void writeOutput() { //Pet�� �̸�, ����, ���Ը� ����ϴ� �޼ҵ�
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	public void setPet(String name, int age, double weight) { //�̸�, ����, ���Ը� �Է¹޾� Ŭ���� ���� ������ ����
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public void setName(String name) { //����ڰ� �Է��� �̸��� �����ϴ� �޼ҵ�
		this.name = name;
	}
	public void setAge(int age) { //����ڰ� �Է��� ���̸� �����ϴ� �޼ҵ�
		this.age = age;
	}
	public void setWeight(double weight) { //����ڰ� �Է��� ���Ը� �����ϴ� �޼ҵ�
		this.weight = weight;
	}
	public String getName() { //�̸� �� ��ȯ�ϴ� �޼ҵ� -> ������ private���� ����� ������ �ܺο��� ������ �� �ֵ��� ��
		return name;
	}
	public int getAge() { //���� ��ȯ�ϴ� �޼ҵ� 
		return age;
	}
	public double getWeight() { //���� ��ȯ�ϴ� �޼ҵ�
		return weight;
	}
	public void move() {
		System.out.println(name+" moves");
	}
}
