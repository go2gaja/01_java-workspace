package com.kh.practice.token.controller;

public class TokenController {
	
	public TokenController(){}
	//TokenController()

	 //+afterToken(str:String):String>> for 변형??
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		String result ="";
		// 띄어쓰기를 없애고 없앤 문자열 반환
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				result += str.charAt(i);
			}
		}
		return result;
		
	//+firstCap(input:String):String
	}
	public String firstCap(String input) {
		 // 첫 글자만 대문자로 바꾼 문자열 반환
        if (input.length() == 0) {
            return input;
        }
        char num = Character.toUpperCase(input.charAt(0));
        return num + input.substring(1);
    }

	
	public int findChar(String input, char one) {
		 int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == one) {
	                count++;
	                
	        }
	            
	    }
	        return count;
	}
}

