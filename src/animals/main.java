package animals;

public class main {

	public static void main(String[] args) {
		
		try {
		Cat cat = new Cat("Whiskers");
		Dog dog = new Dog("Rosco");
		Snake snake = new Snake("Slither");
		Turtle turtle = new Turtle("Bilbo");
		Crocodile croc = new Crocodile("Danger");
		
		cat.display();
		dog.display();
		snake.display();
		turtle.display();
		croc.display();
		} catch (Exception e) {
			System.out.println("An error has occurred in your main.java class.");
		} finally {
			System.out.println("Program Terminated.");
		}

	}

}
