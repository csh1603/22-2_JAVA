import java.util.Scanner;

//Circle�̶�� Ŭ���� ����
class Circle {
	final double PI = 3.14159; //final�� ��� PI �� ����	
	private double radius; //private���� �ܺο��� ���� ���ϴ� ���� radius ����

	public void setRadius(double radius) {
		this.radius = radius; //6��° ���� radius ���� ���� �Է¹��� radius �� ����
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double perimeter() {
		double perimeter = PI*2*radius; //���� �ѷ� ���
		return perimeter;
	}
	
	public double area() {
		double area = PI*radius*radius; //���� ���� ���
		return area;
	}
	
	public void circleInfo() {
		System.out.print("���ѷ�:");
		System.out.printf("%.2f", perimeter()); //perimeter��� �Լ��� ����� ������� .2f�� �Ҽ��� 2��°�ڸ����� ��� 
		System.out.print("\n������:");
		System.out.printf("%.2f", area());
	}
}


public class Week3_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Circle circle = new Circle(); //Circle�̶�� Ŭ������ circle�̶�� ��ü�� ����
		Scanner scanner = new Scanner(System.in); //����ڿ��� ���� �Է¹ޱ� ���� scanner class ����
		
		System.out.print("�������Է�:");
		double radius = scanner.nextDouble(); //radius��� ������ ����ڰ� �Է��� �Ǽ��� ����
		circle.setRadius(radius); //circle ��ü ���� setRadius��� ������ ������ �Է¹��� �� ����
		System.out.println("������:" + circle.getRadius());
		circle.circleInfo(); //���� �ѷ� �� ���� ���
	}

}
