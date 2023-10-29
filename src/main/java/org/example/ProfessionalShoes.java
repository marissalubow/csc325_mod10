package org.example;

/**
 * professional shoes class that is a child class of shoes
 */
public class ProfessionalShoes implements Shoes{
    /**
     * overriding method from Shoes class prints out these are professional Shoes
     */
    @Override
    public void clothingType()
    {
        System.out.println("These are professional type of shoes");
    }
}
