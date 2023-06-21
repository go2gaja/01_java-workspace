package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		
		
		/*
		 * MVC 패턴 : 각 클래스마다 역활을 부여해서 작업(데이터,화면,요청처리)를 부여해서 작업함
		 *  
		 * 
		 * -M(Model) : 데이터를 담당하는 역활(데이터를 담기위한 클래스, 비즈니스 로직 처리하기 위한 클래스,데이터가 보관되어 있는 보관함과 연결해서 입출력)
		 * -V(vIEW)  : 화면을 담당하는 역활 즉 사용자에게 보여지는 시각적인 요소 출력문(print) 입력문(Scanner)
		 * -C(Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역활 (출력문 같은거 안쓸거임)
		 * 
		 */
		
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
		// 커밋테스트
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
