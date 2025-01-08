package classtask;

import classTask1.Animal;

public class Bird extends Animal {
	

    public Bird(String name) {
        super(name);
    }
    

    @Override
    public void eat() {
        System.out.println(name + " the Brid is pecking at seeds.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the Brid chirps!");
    }
    
}
