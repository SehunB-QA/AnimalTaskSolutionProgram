package animaltask;

public class Cat extends Animal implements Birth  {

private String catBreed;

public void EatMouse()
{
	System.out.println("The cat has eaten a mouse. Tasty!");
}


@Override
public void MakeNoise() {
	System.out.println("Meow!");
	
}

@Override
public void Move() {
	System.out.println("A majestic walk!");
	
}

@Override
public void giveBirth() {
	System.out.println("A new cat is here!");
	
}

public String getCatBreed() {
	return catBreed;
}

public void setCatBreed(String catBreed) {
	this.catBreed = catBreed;
}



}