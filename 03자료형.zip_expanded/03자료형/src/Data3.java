
//예제 : 정수를 저장하는 변수 메모리 만들기

public class Data3 {

	public static void main(String[] args) {
		
		//a=1;  //error 이유 : 선언된 변수가 없어서 1을 저장할 수 없다.
		
		//결론 : 정수 1을 컴퓨터 메모리에 저장하기 위해서 반드시 먼저 변수선언을 해야 한다.
		
		/*
		 	변수 선언 문법
		 		
		 		자료형 변수명;
		 */
		  //4바이트 크기의 정수 하나를 저장할 자료형 int로 a변수 선언
		   int a; 
		   
		   a=1;
		   
		   System.out.println(a);//1
		   
		   a=2;
		   System.out.println(a);//2
		
		
	}

}
