//���̹��������� 2171081 ������
public class Play extends Production{ //Production�̶�� Ŭ������ ��ӹ޵��� ��
	private int performanceCost; //private ������ ������ ������ �����Ͽ� �ܺο��� �������� ���ϰ� ��
	
	public int getPerformanceCost() { //������ ������ ��ȯ�ϴ� �޼ҵ�
		return performanceCost;
	}
	public void setPerformanceCost(int performanceCost) { //����ڰ� �Է��� ������ ������ �����ϴ� �޼ҵ�
		this.performanceCost = performanceCost;
	}
	public void display() { //�޼ҵ� �������̵� -> ���� Ŭ�������� ���� �Ǿ��� display �Լ� ���
		super.display(); //Production Ŭ���� ���� �����ϴ� display �Լ� ȣ��
		System.out.println("performance cost:"+performanceCost);
	}
}
