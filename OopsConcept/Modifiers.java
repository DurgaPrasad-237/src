package OopsConcept;

public class Modifiers {
	final String  name = "nani";
	static int rollno = 23;
	public static void main(String[] args) {
		Modifiers obj = new Modifiers();
	//	obj.name = "dhoni"; we can not reassign the value to the final variable
		System.out.println(obj.name);
		System.out.println(rollno);// access withour object
	}

}
