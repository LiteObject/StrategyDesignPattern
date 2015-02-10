package com.LiteObject;

/*
* Define a family of algorithms, encapsulate each one, and make them interchangeable.
* Strategy lets the algorithm vary independently from clients that use it.
* */

public class Main {

    public static void main(String[] args) {

        Rental myRental;

        myRental = new Rental(new Car());
        System.out.println("Rental vehicle: " + myRental.getVehicleName());

        myRental = new Rental(new Truck());
        System.out.println("Rental vehicle: " + myRental.getVehicleName());
    }
}
