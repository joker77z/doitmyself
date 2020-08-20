//오버로딩 업그레이드!
//(inheritance3을 업그레이드)

//this는 자기 클래스 자신! 오버로딩을 떠올려라.

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
		System.out.println(r.sum(1,2)); // A를 상속받은 B를 사용
		System.out.println(r.sum(2,1,3)); // 오버로딩을 사용
	}

}
