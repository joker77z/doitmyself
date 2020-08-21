class calculator6 {
	int a, b;
	public calculator6(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a+b;
	}
}

class calculator7 extends calculator6{
	public calculator7(int a, int b) {
		super(a,b);
	}
	public int minus() {
		return this.a-b;
	}
}
public class inheritance62 {
	public static void main(String[] args) {
		calculator6 c1 = new calculator6(1, 2);
		System.out.println(c1.sum());
		
		calculator7 c2 = new calculator7(2, 1);
		System.out.println(c2.minus());
	}
}
