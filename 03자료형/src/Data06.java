
//예제 : 실수 저장하기

public class Data06 {

	public static void main(String[] args) {
		//int a = 23.7; //[컴파일 에러!]
		//에러 이유 : int는 정수형 변수이므로 소수점이 있는 실수값을 담을 수 없습니다.
		
		//float b = 23.7d; //[컴파일 에러!]
		//에러 이유 : 자바는 실수 값 '23.7'을 기본적으로 '8byte 크기의 double형'으로 인식합니다.
		//따라서 8byte짜리 실수값을 4byte짜리 float 변수메모리에 억지로 넣으려 하니 넘쳐서 에러가 발생합니다.
		
		//해결책 1 : 애초에 넉넉한 8byte 크기인 double형 변수를 사용합니다.
		//double c = 23.7d; (d는 생략 가능)
		double c = 23.7d; 
		System.out.println("double형 출력 : " + c);
		
		//해결책 2 : 23.7이 4byte짜리 float 값이라고 컴퓨터에게 명확하게 알려줍니다.
		//숫자 뒤에 접미사 'f'나 'F'를 붙이면 됩니다.
		float d = 23.7f;
		System.out.println("float형 출력 : " + d);
	}

}
