package Mohit_K.communicationBtwClasses;

public class A {
	
	void m1() {
		System.out.println("Method m1 from class A");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		
		C c = new C();
		c.m3();
	}
}
