package classtask;

import classTask1.Animal;

public class Fish extends Animal {
	
	public Fish(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(name + " the Fish is nibbling on aquatic plantt.");
	}

	@Override
	public void makeSound() {
		System.out.println(name + "the Fish bubbling sounds!");
	}

}
