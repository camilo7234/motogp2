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


    //metodo el cual me devuelve la lista de kid
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
            //guardamos al bike en un nodo DE y lo guardamos en la head
            head = new NodeDE(bike, null, null);
        } 
            NodeDE temp = head;//creamos un temporal y lo igualamos a la cabeza
            while (temp.getNext() != null) {//mientras que el siguiente del temporal sea diferente a null
                temp = temp.getNext();//temporal pasa a ser el seguiente

            }
 

            NodeDE newNode = new NodeDE(bike, null, temp);
            //guardamos al nuevo nodo en el siguiente del temporal
            temp.setNext(new NodeDE());
    return"la moto se agrego";

    public static String addToStart(Bike bike) {
        NodeDE newNode = new NodeDE(bike);
        if (head == null) {
            //guardamos al nuevo nodoDE en la cabeza
            head = newNode;
        } else {
            //primero conectamos la cabeza con el siguiente
            newNode.setNext(head);
            //aseguramos que el nuevo tenga su previus
            newNode.setPrevius(null);
            //le decimo que el nuevo head va a se el nuevoNodeDE
            head = newNode;
        }

        return ListDE.getList().toString();


    }
    @PostMapping(path = "deletbyposition")
    public static String deletByPosition(@RequestBody int i){
        return ListDE.deletByPosition(i);
    }


    public String deletByData(String Object numberBike;
        numberBike){
        NodeDE temp=head;//creamos un temporal tipo NodeDE y lo igualamos a la head
        BikesService newlist= (BikesService) new BikeService();//creamos una nueva lista DE

        while (temp!=null) {//temporal debe recorrer toda la lista

            if (!Objects.equals(numberBike, temp.getData().getNumberBike())){//identificador diferente al que contiene el dato
                BikesService.add(temp.getData());//agregamos en la nueva lista

            }
            temp=temp.getNext();//temporal pasa a ser su siguiente

        }
        head=newlist.head;//head de la nueva lista pasa a ser la head de la princiapal
        return "eliminado";
    }
}

    private static String deletByPosition(int i) {
    }
