import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Week10_2_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Map<String, String> student = new HashMap<String, String>(); //String�� key�� String�� value�� ���� map, student ����
		Scanner scanner = new Scanner(System.in);
		String name, ID, str, maxID, minID; //�л��� �̸�, �й�, Iterator���� ����� ���� str, �̸��� ���̰� ���� �� �л��� �й�, �̸��� ���� ª�� �л��� �й��� �����ϴ� ����
		int maxLength, minLength; //�̸��� ���̸� �����ϴ� ����, max���� ���� �� �л�, min���� ���� ª�� �л� 
		
		System.out.println("�л��� ID�� �̸��� ���ʷ� �Է��ϼ���. (����� 0 0 �Է�)");
		while (true) {
			ID = scanner.next(); //����ڷκ��� �л��� �й��� �Է¹޾� ID ������ ����
			name = scanner.next(); //����ڷκ��� �л��� �̸��� �Է¹޾� name ������ ����
			if (ID.equalsIgnoreCase("0") && name.equalsIgnoreCase("0")) //���� �й��� �̸��� 0�̶�� ���ѷ��� Ż��
				break;
			student.put(ID, name); //�� �� 0�� �ƴ϶�� ID�� name�� key�� value�� ������ �ϴ� student ���� ����
		}
		
		System.out.println("<�л����>");
		System.out.println("[ID]" + "\t[NAME]");
		Set s = student.keySet();
		Iterator<String> it = s.iterator(); //Map ���ο� �����ϴ� ��� ������ ��� & Ȯ���ϱ� ���� Iterator ���� 
		
		str = it.next(); //ù��° ������ str�� ����
		//ù��°�� ���� �л� �̸��� ���̸� maxLength, minLength�� �����Ͽ� ��
		maxLength = student.get(str).length();
		minLength = student.get(str).length();
		//maxID�� minID���� �л��� ID(key)�� ����
		maxID = str;
		minID = str;
		//ù��° �л��� ���� ���
		System.out.println(str + "\t" + student.get(str));
		
		//����� ������ �����ִٸ� ��� �ݺ� -> ��� ������ ����ߴٸ� Ż��
		while(it.hasNext()) {
			str = it.next(); //���� ������ str�� ����
			if (maxLength < student.get(str).length()) { //���� ���� �л� �̸��� ���̰� ���ݱ��� �ô� �л��� �̸� �߿� ���� ��ٸ�, ���� ������ �ִ� maxLength���� ��ٸ�
				maxLength = student.get(str).length(); //maxLength�� ���� �л� �̸��� ���̷� ����
				maxID = str; //maxID�� ���� �л��� �й� ����
			}
			if (minLength > student.get(str).length()) { //���� ���� �л� �̸��� ���̰� ���ݱ��� �ô� �л��� �̸� �߿� ���� ª�ٸ�, ���� ������ �ִ� minLength���� ª�ٸ�
				minLength = student.get(str).length(); //minLength�� ���� �л� �̸��� ���̷� ����
				minID = str; //minID�� ���� �л��� �й� ����
			}
			
			System.out.println(str + "\t" + student.get(str)); //�л��� ���� ����ϱ�
		}
		
		System.out.println("\n��ü �л���:"+student.size()); //size()�޼ҵ带 �̿��ؼ� �� �� ���� map�� �ִ��� Ȯ��
		System.out.println("<���� �� �̸��� ���� �л�>"); //������ Ȯ���� �̸��� ���̰� ���� �� �л��� ���� ���
		System.out.println("ID:" + maxID + " Name:" + student.get(maxID) + " ����:" + maxLength);
		System.out.println("<���� ª�� �̸��� ���� �л�>"); //������ Ȯ���� �̸��� ���̰� ���� ª�� �л��� ���� ���
		System.out.println("ID:" + minID + " Name:" + student.get(minID) + " ����:" + minLength);
	}

}
