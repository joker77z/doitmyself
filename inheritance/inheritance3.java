//오버로딩 (과적하다.)
class A2 {
	public static int sum(int a, int b) {
		return a+b;
	}
	// 오버로딩했다.
	public static int sum(int a, int b, int c) { 
		return a+b+c;
	}
}

class B2 extends A2 {
	public static int del(int a, int b) {
		return a-b;
	}
	// 당연히 오버로딩을 여기다가 해도 상관없다.
	/*
	 * public static int sum(int a, int b, int c) { return a+b+c; }
	 */
}

public class inheritance3 {

	public static void main(String[] args) {
		System.out.println(B2.sum(1,2)); // A를 상속받은 B를 사용
		System.out.println(B2.del(2,1)); // A를 상속받은 B를 사용
		System.out.println(B2.sum(2,1,3)); // 오버로딩을 사용
	}

}
