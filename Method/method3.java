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
		 * 프린트를 할껀데 class와 인스턴스를 사용해서 최대한 main에서 표현되는 문장이 짧게 하면서 클래스의 값들을 그대로 가진상태에서 *,
		 * & 두 가지가 프린트 되도록 코딩
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