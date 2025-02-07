package classFundamentals;

import InputOutputStreamJava.A;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Har", 12);
		Student s2 = new Student(2, "Krishna", 12);
		Student s3 = new Student(1, "Har", 12);
		Student s4 = s2;
		
		
		System.out.println(s1==s2);//false, different reference
		System.out.println(s1.equals(s2));//false, different state
		System.out.println();
		
		System.out.println(s1==s3);//false, different references
		System.out.println(s2.equals(s3));//true , same state=> but objects are different
		
		
		System.out.println(s2==s4);//true
		System.out.println(s2.equals(s4));//true,both reference variables has same object reference
		
		Address add = new Address();
		
		//System.out.println(s1==add);
		
		System.out.println(s1.equals(add));
		System.out.println(add.equals(s1));//false
		
		//comparing two nulls
		System.out.println(null == null);//true
		//System.out.println(null.equals(null);//Ce
		
		Address a1 = null;
		Address a2 = null;
		
		//comparing null with null using == operator always return ture,
		// but equals throws NPE
		
		System.out.println(a1==a2);//ture
		//System.out.println(a1.equals(a2));//NPE
		
		
		//Comparing null with object always return false
		
		Address a3 = new Address();
		System.out.println(a3==a2);//false
		System.out.println(a3.equals(a2));//false
	}

}
