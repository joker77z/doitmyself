class print2 {
	public String delimiter = "";
	public print2(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("test");
	}
}

public class method4 {
	public static void main(String[] args) {
		print2 t1 = new print2("*");
		t1.b();
	}
}