import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW2_1_������ {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   System.out.println("============");
	   System.out.println("����: ���̹�����");
	   System.out.println("�й�: 2171081");
	   System.out.println("����: ������");
	   System.out.println("============");
	   
      Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� scanner Ŭ���� ����
      System.out.println("Input the filename to read.");
      String f1 = scanner.next(); //���� ������ �̸��� f1�� ����
      System.out.println("Input the filename to write");
      String f2 = scanner.next(); //������ �� ������ �̸��� f2�� ����
      
      PrintWriter outStream = null;
      Scanner inputStream = null;
      StringTokenizer token = null;
      int i = 0, j = 0; //���� ������ �� �ٿ� �ִ� �ܾ��� ������ �ش��ϴ� i, �� �ٿ� �󸶳� ���� �ܾ Ȯ���ߴ��� �˱� ���� ���� j ���� �� �ʱ�ȭ
      
      try {
         inputStream = new Scanner(new File(f1)); //���� ������ ����
         outStream = new PrintWriter(f2); //�� ���ϵ� ���ÿ� ���� �� 
      }
      catch(FileNotFoundException e) { //���� ������ ���� �� ���� ó��
         System.out.println("Error opening the file " + f1);
         System.exit(0);
      } 
      catch (IOException e) { //���� ���߿� ������ ����� ���� ó��
          System.out.println("Exception occurs.");
          System.exit(1);
      }
      while (inputStream.hasNextLine()) { //�а� �ִ� ���Ͽ� �� ���� ������ ���� ������ �ݺ�
         String line = inputStream.nextLine(); //line�� �а� �ִ� ������ �� �� ������ ����
         token = new StringTokenizer(line, "\n, "); //StringTokenizer�� �̿��� enter, ',', ���⸦ �������� �ܾ �и� 
         
         String [] str = new String[token.countTokens()]; //�� ���� �ܾ��� ���� ��ŭ ���� �� �ִ� String �迭 str ����
         
         while (token.hasMoreTokens()) { //�ܾ ��� ���� ������ ���� 
            str[i] = token.nextToken().toString(); //token�� �ҷ����� str �迭�� String ���·� ��ȯ�Ͽ� ����
            i++;
         }
         //���� �� ���Ͽ� ���ڰ� 4������ ���� �ܾ �����ϴ� �κ�
         while (j<i) { //�� �ٿ� �ִ� ��� �ܾ Ȯ�� �� ������ �ݺ�
             if (str[j].length() > 4) { //str�� j��° �ε����� �ִ� �ܾ��� ���̰� 4���� ��ٸ�
                outStream.println(str[j]); //f2 ���Ͽ� ����
             }
             j++;
         }
         //i�� j�� 0���� �ʱ�ȭ�Ͽ� ���� �ٿ��� ���� ������ �ݺ��� �� �ֵ��� ��
         i=0;
         j=0;
      }
      //���Ͽ� ���� ó���� ���� �� flush
      inputStream.close();
      outStream.close();
      
      System.out.println(f2 + " is generated.");
   }

}