package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

		Product product1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        Product product2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
			
        
        // 객체가 가진 필드 값 출력 확인
        System.out.println(product1.information());
        System.out.println(product2.information());
        System.out.println(product3.information());

        // 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
        product1.setPrice(1200000);
        product1.setTax(0.05);

        product2.setPrice(1200000);
        product2.setTax(0.05);

        product3.setPrice(1200000);
        product3.setTax(0.05);

        // 객체가 가진 필드 값 출력 확인
        System.out.println(product1.information());
        System.out.println(product2.information());
        System.out.println(product3.information());
        
        

        // 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
        System.out.println("부가세 포함 가격: "+product1.getTaxPrice());
        System.out.println("부가세 포함 가격: " + product2.getTaxPrice());
        System.out.println("부가세 포함 가격: " + product3.getTaxPrice());

		
		
	}

}
