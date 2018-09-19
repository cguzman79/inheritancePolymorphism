package animals;

public class Cat extends Animal implements Mammal, Pet {

	public final boolean isMammal = true;
	public final boolean isPet = true;
	static final String message = "I am a cat. And my name is ";	
	public String name = "";
	
	public Cat(String name) {
		this.name = name;
	}

	public void display() {		
		System.out.println("*******************************************");
		super.display();		
		if(isMammal) {
			System.out.println(Mammal.message);
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
