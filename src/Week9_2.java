//txt에 저장되어있는 문자열을 받아와서 콘솔창에 출력하는 코드

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter file name: ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.next();
		Scanner inputStream = null;
		System.out.println("The file " + fileName + "\n contains the following line:\n");
		try {
			inputStream = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Error openinf the file " + fileName);
			System.exit(1);
		}
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
		}
		inputStream.close();
	}

}
