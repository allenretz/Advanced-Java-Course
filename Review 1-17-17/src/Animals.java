
public abstract class Animals {
	

	int legs;
	int eyes;
	String food; // plant or meat
	boolean isFemale;
	double age;
	double lifespan;
	int[] pos = {0,0};
	int offspring = 1;
	//int[] pos = new int[2];
	
	
	public Animals() {
		isFemale = true;
		age = 0;
	}
	
	public abstract void growOlder();
	
	public void move() {
		pos[0] += 5;
	}
	
	public void eat() {
		
	}

}

//Static only allocates 1 spot in memory They all reference this Memory
