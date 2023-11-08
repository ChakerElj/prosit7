package tn.esprit.gestionzoo.exceptions;

public class ZooFullException extends ZooExceptions{

    public ZooFullException(){
        super("Zoo is full you cannot add a new animal ");
    }
}
