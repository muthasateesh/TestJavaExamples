/**
 * 
 */
package com.sample.test;

public class ImmutableDemo {

	public static void main(String[] args) {
		EmployeePojo emp=new EmployeePojo("ABC123");
		String s1=emp.getPanCardNumber();
		System.out.println("Pan card Number "+s1);
	}

}
// if class name is same we can declare public final class
final class EmployeePojo{
	final String panCardNumber;
	public EmployeePojo(String panCardNumber) {
		this.panCardNumber=panCardNumber;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
}
