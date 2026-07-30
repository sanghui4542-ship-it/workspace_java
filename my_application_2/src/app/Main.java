package app;


import pack1.A; //my_module_a 모듈 프로젝트에서 pack1패키지에 만들어 놓은 class A 불러오기
import pack2.B; //my_module_b 모듈 프로젝트에서 pack2키지지에 만들어 놓은 class B 불러오기

import pack3.C; //my_module_c 모듈 프로젝트에서 pack3패키지에 만들어 놓은 class C 불러오기
import pack4.D; //my_module_d 모듈 프로젝트에서 pack4키지지에 만들어 놓은 class D 불러오기

public class Main {
	
	public static void main(String[] args) {
		
		//my_module_a 모듈 프로젝트 내부의 pack1, pack2패키지에 만들어 놓은 A,B 클래스를 객체 생성 가능
		A a = new A();  a.method();
		B b = new B();  b.method();

		C c = new C();  c.method();
		D d = new D();  d.method();
		
		
	}

}
