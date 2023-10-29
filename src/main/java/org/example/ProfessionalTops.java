package org.example;

/**
 * professional tops class that is a child class of tops
 */
public class ProfessionalTops implements Tops{
    /**
     * overriding method from Tops class prints out these are professional Tops
     */
    @Override
    public void clothingType()
    {
        System.out.println("This piece of clothing is professional tops");
    }
}
