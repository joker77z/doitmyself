

// just use class 

class print {
	public static String delimiter="";
	public static void a() {
		System.out.println(delimiter);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}

public class test3 {
	public static void main(String[] args) {
		print.delimiter = "*";
		print.a();
	}
	
}
