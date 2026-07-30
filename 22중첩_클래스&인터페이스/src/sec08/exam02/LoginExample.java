package sec08.exam02;

//---------------------------------------------------
//바깥(외부)클래스 : LoginController
//실무에서 로그인 요청을 받아 처리하는 자리를 컨트롤러라고 부른다.
//---------------------------------------------------
class LoginController {
	
	public static interface LoginListener{
		
		void onSuccess(String userId);
		
		void onFail(String reason);
				
	}
	//======================================================
	//회원 정보(검사 기준값 정하자)
	//------------------------------------------------------
	//이 예제에서 가입된 회원이 1명이라고 가정하고 상수로 둔다.
	//실무에서는 이 값을 데이터베이스에서 조회한다.
	//======================================================
	private static final String SAVED_ID = "hong";
	private static final String SAVED_PASSWORD = "1234";
	
	//========================================================
	//인스턴스 변수 : 등록된 로그인 결과 처리 객체의 주소를 저장
	//--------------------------------------------------------
	//자료형이 인터페이스(LoginListener)이므로,
	//이 인터페이스를 구현한 어떤 객체든(익명 구현 객체 포함) 저장할 수 있다.
	//========================================================
	private LoginListener loginListener;
	
	//============================================================
	//setter : 로그인 결과 처리 등록
	//============================================================
	public void setLoginListener(LoginListener loginListener) {
		this.loginListener = loginListener;
	}
	
	//=============================================================
	//login() 메소드 : 로그인 요청 처리
	//-------------------------------------------------------------
	//아이디와 비밀번호를 검사하고, 결과에 따라 등록된 익명 구현 객체의 onSuccess() 또는 onFail() 을 실행한다
	//
	public void login(String id, String password) {
		
		System.out.println("[요청] POST / login id =" + id);
		
		//검사1 : 아이디가 가입된 회원의 아이디인지 확인
		if(SAVED_ID.equals(id) == false) {
			
			//실패 이유를 담아 onFail() 실행 -> 실제 내용은 등록된 익명 구현 객체가 결정
			this.loginListener.onFail("존재하지 않는 아이디 입니다.");
			return;// 아래 검사를 하지 않고 즉시 login 메소드 종료			
		}
		//검사2 : 비밀번호가 일치하는지 확인
		//-> 비밀번호를 제대로 입력하지 않았다면?
		if(SAVED_PASSWORD.equals(password) == false ) {
			
			this.loginListener.onFail("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		//두 검사를 모두 통과(DB의 아이디, 비밀번호와 로그인요청시 입력한 아이디,비밀번호가 모두 일치하다면)
		//-> 로그인 입력한 아이디를 담아 onSuccess()메소드 호출할 때 매개변수로 전달
		this.loginListener.onSuccess(id);
		
	}//<=========================================== login 메소드 끝
	
}//<======= LoginController 클래스 끝



public class LoginExample {
	
	public static void main(String[] args) {
		
		//순서1. 로그인 컨트롤러 객체 생성
		LoginController controller = new LoginController();
		
		//--------------------------------------------------------
		//순서2. 로그인 결과 처리를 하는 익명 구현 객체 등록
		//--------------------------------------------------------
		controller.setLoginListener(new LoginController.LoginListener() {
			
			@Override
			public void onSuccess(String userId) {
				//성공 응답 : 실무에서는 메인 페이지로 이동시키는 응답을 보낸다.
				//200 은 "요청 성공"을 뜻하는 HTTP 상태 코드이다.
				System.out.println("[응답 200] 로그인 성공! " + userId + "님, 메인 페이지로 이동합니다.");				
			}
			
			@Override
			public void onFail(String reason) {
				//실패 응답 : 실패 이유를 붙여 로그인 요청하는 페이지를 다시 보여 준다.
				//401은 "인증 실패"를 뜻하는 HTTP 상태 코드이다.
				System.out.println("[응답 401] 로그인 실패 - " + reason + "로그인 요청하는 페이지를 다시 표시합니다.");
				
			}
		});

		//--------------------------------------------
		//순서3. 로그인 요청 3건 처리
		//--------------------------------------------
		
		//로그인 요청1. 아이디와 비밀번호가 모두 DB(상수 2개의 값)와 모두 일치 -> onSuccess() 실행
		controller.login("hong", "1234");
		
		//로그인 요청2. 아이디는 맞지만 비밀번호 틀림 -> onFail() 실행
		controller.login("hong", "9999");
		
		//로그인 요청3. 가입되지 않은 아이디, 비밀번호 맞음 -> onFail() 실행
		controller.login("park", "1234");
		
		
	}

}
























