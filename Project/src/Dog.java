public class Dog implements PetDog {

	public void eat() {
		System.out.println("I eat meat");
	}

	@Override
	public void walk() {
		System.out.println("I walk to find food");
	}

	public int countLegs() {
		// TODO Auto-generated method stub
		return 4;
	}

	
}
