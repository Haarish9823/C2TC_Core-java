class Student{
	int rollno;
	String name;
	void insertrecord(int r, String n);{
		rollno = r;
		name = n;
	}
}
public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.insertrecord(111, "Karan");
		s1.insertrecord(222, "Aryan");
		System.out.println(s1.rollno +" "+s1.name);
		System.out.println(s2.rollno+" "+s2.name);
	}

}
