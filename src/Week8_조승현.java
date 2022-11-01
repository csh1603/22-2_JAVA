import java.util.Scanner;

class Game {
	int com, you, yCount, cCount;
	//�������� ������ ���� com, ����ڰ� �Է��� ��(����,������)�� you, ����ڰ� �̱� Ƚ���� yCount, ��ǻ�Ͱ� �̱� Ƚ���� cCount�� ����
	void play() {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		System.out.println("���������� ������ �����մϴ�.");
		
		while(true) { //����ڳ� ��ǻ�Ͱ� 3���� �̱� ������ ��� �ݺ�
			System.out.println("\n����� ������?(You("+yCount+") - Com(" + cCount +"))"); //����ڰ� �̱� Ƚ���� ��ǻ�Ͱ� �̱� Ƚ���� ���
			System.out.println("���� (1) ����(2) ��(3)");
			input();
			if (yCount == 3 || cCount == 3) //������ 3���� �̱�� �Ǹ� �� ���ѷ����� Ż��
				break;
		}
		
		//��� ������ ������ ����� ���
		System.out.println("\nYou("+yCount+")  Com("+cCount+")");
		if (yCount > cCount) //����ڰ� �̱� Ƚ���� �� ������ ����ڰ� �̰����� �˷���
			System.out.println("����� �̰���ϴ�.");
		else //�װ� �ƴ϶�� ��ǻ�Ͱ� �̰����� �˷���
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		
		System.out.println("������ �����մϴ�.");
	}
	void input() {
		Scanner scanner = new Scanner(System.in); //����ڷκ��� �Է��� �ޱ� ���� Scanner Ŭ���� ����
		com = (int)(Math.random() * 3)+1; //1~3 ���� ���� ��� �� com ������ ����
		try {
			you = scanner.nextInt(); //����ڷκ��ʹ� 1~3���� �ش��ϴ� ���� �Է��� ���� 
			
			if (you < 1 || you > 3) //���� ����ڰ� 1~3 ������ ���� �Է����� �ʾҴٸ� ���� �߻� ó�� -> �Ʒ� ���๮ �������� �ʰ� �ٷ� catch���� �����ϴ� ��ɹ� ����
				throw new Exception();
			
			//����ڿ� ��ǻ�Ͱ� � ���� �����ߴ��� ���
			System.out.println("<You>   <Com>");
			Change(you); //����ڰ� �Է��� ���ڿ� �ش��ϴ� ����, ����, �� ���
			Change(com); //com ������ �Ҵ�� ���������� �ش��ϴ� ����, ����, �� ���
			System.out.println();
			writeOutput(you, com); //������, ����ڰ� �̰����, ��ǻ�Ͱ� �̰���� writeOutput �Լ��� �̿��ؼ� ��� - you�� com�� ���ڷ� �����Ͽ� ���� ����
		} catch(Exception e) {
			System.out.println("������ �߸��Ǿ����ϴ�.");
		}
		
		
	}
	void writeOutput(int you, int com) {
		if (you == com) { //���� ��ǻ�Ϳ� ����ڰ� ���� ���� �´ٸ� ������� �˷���
			System.out.println("���");
		}
		//����� ���� ������ ��, ��(3)�� ����(2)�� �̱��, ����(2)�� ����(1)�� �̱�Ƿ� ����ڰ� �� ���� ���ڰ� 1�� �� ũ�� �̱� or ����(1)�� ��(3)�� �̱�Ƿ� ����ڰ� �� ���� ���ڿ��� ��ǻ���� ���ڸ� ���� -2�� ������ ��
		//�� �Ŀ� ����ڰ� �̰����Ƿ� yCount�� 1�� �߰�
		else if (you-com == 1 || you-com == -2) {
			System.out.println("��� ��");
			yCount++;
		}
		//����� ���� ������ ��, ����(2)�� ��(3)�� �̱��, ����(1)�� ����(2)�� �̱� �� �����Ƿ� ����ڰ� �� ���� ���ڿ��� ��ǻ�Ͱ� �� ���ڸ� ���� -1�� �� or ��(3)�� ����(1)�� �̱� �� �����Ƿ� ������� ���ڿ��� ��ǻ���� ���ڸ� ���� 2�� ������ ��ǻ�Ͱ� �̱�
		//�� �Ŀ� ��ǻ�Ͱ� �̰����Ƿ� cCount�� 1�� �߰�
		else if (you-com == 2 || you-com == -1) {
			System.out.println("��ǻ�� ��");
			cCount++;
		}
	}
	void Change(int a) { //1, 2, 3�� �ش��ϴ� ���ڿ� ���缭 ����, ����, ���� �ٲپ� ����ϴ� �Լ�
		if (a == 1) {
			System.out.print("����     ");
		}
		else if (a == 2) {
			System.out.print("����     ");
		}
		else if (a == 3) {
			System.out.print("��      ");
		}
	}
}

public class Week8_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		g.play();
	}

}
