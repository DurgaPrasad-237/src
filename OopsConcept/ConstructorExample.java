package OopsConcept;

public class ConstructorExample {
	String name;
	int rollno;
	public ConstructorExample(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public void getdetails() {
		System.out.println("name:"+name);
		System.out.println("rollno:"+rollno);
	}

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample("nani",223);
		obj.getdetails();
		

	}

}
