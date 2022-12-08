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
	JTextField t1 = new JTextField(7); //김씨 사람의 수를 입력받는 textfield
	JTextField t2 = new JTextField(7); //이씨 사람의 수를 입력받는 textfield
	JTextField t3 = new JTextField(7); //박씨 사람의 수를 입력받는 textfield
	JTextField t4 = new JTextField(7); //기타 성씨를 가진 사람의 수를 입력받는 textfield
	PaintPanel pp = new PaintPanel();
	
	int initial = 0; //initial 변수를 통해 그림을 그리는 상황을 통제
	int a, b, c, d, sum;
	
	PieChart() {
		Toolkit tk = getToolkit();
		Dimension d = tk.getScreenSize();
		int screenHeight = d.height;
		int screenWidth = d.width;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocation(screenWidth/2-this.getWidth()/2, screenHeight/2-this.getHeight()/2);
		setTitle("Pie Chart of Student names - 조승현");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//textfield를 붙일 panel, p1 선언
		JPanel p1 = new JPanel();
		
		JButton btn = new JButton("Graph");
		
		//panel의 형태를 flowlayout으로 설정
		p1.setLayout(new FlowLayout());
		
		p1.add(new JLabel("Kim"));
		p1.add(t1);
		p1.add(new JLabel("Lee"));
		p1.add(t2);
		p1.add(new JLabel("Park"));
		p1.add(t3);
		p1.add(new JLabel("Etc"));
		p1.add(t4);
		p1.add(btn); //사용자가 입력을 마치고 그래프가 나오도록 누를 버튼 btn
		btn.addActionListener(this); //이벤트 핸들링

		add(pp, "Center"); //그림이 그려질 pp 패널을 가운데에 배치
		add(p1, "South");
		setVisible(true);
	}
	
	//파이 차트를 그리는 PaintPanel 클래스
	class PaintPanel extends JPanel{
        public void paint(Graphics g) {
        	//initial 값이 0이면 아무것도 그리지 않은 초기의 상태를 의미
        	//initial 값이 -1이면 사용자가 text field에 0 혹은 자연수가 아닌 숫자를 입력했다는 상태를 의미
        	//그 두 상태가 아니면 pie chart를 그려야 함
        	//pie chart의 각도 조절은 getAngle 함수를 통해 처리
        	if (initial != -1 && initial != 0) {
        		//김씨 성을 가진 사람을 나타내는 부분
            	g.setColor(Color.orange); 
            	g.fillArc(180, 130, 120, 120, 0, getAngle(a, sum));
            	g.drawString("ORANGE: KIMs(" + a + ")", 330, 150);
            	//이씨 성을 가진 사람을 나타내는 부분
            	g.setColor(Color.red);
            	g.fillArc(180, 130, 120, 120, getAngle(a, sum), getAngle(b, sum));
            	g.drawString("RED: LEEs(" + b + ")", 330, 170);
            	//박씨 성을 가진 사람을 나타내는 부분
            	g.setColor(Color.blue);
            	g.fillArc(180, 130, 120, 120, getAngle(a+b, sum), getAngle(c, sum));
            	g.drawString("Total number of students is " + sum + ".", 150, 300);
            	g.drawString("BLUE: PARKs(" + c + ")", 330, 190);
            	//기타 성씨를 가진 사람을 나타내는 부분
            	g.setColor(Color.green);
            	g.fillArc(180, 130, 120, 120, getAngle(a+b+c, sum), getAngle(d, sum));
            	g.drawString("GREEN: ETC.(" + d + ")", 330, 210);
        	} else if (initial == -1){
        		g.setColor(Color.BLACK);
        		g.drawString("Number should be 0~100", 150, 300);
        	} else if (initial == 0) { //초기의 상태를 의미
        		g.setColor(Color.BLUE);
        		g.drawString("Input numbers of names(0~100).", 150, 300);
        	}
        }
     }
	
	//그래프의 각도를 계산하는 getAngle 메소드
	public int getAngle(int num, int sum) {
		//비율을 계산하고 360을 곱해 부채꼴이 되도록 함
		return (int)Math.round((double)num/(double)sum*360);
	}
	
	//이벤트 핸들링 부분
	@Override
	public void actionPerformed(ActionEvent e){
		try {
			//각 변수 (a, b, c, d)는 Graph 버튼이 눌렸을 때 각 textField에 쓰여있는 숫자를 정수론 변환하여 저장
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = Integer.parseInt(t3.getText());
			d = Integer.parseInt(t4.getText());
			//만약 하나의 숫자라도 0보다 작거나 100보다 크면 예외를 발생시킴
			if(a<0 | a>100 | b<0 | b>100 | c<0 | c>100 | d<0 | d>100) {
				throw new NumberFormatException();
			}
			//그런 상황이 아니라면 = 정상적인 숫자가 입력되었다면 initial을 1로 설정하여 pie chart를 그릴 수 있도록 설정
			initial = 1;
			sum = a + b + c + d;
			repaint();
		} catch (NumberFormatException nfe) { //위에서 처리한 예외가 발생하면 모든 textField를 비우고 initial도 -1로 설정
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			initial = -1;
			repaint();
		}
	}
	
}

public class HW2_4_조승현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("전공: 사이버보안");
		System.out.println("학번: 2171081");
		System.out.println("성명: 조승현");
		System.out.println("============");
		
		new PieChart();
	}

}
