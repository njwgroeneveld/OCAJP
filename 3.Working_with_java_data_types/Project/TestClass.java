package birdsfolder;

public class TestClass{

public static Bird firstBird;


public static void main (String [] args){
	firstBird = new Bird ();
	Bird secondBird = new Bird();
	secondBird.legs = 2;
	secondBird.name = "bigbird";
	secondBird.alive =  true;
	secondBird.height = 50.50;

	//firstBird.fly();
	//secondBird.fly();
	
	secondBird.thirdBird = new Bird();
	//System.out.println(secondBird.fly(10.0f));		// float -> Float -> float -> int
	//System.out.println(secondBird.fly(new Float(15.0f)));	// Float -> float -> int
	//secondBird.fly(5.0);				//incompatible type double (64-bit) float (32 bit)
	secondBird.fly(new Integer(4));	// doesnt compile Integer cannot be converted to Float
	//secondBird.fly(2);				// doesnt compile integer cannot be converted to Float
	//secondBird.fly("10");			// doesnt compile string cannot be converted to Float
}
}
