//���̹��������� 2171081 ������
public class Production {
	private String title; //���깰�� �̸� ���� ����
	private String director; //���깰�� ���� ���� ����
	private String writer; //���깰�� �۰� ���� ����
	
	public String getTitle() { //Production�� private Ÿ�� ���� title�� ��ȯ�ϴ� �޼ҵ�
		return title;
	}
	public String getDirector() { //Production�� private Ÿ�� ���� director�� ��ȯ�ϴ� �޼ҵ�
		return director;
	}
	public String getWriter() { //Production�� private Ÿ�� ���� writer�� ��ȯ�ϴ� �޼ҵ�
		return writer;
	}
	public void setTitle(String title) { //����ڰ� �Է��� ������ Production�� title�� ����
		this.title = title;
	}
	public void setDirector(String director) { //����ڰ� �Է��� ������ Production�� director�� ����
		this.director = director;
	}
	public void setWriter(String writer) { //����ڰ� �Է��� ������ Production�� writer�� ����
		this.writer = writer;
	}
	public void display() { //Production�� ����, ����, �۰��� ����ϴ� �޼ҵ�
		System.out.println("Title:"+getTitle());
		System.out.println("Director:"+getDirector());
		System.out.println("Writer:"+getWriter());
	}
}
