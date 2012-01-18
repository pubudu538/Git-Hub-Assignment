
public class Pet {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Eclipse");
		
		Dog d=new Dog();
		System.out.println("----- Dog -----");
		d.eat();
		d.walk();
		int i = d.countLegs();
		System.out.println("I have "+i+" legs.");
		
		System.out.println("----- Cat -----");
		Cat c=new Cat();
		c.eat();
		c.walk();
		c.sleep();
	}
	
	
}
