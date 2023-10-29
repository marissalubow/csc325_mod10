package org.example;

/**
 * holds all the variations of the professional outfit options
 */
public class ProfessionalOutfitFactory implements OutfitFactory {


    /**
     * gets and returns a new instance of professional tops
     */
    public Tops getTops()
    {
        return new ProfessionalTops();
    }

    /**
     * gets and returns a new instance of a professional pants
     */
    public Pants getPants()
    {
        return new ProfessionalPants();
    }

    /**
     * gets and returns a new instance of a professional shoes
     */
    public Shoes getShoes()
    {
        return new ProfessionalShoes();
    }
}
