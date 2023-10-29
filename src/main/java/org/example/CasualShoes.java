package org.example;

/**
 * casual shoes class that is a child class of shoes
 */
public class CasualShoes implements Shoes
{
    /**
     * overriding method from Shoes class prints out these are casual Shoes
     */
    @Override
    public void clothingType()
    {
        System.out.println("These are casual type of shoes");
    }

}
