import java.util.Scanner;

public class Week5_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner scanner = new Scanner(System.in); //����ڿ��� �Է¹ޱ� ���� ��ĳ�� Ŭ���� ����
		Play play = new Play(); //Play Ŭ������ play��� �̸����� �����Ͽ� ��ü ����
		Film film = new Film(); //File Ŭ������ film�̶�� �̸����� �����Ͽ� ��ü ����
		
		System.out.println("Input Title for Play");
		play.setTitle(scanner.nextLine()); //play ��ü ���� �����ϴ� setTitle�̶�� �޼ҵ�� ����ڿ��� ������ �̸� �Է¹ޱ�
		System.out.println("Input Director for Play");
		play.setDirector(scanner.nextLine()); //play ��ü ���� �����ϴ� setDirector�̶�� �޼ҵ�� ����ڿ��� ������ ���� �Է¹ޱ�
		System.out.println("Input Writer for Play");
		play.setWriter(scanner.nextLine()); //play ��ü ���� �����ϴ� setWriter�̶�� �޼ҵ�� ����ڿ��� ������ �۰� �Է¹ޱ�
		
		System.out.println("Input Title for Film");
		film.setTitle(scanner.nextLine()); //film ��ü ���� �����ϴ� setTitle�̶�� �޼ҵ�� ����ڿ��� ��ȭ�� �̸� �Է¹ޱ�
		System.out.println("Input Director for Film");
		film.setDirector(scanner.nextLine()); //film ��ü ���� �����ϴ� setDirector�̶�� �޼ҵ�� ����ڿ��� ��ȭ�� ���� �Է¹ޱ�
		System.out.println("Input Writer for Film");
		film.setWriter(scanner.nextLine()); //film ��ü ���� �����ϴ� setWriter�̶�� �޼ҵ�� ����ڿ��� ��ȭ�� �۰� �Է¹ޱ�
		
		System.out.println("Input Performance Cost for Play");
		play.setPerformanceCost(scanner.nextInt()); //play ��ü ���� �����ϴ� setPerformanceCost�̶�� �޼ҵ�� ����ڿ��� ������ ���� �Է¹ޱ�
		System.out.println("Input boxOfficeGross for Film");
		film.setBoxOfficeGross(scanner.nextInt()); //film ��ü ���� �����ϴ� setBoxOfficeGross�̶�� �޼ҵ�� ����ڿ��� ��ȭ�� ���� �Է¹ޱ�
		
		play.display(); //������ �̸�, ����, �۰�, ������ ����ϴ� �޼ҵ� ����
		System.out.println();
		film.display(); //��ȭ�� �̸�, ����, �۰�, ������ ����ϴ� �޼ҵ� ����
	}

}
