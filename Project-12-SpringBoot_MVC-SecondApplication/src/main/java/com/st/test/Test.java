package com.st.test;


import static  com.st.test.Sample.viewB;
import static  com.st.test.Sample.viewC;
import static  com.st.test.Month.JUNE;
public class Test {

	public static void main(String[] args) {
		
		viewB();
		viewC(10);
		System.out.println(JUNE);
		System.out.println(Month.FEB);

	}

}
