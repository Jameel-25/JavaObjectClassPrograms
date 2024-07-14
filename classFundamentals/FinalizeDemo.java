package classFundamentals;

class Furniture {
}

class Building {
	Furniture f = new Furniture();

	Building(Furniture f) {
		this.f = f;
	}

	void display() {
		System.out.println(f);
	}

	public void finalize() {
		// Furniture is the internal object of Building object.
		// Unreferenced this object is called resource releasing logic
		f = null;

	}
}

public class FinalizeDemo {

	public static void main(String[] args) throws Exception {
		// creating unreferenced objects
		for (int i = 1; i <= 40; i++) {
			new Building(new Furniture());
		}
		// requesting GC thread to destroy all unreferenced objects
		System.gc();

		// It will halt main thread for 1000 milliseconds, mean while garbage collector
		// destroys all unreferenced objects
		Thread.sleep(1000);
	}

}
