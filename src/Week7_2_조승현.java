import java.util.Scanner;

interface Geometry { //Geometry 인터페이스 선언
	final double PI = 3.14159; //PI라는 double형 상수 선언 -> final을 이용했으므로 변할 수 없는 값
	//이후 Geometry를 implement하는 클래스들은 area함수와 perimeter 함수를 정의해야함
	double area();
	double perimeter();
}

class Circle implements Geometry { //Circle 클래스는 Geometry를 implements함
	double radius; //원의 반지름을 저장하는 radius 변수 선언
	
	Circle() {} //빈 생성자 정의 
	Circle(double radius) { //radius를 인자로 받아 실행하는 생성자
		this.radius = radius;
	}
	
	//Geometry에 헤드만 정의해놨던 메소드 바디 부분 빌드
	@Override
	public double area() { //원의 넓이를 구하는 함수
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double perimeter() { //원의 둘레를 구하는 함수
		// TODO Auto-generated method stub
		return 2*radius*PI;
	}
	
}

class Square implements Geometry { //Square 클래스는 Geometry를 implements함
	double side; //정사각형의 한 변을 저장하는 변수 side 선언
	
	Square() {} //빈 생성자
	Square(double side) { //side를 인자로 받아 실행하는 생성자
		this.side = side;
	}

	@Override
	public double area() { //정사각형의 넓이를 구하는 함수
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() { //정사각형의 둘레를 구하는 함수
		// TODO Auto-generated method stub
		return side*4;
	}
	
}

class Triangle implements Geometry { //Triangle은 Geometry를 implements함 
	double a, b, c, s;
	
	Triangle() {} //빈 생성자
	Triangle(double a, double b, double c) { //a, b, c를 인자로 받아 실행하는 생성자
		this.a = a;
		this.b = b;
		this.c = c;
		s = (a+b+c)/2;
	}

	@Override
	public double area() { //삼각형의 넓이를 구하는 함수
		// TODO Auto-generated method stub
		return Math.sqrt(s*(s-a)*(s-b)*(s-c)); //Math 클래스 내에 존재하는 루트 함수 사용
	}

	@Override
	public double perimeter() { //삼각형의 둘레를 구하는 함수
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
}

public class Week7_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 Scanner 클래스 선언
		
		System.out.println("Input radius for a circle");
		double radius = scanner.nextDouble(); //radius에 사용자가 입력한 실수값(원의 반지름) 저장
		Circle circle = new Circle(radius); //위에서 입력받은 radius를 이용해서 Circle 타입 객체 선언
		System.out.println("Input length for a square");
		double side = scanner.nextDouble(); //side에 사용자가 입력한 실수값(정사각형 한 변의 길이) 저장
		Square square = new Square(side); //위에서 입력받은 side를 이용해서 Square 타입 객체 선언
		System.out.println("Input a for a triangle");
		double a = scanner.nextDouble(); //삼각형 한 변의 길이인 a에 사용자가 입력한 실수값 저장
		System.out.println("Input b for a triangle");
		double b = scanner.nextDouble(); //삼각형 한 변의 길이인 b에 사용자가 입력한 실수값 저장
		System.out.println("Input c for a triangle");
		double c = scanner.nextDouble(); //삼각형 한 변의 길이인 c에 사용자가 입력한 실수값 저장
		Triangle triangle = new Triangle(a,b,c); //위에서 입력받은 a,b,c를 이용해서 Triangle 타입 객체 선언
		
		System.out.println("<Circle>");
		System.out.println("Area: "+circle.area()); //원의 넓이 출력
		System.out.println("Circumference: "+ circle.perimeter()); //원의 둘레 출력
		System.out.println("<Square>");
		System.out.println("Area: "+square.area()); //정사각형의 넓이 출력
		System.out.println("Circumference: "+ square.perimeter()); //정사각형의 둘레 출력
		System.out.println("<Triangle>");
		System.out.println("Area: "+triangle.area()); //삼각형의 넓이 출력
		System.out.println("Circumference: "+ triangle.perimeter()); //삼각형의 둘레 출력
	}

}
