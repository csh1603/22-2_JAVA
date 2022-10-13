//사이버보안전공 2171081 조승현
public class Dog extends Pet{ //Pet이라는 클래스를 상속받도록 함
	private boolean bossterShot; //Dog 클래스에서만 사용하는 boolean 타입 변수 bossterShot 선언 (강아지가 예방접종을 했는지 저장하는 변수)
	
	public void writeOutput() {
		super.writeOutput(); //Pet 클래스 내에 존재하는 writeOutput 함수 호출
		System.out.print("BoosterShot: ");
		if (getBossterShot() == true) //입력받은 예방접종의 여부가 참이라면
			System.out.println("O"); //O를 출력
		else //입력받은 예방접종의 여부가 거짓이라면
			System.out.println("X"); //X 출력
	}
	public void setBossterShot(boolean bossterShot) { //사용자가 입력한 예방접종의 여부를 저장하는 메소드
		this.bossterShot = bossterShot;
	}
	public boolean getBossterShot() { //예방접종 여부를 반환하는 메소드
		return bossterShot;
	}
	public void move() { //Pet의 클래스 내에 존재하는 move 메소드 오버라이딩
		System.out.println(getName() + " walks and runs");
	}
}
