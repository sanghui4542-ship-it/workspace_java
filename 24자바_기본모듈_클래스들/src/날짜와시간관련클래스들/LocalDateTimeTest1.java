package 날짜와시간관련클래스들;
/* 

LocalDateTime클래스
- java.time패키지에 만들어져 있는 클래스
- 제공되는 메소드로 날짜와 시간을 조작할수 있는 클래스

제공되는 메소드들

minusYears(long)    -    년 뺴기
minusMonths(long)   -    월 빼기
minusDays(long)   -    일 빼기
minusWeek(long)   -    주 빼기
minusHours(long)  -    시간 빼기
minusMinutes(long)  -  분 빼기
minusSeconds(long)  -  초 빼기
minusNanos(long)  -  나노초 빼기

plusYears(long)   -    년 더하기
plusMonths(long)  -    월 더하기
plusDays(long)  -      일 더하기
plusWeek(long)  -      주 더하기
plusHours(long)  -    시간 더하기
plusMinutes(long)  -  분 더하기
plusSeconds(long)  -  초 더하기


LocalDateTime 클래스를 이용해서 현재 컴퓨터의 날짜와 시간정보가 저장된 객체를 얻는 방법

		LocalDateTime now = LoCalDateTime.now();


*/
//예제.  현재 컴퓨터  시간에서   년, 월, 일을 연산하는 방법

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest1 {
	public static void main(String[] args) {
		
		//순서1. LocalDateTime클래스의 객체를 얻는 방법
		LocalDateTime   localDateTime = LocalDateTime.now();
		
		//우리가 원하는 현재 날짜와 시간 정보가 아니다.
		//2026-08-04T17:50:20.511916800
		System.out.println( localDateTime );
		
		//순서2. 
		//참고. DateTimeFormatter클래스는 날짜와 시간을 주어진 문자열 패턴으로 변환할때 사용 하는 클래스로,
		//     LocalDateTime객체의 format()메소드를 호출할때 매개값으로 제공하면 문자열 패턴과 동일한 문자열을 반환받아 얻을수 있음
		DateTimeFormatter  dtf;
		
		

	}

}







