package com.mathematic;
import calc.CalcyDemo;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(sum(10,30));
	}
	public static int sum(int n1,int n2) {
		CalcyDemo c=new CalcyDemo();
		return c.add(n1, n2);
	}

}
