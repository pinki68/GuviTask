package classtask;

import java.util.ArrayList;
import java.util.List;

import classTask1.Animal;

public class Zoo {
	
	
	private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo.");
    }
    
    public void showFlyingAnimals() {
        System.out.println("Animals that can fly:");
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
        }
    }

    
    public void showSwimmingAnimals() {
        System.out.println("Animals that can swim:");
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
  /*  public void showAnimalsSwim() {
        for (Animal animal : animals) {
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        
        }
    } */

}
