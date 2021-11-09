package fly.child;

import fly.prarent.Flyer;

public class SuperMan implements Flyer {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("superman fly");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("superman land");
	}

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("superman take_off");
	}
	
	public String stop_bullet() {
		
		return "ÃÑ¾ËÀ» ¸·´Ù";
	}
}
