
public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 메소드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}

}
