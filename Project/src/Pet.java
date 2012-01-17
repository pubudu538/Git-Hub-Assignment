
public class Pet {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Eclipse");
		
		Dog d=new Dog();
		d.eat();
		d.walk();
		int i = d.countLegs();
		System.out.println("I have "+i+" legs.");
	}
	
	
}

public class Dog implements PetDog {

	public void eat() {
		System.out.println("I'm eating");
	}

	@Override
	public void walk() {
		System.out.println("I'm walking");
	}

	public int countLegs() {
		// TODO Auto-generated method stub
		return 4;
	}

	
}
