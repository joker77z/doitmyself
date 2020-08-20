class calculator {
	int a, b;
	calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int sum() {
		return this.a+b;
	}
}

class calculator2 extends calculator {
	calculator2(int a, int b) {
		super(a, b);
	}
	public int minus() {
		return this.a-b;
	}
}


public class inheritance6 {
	public static void main(String[] args) {
		calculator c1 = new calculator(2, 1);		
		calculator2 c2 = new calculator2(2, 1);
		System.out.println(c1.sum());
		System.out.println(c2.minus());
	}

}
