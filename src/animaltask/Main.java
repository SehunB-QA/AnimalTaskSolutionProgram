package animaltask;

public class Main {

	public static void main(String[] args) {
		
		Chicken chicken1 = new Chicken();
		chicken1.setColour("Red");
		chicken1.setNumOfEyes(2);
		chicken1.setNumOfEyes(2);
		chicken1.setName("Daisy");
		chicken1.DoChickenThing();
		chicken1.MakeNoise();
		chicken1.giveBirth();
		
		System.out.println(chicken1.getNumOfEyes());

	}

}
