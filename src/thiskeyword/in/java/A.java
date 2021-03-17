package thiskeyword.in.java;

public class A {

	ThisForCurrentClassVeriable ppp;
	int q;

	public A(ThisForCurrentClassVeriable ppp) {
		this.ppp = ppp;

		System.out.println(ppp.a);
		System.out.println(ppp.b);
		System.out.println(ppp.name);
		ppp.method2();

		System.out.println("As constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ab = 67;
		int a = 78;
		ThisForCurrentClassVeriable obj = new ThisForCurrentClassVeriable(2, 3, "Ajay");
		ThisForCurrentClassVeriable obj1 = new ThisForCurrentClassVeriable(5, 2);

		obj1.method4();
		obj1.method1(2, 3);

		obj1.method2();

	}

}
