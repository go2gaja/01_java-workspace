package com.kh.chap04_assist.model.dao;

public class BufferDao {
	/*
	 * 보조 스트림 : 기반스트림으로 부족했던 성능보다 향상시켜주는 스트럼
	 * 기반스트럼에서 제공하지 않는 추가적인 메소드 제공/ 데이터 전송속도
	 * 외부매체와 연결되는 스트림 아님
	 * 단독 사용불가능 반드시 기반스트림과 함께 사ㅛㅇㅇ
	 */

	// 프로그램>>>>파일: '출력'
	
	
	public void filesSave() {
		//FileWriter 기반스트림을 가지고 해보자 기반스트림 필수
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력할수 있는 스트림
		
		//BufferWriter: 버퍼라는 공간을 제공해주는 보조스트림 >>속도 향상 기반스트림이랑 맞춰야함
		//BufferWriter bw : new Bufferwriter("c_buffer.txt")//불가능
		
		
		/*
		 * 1. 기반 스트림 먼저 생성
		 * FileWriter fw = new FileWriter("c_buffer.txt");
		 * 2. 기반 스트림 객체를 전달하면서>>보조 ㅅ트ㅡ림 생성
		 * BufferWriter bw = new BufferWroter(fw);
		 * 
		 */
		
		/*
		 * 위 두줄을 한줄ㄹ로
		 * BufferWriter bw = null;
		 * bw= new BufferWriter (new FileWriter("c_Buffer.txt")); <이런식으로
		  
		try {
			bw= new BufferWriter
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
	}
	

}
