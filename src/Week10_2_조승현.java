import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week10_2_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		Map<String, String> student = new HashMap<String, String>(); //String을 key로 String을 value로 갖는 map, student 정의
		Scanner scanner = new Scanner(System.in);
		String name, ID, str, maxID, minID; //학생의 이름, 학번, Iterator에서 사용할 변수 str, 이름의 길이가 가장 긴 학생의 학번, 이름이 가장 짧은 학생의 학번을 저장하는 변수
		int maxLength, minLength; //이름의 길이를 저장하는 변수, max에는 가장 긴 학생, min에는 가장 짧은 학생 
		
		System.out.println("학생의 ID와 이름을 차례로 입력하세요. (종료시 0 0 입력)");
		while (true) {
			ID = scanner.next(); //사용자로부터 학생의 학번을 입력받아 ID 변수에 저장
			name = scanner.next(); //사용자로부터 학생의 이름을 입력받아 name 변수에 저장
			if (ID.equalsIgnoreCase("0") && name.equalsIgnoreCase("0")) //만약 학번과 이름이 0이라면 무한루프 탈출
				break;
			student.put(ID, name); //둘 다 0이 아니라면 ID와 name을 key와 value로 갖도록 하는 student 정보 생성
		}
		
		System.out.println("<학생명단>");
		System.out.println("[ID]" + "\t[NAME]");
		Set s = student.keySet();
		Iterator<String> it = s.iterator(); //Map 내부에 존재하는 모든 정보를 출력 & 확인하기 위한 Iterator 선언 
		
		str = it.next(); //첫번째 정보를 str에 저장
		//첫번째로 들어온 학생 이름의 길이를 maxLength, minLength로 저장하여 비교
		maxLength = student.get(str).length();
		minLength = student.get(str).length();
		//maxID와 minID에는 학생의 ID(key)값 저장
		maxID = str;
		minID = str;
		//첫번째 학생이 정보 출력
		System.out.println(str + "\t" + student.get(str));
		
		//출력할 정보가 남아있다면 계속 반복 -> 모든 정보를 출력했다면 탈출
		while(it.hasNext()) {
			str = it.next(); //다음 정보를 str에 저장
			if (maxLength < student.get(str).length()) { //만약 현재 학생 이름의 길이가 지금까지 봤던 학생의 이름 중에 가장 길다면, 현재 가지고 있는 maxLength보다 길다면
				maxLength = student.get(str).length(); //maxLength를 현재 학생 이름의 길이로 수정
				maxID = str; //maxID는 현재 학생의 학번 저장
			}
			if (minLength > student.get(str).length()) { //만약 현재 학생 이름의 길이가 지금까지 봤던 학생의 이름 중에 가장 짧다면, 현재 가지고 있는 minLength보다 짧다면
				minLength = student.get(str).length(); //minLength를 현재 학생 이름의 길이로 수정
				minID = str; //minID는 현재 학생의 학번 저장
			}
			
			System.out.println(str + "\t" + student.get(str)); //학생의 정보 출력하기
		}
		
		System.out.println("\n전체 학생수:"+student.size()); //size()메소드를 이용해서 총 몇 개의 map이 있는지 확인
		System.out.println("<가장 긴 이름을 가진 학생>"); //위에서 확인한 이름의 길이가 가장 긴 학생의 정보 출력
		System.out.println("ID:" + maxID + " Name:" + student.get(maxID) + " 길이:" + maxLength);
		System.out.println("<가장 짧은 이름을 가진 학생>"); //위에서 확인한 이름의 길이가 가장 짧은 학생의 정보 출력
		System.out.println("ID:" + minID + " Name:" + student.get(minID) + " 길이:" + minLength);
	}

}
