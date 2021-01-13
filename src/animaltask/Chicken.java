package animaltask;

public class Chicken extends Animal implements Birth{

   
     private String chickenType;
     
     public void DoChickenThing()
     {
    	 System.out.println("Doing chicken thing!");
     }
     
	
	@Override
	public void MakeNoise() {
		System.out.println("CLUCK!");
		
	}

	@Override
	public void Move() {
		System.out.println("PAT! PAT!");
		
	}

	@Override
	public void giveBirth() {
		System.out.println("Laid an egg!");
		
	}

	public String getChickenType() {
		return chickenType;
	}

	public void setChickenType(String chickenType) {
		this.chickenType = chickenType;
	}

}
