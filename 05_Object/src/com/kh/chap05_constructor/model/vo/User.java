package com.kh.chap05_constructor.model.vo;

public class User {
	
	
	//필드부
	
	
	
	private String userId;
	private String UserPwd;
	private String UserName;
	private int age;
	private char gender;
	/*
	 * 생성자
	 * public 클래스명(매개변수...){
	 * 
	 * }
	 * 
	 *  1.객체를 생성해주기 위한 목적
	 *  
	 *  생성자 작성시 주의사항
	 *  
	 *  1. 반드시 생성자 명은 클래스 명과 동일해야함 (대/소문자 구분)>>안그러면 오류 발생
	 *  2. 반환형이 존재하지 않음 (만일 반환형을 쓰게되면 메소드로 인식해버림)
	 *  3. 매개변수 생성자를 명시적으로 작성하게 되면 기본 생성자를 JVM이 자동으로 만들어주지 않음
	 *  즉 어찌됐던 간에 기본 생성자는 항상 작성하는 습관을 들이는게 좋다
	 */
	
	public User() {
		//기본 생성자>>매개변수 없는 생성자
		//단지 객체 생성만을 목적으로 할 때 사용함
		//System.out.println("이거되나?");
		//기본생성자를 생략했을 경우>>"JVM"이 자동으로 만들어줬기 때문에 항상 객체생성 가능
	}
	
	//매개변수 생성자
	//객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화 할 목적초파
	public User(String userId,String userPwd,String userName) {
		
		this.userId=userId;
		this.UserPwd=userPwd;
		this.UserName=userName;
		
	}
	
	
	//매소드부
	
	//이번에는 get set 한쌍으로 만들어보기
	
	public String getUserId() {
		return userId;
		
	}
	
	public void setUeserId(String uerId) {
		this.userId=uerId;
	}
	
	public String getUserPwd() {
		return UserPwd;
	}
	public void setUerPwd(String uerPwd) {
		this.UserPwd=uerPwd;
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName=userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public String information() {
		return "userId : "+userId+", userPwd :"+UserPwd
		+",userName : "+ UserName+",age:"+ age+",gender:"+gender;
	}


	public User(String userId,String userPwd,String userName,int age,char gender) {
		/*
		this.userId=userId;
		this.UserPwd=userPwd;
		this.UserName=userName;
		*/
		
		this(userId,userPwd,userName);//this생성자 >이렇게 코드를 간결하게 
		//위와같이 중복되는 동일한 초기화 하는 내용의 생성자가 이미 존재할경우
		//this생성자 활용 가능
		//>>같은 클래스 내에 생성자에서 또 다른 생성자를 호출하고자 할때 사용함.
		//유의사항 :반드시 첫줄에 작성해야됨!! this생성자는 항상 위치가 맨위야만 함 아래에 있으면 에러가 발생함
		
		this.age=age;
		this.gender=gender;
	}
	

}

