//���̹��������� 2171081 ������
public class Cat extends Pet{ //Pet�̶�� Ŭ������ ��ӹ޵��� ��
	private String color; //Cat Ŭ���������� ����ϴ� String Ÿ�� ���� color ���� (�������� ���������� �ߴ��� �����ϴ� ����)
	
	public void writeOutput() {
		super.writeOutput(); //Pet Ŭ���� ���� �����ϴ� writeOutput �Լ� ȣ��
		System.out.println("Color: "+getColor()); //����ڷκ��� ������� ���� �Է¹���
	}
	public void setColor(String color) { //����ڰ� �Է��� ������� ���� �����ϵ��� �ϴ� �޼ҵ�
		this.color = color; 
	}
	public String getColor() { //������� ���� ��ȯ�ϴ� �޼ҵ�
		return color;
	}
	public void move() { //Pet�� Ŭ���� ���� �����ϴ� move �޼ҵ� �������̵�
		System.out.println(getName() + " creeps and jumps");
	}
}
