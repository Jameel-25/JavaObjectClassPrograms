package classFundamentals;

class A {
	int a = 5;
}

class B extends A {
	int b = 6;
}

class C extends B {
	int c = 7;
}

public class D extends C implements Cloneable {
	int d = 8;

	@Override
	public String toString() {
		return "D [d=" + d + ", c=" + c + ", b=" + b + ", a=" + a + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		D d1 = new D();
		D d2 = (D) d1.clone();

		System.out.println("d1 object data\n" + d1);
		System.out.println("d2 object data\n" + d2);

		d2.a = 12;
		d2.b = 13;
		d2.c = 14;
		d2.d = 15;
		System.out.println("\nAfter Modification");
		System.out.println("d1 object data\n" + d1);
		System.out.println("d2 object data\n" + d2);

	}

}
