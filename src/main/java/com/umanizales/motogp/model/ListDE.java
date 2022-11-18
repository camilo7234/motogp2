package com.umanizales.motogp.model;

import ch.qos.logback.core.pattern.parser.Node;
import com.umanizales.motogp.service.BikeService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Data
public class ListDE<BikesService> {
    private static NodeDE head;
    private int size;
    public static List<Bike> getList() {
        NodeDE temp = head;
        List<Bike> list = new ArrayList<>();
        if (head != null) {
            while (temp != null) {
                list.add(temp.getData());
                temp = temp.getNext();
            }
        }
        return list;
    }

    public String add(Bike bike) {
        if (head == null) {
            head = new NodeDE(bike, null, null);
        }
        NodeDE temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        NodeDE newNode = new NodeDE(bike, null, temp);

        temp.setNext(new NodeDE());
        return "la moto se agrego";

        public static String addToStart (Bike bike){
            NodeDE newNode = new NodeDE(bike);
            if (head == null) {
                head = newNode;
            } else {
                newNode.setNext(head);
                newNode.setPrevius(null);
                head = newNode;
            }
            return ListDE.getList().toString();
        }
        @PostMapping(path = "deletbyposition")
        public static String deletByPosition ( @RequestBody int i){
            return ListDE.deletByPosition(i);
        }


        public String deletByData (String Object numberBike;
        numberBike){
            NodeDE temp = head;
            BikesService newlist = (BikesService) new BikeService();

            while (temp != null) {

                if (!Objects.equals(numberBike, temp.getData().getNumberBike())) {
                    BikesService.add(temp.getData());
                }
                temp = temp.getNext();
            }
            head = newlist.head;
            return "eliminado";
        }
    }
    private static String deletByPosition(int i) {}
}