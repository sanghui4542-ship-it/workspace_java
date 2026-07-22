package com.myapp.models;

public class MainApp {

	public static void main(String[] args) {
		
		User localUser = new User("홍길동");
		localUser.printInfo();
		
		com.external.models.User externalUser = new com.external.models.User(1234);
		externalUser.printIntfo();
	}
}
