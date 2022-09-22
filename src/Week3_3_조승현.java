import java.util.Scanner;

class MyFile {
	private String title;
	private int page;
	
	public void setTitle(String title) {
		this.title = title; //4��° �ٿ� �ִ� ���� ���� title�� �Է¹��� title �� ����
	}
	
	public String getTitle() {
		return getTitle();
	}
	
	public void setPage(int page) {
		this.page = page; //5��° �ٿ� �ִ� ���� ���� page�� �Է¹��� page �� ����
	}
	
	public int getPage() {
		return page;
	}
	
	//MyFile�̶�� ������Ÿ���� mf��� ��ü�� ���ڷ� �޾� �Լ� ó��
	public void fileCopy(MyFile mf) {
		mf.title = title; 
		mf.page = page;
	}
	
	public void fileInfo() {
		System.out.println("��������:" + title); //��ü �ȿ� �����ϴ� �������� ���
		System.out.println("������:" + page); //���� �ȿ� �����ϴ� ������ ���� ���
	}
}

public class Week3_3_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 2171081");
		System.out.println("����: ������");
		System.out.println("============");
		
		Scanner kbd = new Scanner(System.in); //����ڿ��� �Է��� �ޱ� ���� scanner Ŭ���� ����
		String title;
		int page;
		MyFile fOld = new MyFile(); //fOld��� ��ü�� MyFile Ŭ������ ����
		MyFile fNew = new MyFile(); //fNew��� ��ü�� MyFile Ŭ������ ����
		System.out.println("--File�����Է� (����,��������)--");
		fOld.setTitle(kbd.nextLine());
		fOld.setPage(kbd.nextInt());
		fOld.fileCopy(fNew);
		System.out.println("<���� File>");
		fOld.fileInfo(); //fOld ��ü �ȿ� �����ϴ� fileInfo() �Լ� ��� ����
		System.out.println("<����� File>");
		fNew.fileInfo();
	}

}
