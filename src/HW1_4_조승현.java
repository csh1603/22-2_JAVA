import java.util.Scanner;

class StudentInformation {
	
	private String name, id; //학생의 이름과 학번을 String 타입의 private 변수로 선언
	
	public void display() { //학생의 이름과 학번을 출력하는 메소드
		System.out.println(getName() +"   " + getID());
	}
	
	public void setName(String name) { //사용자에게 입력받은 이름을 name 변수에 저장
		this.name = name;
	}
	public void setID(String id) { //사용자에게 입력받은 학번을 id 변수에 저장
		this.id = id;
	}
	public String getName() { //private 변수 name을 반환하는 메소드
		return name;
	}
	public String getID() { //private 변수 id를 반환하는 메소드
		return id;
	}
}

class StudentScore extends StudentInformation { //StudentInformation을 상속받는 StudentScore 클래스
	private int korean, math, english; //국어, 수학, 영어 점수를 저장하는 korean, math, english 변수 선언

	public void display() { //이름, 학번, 국어점수, 수학점수, 영어점수를 출력하는 메소드 - 부모 클래스에 존재하는 display 오버라이딩
		System.out.print(getName() +"   "+ getID() +"        "+getKorean()+"        "+getMath()+"       "+getEnglish());
	}
	
	public void setKorean(int korean) { //private 변수 korean에 접근하여 값을 저장하는 메소드
		this.korean = korean;
	}
	public void setMath(int math) { //private 변수 math에 접근하여 값을 저장하는 메소드
		this.math = math;
	}
	public void setEnglish(int english) { //private 변수 english에 접근하여 값을 저장하는 메소드
		this.english = english;
	}
	
	public int getKorean() { //private 변수 korean을 반환하는 메소드
		return korean;
	}
	public int getMath() { //private 변수 math를 반환하는 메소드
		return math;
	}
	public int getEnglish() { //private 변수 english를 반환하는 메소드
		return english;
	}
}

public class HW1_4_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many students are there?");
		int c = scanner.nextInt(); //c에 학생수를 입력받아 저장
		scanner.nextLine(); //버퍼에 남아있는 enter 비우기
		
		StudentScore[] ss = new StudentScore[c]; //StudentScore 타입인 ss 객체 배열 c개 만큼 선언
		System.out.println("Input the information.");
		int sum[] = new int[c]; //각 학생의 국어, 영어, 수학 점수를 다 더해서 저장하는 sum 배열 선언
		int korean = 0, math = 0, english = 0; //과목별 총점을 저장할 korean, math, english 선언, 초기값 0으로 설정
		
		for (int i=0 ; i<c ; i++) {
			ss[i] = new StudentScore(); //ss[i]에 StudentScore 객체 할당
			System.out.print("\nID:");
			ss[i].setID(scanner.nextLine()); //입력받은 ID 값 저장
			System.out.print("Name:");
			ss[i].setName(scanner.nextLine()); //입력받은 Name 값 저장
			System.out.print("Korean:");
			ss[i].setKorean(scanner.nextInt()); //입력받은 국어 점수 저장
			scanner.nextLine();
			System.out.print("Math:");
			ss[i].setMath(scanner.nextInt()); //입력받은 수학 점수 저장
			scanner.nextLine();
			System.out.print("English:");
			ss[i].setEnglish(scanner.nextInt()); //입력받은 영어 점수 저장
			scanner.nextLine();
			sum[i] = ss[i].getEnglish()+ss[i].getKorean()+ss[i].getMath(); //sum배열에 각 학생이 받은 영어, 국어, 수학 점수 다 더해서 저장
		}
		
		System.out.println("\nName            ID     KOREAN     MATH     ENGLISH     SUM     AVERAGE");
		for (int j=0 ; j<c ; j++) {
			ss[j].display(); //각 학생의 이름, 학번, 국어점수, 수학점수, 영어점수 출력
			System.out.printf("      " + sum[j]+"     %.2f", (float)sum[j]/3); //각 학생의 총점, 소수 둘째 자리까지 평균 출력
			System.out.println();
			korean += ss[j].getKorean(); //j번째 학생의 국어 점수를 korean 변수에 더함
			math += ss[j].getMath(); //j번째 학생의 국어 점수를 math 변수에 더함
			english += ss[j].getEnglish(); //j번째 학생의 영어 점수를 english 변수에 더함
		}
		//각 과목별 평균을 출력, 위에서 저장했던 korean, math, english를 학생 수로 나누어 소수 둘째 자리까지 출력
		System.out.printf("Subject Avg             %.2f       %.2f     %.2f", (float)korean/c, (float)math/c, (float)english/c);
	}

}
