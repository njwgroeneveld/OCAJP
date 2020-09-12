package Foo;
import Foo.Bar.ClassTwo.method;		// import option 1
import Foo.Bar.ClassTwo;			// import option 2
import Foo.Bar.*;					// import option 3


public class ClassOne{
	
	public static void main (String [] args){
		Foo.Bar.ClassTwo.method();
	}


}