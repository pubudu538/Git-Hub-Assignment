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
