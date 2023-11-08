package tn.esprit.gestionzoo.exceptions;

public class AnimalAlreadyExistException extends ZooExceptions{

    public AnimalAlreadyExistException(){
        super("Animal is already exist in zoo");
    }
}
