package fly.child;

import fly.prarent.Flyer;

public class Bird implements Flyer {

	@Override
	public void fly() {
		System.out.println("Bird Fly");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird Land");
		
	}

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("Bird Take_Off");
	}
	
	
	public String layEggs() {
		return "¾ËÀ» ³º´Ù";
	}
	
	public String buildNest() {
		return "µÕÁö¸¦ Áş´Ù";
	}
}
