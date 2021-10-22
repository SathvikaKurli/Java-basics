
public abstract class Bike2 {
	Bike2(){System.out.println("bike2 is created");}
	abstract void run();
	void changeGear()
	{System.out.println("gear changed");}
}
class Honda extends Bike2{
	void run()
	{System.out.println("running safely..");}
}
class TestAbstraction2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike2 obj=new Honda();
		obj.run();
		obj.changeGear();

	}

}
