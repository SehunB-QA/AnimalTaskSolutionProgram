package animaltask;

public class Eagle extends Animal implements Flyable, Birth {
	
	public void ProtectNest()
	{
		System.out.println("A eagle has to protect it's nest!");
	}

@Override
public void MakeNoise() {
	System.out.println("Skreeeeeaghh!");
	
}



@Override
public void Move() {
	
	System.out.println("Weeeeeee!");
}



@Override
public void takeOff() {
	System.out.println("Time to fly!");
	
}



@Override
public void giveBirth() {
	System.out.println("Laid an bird egg!");
	
}

}