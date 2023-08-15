package OopsConcept;

public class SecondClass extends Firstclass {

	public static void main(String[] args) {
		SecondClass obj = new SecondClass();
		obj.method2();
		obj.method1();
	}

	@Override
	public void method2() {
	System.out.println("this is the method2 in the firstclass");	
	}
	public void method() {
		this.method1();
	}
	

}
