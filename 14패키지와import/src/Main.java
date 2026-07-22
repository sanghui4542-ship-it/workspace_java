
/*
import   <-  다른 패키지에 만들어 놓은 .java파일 내부에 작성된 class를 현재 파일에서 사용하기위해 
			 class 를 불러와 적용하는 예약어.
				 
사용법
     import  패키지명.클래스명;

	     
다른 com.example.utils 패키지에 만들어 놓은 Calculator.java파일 내부의  
Calculator클래스를 사용하기 위해 import 구문을 사용합니다.	     
*/
import  com.example.utils.Calculator;

public class Main {

	public static void main(String[] args) {

		//Calculator 클래스 설계도 하나를 이용해 객체 메모리 생성 해봅시다.  안됨!
		Calculator   calculator = new Calculator();
		
		//두 정수의 합을 반환 받기 위해 add 메소드 사용
		int reuslt = calculator.add(10, 5);

		System.out.println("덤셈 결과 : " + reuslt);
		
	}

}





