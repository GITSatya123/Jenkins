package com.st.fi;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("satyajit"));
		System.out.println(f.apply("behera"));
	}

}
