package com.umanizales.motogp.service;
import com.umanizales.motogp.model.ListDE;
import com.umanizales.motogp.model.Bike;
import lombok.Data;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class BikeService {
    private List<Bike> bikes;


    public BikeService() {
        bikes = new ArrayList<>();
        bikes.add(new Bike("001", "carlos","blue","activo"));
        bikes.add(new Bike("002", "german","red","activo"));
    }

    public String addToStart(Bike bike){
        ListDE.addToStart(bike);
        return "Se agrego";
    }

    public static String deletByPosition(int i){
        return ListDE.deletByPosition(i);
    }

    public static String deletByData(String numberBike){
        BikeService listDE = new BikeService();
        return listDE.deletByData(numberBike);
    }
    public static String add(Bike bike){
        return ListDE.add(bike);
    }
}



}