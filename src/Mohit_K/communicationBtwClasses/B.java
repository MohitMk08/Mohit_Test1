package Mohit_K.communicationBtwClasses;

public class B {
	
	void m2() {
		System.out.println("Method m2 from class B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.m2();
		
		A a = new A();
		a.m1();
	}
}
