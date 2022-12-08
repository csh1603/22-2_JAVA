import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PieChart extends JFrame implements ActionListener {
	JTextField t1 = new JTextField(7); //�达 ����� ���� �Է¹޴� textfield
	JTextField t2 = new JTextField(7); //�̾� ����� ���� �Է¹޴� textfield
	JTextField t3 = new JTextField(7); //�ھ� ����� ���� �Է¹޴� textfield
	JTextField t4 = new JTextField(7); //��Ÿ ������ ���� ����� ���� �Է¹޴� textfield
	PaintPanel pp = new PaintPanel();
	
	int initial = 0; //initial ������ ���� �׸��� �׸��� ��Ȳ�� ����
	int a, b, c, d, sum;
	
	PieChart() {
		Toolkit tk = getToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2);
		setTitle("Pie Chart of Student names - ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//textfield�� ���� panel, p1 ����
		JPanel p1 = new JPanel();
		
		JButton btn = new JButton("Graph");
		
		//panel�� ���¸� flowlayout���� ����
		p1.setLayout(new FlowLayout());
		
		p1.add(new JLabel("Kim"));
		p1.add(t1);
		p1.add(new JLabel("Lee"));
		p1.add(t2);
		p1.add(new JLabel("Park"));
		p1.add(t3);
		p1.add(new JLabel("Etc"));
		p1.add(t4);
		p1.add(btn); //����ڰ� �Է��� ��ġ�� �׷����� �������� ���� ��ư btn
		btn.addActionListener(this); //�̺�Ʈ �ڵ鸵

		add(pp, "Center"); //�׸��� �׷��� pp �г��� ����� ��ġ
		add(p1, "South");
		setVisible(true);
	}
	
	//���� ��Ʈ�� �׸��� PaintPanel Ŭ����
	class PaintPanel extends JPanel{
        public void paint(Graphics g) {
        	//initial ���� 0�̸� �ƹ��͵� �׸��� ���� �ʱ��� ���¸� �ǹ�
        	//initial ���� -1�̸� ����ڰ� text field�� 0 Ȥ�� �ڿ����� �ƴ� ���ڸ� �Է��ߴٴ� ���¸� �ǹ�
        	//�� �� ���°� �ƴϸ� pie chart�� �׷��� ��
        	//pie chart�� ���� ������ getAngle �Լ��� ���� ó��
        	if (initial != -1 && initial != 0) {
        		//�达 ���� ���� ����� ��Ÿ���� �κ�
            	g.setColor(Color.orange); 
            	g.fillArc(180, 130, 120, 120, 0, getAngle(a, sum));
            	g.drawString("ORANGE: KIMs(" + a + ")", 330, 150);
            	//�̾� ���� ���� ����� ��Ÿ���� �κ�
            	g.setColor(Color.red);
            	g.fillArc(180, 130, 120, 120, getAngle(a, sum), getAngle(b, sum));
            	g.drawString("RED: LEEs(" + b + ")", 330, 170);
            	//�ھ� ���� ���� ����� ��Ÿ���� �κ�
            	g.setColor(Color.blue);
            	g.fillArc(180, 130, 120, 120, getAngle(a+b, sum), getAngle(c, sum));
            	g.drawString("Total number of students is " + sum + ".", 150, 300);
            	g.drawString("BLUE: PARKs(" + c + ")", 330, 190);
            	//��Ÿ ������ ���� ����� ��Ÿ���� �κ�
            	g.setColor(Color.green);
            	g.fillArc(180, 130, 120, 120, getAngle(a+b+c, sum), getAngle(d, sum));
            	g.drawString("GREEN: ETC.(" + d + ")", 330, 210);
        	} else if (initial == -1){
        		g.setColor(Color.BLACK);
        		g.drawString("Number should be 0~100", 150, 300);
        	} else if (initial == 0) { //�ʱ��� ���¸� �ǹ�
        		g.setColor(Color.BLUE);
        		g.drawString("Input numbers of names(0~100).", 150, 300);
        	}
        }
     }
	
	//�׷����� ������ ����ϴ� getAngle �޼ҵ�
	public int getAngle(int num, int sum) {
		//������ ����ϰ� 360�� ���� ��ä���� �ǵ��� ��
		return (int)Math.round((double)num/(double)sum*360);
	}
	
	//�̺�Ʈ �ڵ鸵 �κ�
	@Override
	public void actionPerformed(ActionEvent e){
		try {
			//�� ���� (a, b, c, d)�� Graph ��ư�� ������ �� �� textField�� �����ִ� ���ڸ� ������ ��ȯ�Ͽ� ����
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = Integer.parseInt(t3.getText());
			d = Integer.parseInt(t4.getText());
			//���� �ϳ��� ���ڶ� 0���� �۰ų� 100���� ũ�� ���ܸ� �߻���Ŵ
			if(a<0 | a>100 | b<0 | b>100 | c<0 | c>100 | d<0 | d>100) {
				throw new NumberFormatException();
			}
			//�׷� ��Ȳ�� �ƴ϶�� = �������� ���ڰ� �ԷµǾ��ٸ� initial�� 1�� �����Ͽ� pie chart�� �׸� �� �ֵ��� ����
			initial = 1;
			sum = a + b + c + d;
			repaint();
		} catch (NumberFormatException nfe) { //������ ó���� ���ܰ� �߻��ϸ� ��� textField�� ���� initial�� -1�� ����
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			initial = -1;
			repaint();
		}
	}
	
}

public class HW2_4_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		new PieChart();
	}

}
