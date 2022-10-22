import java.util.Scanner;

class DiceGame {
	private int diceFace;
	private int userGuess;
	
	private int rollDice() { //�������� 1~6������ ���� ����
		return (int)(Math.random() * 5 + 1); //����� ��� �� �Ŀ� int Ÿ������ ����
	}
	private void setUserInput() { //����ڷκ��� �����ϴ� �ֻ����� ���ڸ� �޴� �޼ҵ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dice is rolled!!!");
		System.out.println("Guess the number! What do you think?");
		while(true) { //����ڰ� 1~6������ ���� �Է��� ������ ��� �ݺ�
			userGuess = scanner.nextInt(); //userGuess�� ����ڰ� �Է��� ���� ����
			 scanner.nextLine(); //���ۿ� �����ִ� enter �ϳ� ����
			if (userGuess > 6 || userGuess < 1) // 1~6 ������ ���� �Է��� ���� �ƴ϶�� �Ʒ��� ���� ��� �� �ٽ� �Է� ����
				System.out.println("Input number between 1~6");
			else //1~6 ������ ���� ����� �Է��ߴٸ� ���ѷ����� Ż��
				break;
		}
	}
	private void checkUserGuess() { //dice�� ���� ����ڰ� ������ ���� ������ Ȯ���ϴ� �޼ҵ�
		if(userGuess == diceFace) //���� �� ���� ���ٸ� �Ʒ��� ���� ���
			System.out.println("Bingo!!!");
		else { //Ʋ�ȴٸ� Wrong ��� �� �ֻ����� ���ڰ� �����̾����� �˷���
			System.out.println("Wrong!");
			System.out.println("The face was "+diceFace);
		}
	}
	public void startPlaying() {
		System.out.println("<< GAME START >>");
		diceFace = rollDice(); //diceFace ������ �������� �������ְ�
		setUserInput(); //������ ���ڸ� �ް�
		checkUserGuess(); //������ Ȯ���ϴ� �۾� ����
	}
}

public class HW1_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in);
		DiceGame dg = new DiceGame(); //DiceGameŬ������ dg��� ���ο� ��ü ����
		String input = "y"; 
		//����ڿ��� �Լ� ������ �Ұ��� ������� �� ����� �����ϴ� input ���� ����
		//�⺻ �Է��� y�� ������� (y�϶��� ��� �ֻ��� ������ ����)
		
		while (input.equalsIgnoreCase("y")) { //input�� y�� �� ���� ��� �ݺ�
			dg.startPlaying(); //dg ��ü �ȿ� �����ϴ� startPlaying �޼ҵ� ����
			System.out.println("Try again?(y/n)");
			input = scanner.nextLine(); //input�� ���ο� ������� �Է��� ������
			System.out.println();
		}
		
		System.out.println("Game finished.");
		
	}

}
