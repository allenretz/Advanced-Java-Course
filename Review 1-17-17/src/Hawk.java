
public class Hawk extends Avian {

	public Hawk() {
		super();
		this.legs = 2;
		this.eyes = 2;
		
	}

	@Override
	public void move() {
		this.pos[0] += 5;
		this.pos[0] += 5;

	}

}
