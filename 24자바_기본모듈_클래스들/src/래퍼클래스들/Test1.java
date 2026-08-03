package 래퍼클래스들;

//주제 : 박싱과 언박싱 연습

public class Test1 {
	public static void main(String[] args) {
		
		//기본 자료형 int의 데이터 10을 박싱(수동 박싱) 하자.
		
			//박싱방법1. 
			//Integer i = new Integer(10);
				
			//박싱방법2.
			Integer i = Integer.valueOf(10);
			//      i = new Integer(10);
		
		//박싱된 int 데이터 10을 언박싱해서 꺼내와 얻어 출력하자.
		//언박싱 방법. intValue()메소드를 호출해서 기본자료형 10 데이터를 다시 얻습니다. 		
				System.out.println( i.intValue() );

			//기본자료형 double의 데이터 3.14를 박싱(수동 박싱) 하자.
				
				//박싱방법1.
				//Double d = new Double(3.14);
				
				//박싱방법2.
				Double d = Double.valueOf(3.14);
			  //Double d = new Double(3.14);
				
			//언박싱 해서 3.14를 다시 얻어 출력해보기.
				double result = d.doubleValue(); //3.14 반환받아 저장
				System.out.println(result); //3.14 출력
				
				
	}

}
