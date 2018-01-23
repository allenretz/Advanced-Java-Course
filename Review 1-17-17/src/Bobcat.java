import java.util.ArrayList;
import java.util.Random;

public class Bobcat extends Mamal {

	public Bobcat() {
		this.legs=4;
		this.eyes=2;
		this.food="meat"; // plant or meat
		this.isFemale = true;
		this.age = 0;
		this.lifespan = 12;
	}
	
	public ArrayList<Rabbit> eat(ArrayList<Rabbit> r) {
		Random rand = new Random();
		r.remove(rand.nextInt(r.size()));
		
		return r;
	}
	
	public Bobcat reproduce() {
		return new Bobcat();
		
	}

}
