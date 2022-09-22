import java.util.Scanner;

class MyFile {
	private String title;
	private int page;
	
	public void setTitle(String title) {
		this.title = title; //4번째 줄에 있는 전역 변수 title에 입력받은 title 값 대입
	}
	
	public String getTitle() {
		return getTitle();
	}
	
	public void setPage(int page) {
		this.page = page; //5번째 줄에 있는 전역 변수 page에 입력받은 page 값 대입
	}
	
	public int getPage() {
		return page;
	}
	
	//MyFile이라는 데이터타입의 mf라는 객체를 인자로 받아 함수 처리
	public void fileCopy(MyFile mf) {
		mf.title = title; 
		mf.page = page;
	}
	
	public void fileInfo() {
		System.out.println("파일제목:" + title); //객체 안에 존재하는 파일제목 출력
		System.out.println("페이지:" + page); //객제 안에 존재하는 페이지 변수 출력
	}
}

public class Week3_3_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //사용자에게 입력을 받기 위한 scanner 클래스 선언
		String title;
		int page;
		MyFile fOld = new MyFile(); //fOld라는 객체를 MyFile 클래스로 선언
		MyFile fNew = new MyFile(); //fNew라는 객체를 MyFile 클래스로 선언
		System.out.println("--File정보입력 (제목,페이지수)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		fOld.fileCopy(fNew);
		System.out.println("<원래 File>");
		fOld.fileInfo(); //fOld 객체 안에 존재하는 fileInfo() 함수 결과 실행
		System.out.println("<복사된 File>");
		fNew.fileInfo();
	}

}
