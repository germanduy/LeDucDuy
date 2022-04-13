package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Complex so1 = new Complex(4.2,5.6);
        Complex so2 = new Complex(5.6,-4.5);
        System.out.println(so1.toString(so1.add(so2)));
        System.out.println(so1.toString(so1.subtract(so2)));
        System.out.println(so1.toString(so1.multiply(so2)));
        System.out.println(so1.toString(so1.divide(so2)));
    }
}
