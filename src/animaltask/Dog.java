package animaltask;

public class Dog extends Animal implements Birth{

	private String dogBreed;
	
	
	public void ChaseCat()
	{
		System.out.println("The dog is chasing a cat. Uh oh!");
	}
	
	

	@Override
	public void MakeNoise() {
		System.out.println("Woof!");
		
	}

	@Override
	public void Move() {
		System.out.println("Look at that dog go!");
		
	}
	
	
	@Override
	public void giveBirth() {
		System.out.println("A new dog is here!");
		
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}


}
