package com.st.fi;

import java.util.function.BiFunction;

/*interface Math {
	
	public int multiply(int a,int b);
	
}*/



public class Test {

	public static void main(String[] args) {

		/*Math mob=(int a,int b)->a+b;
		Math mob=(a,b)->a*b;
		int result=mob.multiply(10,20);
		System.out.println(result);
		}
		
		BiFunction<Integer, Integer, Integer> ob=(a,b)->a+b;
		int result=ob.apply(200, 300);
		System.out.println(result);
		
		BiFunction<String, String, String> ob=(s1,s2)->"WElCOME TO:"+s1+"-"+s2;
		String result =ob.apply("Satyajit", "Behera");
		System.out.println(result);*/
		
		BiFunction<Integer, Double, String> ob=(v1,v2)->"Result is:"+(v1*v2);
		String result=ob.apply(30, 23.6);
		System.out.println(result);
	}
}


