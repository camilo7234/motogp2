package com.umanizales.motogp.controller;

import com.umanizales.motogp.model.Bike;
import com.umanizales.motogp.model.ListDE;
import com.umanizales.motogp.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
        (path="bike")
public class BikeController {
    @Autowired
    private BikeService BikeController;

    @GetMapping (path = "bikes")
    public List<Bike> getbikes(){
        return BikeController.getBikes();
    }
    @PostMapping(path = "addDE")//agregar niños en DE
    public String
    add(@RequestBody Bike bike) {
        return BikeService.add(bike);
    }


    @PostMapping(path = "addToStart")//agregar al inicion en DE
    //igualmente se envia un bike por el body del post
    public String addToStart(@RequestBody Bike bike) {
        return ListDE.addToStart(bike);
    }
    @PostMapping(path = "deletbyposition")//elimina por posicion
    //ingresamos la posicion del bike que queremos eliminar
    public  String deletByPosition(@RequestBody int i){
        return BikeService.deletByPosition(i);
    }
    @PostMapping(path = "deletbydata")
    public String deletByData(@RequestBody String numberBike){
        return BikeService.deletByData(numberBike);
    }
}




}