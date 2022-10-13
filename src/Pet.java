//사이버보안전공 2171081 조승현
public class Pet {
	private String name; //Pet의 이름
	private int age; //Pet의 나이
	private double weight; //Pet의 무게
	
	public void writeOutput() { //Pet의 이름, 나이, 무게를 출력하는 메소드
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	public void setPet(String name, int age, double weight) { //이름, 나이, 무게를 입력받아 클래스 내의 변수에 저장
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public void setName(String name) { //사용자가 입력한 이름을 저장하는 메소드
		this.name = name;
	}
	public void setAge(int age) { //사용자가 입력한 나이를 저장하는 메소드
		this.age = age;
	}
	public void setWeight(double weight) { //사용자가 입력한 무게를 저장하는 메소드
		this.weight = weight;
	}
	public String getName() { //이름 값 반환하는 메소드 -> 위에서 private으로 선언된 변수를 외부에서 접근할 수 있도록 함
		return name;
	}
	public int getAge() { //나이 반환하는 메소드 
		return age;
	}
	public double getWeight() { //무게 반환하는 메소드
		return weight;
	}
	public void move() {
		System.out.println(name+" moves");
	}
}
