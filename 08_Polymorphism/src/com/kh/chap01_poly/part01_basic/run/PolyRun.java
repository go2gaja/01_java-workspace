package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기억해둘 것 '=' 기준으로 해서 왼쪽과 오른쪽의 자료형(타입)은 갈아야됨
		
		System.out.println("1.부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
		//p1 레퍼런스로 Parent에만 접근 가능
		System.out.println("2 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1= new Child1();
		
		c1.printChild1();
		c1.printParent();//자동형변환 된거였음 Child1 >Parent
		
		//((Parent)c1).printParent();
		//Parent 접근시 자동으로 형변환 된 채로 진행된것
		
		
		System.out.println("부모타입 레퍼런스로 자식 객체를 다루는 경우(다형성)");
		/*
		 * Parent p2 =/(Parent)/ new Child1();>>자료형이 다름>>자동형변환 된것
		 * p2.printParent();
		 * 02.printChild1();
		 * ((Child1)p2).printChild1();//강제 형변환을 하면 호출은 가능
		 * 
		 *p2 레퍼런스로 지금 당장은 Parent에만 접근가능하지만
		 *Child1에 접근하고자 한다면 강제 형변환을 하면 접근은 가능
		 *
		 * 상속 구조의 클래스들 간에는 형변환 가능
		 * 
		 * 1.UpCasting
		 * 	 자식타입>부모타입 형변환
		 * 	 자동형변환
		 * 	 ex ) 자식.부모메소드();
		 * 2.DownCasting
		 * 	 부모타입>>자식타입 형변환
		 * 	 강제형변환
		 * 	 ex) ((자식)부모).자식메소드();	
		 *	 상속 구조가 아니면 안된다
		 *
		 *   다형성 정의
		 * 	 부모타입으로 부터 파생된 여러가지 타입의 자식 객체들을 부모클레스 타입 하나로도 다룰 수 있다.
		 * 
		 *   다형성을 쓰는 목적	
		 * 
		 *   
		 *   
		 *   
		 */
		
		//다형성을 배우기전..
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] =new Child2(2,1,5);
		arr2[1] =new Child2(0, 0, 0);
		
		//===================================
		// 다형성(부모타입의 레퍼런스를 적용한후)
		Parent[] arr = new Parent[4];
		//Parent 타입
		
		arr[0] = new Child1(3, 5, 1);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child1(5, 7, 2);
		arr[3] = new Child2(2, 3, 5);
		//하나의 부모타입만으로 여러 자식 객체들을 받을 수 있음=> 편리하다. 코드길이 감소
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		//arr[0].printChild1();
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printParent();
		//((Child2)arr[2]).printChild2(); >>java.lang.ClassCastException :부적절한 형변환
		//arr[3]
		((Child2)arr[3]).printChild2();
	
		
		System.out.println("===============반복문 이용해서 출력 ========================");
		for(int i=0; i<arr.length;i++) {
			((Child2)arr[3]).printChild2();
		
			/*
		 	 * instanceof 연산자 >> 연산결과 true / false 반환
		 	 * 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때 사용
		 	 * 
		 	 * 
		 	 * 
		 	 * 
		 	 * 
		 	 */
			
			
			
			
			
			/*if(i==0||i==2) {*/
		if(arr[i] instanceof Child1) {//해당 레퍼런스가 실제 Child1 참조하고있다면 true 아니면 false	
			((Child1)arr[i]).printChild1();
		}else {
			((Child2)arr[i]).printChild2();
		}
		
		
		
		
		}//양다리 >> 공유 : 연상(공유 오빠), 차은우 : 연하(은우야)
		
			
		Parent pp = new Child1();
		pp.print();
		
		/*
		 * 동적 바인딩: 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩(레퍼런스 타입의 메소드를 가리킴)
		 * 				단, 실질적으로 참조하는 자식클레스에 해당 메소드가 오바라이딩 돼있다면
		 * 				프로그램 실행시 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
		 * 
		 */
		
		for(int i=0; i<arr.length;i++) {
			arr[i].print();
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
