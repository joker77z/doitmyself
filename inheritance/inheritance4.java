//�������̵� ���׷��̵�!
//(inheritance2 �� ���׷��̵�)

//������ �������̵��� �ϸ鼭 �����ڵ尡 �Ϻ� �ְ� �Ǹ� �ߺ��ڵ尡 �߻��ϰ� �ȴ�.
//�̰��� �ǹٸ� �ڵ��� �ƴϱ� ������ �θ� Ŭ������ �ڵ带 �״�� �������鼭
//���� �߰��ϰ� ���� ���븸 �߰��ϴ� ����̴�.

//�ٽ� : super �θ� Ŭ������ ����Ų��. �������̵��� �����ض�.

class A3 {
	public int sum(int a, int b) {
		return a+b;
	}
}

class B3 extends A3 {
	public int sum(int a, int b) {
		System.out.println("test"); // STEP2 : "test"�� ȭ�鿡 ����Ѵ�.
		return super.sum(a, b); // STEP3 : �θ�Ŭ���� A3�� sum�� �״�� �����´�.
	}
}

public class inheritance4 {

	public static void main(String[] args) {
		B3 r = new B3();
		System.out.println(r.sum(1,2)); //STEP1 : B3�� sum�� ã�ư��� 1, 2�� �����Ѵ�.
	}

}
