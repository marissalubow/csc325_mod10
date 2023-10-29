package org.example;

/**
 * holds all the variations of the casual outfit options
 */
public class CasualOutfitFactory implements OutfitFactory
{

    /**
     * gets and returns a new instance of a casual tops
     */
    public Tops getTops()
    {
        return new CasualTops();
    }

    /**
     * gets and returns a new instance of a casual pants
     */
    public Pants getPants()
    {
        return new CasualPants();
    }

    /**
     * gets and returns a new instance of a casual shoes
     */
    public Shoes getShoes()
    {
        return new CasualShoes();
    }
}
