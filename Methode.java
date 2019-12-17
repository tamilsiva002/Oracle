package thurs;

public class Methode {
	

	
	public static void main(String[] args) {
		
		// static ->> classname.methodeneme();
		
		
		//Methode.newMethode(50,100.5f);
		
		int valeu=Methode.returnMethod(20, 100.5f);
		int valeu1=Methode.retMethod(20, 100.5f);
		System.out.println(valeu);
		
		Methode.newMethode(valeu,valeu1);
		
		
		// Call -> Object Create -> Classname userdefindName =new classname();
		Methode obj=new Methode();
		//1) new keyword -  Space create 
		//2) classname name - obj 
		//3) To load non staic methods to obj object space --- Constructre();
		// Obj --- newKeyword();
		// non static --> objectname.method();
		
		//obj.newKeyword("sakthdnskfjkadsjfkasfj");
		//obj.newKeyword("Tamil");
		
		
	}
	
	
	//1) Access Specifier -public, private, protected -INhi, default
	//2) Modifer - Static, Non- Static
	//3) Return type - Void (0), int, float, 8 primite , class (String, WebElement)
	//4) Methode Name - user defined ( Eg; sum, total,sakthi)
	//5) Arugument (int a), (String name)
	
	
	//Static
	//1) if the method value change means, source code also changed, we cont retraive old
	//2) call or invoke --call ->  Classname.methodName();
	
	public static void newMethode(int value1,float value2)
	{
		int a=value1; //input - int
		float b=value2; // input - int
		int c=(int) (a+b);
		System.out.println(c);
	}
	
	public static int returnMethod(int value1,float value2)
	{
		int a=value1; //input - int
		float b=value2; // input - int
		int c=(int) (a+b);
		System.out.println(c);
		return c;
	}
	
	public static int retMethod(int value1,float value2)
	{
		int a=value1; //input - int
		float b=value2; // input - int
		int c=(int) (a+b);
		System.out.println(c);
		return c;
	}
	//non - static
	//source code not changed 
	// Call -> Object Create -> Classname userdefindName =new classname();
	
	public void newKeyword(String name)
	{
		System.out.println(name);
	}
	
	
	
	
	
	
	
	
	

}
