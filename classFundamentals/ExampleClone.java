package classFundamentals;

public class ExampleClone implements Cloneable {
	int x = 10;
	int y = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		ExampleClone e1 = new ExampleClone();
		ExampleClone e2 = (ExampleClone) e1.clone();
		System.out.println(e2.x);
		e2.x = 45;
		System.out.println("e1:" + e1.x + " e2:" + e2.x);

	}

}
