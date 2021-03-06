package animals;

public class Crocodile extends Animal implements Reptile, Pet {

	public final boolean isMammal = false;
	public final boolean isReptile = true;
	public final boolean isAmphibian = false;	
	public final boolean isPet = false;
	static final String message = "I am a crocodile. And my name is ";	
	public String name = "";
	
	public Crocodile (String name) {
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
