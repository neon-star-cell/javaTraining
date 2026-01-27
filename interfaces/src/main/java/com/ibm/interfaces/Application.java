package com.ibm.interfaces;

public class Application
{
	public void permissionToLand(Flyer flyer) {
		flyer.land();
	}
	public static void main( String[] args )
	{
		Application application = new Application();
		Airplane airplane = new Airplane();
		application.permissionToLand(airplane);
		
		Bird bird = new Bird();
		application.permissionToLand(bird);
	}
}