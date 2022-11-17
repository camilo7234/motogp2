package com.umanizales.motogp.model;


import lombok.Data;

@Data
public class Bike{
    private String numberBike;//id bike
    private String pilot;
    private String color ;
    private String status;



    public Bike(String numberBike, String pilot, String color, String status) {

    }

    public Bike() {

    }
}

