//오버라이딩
class A1 {
	public static int sum(int a, int b) {
		return a+b;
	}
}

class B1 extends A1 {
	public static int sum(int a, int b) {
		return a+b+a;
	}
	public static int del(int a, int b) {
		return a-b;
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		System.out.println(B1.sum(1,2)); // A1에 있는 sum을 읽는 것이 아니라
										// B1에 있는 sum을 읽는다! 
										// 이것이 바로 올라탔다.
										// overriding (오버라이딩)!
		System.out.println(B1.del(2,1)); // 
	}

}
