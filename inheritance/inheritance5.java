//�����ε� ���׷��̵�!
//(inheritance3�� ���׷��̵�)

//this�� �ڱ� Ŭ���� �ڽ�! �����ε��� ���÷���.

class A4 {
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) { 
		return this.sum(a,b)+c;
	}
}


public class inheritance5 {

	public static void main(String[] args) {
		A4 r = new A4();
		System.out.println(r.sum(1,2)); // A�� ��ӹ��� B�� ���
		System.out.println(r.sum(2,1,3)); // �����ε��� ���
	}

}
