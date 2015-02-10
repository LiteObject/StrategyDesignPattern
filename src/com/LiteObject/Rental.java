package com.LiteObject;

/**
 * Created by M on 2/10/2015.
 */
public class Rental {

    private Vehicle rentalVehicle;

    public Rental(Vehicle vehicle){
        this.rentalVehicle = vehicle;
    }

    public String getVehicleName(){
        return this.rentalVehicle.getName();
    }
}
