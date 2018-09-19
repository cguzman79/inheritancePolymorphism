package animals;

public class Turtle extends Animal implements Amphibian, Pet {

	public final boolean isMammal = false;
	public final boolean isReptile = false;
	public final boolean isAmphibian = true;	
	public final boolean isPet = true;
	static final String message = "I am a turtle. And my name is ";
	public String name = "";
	
	public Turtle(String name) {
		this.name = name;
	}

	public void display() {		
		System.out.println("*******************************************");
		super.display();		
		if(isMammal) {
			System.out.println(Mammal.message);
		}
		if(isReptile) {
			System.out.println(Reptile.message);
		}
		if(isAmphibian) {
			System.out.println(Amphibian.message);
		}
		if(isPet) {
			System.out.println(Pet.message1);
		} else {
			System.out.println(Pet.message2);
		}		
		System.out.println(message + name + ".");
		System.out.println("*******************************************");
	}//end display().
}
