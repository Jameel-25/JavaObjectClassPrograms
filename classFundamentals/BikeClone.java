package classFundamentals;

public class BikeClone implements Cloneable {

	private int engineNumber; // should be initialized by manufacturing company
	private int modelNumber; // should be initialized by manufacturing company
	private String type;// should be initialized by manufacturing company
	private int bikeNumber; // should be initialized after bike sales by RT office

	public BikeClone(int engineNumber, int modelNumber, String type) {
		super();
		this.engineNumber = engineNumber;
		this.modelNumber = modelNumber;
		this.type = type;
	}

	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber; // RT office call this method to set bike number

	}

	// Overriding clone method to develop above design
	public BikeClone clone() throws CloneNotSupportedException {
		BikeClone newBike = (BikeClone) super.clone();// current bike object is cloned
		newBike.engineNumber = this.engineNumber + 10;// changing individual property
		return newBike;// returning cloned bike
	}

	@Override
	public String toString() {
		return "BikeClone [engineNumber=" + engineNumber + ", modelNumber=" + modelNumber + ", type=" + type
				+ ", bikeNumber=" + bikeNumber + "]";
	}

}
