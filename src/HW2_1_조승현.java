import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW2_1_조승현 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   System.out.println("============");
	   System.out.println("전공: 사이버보안");
	   System.out.println("학번: 2171081");
	   System.out.println("성명: 조승현");
	   System.out.println("============");
	   
      Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받기 위한 scanner 클래스 선언
      System.out.println("Input the filename to read.");
      String f1 = scanner.next(); //읽을 파일의 이름을 f1에 저장
      System.out.println("Input the filename to write");
      String f2 = scanner.next(); //내용을 쓸 파일의 이름을 f2에 저장
      
      PrintWriter outStream = null;
      Scanner inputStream = null;
      StringTokenizer token = null;
      int i = 0, j = 0; //읽을 파일의 한 줄에 있는 단어의 개수에 해당하는 i, 한 줄에 얼마나 많은 단어를 확인했는지 알기 위한 변수 j 선언 및 초기화
      
      try {
         inputStream = new Scanner(new File(f1)); //읽을 파일을 열고
         outStream = new PrintWriter(f2); //쓸 파일도 동시에 열어 줌 
      }
      catch(FileNotFoundException e) { //읽을 파일이 없을 때 예외 처리
         System.out.println("Error opening the file " + f1);
         System.exit(0);
      } 
      catch (IOException e) { //쓰는 도중에 오류가 생기면 예외 처리
          System.out.println("Exception occurs.");
          System.exit(1);
      }
      while (inputStream.hasNextLine()) { //읽고 있는 파일에 더 읽을 내용이 없을 때까지 반복
         String line = inputStream.nextLine(); //line에 읽고 있는 파일의 한 줄 내용을 저장
         token = new StringTokenizer(line, "\n, "); //StringTokenizer를 이용해 enter, ',', 띄어쓰기를 기준으로 단어를 분리 
         
         String [] str = new String[token.countTokens()]; //한 줄의 단어의 개수 만큼 담을 수 있는 String 배열 str 선언
         
         while (token.hasMoreTokens()) { //단어를 모두 읽을 때까지 번복 
            str[i] = token.nextToken().toString(); //token을 불러오고 str 배열에 String 형태로 변환하여 저장
            i++;
         }
         //새로 쓸 파일에 글자가 4개보다 많은 단어를 저장하는 부분
         while (j<i) { //한 줄에 있는 모든 단어를 확인 할 때까지 반복
             if (str[j].length() > 4) { //str의 j번째 인덱스에 있는 단어의 길이가 4보다 길다면
                outStream.println(str[j]); //f2 파일에 쓰기
             }
             j++;
         }
         //i와 j를 0으로 초기화하여 다음 줄에도 같은 연산을 반복할 수 있도록 함
         i=0;
         j=0;
      }
      //파일에 대한 처리가 끝난 후 flush
      inputStream.close();
      outStream.close();
      
      System.out.println(f2 + " is generated.");
   }

}