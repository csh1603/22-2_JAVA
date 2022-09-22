import java.util.Scanner;

//Circle이라는 클래스 정의
class Circle {
	final double PI = 3.14159; //final로 상수 PI 값 설정	
	private double radius; //private으로 외부에서 접근 못하는 변수 radius 설정

	public void setRadius(double radius) {
		this.radius = radius; //6번째 줄의 radius 변수 값에 입력받은 radius 값 대입
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double perimeter() {
		double perimeter = PI*2*radius; //원의 둘레 계산
		return perimeter;
	}
	
	public double area() {
		double area = PI*radius*radius; //원의 넓이 계산
		return area;
	}
	
	public void circleInfo() {
		System.out.print("원둘레:");
		System.out.printf("%.2f", perimeter()); //perimeter라는 함수로 계산한 결과값을 .2f로 소수점 2번째자리까지 출력 
		System.out.print("\n원넓이:");
		System.out.printf("%.2f", area());
	}
}


public class Week3_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Circle circle = new Circle(); //Circle이라는 클래스를 circle이라는 객체로 선언
		Scanner scanner = new Scanner(System.in); //사용자에게 값을 입력받기 위한 scanner class 선언
		
		System.out.print("반지름입력:");
		double radius = scanner.nextDouble(); //radius라는 변수에 사용자가 입력한 실수값 저장
		circle.setRadius(radius); //circle 객체 안의 setRadius라는 변수에 위에서 입력받은 값 전달
		System.out.println("반지름:" + circle.getRadius());
		circle.circleInfo(); //원의 둘레 및 넓이 출력
	}

}
