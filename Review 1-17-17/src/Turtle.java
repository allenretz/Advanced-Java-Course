
public class Turtle extends Animals {

	@Override
	public void growOlder() {
		this.age++;
		this.lifespan++;
		
	}
	public void move() {
		this.pos[0]++;
	}

}
