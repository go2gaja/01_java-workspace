package com.hw1.model.vo.Employee;

public class Employee {
	private int empNo;//사번
	private String empName;//사원명
	private String dept;//소속부서
	private String job;//직급
	private int age;//나이
	private char gender;//성별
	private int slary;//급여
	private double bonusPoint;//보너스포인트
	private String phone;//전화번호
	private String address;//주소
	
	public Employee() {}
	
	 public Employee(int empNo, String empName, int age, char gender, 
			 String phone, String address) {
	        this.empNo = empNo;
	        this.empName = empName;
	        this.age =age;
	        this.gender = gender;
	        this.phone = phone;
	        this.address = address;
	    }
	
	
	public Employee(int empNo, String empName, String dept, String job, int age, 
			char gender,int salary,double bounusPoint, String phone, String address) {
		this.empNo=empNo;
		this.empName=empName;
		this.dept=dept;
		this.job=job;
		this.age=age;
		this.gender=gender;
		this.slary=salary;
		this.bonusPoint=bounusPoint;
		this.phone=phone;
		this.address=address;
			
	}
	
	 public String information() {
	        return "사번 :" +empNo+",사원명 :"+empName+",소속부서 :"+dept+",직급 :"+job+",나이:"+age+",성별 :"+gender+",급여 :"+slary+",보너스포인트:"+bonusPoint+",전화번호 :"+phone+",주소"+address;
	    }
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo=empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getdept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public int get() {
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
	public int getSalary() {
		return slary;
	}
	public void setSalary(int salary) {
		this.slary=salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint=bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	
	
	public int totalSlary() {
		return (int)(this.slary+(this.slary*this.bonusPoint));
	}
	
	
	
	
	

}
