//�������̵�
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
		System.out.println(B1.sum(1,2)); // A1�� �ִ� sum�� �д� ���� �ƴ϶�
										// B1�� �ִ� sum�� �д´�! 
										// �̰��� �ٷ� �ö�����.
										// overriding (�������̵�)!
		System.out.println(B1.del(2,1)); // 
	}

}
