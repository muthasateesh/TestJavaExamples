package com.sample.test;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
        obj.method(null); // This will call the method with the String parameter or any wrapper method
    }
// The method method(String) is ambiguous for the type MethodOverloading if we dont comment method(Integer)
	public void method(String arg) {
        System.out.println("String method called");
    }

    public void method(Object arg) {
        System.out.println("Object method called");
    }
 // The method method(Integer) is ambiguous for the type MethodOverloading if we dont comment method(String)
  /*  public void method(Integer arg) {
        System.out.println("Integer method called");
    }*/

}
