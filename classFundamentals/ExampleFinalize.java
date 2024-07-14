package classFundamentals;

public class ExampleFinalize {
	int x;
	static ExampleFinalize e;

	ExampleFinalize(int x) {
		this.x = x;
	}

	public void finalize() {
		System.out.println("In finalize");
		// Converting unreferenced object as referenced object
		e = this;

		// now GC cannot destroy this object
	}

	public static void main(String[] args) throws InterruptedException {
		ExampleFinalize e1 = new ExampleFinalize(10);

		// unreferencing object
		e1 = null;

		// requesting GC
		System.gc();

		// Pausing main thread to allow GC to excecute
		Thread.sleep(100);

	}

}
