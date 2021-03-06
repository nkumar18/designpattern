//SignletonTest1_ReflectionAPI.java
package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer1;

public class SignletonTest1_ReflectionAPI {

	public static void main(String[] args) {
		//get single object of single java class using static factory method
		Printer1 p1=Printer1.getInstance();
		System.out.println(p1.hashCode());
		try {
			//get java.lang.Class object representing Printer class
			Class c=p1.getClass();  //getClass() is public method of java.lang.Object class.
			//get All costructor of Printer class
			  Constructor cons[]= c.getDeclaredConstructors();
			  cons[0].setAccessible(true); //gives access to private cosntructor
			  ///create object using the accessed private constructor
			  Printer1 p2=(Printer1)cons[0].newInstance();
			  Printer1 p3=(Printer1)cons[0].newInstance();
			  System.out.println("Objects are created using reflection api");
			  System.out.println(p1.hashCode()+" "+p2.hashCode()+"  "+p3.hashCode());
		}//try
		catch(InstantiationException iae) {
			iae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}//main
}//class
