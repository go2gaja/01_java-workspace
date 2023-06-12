package com.kh.part02_electronic.model.run;

import com.kh.part02_electronic.control.ElectronicShop1;
import com.kh.part02_electronic.control.ElectronicShop2;
import com.kh.part02_electronic.model.vo.Desktop;
import com.kh.part02_electronic.model.vo.Electronic;
import com.kh.part02_electronic.model.vo.NoteBook;
import com.kh.part02_electronic.model.vo.Tablet;

public class run {
	public static void main(String[] args) {
		
		/*
		//1 다형성 적용 안했을 경우(ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		//es에서 마련해놓은 desk, note, tab 이란느 필드에
		//객체를 생성해서 넣어주기 위해서 우선 es생성
		
		//메소드를 써서 생성하겠음
		//먼저 필요한 메소드를  생각해보자
		
		//아직은 없는 메소드
		//추가용 메소드>insert
		//데스크탑 이라는 객체를 생성해서 넘기는 메소드
		
		es.insert(new Desktop("samsung","dt",1200000,"gtx1070"));
		//노트북 이라는 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("Lg","rf",2000000,4));
		
		es.insert(new Tablet("ap","아이패드",801000,false));
		
		//가게에 해당 객체들이 잘 생성되었는지를 확인해보자
		// 조회용 메소드 > select();
		
		
		
		Desktop d = es.selectDesktop();

		NoteBook n =es.selectNoteBook();
		
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		
		System.out.println(n);
		System.out.println(t);
		*/	
		

	//실행용 클래스는 납품업체라고 생각
	
		
		
		//2 . 다형성 적용했을 경우 (ElectronicShop2)
		
		ElectronicShop2 es = new ElectronicShop2();
		
		//추가용 메소드 >> insert
		
		es.insert(new Desktop("samsung","dt",12000000,"gtx7200"));
		
		es.insert(new NoteBook("LG","그램", 200000,4));
		
		es.insert(new Tablet("apple","d",200000,false));
		
		//조회용 메소드 > select 
		//이번에는 이름을 하나로 
		
		//es.select(인덱스 값);
		//Desktop d=es.select(0);
		//실제로 들어있는 값은 Desktop 객체가 맞으나 반환형이 Electronic 이라서 맞춰줘야함>> 강제형변환
		/*
		Desktop d=(Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t =(Tablet)es.select(2);
		
		//이런걸 다운 캐스팅이라고 한다
		/*
		 *위에것과 같다
		 *동적 바인딩 
		 *위아래 둘다 사용 가능
		 *그럼 toString() 할 때 부모에 있는 toString 을 불러오지 않을까?
		 *아님>왜? 동적바인딩
		 
		*/
		Electronic d=es.select(0);
		Electronic n=es.select(1);
		Electronic t=es.select(2);
		
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
