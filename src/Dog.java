//���̹��������� 2171081 ������
public class Dog extends Pet{ //Pet�̶�� Ŭ������ ��ӹ޵��� ��
	private boolean bossterShot; //Dog Ŭ���������� ����ϴ� boolean Ÿ�� ���� bossterShot ���� (�������� ���������� �ߴ��� �����ϴ� ����)
	
	public void writeOutput() {
		super.writeOutput(); //Pet Ŭ���� ���� �����ϴ� writeOutput �Լ� ȣ��
		System.out.print("BoosterShot: ");
		if (getBossterShot() == true) //�Է¹��� ���������� ���ΰ� ���̶��
			System.out.println("O"); //O�� ���
		else //�Է¹��� ���������� ���ΰ� �����̶��
			System.out.println("X"); //X ���
	}
	public void setBossterShot(boolean bossterShot) { //����ڰ� �Է��� ���������� ���θ� �����ϴ� �޼ҵ�
		this.bossterShot = bossterShot;
	}
	public boolean getBossterShot() { //�������� ���θ� ��ȯ�ϴ� �޼ҵ�
		return bossterShot;
	}
	public void move() { //Pet�� Ŭ���� ���� �����ϴ� move �޼ҵ� �������̵�
		System.out.println(getName() + " walks and runs");
	}
}
