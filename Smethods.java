package Day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Smethods {
	public static void main (String args[]) {
		
	
	String name="shivarekka";
	String name1="shivarekka";
	String name2="SHIVAREKKA";
	 char a=name.charAt(5);
	 System.out.println(a);
	 String b=name.toLowerCase();
	 System.out.println(b);
	 String c=name.toUpperCase();
	 System.out.println(c);
	 boolean d=name.equals(name1);
	 System.out.println(d);
	 int e=name.length();
	 System.out.println(e);
	 String f=name.trim();
	 System.out.println(f);
	 String h=name.substring(2,5);
	 System.out.println(h); //starting is index ending is length
	 boolean i=name.equalsIgnoreCase(name2);
	 System.out.println("anssssssss"+i);
	 boolean j=name.startsWith("s");
	 System.out.println(j);
	 boolean k=name.endsWith("S");
	 System.out.println(k);
	 String l=name.concat(" M");
	 System.out.println(l);
	   String []sts = name.split("kk");//in order to split + we have to use(// +)
	   System.out.println(Arrays.toString(sts));
	   
	 System.out.println(sts[0]);
	 
	 String st = "hello world";
       char[] de =	 st.toCharArray();
	 System.out.println(Arrays.toString(de));
	 
	 System.out.println(de.length);
	 
	 int index= st.indexOf("world");
	 System.out.println("index of : "+index);
	 

	 
			 
	
	
	
	
	}
}
