package animaltask;

public abstract class Animal {

	private int numOfEyes;
	private int numOfLegs;
	private String colour;
	private String name;
	
	public abstract void MakeNoise();
	public abstract void Move();
	
	public int getNumOfEyes() {
		return numOfEyes;
	}
	public void setNumOfEyes(int numOfEyes) {
		this.numOfEyes = numOfEyes;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
