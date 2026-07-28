package Ex7;

interface Vehicle{
	void run(); //달리는 기능을 의미하는 run 추상메소드
}

class Bus implements Vehicle{

	@Override
	public void run() { System.out.println("버스가 달립니다."); }
}

class Taxi implements Vehicle{

	@Override
	public void run() { System.out.println("택시가 달립니다.");	}
	
}

//운전자 설계도(클래스)
class driver{
	
	//운전하는 동작을 메소드로 표현
	void drive(Vehicle vehicle) { //<- new Bus(); 또는 new Taxi(); 두개 중 하나의 자식객체를 매개변수로 전달 받음
		
	//	new Bus().run();
		vehicle.run();
		
	}
}


public class CarExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		driver.drive(new(Bus));

	}

}
