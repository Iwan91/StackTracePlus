# StackTracePlus
Library for Java to get more info when catch exception

## Usage
You can find more examples [here](https://github.com/Iwan91/StackTracePlus/tree/master/StackTracePlus/src/iwan91/com/github/StackTracePlus/examples)

Example usage (source code from [example1](https://github.com/Iwan91/StackTracePlus/tree/master/StackTracePlus/src/iwan91/com/github/StackTracePlus/examples/example1)):

Run below script:
```java
public class Example1Main {
	public static void main(String[] args) {
		ClassA a=null;
		ClassB b=null;
		ClassC c=null;
		try{
			a=new ClassA();
			b=new ClassB();
			c=new ClassC();
			throw new Exception("myException");
		}
		catch(Exception e){
			/*Parameters for function StackTracePlus.printStackTrace and StackTracePlus.getStackTrace
			  1st parameter exception.Type Exception. Can be null
			  2nd parameter additional message.Type String. Can be null
			  others parameters. Type Object. Can be from 0 to n objects.*/

			//Print stackTree
			StackTracePlus.printStackTrace(e, "additional message", a,b,c);
			
			//Get stackTree. Return String.
			//StackTracePlus.getStackTrace(e, "additional message", a,b,c);
		}
	}
}
```
and you get this stackTrace:
```java
java.lang.Exception: myException
	at iwan91.com.github.StackTracePlus.examples.example1.Example1Main.main(Example1Main.java:16)

Java Variables:
   Object[0]
   iwan91.com.github.StackTracePlus.examples.example1.ClassA
         Array[0]
         java.lang.Integer
               java.lang.Integer: 0
         Array[1]
         java.lang.Integer
               java.lang.Integer: 0
         Array[2]
         java.lang.Integer
               java.lang.Integer: 0
      b = byte: 2
      s = short: 22
      i = int: 222
      l = long: 2222
      f = float: 2.2
      d = double: 2.22
      bool = boolean: true
      c = char: 2
      str = java.lang.String: 22
      e = iwan91.com.github.StackTracePlus.examples.example1.EnumA: DOG
      objectB = iwan91.com.github.StackTracePlus.examples.example1.ClassB: null
      objectC = iwan91.com.github.StackTracePlus.examples.example1.ClassC: iwan91.com.github.StackTracePlus.examples.example1.ClassC@25154f
      iwan91.com.github.StackTracePlus.examples.example1.ClassC
         b = java.lang.Byte: null
         s = java.lang.Short: null
         i = java.lang.Integer: null
         lL = java.lang.Long: null
         f = java.lang.Float: null
         d = java.lang.Double: null
         bool = java.lang.Boolean: null
         c = java.lang.Character: null

   Object[1]
   iwan91.com.github.StackTracePlus.examples.example1.ClassB
      b = byte: 0
      s = short: 0
      i = int: 0
      lL = long: 0
      f = float: 0.0
      d = double: 0.0
      bool = boolean: false
      c = char: 
      str = java.lang.String: null
      e = iwan91.com.github.StackTracePlus.examples.example1.EnumA: null

   Object[2]
   iwan91.com.github.StackTracePlus.examples.example1.ClassC
      b = java.lang.Byte: null
      s = java.lang.Short: null
      i = java.lang.Integer: null
      lL = java.lang.Long: null
      f = java.lang.Float: null
      d = java.lang.Double: null
      bool = java.lang.Boolean: null
      c = java.lang.Character: null

Message:
additional message
```
