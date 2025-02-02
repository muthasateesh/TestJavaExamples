package com.sample.test;

import java.util.Arrays;

public class GrowableArray {
	 private int[] array;
	    private int size;

	    public GrowableArray() {
	        array = new int[5]; // Initial capacity
	        size = 0;
	    }

	    // Method to add an element to the array
	    public void add(int element) {
	        if (size == array.length) {
	            // Increase the array size if needed
	            array = Arrays.copyOf(array, array.length * 2);
	        }
	        array[size++] = element;
	    }

	public static void main(String[] args) {
		 GrowableArray ga = new GrowableArray();

	        // Adding elements
	        ga.add(1);
	        ga.add(2);
	        ga.add(3);
	        ga.add(4);
	        ga.add(5);

	        // Printing the elements
	        System.out.print("Array: ");
	        ga.printArray();

	        // Adding more elements
	        ga.add(6);
	        ga.add(7);

	        // Printing the updated array
	        System.out.print("Updated Array: ");
	        ga.printArray();

	        // Removing an element
	        ga.remove(2);  // Remove the element at index 2

	        // Printing the array after removal
	        System.out.print("Array after removal: ");
	        ga.printArray();

	}
    // Method to remove an element at a specific index
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = 0; // Optional: set last element to 0 after removal
    }

    // Method to get the size of the array
    public int getSize() {
        return size;
    }

    // Method to print the elements of the array
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }	

}
