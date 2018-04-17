package interfacetest;

public interface Lion 
{
		public abstract void bark();
		public  abstract void bite();	
}

abstract class Rat implements Lion
{
	void clean()
	{
		System.out.println("Cleaning");
	}
	abstract void swim();
	
}



class q extends Rat
{

	@Override
	public void bark() {
		System.out.println("bark");
		
	}

	@Override
	public void bite() {
		System.out.println("bite");
		
	}

	@Override
	void swim() {
		System.out.println("swim");
		
	}
}


interface asa extends Lion{}
class mMain{
	public static void main(String[] args) {
		q r =new q();
		r.bark();
		r.bite();
		r.clean();
		r.swim();
	}
}