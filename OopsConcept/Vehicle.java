package OopsConcept;

public class Vehicle {
	String name;
	int price;
	String color;
	public void addProperties(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public void details() {
		System.out.println("name: "+name);
		System.out.println("price: "+price);
		System.out.println("color: "+color);
	}
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.name = "thar";
		obj.price = 100;
		obj.color = "red";
		obj.addProperties(obj.name, obj.price, obj.color);
		obj.details();

	}

}
