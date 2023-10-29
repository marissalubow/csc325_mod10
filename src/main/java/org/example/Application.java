package org.example;

/**
 * Application class describes each of the different types of outfit options
 */
public class Application
{
    private Tops tops;
    private Pants pants;
    private Shoes shoes;

    /**
     * paramerterized constructor
     */
    public Application(OutfitFactory factory)
    {
        tops = factory.getTops();
        pants = factory.getPants();
        shoes = factory.getShoes();
    }

    /**
     * method that will display all the different outfit variations
     */
    public void showOutfit()
    {
        tops.clothingType();
        pants.clothingType();
        shoes.clothingType();

    }


}
