import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Week9_1_조승현 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("============");
      System.out.println("전공: 사이버보안");
      System.out.println("학번: 2171081");
      System.out.println("성명: 조승현");
      System.out.println("============");
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("File name for input:");
      String fileIn = scanner.next(); //자료가 있는 input 파일의 이름을 사용자로부터 입력 받음 -> 이미 존재하는 파일이어야함!!
      System.out.println("File name for output:");
      String fileOut = scanner.next(); //input 내에 존재하는 값을 2배하여 저장할 파일이름을 fileOut이라고 하고 사용자로부터 입력받음
      
      try { //큰 try문 -> input 파일로부터 정보를 읽어옴
         ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileIn));
         ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileOut));
         System.out.println("The numbers in File " + fileIn);
         
         try { //작은 try문 -> input 파일의 정보로부터 2배를 이끌어내어 output 파일에 저장
            while (true) { //무한루프 -> 더 이상 읽을 정보가 없으면 빠져나옴
               int in = inputStream.readInt(); //in 변수에 fileIn 이름을 가진 파일 안에 있는 정수인 변수들을 읽어옴
               System.out.println(in);
               int out = (in*2); //out 변수에 in 변수에 2배 한 값을 저장하고
               outputStream.writeInt(out); //out 값을 fileOut 이름을 가진 파일에 저장
            }
         } catch(EOFException e) { //파일을 모두 다 읽었으면 아래의 명령문 실행
            System.out.println("End of reading from File, " + fileIn);
            System.out.println(fileOut + " is generated.");
         }
         inputStream.close(); //전달받은 모든 정보를 flush하고 저장
         outputStream.close();
      } catch(FileNotFoundException e) { //없는 파일이라고 하면
         System.out.println("Cannot find file " + fileIn);
      } catch (IOException e) { //입출력 오류가 발생했으면
         System.out.println("Probelm with input from file " + fileIn);
      }
      
      try { //아까 fileIn으로부터 2배를 한 값이 fileOut에 저장되어있음 -> 이를 출력하는 try문
         ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileOut));
         System.out.println("\nThe numbers in new File, " + fileOut);
         
         try {
            while (true) { //무한루프 -> 정보를 다 읽을 때까지 실행
               int anInteger = inputStream.readInt(); //anInteger 변수에 fileOut 안에 있는 정수를 하나씩 읽어서 저장
               System.out.println(anInteger); //잠시 저장해 둔 숫자를 출력
            }
         } catch(EOFException e) { //안에 있는 정보를 다 읽었다면 아래의 명령문 실행
            System.out.println("End of reading from 2nd File, " + fileOut);
         }
         inputStream.close();
      } catch(FileNotFoundException e) { //없는 파일이라면 아래의 명령문 실행
         System.out.println("Cannot find file " + fileOut);
      } catch (IOException e) { //입출력에 문제가 생겼다면 아래의 명령문 실행
         System.out.println("Probelm with input from file " + fileOut);
      }
      
   }

}