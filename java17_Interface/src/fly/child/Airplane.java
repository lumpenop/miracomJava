package fly.child;

import fly.prarent.Flyer;

public class Airplane implements Flyer{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane fly");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airplane land");
	}

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		System.out.println("Airplane take_off");
	}

}
