package org.example;

/**
 * casual tops class that is a child class of tops
 */
public class CasualTops implements Tops
{
    /**
     * overriding method from Tops class prints out these are casual Tops
     */
    @Override
    public void clothingType()
    {
        System.out.println("This piece of clothing is casual tops");
    }
}
