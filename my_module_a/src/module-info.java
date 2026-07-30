



//module 모듈명     {    }
module my_module_a {

	//my_module_a 모듈 프로젝트가 포함하고 잇는
	//두개의 pack1와 pack2패키지를
	//외부 프로젝트(외부 응용프로그램)에서 사용할 수 있도록
	//모듈기술자파일(module-info.java)에 다음과 같이 작성합니다.
	
	//작성 방법 설명
	//		  export 키워드는 모듈 프로젝트가 가지고 있는 패키지를 외부 프로젝트에서 사용할 수 있도록
	//		  외부에 노출 시키는 역할을 하는 키워드 입니다.
	
	//작성 방법
	//      exports 노출시킬패키지명;
	exports pack1;
	exports pack2;

}