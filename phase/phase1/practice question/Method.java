package org.com;

public class  Method {
	public static int a =10 ,b =20;
	public int x =50 , y =100;


	public static void main(String[] args) {
		Method obj1 = new Method();
		obj1.test1();
		obj1.test2();
		System.out.println("obj1.x = "+obj1.x );
		System.out.println("obj1.y = "+obj1.y );
		
		obj1.test3();
		obj1.test4();
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}
	public void test1() {
		System.out.println("Test 1 ");
	}

	public void test2() {
		System.out.println("Test 2 ");
	}

	public static void test3() {
		System.out.println("Test 3 ");
	}

	public static void test4() {
		System.out.println("Test 4");
	}

}
