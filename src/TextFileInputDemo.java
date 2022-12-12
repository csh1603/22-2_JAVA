import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter file name: ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.next();
		Scanner inputStream = null; //Scanner를 이용해 파일 내에 존재하는 데이터를 읽어옴
		System.out.println("The file " + filename + " contains the following lines: ");
		try {
			inputStream = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + filename);
			System.exit(0);
		}
		while (inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println(line);
		} inputStream.close();
	}

}
