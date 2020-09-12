package p2;
import p1.ClassA;

public class ClassB{
	
	public static String f1 = "static field ClassB";
	public String f2 = "instance field ClassB";

public static void main (String [] args){
	ClassA CA = new ClassA();		// initialize an instance of ClassA
	//System.out.println(CA.f2);		// printing instance field of ClassA
	System.out.println(ClassA.f1);	// printing static field of ClassA through FQCN
	
}


}