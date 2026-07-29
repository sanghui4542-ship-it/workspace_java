package sec07.exam01;
/*
 
 익명 클래스?
 - 이름이 없는 클래스
 
 익명 객체?
 - 이름이 없는 클래스를 이용해서 생성한 이름이 없는 객체
 
 익명 객체 종류
 1. 익명 자식 객체 - 클래스를 상속받아서 만든 이름이 없는 자식 객체.
 2. 익명 구현 객체 - 인터페이스를 구현받아 만든 이름이 없는 자식 객체.
 
 익명 자식 객체
 - 부모클래스를 상속받아서 다음과 같은 작성 문법으로 만들 수(생성할 수)있다.
 
 	new 상속 받은 
 

*/

class A { //부모 클래스	
	int num;
	void print() {
		System.out.println("출력");
	}
	
}

public class CarExample {
	public static void main(String[] args) {
		
		new A() {

			@Override
			void print() {
				System.out.println("이름이 없는 익명자식구현객체의 메소드이다");
			}			
		};
		
	}

}
