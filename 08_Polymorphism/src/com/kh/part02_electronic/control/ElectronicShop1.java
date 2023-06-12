package com.kh.part02_electronic.control;

import com.kh.part02_electronic.model.vo.Desktop;
import com.kh.part02_electronic.model.vo.NoteBook;
import com.kh.part02_electronic.model.vo.Tablet;

//다형성 개념 적용 안했을때
public class ElectronicShop1 {
	//용산 전자상가에 있는 가게
	//private int price;//기본 자료형
	
	private Desktop desk;//내가 만든 자료형
	private NoteBook note;//객체 생성은 안되고 텅 비어있음
	private Tablet tab;//
	
	//이건 실제로 객체가 생성된 것은 아님
	//필드가 메모리상에 확보되는 순간>>객체가 생성되는 순간
	
	public void insert(Desktop d) {//Desktop d= new Desktop(~~~~~)
		desk=d;
	}	
		
		
	public void insert(NoteBook n) {//NoteBook n = new Notebook
		note = n;
	}
	public void insert(Tablet t) { //Tablet t= new Tablet
		tab = t;
		
		//동일한 클래스에 동일한 메소드 명으로 여러개 만들어져있는것> 오버로딩
		//단 매개변수명은 달라야한다
		//오버로딩이 적용 돼있음
		
		//insert처럼 select도 같은이름으로 하면 안되는 이유?
		//매개변수가 없기 때문에 불가능하다>>오류남
		
		//현재는 메소드가 총 6개
		//다형성 적용하면 2~3개로 줄이기가 가능
		
		
		
		
		//조회
		//모르겠으면 일단 반환형을 void>나중에 수정 가능
		
		}
		public Desktop selectDesktop() {
			return desk;
			
		}
		public NoteBook selectNoteBook() {
			return note;
		}
		
		public Tablet selectTablet() {
			return tab;
			
		
			
		
}
		
}

	
		
	
	
	

