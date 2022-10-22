import java.util.Scanner;

interface Geometry { //Geometry �������̽� ����
	final double PI = 3.14159; //PI��� double�� ��� ���� -> final�� �̿������Ƿ� ���� �� ���� ��
	//���� Geometry�� implement�ϴ� Ŭ�������� area�Լ��� perimeter �Լ��� �����ؾ���
	double area();
	double perimeter();
}

class Circle implements Geometry { //Circle Ŭ������ Geometry�� implements��
	double radius; //���� �������� �����ϴ� radius ���� ����
	
	Circle() {} //�� ������ ���� 
	Circle(double radius) { //radius�� ���ڷ� �޾� �����ϴ� ������
		this.radius = radius;
	}
	
	//Geometry�� ��常 �����س��� �޼ҵ� �ٵ� �κ� ����
	@Override
	public double area() { //���� ���̸� ���ϴ� �Լ�
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double perimeter() { //���� �ѷ��� ���ϴ� �Լ�
		// TODO Auto-generated method stub
		return 2*radius*PI;
	}
	
}

class Square implements Geometry { //Square Ŭ������ Geometry�� implements��
	double side; //���簢���� �� ���� �����ϴ� ���� side ����
	
	Square() {} //�� ������
	Square(double side) { //side�� ���ڷ� �޾� �����ϴ� ������
		this.side = side;
	}

	@Override
	public double area() { //���簢���� ���̸� ���ϴ� �Լ�
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() { //���簢���� �ѷ��� ���ϴ� �Լ�
		// TODO Auto-generated method stub
		return side*4;
	}
	
}

class Triangle implements Geometry { //Triangle�� Geometry�� implements�� 
	double a, b, c, s;
	
	Triangle() {} //�� ������
	Triangle(double a, double b, double c) { //a, b, c�� ���ڷ� �޾� �����ϴ� ������
		this.a = a;
		this.b = b;
		this.c = c;
		s = (a+b+c)/2;
	}

	@Override
	public double area() { //�ﰢ���� ���̸� ���ϴ� �Լ�
		// TODO Auto-generated method stub
		return Math.sqrt(s*(s-a)*(s-b)*(s-c)); //Math Ŭ���� ���� �����ϴ� ��Ʈ �Լ� ���
	}

	@Override
	public double perimeter() { //�ﰢ���� �ѷ��� ���ϴ� �Լ�
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
}

public class Week7_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� Scanner Ŭ���� ����
		
		System.out.println("Input radius for a circle");
		double radius = scanner.nextDouble(); //radius�� ����ڰ� �Է��� �Ǽ���(���� ������) ����
		Circle circle = new Circle(radius); //������ �Է¹��� radius�� �̿��ؼ� Circle Ÿ�� ��ü ����
		System.out.println("Input length for a square");
		double side = scanner.nextDouble(); //side�� ����ڰ� �Է��� �Ǽ���(���簢�� �� ���� ����) ����
		Square square = new Square(side); //������ �Է¹��� side�� �̿��ؼ� Square Ÿ�� ��ü ����
		System.out.println("Input a for a triangle");
		double a = scanner.nextDouble(); //�ﰢ�� �� ���� ������ a�� ����ڰ� �Է��� �Ǽ��� ����
		System.out.println("Input b for a triangle");
		double b = scanner.nextDouble(); //�ﰢ�� �� ���� ������ b�� ����ڰ� �Է��� �Ǽ��� ����
		System.out.println("Input c for a triangle");
		double c = scanner.nextDouble(); //�ﰢ�� �� ���� ������ c�� ����ڰ� �Է��� �Ǽ��� ����
		Triangle triangle = new Triangle(a,b,c); //������ �Է¹��� a,b,c�� �̿��ؼ� Triangle Ÿ�� ��ü ����
		
		System.out.println("<Circle>");
		System.out.println("Area: "+circle.area()); //���� ���� ���
		System.out.println("Circumference: "+ circle.perimeter()); //���� �ѷ� ���
		System.out.println("<Square>");
		System.out.println("Area: "+square.area()); //���簢���� ���� ���
		System.out.println("Circumference: "+ square.perimeter()); //���簢���� �ѷ� ���
		System.out.println("<Triangle>");
		System.out.println("Area: "+triangle.area()); //�ﰢ���� ���� ���
		System.out.println("Circumference: "+ triangle.perimeter()); //�ﰢ���� �ѷ� ���
	}

}
