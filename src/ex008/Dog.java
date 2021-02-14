package ex008;

public class Dog {

	String name = "";
	String breed = "mutt";
	int weight = 0;
	
	public Dog(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

}