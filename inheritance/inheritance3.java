//�����ε� (�����ϴ�.)
class A2 {
	public static int sum(int a, int b) {
		return a+b;
	}
	// �����ε��ߴ�.
	public static int sum(int a, int b, int c) { 
		return a+b+c;
	}
}

class B2 extends A2 {
	public static int del(int a, int b) {
		return a-b;
	}
	// �翬�� �����ε��� ����ٰ� �ص� �������.
	/*
	 * public static int sum(int a, int b, int c) { return a+b+c; }
	 */
}

public class inheritance3 {

	public static void main(String[] args) {
		System.out.println(B2.sum(1,2)); // A�� ��ӹ��� B�� ���
		System.out.println(B2.del(2,1)); // A�� ��ӹ��� B�� ���
		System.out.println(B2.sum(2,1,3)); // �����ε��� ���
	}

}
