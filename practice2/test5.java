

// use class + instance
// ver : ������ ���!
// ex) �ν��Ͻ��� �����ϰ� ����� �� �ݵ�� �Է������ �ϴ� ���� ������ ��
// �׶� �����ڸ� ����Ѵ�.

class print3 {
	public String delimiter="";
	public print3(String delimiter) {
		this.delimiter = delimiter;
	}
	public void a() {
		System.out.println(delimiter);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}

public class test5 {
	public static void main(String[] args) {
		print3 p1 = new print3("*");
		p1.a();
		
		print3 p2 = new print3("&");
		p2.a();
	}
	
}
