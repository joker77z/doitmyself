class calculator3 {
	int a, b;
	public calculator3(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return a+b;
	}
}

class calculator4 extends calculator3{
	public calculator4(int a, int b) {
		super(a,b);
	}
	public int minus() {
		return this.a-b;
	}
}
public class inheritance61 {
	public static void main(String[] args) {
		calculator3 c1 = new calculator3(1, 2);
		System.out.println(c1.sum());
		
		calculator4 c2 = new calculator4(2, 1);
		System.out.println(c2.sum());
	}
}
