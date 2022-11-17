package com.umanizales.motogp.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
    public class NodeDE {
    private Bike data;
    private NodeDE next;
    private NodeDE previous;

    public NodeDE(Bike bike) {

    }

    public NodeDE() {

    }

    public void setPrevius(Object o) {
    }
}
