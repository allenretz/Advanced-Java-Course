import java.util.ArrayList;

public class Zoo {
	ArrayList<Rabbit>rabbits = new ArrayList<Rabbit>();
	ArrayList<Bobcat>bobcats = new ArrayList<Bobcat>();

	public Zoo() {
		
		
		rabbits.add(new Rabbit());
		rabbits.add(new Rabbit());
		
		bobcats.add(new Bobcat());
		bobcats.add(new Bobcat());
		
		
	}
	public int advance() {
		int rabbitCount = rabbits.size();
		for(int n= 0; n < rabbitCount; n++) {
			if (rabbits.size() > 1) {
				if (rabbitCount < 500) {
					for(int rab = 0; rab < rabbits.get(n).offspring; rab++) {
						rabbits.add(new Rabbit());
						if (rabbitCount < 30) {
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
							rabbits.add( new Rabbit());
						}
						
					}
				}
			}
		}
		for (int n = 0; n < bobcats.size(); n++) {
			if (rabbits.size() > Math.sqrt(bobcats.size())) {
				rabbits = bobcats.get(n).eat(rabbits);
			}
			else {
				bobcats.remove(n);
			}
		}
		if (rabbits.size() > bobcats.size()){
			for (int n = 0; n < bobcats.size() / 2; n++) {
				bobcats.add(bobcats.get(n).reproduce());
			}
		}
		System.out.print("Rabits: ");
		System.out.println(rabbits.size());
		System.out.print("Bobcats: ");
		System.out.println(bobcats.size());
		return 0;
	}

}
