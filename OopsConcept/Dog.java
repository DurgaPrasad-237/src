package OopsConcept;

public class Dog extends Animal {
	 public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }

	public static void main(String[] args) {
		 Animal myAnimal = new Animal();
		    Animal myPig = new Pig();
		    Animal myDog = new Dog();
		        
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();

	}

}
