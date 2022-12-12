class OuterClass {
	int x = 200;
	InnerClass IC = new InnerClass();
	
	void methodOC() {
		//System.out.println("y from innerClass" + y);
		System.out.println("y of InnerClass from OuterClass = " + IC.y);
	}
	class InnerClass {
		int y = 400;
		void methodIC() {
			System.out.println("x of OuterClass from InnerClass = " + x);
		}
	}
}

public class Week11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		System.out.println("oc.x = " + oc.x); //200
		System.out.println("ic.y = " + ic.y); //400
		/*System.out.println("ic.x = " + ic.x); //error, innerclass ���θ� ��
		System.out.println("oc.y = " + oc.y); //error*/
		oc.methodOC(); //error, method ��ü���� ����
		ic.methodIC(); //�̷����ϸ� ic���� y�� ����
		System.out.println("oc.ic.y = " + oc.IC.y); //possible
		oc.IC.methodIC();
	}

}
