package test2;

public class Car {  //자동차 클래스 정의
	
	//1. 클래스 변수 정의  -  new Car(); 객체 메모리에 포함된 객체변수의 데이터를 저장할 변수 정의 
	String company = "현대자동차"; //자동차 제조사 
	String model;               //자동차 모델명(예: "아반떼", "소나타", "투산하이브리드")
	String color;               //자동차 색상 (예: "검정색", "흰색")
	int    maxSpeed;            //자동차 최고 속도(예: 200,  250)
	
	//2. 생성자 오버로딩  - 여러개의 생성자를 만드는 작업 
	//(1) 자동차 모델명을 전달 받는 생성자 - 매개변수 1개 
	public Car(String model) {
					//"아빤떼"
		//this() 를 사용하여 현재 Car클래스의 다른 생성자 호출! -> Car(String model, String color, int maxSpeed) 생성자 호출
		this(model, "은색", 250);
	}
	
	//(2) 자동차 모델명과 색상을 매개변수로 전달 받는 생성자 - 매개변수 2개 
	public Car(String model, String color) {
					//"소나타"      "검정색"
		
		//this() 를 사용하여 현재 Car클래스의 다른 생성자 호출! -> Car(String model, String color, int maxSpeed) 생성자 호출
		this(model, color, 250);
		
	}
	//(3) 자동차 모델명과 색상 그리고 최고속도를 매개변수로 전달 받는 생성자 - 매개변수 3개
	public Car(String model, String color, int maxSpeed) {
		
	//	this.객체변수명 = 매개변수명;
		this.model   = model;
		this.color   = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	public static void main(String[] args) {
		
			new Car("아반떼");
		/*
				순서1. Car(String model){}    매개변수가 1개인 생성자 호출됨
		
				순서2. this(model, "은색", 250);  다른 생성자 호출 구문을 통해 
				      Car(String model, String color, int maxSpeed){}  매개변수가 3개인 생성자 호출됨 
		
				순서3. Car(String model, String color, int maxSpeed){} 매개변수가 3개인 생성자를 통해
				      new로 생성한 Car객체 메모리의 객체변수 데이터들을 초기화
		
		 		결론 :  model객체변수 ["아반떼"], color객체변수["은색"], maxSpeed객체변수[250]
	    */		
		
			new Car("소나타", "검정색");
		
			new Car("제네시스", "파란색", 300);

	}

}











