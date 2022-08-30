package com;

public class Obmethod {
String name;
int age;
void input(String n,int a) {
	age=a;
	name=n;
}
void display() {
	System.out.println(name+" "+age);
}
class Obmethod1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Obmethod ob = new Obmethod();
Obmethod ob1 = new Obmethod();
ob.input("ran", 10);
ob1.input("rohit", 20);
	}

}}
