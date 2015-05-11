package iwan91.com.github.StackTracePlus.examples;

import java.util.ArrayList;
import java.util.List;

public class ClassE extends ClassD implements InterfaceA {
	String s1="classE";
	List<Integer> array=new ArrayList<Integer>();
	
	public ClassE(){
		array.add(5);
		array.add(10);
		array.add(15);
	}
	
	@Override
	public void myMethod() {
	}
}
