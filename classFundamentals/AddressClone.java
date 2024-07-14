package classFundamentals;

public class AddressClone implements Cloneable {
	int flatNo = 1;
	String colony = "Ammerpet";
	String city = "Hyd";

	public AddressClone clone() throws CloneNotSupportedException {
		return (AddressClone) super.clone();
	}
}
