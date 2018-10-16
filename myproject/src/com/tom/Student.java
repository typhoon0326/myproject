package com.tom;

public class Student {
	String name;
	int english;
	int math;
	
	public Student(String name,int english, int math){
		this.name = name;
		this.english = english;
		this.math = math;
	}
    public void print(){
    	System.out.print(name + "\t" + english + "\t" + math + "\t" +(english+math)/2);
    }
}
