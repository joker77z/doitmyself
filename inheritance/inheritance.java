class A {
	public static int sum(int a, int b) {
		return a+b;
	}
}

class B extends A {
	public static int del(int a, int b) {
		return a-b;
	}
}

public class inheritance{

	public static void main(String[] args) {
		System.out.println(B.sum(1,2)); // A�� ��ӹ��� B�� ���
		System.out.println(B.del(2,1)); // A�� ��ӹ��� B�� ���
	}

}