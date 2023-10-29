package org.example;

/**
 * party tops class that is a child class of tops
 */
public class PartyTop implements Tops
{
    /**
     * overriding method from Tops class prints out these are partyTops
     */
    @Override
    public void clothingType()
{
    System.out.println("This piece of clothing is party tops");
}
}
