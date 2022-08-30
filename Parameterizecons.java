package com;

public class Parameterizecons {
	int age;
	String name;
	Parameterizecons(int a,String n){
		age=a;
		name=n;	
	}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		Parameterizecons d=new Parameterizecons(50,"karthik");
		Parameterizecons d1=new Parameterizecons(25,"rohit");
		d.show();
		d1.show();
	}
}
