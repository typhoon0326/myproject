package com.tom;

public class typhoon {

	public static void main(String[] args) 
	{
		//
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		
		String S1 = new String("abc");
		String S2 = new String("abc");
		System.out.println(S1 == S2);
		
		System.out.println("Jason 95 87");
		String name = "Jason";
	    int english = 95;
		int math = 87;
		
		System.out.println(name + "\t" + english + "\t" + math + "\t" +(english+math)/2);
	}

}
