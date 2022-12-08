import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//ȭ�鿡 ����� JFrame, RunFrame ����, ���콺 �̺�Ʈ�� ó���� �� -> MouseListener ����
class RunFrame extends JFrame implements MouseListener {
	private JButton button; //�����ٴ� ��ư button ����
	public RunFrame() {
		this.setSize(300, 300);
		this.setResizable(false); //������ ������ �Ұ����ϰ� ����
		this.setTitle("�� ��ƺ�~��! - ������");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //ȭ���� ������ ��� ���α׷��� �������� ����
		JPanel panel = new JPanel(); //��ư�� �ø� Panel ����
		button = new JButton("Click!"); //��ư�� ������ "Click!"
		button.addMouseListener(this); //�̺�Ʈ�� ������ listener ����
		panel.add(button); //panel�� button �ø���
		this.add(panel); //Frame�� panel �ø���
		this.setVisible(true);
	}
	//implement �߱� ������ ��� �޼ҵ� �������̵� �ؾ���
	//����� �̺�Ʈ�� mouseClicked & mouseEnetered
	@Override
	public void mouseClicked(MouseEvent e) { //��ư�� ������ �� ����� �޼ҵ�
		System.out.println("��,,,�����٤Ф�");
		int x = (int)(Math.random()*240); //0~240 ���� ������ �� ����
		int y = (int)(Math.random()*240);
		button.setLocation(x, y); //������ ������ ������ x, y ��ǥ�� button �̵�
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) { //��ư ���� ���콺�� ���� �� ����Ǵ� �޼ҵ�
			int x = (int)(Math.random()*240);
			int y = (int)(Math.random()*240);
			button.setLocation(x, y); //button�� ��ġ�� ������ ������ ������ ��ǥ x, y�� �̵�
			System.out.println("x=" + x + "\ty=" + y);
	}
	@Override
	public void mouseExited(MouseEvent e) {}
}

public class Week12_1_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		new RunFrame();
	}

}
