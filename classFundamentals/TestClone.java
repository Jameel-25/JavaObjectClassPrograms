package classFundamentals;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		ExampleClone3 e1 = new ExampleClone3();
		ExampleClone3 e2 = e1.clone();

		System.out.println(e1);
		System.out.println(e2);
	}

}
