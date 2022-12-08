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

//화면에 출력할 JFrame, CarFrame 정의, 버튼을 누르는 이벤트를 처리할 것 -> ActionListener 구현
class CarFrame extends JFrame implements ActionListener {

   Color color = new Color(255, 0, 0); //초기 차의 색을 빨간색으로 설정, 이후 color 변수를 통해 색을 정의함
   JRadioButton RB1 = new JRadioButton("RED"); //차 밑에 나오는, 색에 해당하는 라디오버튼 RB1은 RED를 의미
   JRadioButton RB2 = new JRadioButton("GREEN"); //라디오버튼 RB2은 GREEN을 의미
   JRadioButton RB3 = new JRadioButton("BLUE"); //라디오버튼 RB3은 BLUE를 의미
   JButton btn = new JButton("Paint"); //사용자가 이벤트를 발생시킬 버튼 btn 정의
   
   public CarFrame() {
      this.setTitle("MyCar - 조승현"); //JFrame의 이름 정의
      this.setSize(500, 350); //JFrame의 크기 정의
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      Toolkit tk = getToolkit(); //toolkit으로 frame이 화면 중앙에 위치하도록 설정
      Dimension d = tk.getScreenSize();
      int screenHeight = d.height;
      int screenWidth = d.width;
      this.setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2);
      PaintPanel pp = new PaintPanel(); //자동차를 그릴 panel PaintPanel 선언
      add(pp, "Center"); //pp 패널을 BorderLayout의 가운데에 배치
      JPanel bp = new JPanel(new FlowLayout()); //버튼을 올릴 패널 bp 선언, 버튼은 FlowLayout으로 정의
      bp.add(RB1); //bp 패널에 RB1 붙이기
      bp.add(RB2); //bp 패널에 RB2 붙이기
      bp.add(RB3); //bp 패널에 RB3 붙이기
      //라디오버튼으로 묶음 -> 3개 중에 하나만 선택 가능
      ButtonGroup bg = new ButtonGroup();
      bg.add(RB1);
      bg.add(RB2);
      bg.add(RB3);
      bp.add(btn); //bp 패널에 btn 붙이기
      btn.addActionListener(this); //이벤트를 감지할 listener 설정
      add(bp, "South"); //버튼이 놓인 bp 패널은 BorderLayout의 south에 배치
      this.setVisible(true);
   }
   
   class PaintPanel extends JPanel {
      public void paint(Graphics g) {
    	  //초기에는 빨간색, 이후에는 사용자가 버튼을 통해 누른 색깔로 아래의 그림을 그림
    	  g.setColor(color);
    	  g.fillRect(170, 50, 140, 60);
    	  g.fillRect(100, 110, 280, 100);
    	  //lightGray로 바퀴 그림
    	  g.setColor(Color.lightGray);
    	  g.fillOval(120, 180, 80, 80);
    	  g.fillOval(270, 180, 80, 80);
    	  //black으로 눈을 그림
    	  g.setColor(Color.black);
    	  g.drawArc(260, 70, 40, 50, 0, 180);
    	  g.drawArc(260, 71, 40, 50, 0, 180);
    	  g.drawArc(260, 72, 40, 50, 0, 180);
      }
   }
   //ActionListener implement 했으므로 메소드 오버라이딩
   @Override
   public void actionPerformed(ActionEvent e) {
         if(RB1.isSelected()) { //RB1이 선택된 상태로 btn이 눌렸다면 -> 차를 빨간색으로 설정
            color = new Color(255, 0, 0);
         } else if (RB2.isSelected()) { //RB2가 선택된 상태로 btn이 눌렸다면 -> 차를 초록색으로 설정
            color = new Color(0, 255, 0);
         } else if (RB3.isSelected()) { //RB3가 선택된 상태로 btn이 눌렸다면 -> 차를 파란색으로 설정
            color = new Color(0, 0, 255);
         }
      repaint();
   }
}

public class Week12_2_조승현 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   System.out.println("============");
	   System.out.println("전공: 사이버보안");
	   System.out.println("학번: 2171081");
	   System.out.println("성명: 조승현");
	   System.out.println("============");
	   
	   new CarFrame();
   }

}