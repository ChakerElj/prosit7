package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("I'm eating "+meat.toString().toLowerCase());
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("I'm eating "+plant.toString().toLowerCase());

    }

    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("I'm eating "+food.toString().toLowerCase() + " "+ Food.MEAT.toString().toLowerCase() +" and "+Food.PLANT.toString().toLowerCase());
    }
}
