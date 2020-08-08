package com.st.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AppTest{

	public static void main(String[] args) {
		
		/*Message m=name->System.out.println("My Name is::"+name);
		m.show("satya");
		
		Predicate<Integer> p=I->(I>10);
		System.out.println(p.test(100));
		System.out.println(p.test(7));
		System.out.println();
		Predicate<String> p1= s->(s.length()>15);
		System.out.println(p1.test("satyajit"));
		System.out.println(p1.test("satya"));*/
		
			
		
		int x[]= {10,33,40,50,98,60,76,25};
		Predicate<Integer> p=I->(I%2==0);
		System.out.println("The no is divisible by 5 are:");
		m1(p,x);
		
		Predicate<Integer> p1=I->(I>50);
		System.out.println("The no are geaterthan 50 are:");
		m1(p1,x);
		System.out.println("The no  are not gtreaterthan 50 are:");
		m1(p1.negate(),x);
		System.out.println("The no  are not gtreaterthan 30 and even are::");
		m1(p.and(p1),x);
		System.out.println("The no  are not gtreaterthan 50 or even are:");
		m1(p.or(p1),x);
	}
		public static void m1(Predicate<Integer> p, int[]x) {
			for(int x1:x) {
				if(p.test(x1)) 
					System.out.println(x1);
				}
			}
		}

	


