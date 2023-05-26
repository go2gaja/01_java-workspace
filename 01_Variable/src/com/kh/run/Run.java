package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_printf;
import com.kh.variable.D_Cast;

public class Run {
	public static void main(String[] args) {
		//System.out.println("ko kyong won");
		//A_Variable a = new A_Variable ();
		//클래스 별칭=new 클래스명();
		//a.printVarible();
		//a.decleareVariable();
		
		B_KeyboardInput b = new B_KeyboardInput();
		// 클래스명 별칭 = new 클래스명();
		//b.inputTest1();
		//b.inputTest2();
		//b.inputTest3();
	    //b.inputTest4();
		//b.charAtTest();
		
		C_printf c = new C_printf();
		//c.printfTest();
		
		D_Cast d= new D_Cast();
		//d.autoCasting();
		d.forceCasting();
		
	}
	
	
}
