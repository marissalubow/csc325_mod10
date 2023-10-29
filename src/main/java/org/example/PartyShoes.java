package org.example;

/**
 * party shoes class that is a child class of shoes
 */
public class PartyShoes implements Shoes
{
    /**
     * overriding method from Shoes class prints out these are party Shoes
     */
    @Override
    public void clothingType()
{
    System.out.println("These are party type of shoes");
}
}
