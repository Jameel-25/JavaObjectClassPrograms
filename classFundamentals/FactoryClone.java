package classFundamentals;

public class FactoryClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		BikeClone b1 = new BikeClone(12345, 2012, "Pulsar 180CC");// first bike object
		BikeClone b2 = (BikeClone) b1.clone();// cloning first bike object

		System.out.println(b1 == b2);// clone() method creates new object , so == returns false

		b1.setBikeNumber(8192);
		b2.setBikeNumber(8193); // Setting bike number. This method is called in RT Office

		System.out.println("b1 object details");
		System.out.println(b1);

		System.out.println();
		System.out.println("b2 object details");
		System.out.println(b2);
	}

}
