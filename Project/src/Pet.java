
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
