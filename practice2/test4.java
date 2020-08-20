

// use class + instance
// ver : 생성자 사용 없이

class print2 {
	public String delimiter="";
	public void a() {
		System.out.println(delimiter);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("3");
	}
}

public class test4 {
	public static void main(String[] args) {
		
		print2 p1 = new print2();
		p1.delimiter ="*";
		p1.a();
		
	}
	
}
