package org.example;

/**
 * casual pants class that is a child class of pants
 */
public class CasualPants implements Pants
{
    /**
     * overriding method from Pants class prints out these are casual type of pants
     */
    @Override
    public void clothingType()
    {
        System.out.println("This piece of clothing is casual pants");
    }

}
