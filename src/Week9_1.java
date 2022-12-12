//txt 파일에 사용자가 keyboard로 입력한 내용을 저장하는 코드

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Week9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "test.txt";
		PrintWriter pw = null;
		String line;
		try {
			pw = new PrintWriter(fileName);
		} catch (IOException e) {
			System.out.println("Exception occurs");
			System.exit(1);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input three lines");
		for (int i=0 ; i<3 ; i++) {
			line = scanner.nextLine();
			pw.println(line);
		}
		pw.close();
	}

}