package operators.in.java;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Unary operator exp++,exp--,++exp,--exp,~ (-num -1),!
		int a = -4;
		int b = 7;
		int p = 8;
		int q = 9;
		int u = 6; // 8-3+8
		// b =7, a =3, p=8
		// 7-6-6

		int z1 = ~a;
		System.out.println(z1);

		int c = a++;
		// a= a+1;
		System.out.println(a);
		System.out.println(c);

		int d = b--;
		// b = b-1;
		System.out.println(b);
		System.out.println(d);
		// p = p+1;
		int x = ++p;
		System.out.println(x);
		System.out.println(p);
		// q = q-1;
		int z = --q;
		System.out.println(z);
		System.out.println(q);

		int j = ~u;
		System.out.println(j);

		boolean flag1 = true;
		boolean flag2 = !flag1;
		System.out.println(flag2);

		boolean flag3 = !(a > b);// a=5, b=6
		System.out.println(flag3);

		int test3 = ++b - (--a) + b-- + b++ ; // test3 = 7 -  4 + 7 + 6
		System.out.println(test3);
		int test4 = --p - (--b) - (--p);
		System.out.println(test4);

	}

}
