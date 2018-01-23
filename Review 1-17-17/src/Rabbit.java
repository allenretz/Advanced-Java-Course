
public class Rabbit extends Mamal {

	public Rabbit() {
		this.legs=4;
		this.eyes=2;
		this.food="plant"; // plant or meat
		this.isFemale = true;
		this.age = 0;
		this.lifespan = 3;
		this.offspring = 2;
	}
	
	public Rabbit reproduce() {
		return new Rabbit();
	}

}
