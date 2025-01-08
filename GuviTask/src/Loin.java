package classtask;

import classTask1.Animal;

public class Loin extends Animal {

	public Loin(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(name + " the Lion is eating meat.");
	}

	@Override
	public void makeSound() {
		System.out.println(name + " the Lion roars: ROAR!");
	}

}
