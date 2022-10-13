//사이버보안전공 2171081 조승현
public class Film extends Production{ //Production이라는 클래스를 상속받도록 함
	private int boxOfficeGross; //private 변수로 영화의 가격을 선언하여 외부에서 접근하지 못하게 함
	
	public int getBoxOfficeGross() { //영화의 가격을 반환하는 메소드
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) { //사용자가 입력한 영화의 가격을 저장하는 메소드
		this.boxOfficeGross = boxOfficeGross;
	}
	public void display() { //메소드 오버라이딩 -> 조상 클래스에서 선언 되었던 display 함수 사용
		super.display(); //Production 클래스 내에 존재하는 display 함수 호출
		System.out.println("boxOfficeGross:"+boxOfficeGross);
	}
}
