package org.example;

/**
 * party pants class that is a child class of pants
 */
public class PartyPants implements Pants
{
    /**
     * overriding method from Pants class prints out these are party type of pants
     */
    @Override
    public void clothingType()
    {
        System.out.println("This piece of clothing is party pants");
    }
}
