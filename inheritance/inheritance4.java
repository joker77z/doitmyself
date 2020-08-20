//오버라이딩 업그레이드!
//(inheritance2 를 업그레이드)

//기존에 오버라이딩을 하면서 기존코드가 일부 있게 되면 중복코드가 발생하게 된다.
//이것은 옳바른 코딩이 아니기 때문에 부모 클래스의 코드를 그대로 가져오면서
//내가 추가하고 싶은 내용만 추가하는 방법이다.

//핵심 : super 부모 클래스를 가르킨다. 오버라이딩을 생각해라.

class A3 {
	public int sum(int a, int b) {
		return a+b;
	}
}

class B3 extends A3 {
	public int sum(int a, int b) {
		System.out.println("test"); // STEP2 : "test"를 화면에 출력한다.
		return super.sum(a, b); // STEP3 : 부모클래스 A3의 sum을 그대로 가져온다.
	}
}

public class inheritance4 {

	public static void main(String[] args) {
		B3 r = new B3();
		System.out.println(r.sum(1,2)); //STEP1 : B3에 sum을 찾아가서 1, 2를 대입한다.
	}

}
