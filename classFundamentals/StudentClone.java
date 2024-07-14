package classFundamentals;

public class StudentClone implements Cloneable{
	int sNo = 1;
	String sName = "StudentOne";
	String course = "Course1";
	double fee = 1000;
	AddressClone add = new AddressClone();

	public StudentClone clone() throws CloneNotSupportedException {
		StudentClone s = (StudentClone) super.clone();
		s.add = this.add.clone();
		return s;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		StudentClone s1 = new StudentClone();
		StudentClone s2 = s1.clone();
		System.out.println(s1.add == s2.add);// false
	}

}
