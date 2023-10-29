package org.example;
import java.util.Scanner;
/**
 * driver class, contains the main method of program
 */
public class DriverClass
{
    //using factory design pattern
    private static Application configureApplication() {

        Application app;
        OutfitFactory factory;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter casual, professional, or party");
        String clothingType = scnr.nextLine();


        if (clothingType.contains("professional")) {
            factory = new  ProfessionalOutfitFactory();
            app = new Application(factory);
        }
        else if (clothingType.contains("casual")) {
            factory = new CasualOutfitFactory();
            app = new Application(factory);
        }
        else {
            factory = new PartyOutfitFactory();
            app = new Application(factory);
        }
        return app;
    }
    /**
     * main method starting point of program
     */
    public static void main(String[] args)
    {
        Application app = configureApplication();
        app.showOutfit();
    }

}