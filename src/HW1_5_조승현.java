import java.util.Scanner;

class Shape {
   private int x;
   private int y;
   
   public void setPoint(int x, int y) { //����ڿ��� �Է¹��� x, y ���� ���ڷ� ���޹޾� Shape�� x, y ��ǥ�� ����
      this.x = x;
      this.y = y;
   }
   public void display() { //x, y ��ǥ�� ����ϴ� �޼ҵ�
      System.out.println("Point (x,y) = (" + x + "," + y + ")");
   }
}

class Circle extends Shape { //Shape�� ��ӹ޴� Circle Ŭ����
   private int r;
   
   Circle() {} //�� ������
   Circle(int x, int y, int r) { //���� 3���� ������ �ʱ�ȭ�ϴ� ������
      this.setPoint(x, y, r); //Circle Ŭ���� ���� �����ϴ� setPoint �Լ��� �̿��Ͽ� �ʱ�ȭ
   }
   
   public void setPoint(int x, int y, int r) { //�޼ҵ� �������̵� - Circle�� �����ϴ� �������� ����ϴ� �޼ҵ�
      super.setPoint(x, y); //��ӹ��� Shape Ŭ���� ���� �����ϴ� setPoint �Լ��� x, y �����Ͽ� �޼ҵ� ���� -> x,y ��ǥ ����
      this.r = r; //�Է¹��� r�� Circle ���� �����ϴ� r ������ ����
   }
   public void display() { //�޼ҵ� �������̵�
      super.display(); //��ӹ��� Shape Ŭ������ �����ϴ� display �Լ� ����
      System.out.println("Radius r = " + r); //r ���� ���
   }
}

class Rectangle extends Shape { //Shape�� ��ӹ޴� Rectangle Ŭ����
   private int width;
   private int height;
   
   Rectangle() {} //�� ������
   Rectangle(int x, int y, int width, int height) { //x, y, width, height�� ���ڷ� �ʱ�ȭ�ϴ� ������
      this.setPoint(x, y, width, height); //Rectangle Ŭ���� ���� �����ϴ� setPoint �Լ��� �̿��ؼ� �ʱ�ȭ
   }
   
   public void setPoint(int x, int y, int width, int height) { //�޼ҵ� �������̵�
      super.setPoint(x, y); //��ӹ��� Shape Ŭ���� ���� �����ϴ� setPoint �޼ҵ忡 x, y�� ���ڷ� ����
      this.width = width; //�Է¹��� width�� Rectangle ���� �����ϴ� width ������ ����
      this.height = height; //�Է¹��� height�� Rectangle ���� �����ϴ� height ������ ����
   }
   public void display() { //�޼ҵ� �������̵� - Rectangle�� �����ϴ� �������� ����ϴ� �޼ҵ�
      super.display(); //��ӹ��� Shape ��ü ���� �����ϴ� display �޼ҵ� ����
      System.out.println("Width: " + width + ", Height:" + height); //width�� height�� ���
   }
}

public class HW1_5_������ {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("============");
      System.out.println("����: ���̹�����");
      System.out.println("�й�: 2171081");
      System.out.println("����: ������");
      System.out.println("============");
      
      Scanner scanner = new Scanner(System.in);
      
      Shape[] myShape = new Shape[10]; //Shape Ÿ���� ������ 10���� ��ü �迭 myShape ����
      int x, y, r, width, height; //����ڷκ��� �Է¹��� x, y, r, width, height�� ������ ���� ����
      int i=0; //myShape �迭�� �ε����� ��Ÿ���� i ���� ���� �� 0���� �ʱ�ȭ

      
      AA: while (i < 10) { //i�� 10 �̸��̶�� = myShape�� �ִ� ũ�⸦ ���� �ʴ� ���� �ݺ�
         System.out.println("1. Circle   2. Rectangle   3. Show   4. Exit");
         int input = scanner.nextInt(); //����ڰ� �Է��� ����� input�� ����
         switch(input) { //input ������ ���� switch�� ����
         case 1: //1�� �Է��ߴٸ� = Circle�� ����
            System.out.print("x = ");
            x = scanner.nextInt(); //x�� ����ڰ� �Է��� x�� ����
            System.out.print("y = ");
            y = scanner.nextInt(); //y�� ����ڰ� �Է��� y�� ����
            System.out.print("r = ");
            r = scanner.nextInt(); //r�� ����ڰ� �Է��� r�� ����
            myShape[i++] = new Circle(x, y, r); //myShape�� i��° �迭�� x, y, r�� ���ڷ� �����Ͽ� Circle ��ü �Ҵ�, ��� ������ ������ ���� �����ڷ� i �� ����
            System.out.println();
            break;
         case 2: //2�� �Է��ߴٸ� = Rectangle�� ����
            System.out.print("x = ");
            x = scanner.nextInt(); //x�� ����ڰ� �Է��� x�� ����
            System.out.print("y = ");
            y = scanner.nextInt(); //y�� ����ڰ� �Է��� y�� ����
            System.out.print("w = ");
            width = scanner.nextInt(); //width�� ����ڰ� �Է��� w�� ����
            System.out.print("h = ");
            height = scanner.nextInt(); //height�� ����ڰ� �Է��� h�� ����
            myShape[i++] = new Rectangle(x, y, width, height); //myShape�� i��° �迭�� x, y, width, height�� ���ڷ� �����Ͽ� Rectangle ��ü �Ҵ�, ��� ������ ������ ���� �����ڷ� i �� ����
            System.out.println();
            break;
         case 3: //3�� �Է��ߴٸ�, ���ݱ��� �Է��� ��� ����� ���
            for (int j = 0 ; j<i ; j++) //i��°���� (����ڰ� �Է��� ������ŭ �ݺ�)
               myShape[j].display(); //myShape ��ü ���� �����ϴ� display �޼ҵ� ����, Circle�� Rectanlge�� ���� �ٸ��� ���
            System.out.println();
            break;
         case 4: break AA; //4�� �����ߴٸ� while�� Ż��
         }
      }
   }

}