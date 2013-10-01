package com.github.sevntu.checkstyle.checks.coding;

public class AvoidFinalConditionInversion {

	public boolean method1() {
		boolean a, b = false;
		return ! (a == b); // correct: a != b
	}
	
	public boolean method2() {
		boolean a, b = false;
		return ! (a > b); // correct: a <= b
	}
	
	public void method3() {
		int a, b = 5;
		if (! ((a >= 8) && (b >= 5)) ){ // correct if (a < 8 && b < 5) 
			//
		}
	}
}