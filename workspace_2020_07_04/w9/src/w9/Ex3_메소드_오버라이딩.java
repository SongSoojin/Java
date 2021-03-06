package w9;

/*
 * 메소드 오버라이딩(Method Overriding)
 * 
 * 서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
 * 슈퍼 클래스의 메소드 무력화
 * “메소드 무시하기”로 번역되기도 함
 * 
 */

public class Ex3_메소드_오버라이딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B b = new B();
		b.f(); //정적 바인딩 : 컴파일시 함수의 결정
		b.d();

		System.out.println();
		
		A a = new B(); //업캐스팅
		a.f(); // 동적 바인딩 : 실행시 함수가 결정 ( A의 f()를 호출해도, 오버라이딩된 메소드, B의 f()가 실행됨 ) 
		a.d();
	}

}


class A {
	void f() {
		System.out.println("A의 f() 호출");
	}
	void d() {
		System.out.println("A의 d() 호출");
	}
	
}
class B extends A {
	void f() { 	// 클래스 A의 f()를 오버라이딩
		System.out.println("B의 f() 호출");
	}
}
