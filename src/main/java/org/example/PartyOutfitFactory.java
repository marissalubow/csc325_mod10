package org.example;

/**
 * holds all the variations of the party outfit options
 */
public class PartyOutfitFactory implements OutfitFactory
{
    /**
     * gets and returns a new instance of party tops
     */
    public Tops getTops() {
        return new PartyTop();
    }
    /**
     * gets and returns a new instance of party pants
     */
    public Pants getPants() {
        return new PartyPants();
    }
    /**
     * gets and returns a new instance of party shoes
     */
    public Shoes getShoes() {
        return new PartyShoes();
    }
}
