package iwan91.com.github.StackTracePlus.examples.example1;

import iwan91.com.github.StackTracePlus.StackTracePlus;

public class Example1Main {
	
	
	public static void main(String[] args) {
		ClassA a=null;
		ClassB b=null;
		ClassC c=null;
		ClassE e=null;
		try{
			a=new ClassA();
			b=new ClassB();
			c=new ClassC();
			e=new ClassE();
			throw new Exception("myException");
		}
		catch(Exception ex){
			/*Parameters for function StackTracePlus.printStackTrace and StackTracePlus.getStackTrace
			  1st parameter exception.Type Exception. Can be null
			  2nd parameter additional message.Type String. Can be null
			  others parameters. Type Object. Can be from 0 to n objects.*/

			//Print stackTree
			StackTracePlus.printStackTrace(ex, "additional message", a,b,c,e);
			
			//Get stackTree. Return String.
			//String s=StackTracePlus.getStackTrace(ex, "additional message", a,b,c,e);
		}
	}

}
