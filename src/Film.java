//���̹��������� 2171081 ������
public class Film extends Production{ //Production�̶�� Ŭ������ ��ӹ޵��� ��
	private int boxOfficeGross; //private ������ ��ȭ�� ������ �����Ͽ� �ܺο��� �������� ���ϰ� ��
	
	public int getBoxOfficeGross() { //��ȭ�� ������ ��ȯ�ϴ� �޼ҵ�
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) { //����ڰ� �Է��� ��ȭ�� ������ �����ϴ� �޼ҵ�
		this.boxOfficeGross = boxOfficeGross;
	}
	public void display() { //�޼ҵ� �������̵� -> ���� Ŭ�������� ���� �Ǿ��� display �Լ� ���
		super.display(); //Production Ŭ���� ���� �����ϴ� display �Լ� ȣ��
		System.out.println("boxOfficeGross:"+boxOfficeGross);
	}
}
