package org.example;

/**
 * professional pants class that is a child class of pants
 */
public class ProfessionalPants implements Pants
{
    /**
     * overriding method from Pants class prints out these are professional type of pants
     */
    @Override
    public void clothingType()
    {
        System.out.println("This piece of clothing is professional pants");
    }
}
