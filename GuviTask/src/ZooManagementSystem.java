package classtask;

import classTask1.Animal;

public class ZooManagementSystem {

	public static void main(String[] args) {
		
		 Zoo zoo = new Zoo();

	        Animal bird = new Bird("Parrot");
	        Animal fish = new Fish("Goldfish");
	        Animal lion = new Loin("lion");
	    

	        zoo.addAnimal(bird);
	        zoo.addAnimal(fish);
	        zoo.addAnimal(lion);
	    

	        zoo.showFlyingAnimals();
	        zoo.showSwimmingAnimals();
	    
	    
		
		
	}

}
