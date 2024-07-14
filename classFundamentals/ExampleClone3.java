package classFundamentals;

class ExampleClone3 implements Cloneable {
	int x = 10, y = 20;

	@Override
	public ExampleClone3 clone() throws CloneNotSupportedException {
		return (ExampleClone3) super.clone();

	}

	@Override
	public String toString() {
		return "ExampleClone3 [x=" + x + ", y=" + y + "]";
	}

}
