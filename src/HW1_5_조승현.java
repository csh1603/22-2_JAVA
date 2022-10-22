import java.util.Scanner;

class Shape {
   private int x;
   private int y;
   
   public void setPoint(int x, int y) { //사용자에게 입력받은 x, y 값을 인자로 전달받아 Shape의 x, y 좌표로 설정
      this.x = x;
      this.y = y;
   }
   public void display() { //x, y 좌표를 출력하는 메소드
      System.out.println("Point (x,y) = (" + x + "," + y + ")");
   }
}

class Circle extends Shape { //Shape를 상속받는 Circle 클래스
   private int r;
   
   Circle() {} //빈 생성자
   Circle(int x, int y, int r) { //인자 3개를 가지고 초기화하는 생성자
      this.setPoint(x, y, r); //Circle 클래스 내에 존재하는 setPoint 함수를 이용하여 초기화
   }
   
   public void setPoint(int x, int y, int r) { //메소드 오버라이딩 - Circle를 구성하는 변수들을 출력하는 메소드
      super.setPoint(x, y); //상속받은 Shape 클래스 내에 존재하는 setPoint 함수에 x, y 전달하여 메소드 실행 -> x,y 좌표 설정
      this.r = r; //입력받은 r은 Circle 내에 존재하는 r 변수에 저장
   }
   public void display() { //메소드 오버라이딩
      super.display(); //상속받은 Shape 클래스에 존재하는 display 함수 실행
      System.out.println("Radius r = " + r); //r 변수 출력
   }
}

class Rectangle extends Shape { //Shape을 상속받는 Rectangle 클래스
   private int width;
   private int height;
   
   Rectangle() {} //빈 생성자
   Rectangle(int x, int y, int width, int height) { //x, y, width, height를 인자로 초기화하는 생성자
      this.setPoint(x, y, width, height); //Rectangle 클래스 내에 존재하는 setPoint 함수를 이용해서 초기화
   }
   
   public void setPoint(int x, int y, int width, int height) { //메소드 오버라이딩
      super.setPoint(x, y); //상속받은 Shape 클래스 내에 존재하는 setPoint 메소드에 x, y를 인자로 전달
      this.width = width; //입력받은 width는 Rectangle 내에 존재하는 width 변수에 저장
      this.height = height; //입력받은 height는 Rectangle 내에 존재하는 height 변수에 저장
   }
   public void display() { //메소드 오버라이딩 - Rectangle를 구성하는 변수들을 출력하는 메소드
      super.display(); //상속받은 Shape 객체 내에 존재하는 display 메소드 실행
      System.out.println("Width: " + width + ", Height:" + height); //width와 height를 출력
   }
}

public class HW1_5_조승현 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("============");
      System.out.println("전공: 사이버보안");
      System.out.println("학번: 2171081");
      System.out.println("성명: 조승현");
      System.out.println("============");
      
      Scanner scanner = new Scanner(System.in);
      
      Shape[] myShape = new Shape[10]; //Shape 타입을 가지는 10개의 객체 배열 myShape 선언
      int x, y, r, width, height; //사용자로부터 입력받을 x, y, r, width, height를 저장할 변수 선언
      int i=0; //myShape 배열의 인덱스를 나타내는 i 변수 선언 및 0으로 초기화

      
      AA: while (i < 10) { //i가 10 미만이라면 = myShape의 최대 크기를 넘지 않는 동안 반복
         System.out.println("1. Circle   2. Rectangle   3. Show   4. Exit");
         int input = scanner.nextInt(); //사용자가 입력한 명령을 input에 저장
         switch(input) { //input 변수에 따라 switch문 실행
         case 1: //1을 입력했다면 = Circle을 선택
            System.out.print("x = ");
            x = scanner.nextInt(); //x에 사용자가 입력한 x값 저장
            System.out.print("y = ");
            y = scanner.nextInt(); //y에 사용자가 입력한 y값 저장
            System.out.print("r = ");
            r = scanner.nextInt(); //r에 사용자가 입력한 r값 저장
            myShape[i++] = new Circle(x, y, r); //myShape의 i번째 배열에 x, y, r을 인자로 전달하여 Circle 객체 할당, 모든 실행이 끝나고 후위 연산자로 i 값 증가
            System.out.println();
            break;
         case 2: //2를 입력했다면 = Rectangle을 선택
            System.out.print("x = ");
            x = scanner.nextInt(); //x에 사용자가 입력한 x값 저장
            System.out.print("y = ");
            y = scanner.nextInt(); //y에 사용자가 입력한 y값 저장
            System.out.print("w = ");
            width = scanner.nextInt(); //width에 사용자가 입력한 w값 저장
            System.out.print("h = ");
            height = scanner.nextInt(); //height에 사용자가 입력한 h값 저장
            myShape[i++] = new Rectangle(x, y, width, height); //myShape의 i번째 배열에 x, y, width, height를 인자로 전달하여 Rectangle 객체 할당, 모든 실행이 끝나고 후위 연산자로 i 값 증가
            System.out.println();
            break;
         case 3: //3을 입력했다면, 지금까지 입력한 모든 결과를 출력
            for (int j = 0 ; j<i ; j++) //i번째까지 (사용자가 입력한 개수만큼 반복)
               myShape[j].display(); //myShape 객체 내에 존재하는 display 메소드 실행, Circle과 Rectanlge에 따라 다르게 출력
            System.out.println();
            break;
         case 4: break AA; //4를 선택했다면 while문 탈출
         }
      }
   }

}