package OopsConcept;
class Brands{
	String name;
	int liters;
	long code;
	int price;
	public void adddetails(String name, int liters, long code, int price) {
		this.name = name;
		this.code = code;
		this .price = price;
		this .liters = liters;
	}
	
	public void getdetails() {
		System.out.println("name of the cooldrink:"+name);
		System.out.println("liters:"+liters);
		System.out.println("price:"+price);
		System.out.println("code number:"+code);
	}
}
public class Cooldrink{	
	public static void main(String args[]) {
		Brands obj = new Brands();
		obj.adddetails("sprite", 25, 123456789, 50);
		obj.getdetails();
}

}