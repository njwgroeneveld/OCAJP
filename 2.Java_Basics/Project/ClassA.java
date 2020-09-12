package p1;
import p2.ClassB;		// import ClassB by package p2
public class ClassA{
	public static String f1 = "static field ClassA";
	public String f2 = "instance field ClassA";
	
	// excercise 2?
	/*public void method(){
		int var1=0;
		int var2=10;
		int param=0;
		while(var1<var2){
			param++;
		}
		System.out.println(param);
	}
	*/

	
	public static void main(String [] args){
		ClassB CB = new ClassB();		// initialize an instance of ClassB
		//System.out.println(CB.f2);		// print instance field ClassA
		//System.out.println(ClassB.f1);		// print static field ClassA by FQCN
		System.out.println(ClassB.f1);
		System.out.println(CB.f2);
		ClassA CA = new ClassA();
		CA.method();
		
		
		
	}
	

}
