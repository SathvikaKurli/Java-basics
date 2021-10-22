
public class Animal {
	Animal(){System.out.println("änimal is created");}
}
class Dog extends Animal{
	Dog(){
		System.out.println("dog is created");
	}
}
class TestSuper4{
	public static void main(String args[]) {
		Dog d=new Dog();
	}
}
