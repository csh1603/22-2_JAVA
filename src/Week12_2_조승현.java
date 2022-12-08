import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//ȭ�鿡 ����� JFrame, CarFrame ����, ��ư�� ������ �̺�Ʈ�� ó���� �� -> ActionListener ����
class CarFrame extends JFrame implements ActionListener {

   Color color = new Color(255, 0, 0); //�ʱ� ���� ���� ���������� ����, ���� color ������ ���� ���� ������
   JRadioButton RB1 = new JRadioButton("RED"); //�� �ؿ� ������, ���� �ش��ϴ� ������ư RB1�� RED�� �ǹ�
   JRadioButton RB2 = new JRadioButton("GREEN"); //������ư RB2�� GREEN�� �ǹ�
   JRadioButton RB3 = new JRadioButton("BLUE"); //������ư RB3�� BLUE�� �ǹ�
   JButton btn = new JButton("Paint"); //����ڰ� �̺�Ʈ�� �߻���ų ��ư btn ����
   
   public CarFrame() {
      this.setTitle("MyCar - ������"); //JFrame�� �̸� ����
      this.setSize(500, 350); //JFrame�� ũ�� ����
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      Toolkit tk = getToolkit(); //toolkit���� frame�� ȭ�� �߾ӿ� ��ġ�ϵ��� ����
      Dimension d = tk.getScreenSize();
      int screenHeight = d.height;
      int screenWidth = d.width;
      this.setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2);
      PaintPanel pp = new PaintPanel(); //�ڵ����� �׸� panel PaintPanel ����
      add(pp, "Center"); //pp �г��� BorderLayout�� ����� ��ġ
      JPanel bp = new JPanel(new FlowLayout()); //��ư�� �ø� �г� bp ����, ��ư�� FlowLayout���� ����
      bp.add(RB1); //bp �гο� RB1 ���̱�
      bp.add(RB2); //bp �гο� RB2 ���̱�
      bp.add(RB3); //bp �гο� RB3 ���̱�
      //������ư���� ���� -> 3�� �߿� �ϳ��� ���� ����
      ButtonGroup bg = new ButtonGroup();
      bg.add(RB1);
      bg.add(RB2);
      bg.add(RB3);
      bp.add(btn); //bp �гο� btn ���̱�
      btn.addActionListener(this); //�̺�Ʈ�� ������ listener ����
      add(bp, "South"); //��ư�� ���� bp �г��� BorderLayout�� south�� ��ġ
      this.setVisible(true);
   }
   
   class PaintPanel extends JPanel {
      public void paint(Graphics g) {
    	  //�ʱ⿡�� ������, ���Ŀ��� ����ڰ� ��ư�� ���� ���� ����� �Ʒ��� �׸��� �׸�
    	  g.setColor(color);
    	  g.fillRect(170, 50, 140, 60);
    	  g.fillRect(100, 110, 280, 100);
    	  //lightGray�� ���� �׸�
    	  g.setColor(Color.lightGray);
    	  g.fillOval(120, 180, 80, 80);
    	  g.fillOval(270, 180, 80, 80);
    	  //black���� ���� �׸�
    	  g.setColor(Color.black);
    	  g.drawArc(260, 70, 40, 50, 0, 180);
    	  g.drawArc(260, 71, 40, 50, 0, 180);
    	  g.drawArc(260, 72, 40, 50, 0, 180);
      }
   }
   //ActionListener implement �����Ƿ� �޼ҵ� �������̵�
   @Override
   public void actionPerformed(ActionEvent e) {
         if(RB1.isSelected()) { //RB1�� ���õ� ���·� btn�� ���ȴٸ� -> ���� ���������� ����
            color = new Color(255, 0, 0);
         } else if (RB2.isSelected()) { //RB2�� ���õ� ���·� btn�� ���ȴٸ� -> ���� �ʷϻ����� ����
            color = new Color(0, 255, 0);
         } else if (RB3.isSelected()) { //RB3�� ���õ� ���·� btn�� ���ȴٸ� -> ���� �Ķ������� ����
            color = new Color(0, 0, 255);
         }
      repaint();
   }
}

public class Week12_2_������ {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   System.out.println("============");
	   System.out.println("����: ���̹�����");
	   System.out.println("�й�: 2171081");
	   System.out.println("����: ������");
	   System.out.println("============");
	   
	   new CarFrame();
   }

}