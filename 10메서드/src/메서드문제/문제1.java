/*
 문제 1. 두 수의 합 구하기
- 메서드 이름: sum
- 매개변수: int a, int b
- 반환 타입: int
- 설명: 두 개의 정수를 입력받아 그 합을 반환하는 메서드를 작성하세요.
*/


package 메서드문제;

public class 문제1 {

	public static int sum(int a, int b) {
		
		return a + b;

	}

	public static void main(String[] args) {
		
	  System.out.println( sum(5, 8) );
			
	}
	
}

/*
문제 2. 문자열 반복 출력하기
- 메서드 이름: printLoop
- 매개변수: String str, int n
- 반환 타입: void
- 설명: 입력받은 문자열(str)을 n번 반복해서 화면에 출력하는 메서드를 작성하세요. (결과를 반환하지 않고 출력만 합니다.)
*/