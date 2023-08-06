package OopsConcept;

public class Classandobject {
	String name;
	long phno;
	public void details(long number, String name) {
		this.name=name;
		this.phno=number;	
	}
	public void get() {
		System.out.println("name: "+name);
		System.out.println("number: "+phno);
	}
	public static void main (String args[]) {
		Classandobject obj = new Classandobject();
		obj.details(7730858682l, "nani");
		obj.get();	
	}
}
