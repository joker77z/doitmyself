

// use class + instance
// ver : 생성자 사용!
// ex) 인스턴스를 지정하고 사용할 때 반드시 입력해줘야 하는 값을 지정할 때
// 그때 생성자를 사용한다.

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
