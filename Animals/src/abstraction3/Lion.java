package abstraction3;

public class Lion extends Animal{
	
	Lion() {
		System.out.println("LION inherits Animal");
	}
	
	Lion(String name) {
		super(name);
		System.out.println("LION inherits Animal");
	}
	
	void display() {
		System.out.println("Lion Display");
	}
	
	@Override
	void sound() {
		System.out.println("Sounds: Roar");
	}
	
	@Override
	void food() {
		System.out.println("Food: Meat");
	}
	
	void displayAll() {
		display();
		numOfEyes();
		numOfLimbs();
		sound();
		food();
	}

}
