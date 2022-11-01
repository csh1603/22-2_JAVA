import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Pet implements Serializable{
   private String name; //애완동물의 이름을 저장하는 변수
   private int age; //애완동물의 나이를 저장하는 변수
   private double weight; //애완동물의 무게를 저장하는 변수
   
   public void setPet(String newName, int newAge, double newWeight) { //생성자 역할을 하는 setPet 메소드 정의
      name = newName;
      age = newAge;
      weight = newWeight;
   }
   public void setName(String newName) { //이름을 설정하는 setName 메소드
      name = newName;
   }
   public void setWeight(double newWeight) { //몸무게를 설정하는 setWeight 메소드
      weight = newWeight;
   }
   public String getName() { //private 변수인 이름을 반환하는 getName 메소드
      return name;
   }
   public int getAge() { //private 변수인 나이를 반환하는 getAge 메소드
      return age;
   }
   public double getWeight() { //private 변수인 몸무게를 반환하는 getWeigt 메소드
      return weight;
   }
}

class Dog extends Pet implements Serializable { //Pet를 상속받고 Serializable를 구현하는 Dog 클래스
   private String breed; //강아지의 종을 알리는 변수
   private boolean boosterShot; //예방접종 여부를 알려주는 변수
   String boo; //예방접종 여부를 O, X로 표시하기 위한 변수
   
   Dog() {   } //빈 생성자
   Dog(String newName, int newAge, double newWeight, String newBreed, boolean newBoost){ //이름, 나이, 몸무게, 종, 예방접종 여부를 전달 받았을 때 사용하는 생성자
      super.setPet(newName, newAge, newWeight); //Pet 클래스 내부에 존재하는 setPet 메소드에 이름, 나이, 몸무게를 인자로 전달하여 초기화
      breed = newBreed;
      boosterShot = newBoost;
   }
   
   public void setBreed(String breed) { //종을 설정하는 setBreed 메소드
      this.breed = breed;
   }
   public void setBoosteerShot(boolean newBoost) { //예방접종여부를 설정하는 setBoosterShot 메소드
      boosterShot = newBoost;
   }
   public String getBreed() { //private 변수인 종을 반환하는 getBreed 메소드
      return breed;
   }
   public boolean getBoosterShot() { //private 변수인 예방접종여부를 반환하는 getBoosterShot 메소드
      return boosterShot;
   }
   public String toString() { //이름, 나이, 몸무게, 종, 예방접종 여부를 출력하는 메소드
      if (getBoosterShot() == true) { //만약 예방접종 여부가 true라면 boo변수에 O를 저장
         boo = "O";
      }
      else  //만약 예방접종 여부가 false라면 boo변수에 O를 저장
         boo = "X";
      return (getName() + "   " + getAge() + "      " + getWeight() + "     " + getBreed() + "       " + boo);
   }
}

public class Week9_2_조승현 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      System.out.println("============");
      System.out.println("전공: 사이버보안");
      System.out.println("학번: 2171081");
      System.out.println("성명: 조승현");
      System.out.println("============");
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input File name to write Dog data");
      String fileName = scanner.next(); //Dog data를 저장할 파일명을 사용자로부터 입력받아 fileName에 저장
      
      Dog myDog[] = new Dog[10];
      myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
      myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
      myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
      myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
      myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
      myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
      myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
      myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
      myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
      myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);
      
      try {
         ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
         outputStream.writeObject(myDog); //myDog 인스턴스에 담긴 내용을 outputStream에 밀어넣기
         outputStream.close(); //flush하고 저장
      } catch (IOException e) {
         System.out.println("ERROR writing to file "+ fileName + ".");
         System.exit(0);
      }
      
      System.out.println("Name    Age    Weight   Breed       BoosterShot");
      
      Dog[] another = null; //fileName 안에 있는 Dog 인스턴스들의 정보를 저장할 another 배열 선언 
      
      try {
         ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
         another = (Dog[])inputStream.readObject(); //readObject는 Object타입으로 반환하기 때문에 자손 클래스인 Dog 클래스로 다운 캐스팅 후 another에 저장, Serializable 때문에 한번에 정보가 다 들어옴
         for (int i=0 ; i<10 ; i++) { //모든 인스턴스 배열을 확인하면서 각 인스턴스의 정보 출력
            System.out.println(another[i].toString());
         }
         inputStream.close();
      }
        catch(EOFException e) {
         System.out.println("End of File Exception.");
      } catch(FileNotFoundException e) { //파일을 찾을 수 없을 때 실행되는 catch문
         System.out.println("File not found Exception.");
      } catch (IOException e) {
         System.out.println("IO Exception.");
      } catch (Exception e) {
         System.out.println("Exception");
      }
      
      System.out.println("\nDogs older 2 years and did not get the boosterShot.");
      try { //위에서 진행한 try문과 거의 동일
         ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
         another = (Dog[])inputStream.readObject();
         for (int i=0 ; i<10 ; i++) { //이번에는 나이가 2살보다 많고, 예방접종을 맞지 않은 강아지들을 대상으로 출력
            if (another[i].getAge() > 2 && another[i].getBoosterShot() == false) {
               System.out.println(another[i].getName() + "      " + another[i].getBreed()); //이름과 종만 출력
            }
         }
         inputStream.close();
      }
        catch(EOFException e) {
         System.out.println("End of File Exception.");
      } catch(FileNotFoundException e) {
         System.out.println("File not found Exception.");
      } catch (IOException e) {
         System.out.println("IO Exception.");
      } catch (Exception e) {
         System.out.println("Exception");
      }
         
      
      System.out.println("\nProgram finished");
   }

}