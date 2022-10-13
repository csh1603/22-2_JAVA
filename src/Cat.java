//사이버보안전공 2171081 조승현
public class Cat extends Pet{ //Pet이라는 클래스를 상속받도록 함
	private String color; //Cat 클래스에서만 사용하는 String 타입 변수 color 선언 (강아지가 예방접종을 했는지 저장하는 변수)
	
	public void writeOutput() {
		super.writeOutput(); //Pet 클래스 내에 존재하는 writeOutput 함수 호출
		System.out.println("Color: "+getColor()); //사용자로부터 고양이의 색을 입력받음
	}
	public void setColor(String color) { //사용자가 입력한 고양이의 색을 저장하도록 하는 메소드
		this.color = color; 
	}
	public String getColor() { //고양이의 색을 반환하는 메소드
		return color;
	}
	public void move() { //Pet의 클래스 내에 존재하는 move 메소드 오버라이딩
		System.out.println(getName() + " creeps and jumps");
	}
}
