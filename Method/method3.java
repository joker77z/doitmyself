class print {
	public String delimiter;
	public void a() {
		System.out.println(delimiter);
		System.out.println("instance");
	}
	public static void b(String delimiter) {
		System.out.println(delimiter);
		System.out.println("no instance");
	}
}

public class method3 {
	public static void main(String[] args) {
		/*
		 * ����Ʈ�� �Ҳ��� class�� �ν��Ͻ��� ����ؼ� �ִ��� main���� ǥ���Ǵ� ������ ª�� �ϸ鼭 Ŭ������ ������ �״�� �������¿��� *,
		 * & �� ������ ����Ʈ �ǵ��� �ڵ�
		 */
		print t1 = new print();
		t1.delimiter="*";
		t1.a();
		
		print t2 = new print();
		t2.delimiter = "**";
		t2.a();
		
		print.b("&");
	}
}