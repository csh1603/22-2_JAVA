//사이버보안전공 2171081 조승현
public class Production {
	private String title; //생산물의 이름 변수 선언
	private String director; //생산물의 감독 변수 선언
	private String writer; //생산물의 작가 변수 선언
	
	public String getTitle() { //Production의 private 타입 변수 title을 반환하는 메소드
		return title;
	}
	public String getDirector() { //Production의 private 타입 변수 director를 반환하는 메소드
		return director;
	}
	public String getWriter() { //Production의 private 타입 변수 writer를 반환하는 메소드
		return writer;
	}
	public void setTitle(String title) { //사용자가 입력한 변수를 Production의 title에 저장
		this.title = title;
	}
	public void setDirector(String director) { //사용자가 입력한 변수를 Production의 director에 저장
		this.director = director;
	}
	public void setWriter(String writer) { //사용자가 입력한 변수를 Production의 writer에 저장
		this.writer = writer;
	}
	public void display() { //Production의 제목, 감독, 작가를 출력하는 메소드
		System.out.println("Title:"+getTitle());
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
	}
}
