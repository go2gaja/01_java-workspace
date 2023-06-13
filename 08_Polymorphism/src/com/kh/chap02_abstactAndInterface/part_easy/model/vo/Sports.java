package com.kh.chap02_abstactAndInterface.part_easy.model.vo;
	//추상 메소드 할거임
public abstract class Sports {
	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people=people;
	}
	
	public int getPeople() {
		return people;//몸통부>>이게 없다면 완벽한 메소드가 아니다
	}
	public void setPeople(int people) {//머리부
		this.people=people;//몸통부
	}
	@Override
	public String toString() {
		return"people :"+people;
	}
	//추상 메소드(미완성된 메소드) 만들기
	
	//public void rule();//머리부만 있는거 몸통이 없어서 에러가 나는것	
	public abstract void rule();
	//미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성 이라는 이야기
	
	//그럼 언제 완성하나>>해당 추상클래스를 상속 받는 자식에서
	
	
	
	
	

}
