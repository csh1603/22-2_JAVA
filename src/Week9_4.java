import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//binaryfile�� �Է��ϱ�
public class Week9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "numbers.dat";
		try {
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter nonnegative integers.");
			System.out.println("Place a negative number at the end.");
			
			int anInteger;
			do {
				anInteger = scanner.nextInt();
				outputStream.writeInt(anInteger);
			} while (anInteger >= 0);
			
			System.out.println("Numbers and sentinel value");
			System.out.println("written to the file " + fileName);
			outputStream.close();
		} catch (IOException e) {
			System.out.println("Problem with output to file " + fileName); 
		}
	}

}
