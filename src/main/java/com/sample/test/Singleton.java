package com.sample.test;

import java.io.Serializable;
//Implemented Serializable interface: This allows the Singleton class to be serialized.
public class Singleton implements Serializable {
	// Added serialVersionUID: This is recommended for Serializable classes to ensure version compatibility during deserialization.
    private static final long serialVersionUID = 1L; // Added for serialization
    private static volatile Singleton instance; // volatile can be added to the singleton instance to ensure proper visibility across threads
    
    private Singleton() {}
    
    public static Singleton getInstance() {
    	  if (instance == null) {
              synchronized (Singleton.class) {
                  if (instance == null) {
                      instance = new Singleton();
                  }
              }
          }
        return instance;
    }
    
    // Override readResolve to return the existing instance when we use serialization
    private Object readResolve() {
   //Overridden readResolve method: This method ensures that the Singleton instance is returned during deserialization 	
        return getInstance();
    }
}
