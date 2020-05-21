package viieshomework;

import java.util.*;

public class ProductTester {

    //kasutaja input tekstina
    public static String userInput() {
        Scanner skanner = new Scanner(System.in);
        return skanner.nextLine();
    }

    //kasutaja input arvuna
    public static Integer userInputAsInteger() {
        Scanner skanner = new Scanner(System.in);
        return skanner.nextInt();
    }

    //kasutaja input komaarvuna
    public static Double userInputAsDouble() {
        Scanner skanner = new Scanner(System.in);
        return skanner.nextDouble();
    }

    public static void main(String[] args) {

        Vendor helios = new Vendor("Helios kirjastus", "Tallinna tn 50", "Kean Garrett", "5306298");
        Vendor pegasus = new Vendor ("Pegasus", "Jakobsoni tn 15", "Larissa Carrillo", "58272047");

        Author rowling = new Author(helios,"J. K. Rowling");
        Author king = new Author(pegasus, "Stephen King");


        //loon uued produktid
        Product Grindelwald = new Product(92578, "The Crimes of Grindelwald", 569, 35.49, helios, rowling);
        Product KiteRunner = new Product (66230, "The Kite Runner", 302, 8.79, pegasus, king);
        Product RikasIsa = new Product (27931, "Rikas isa, vaene isa", 83, 16.99, pegasus, king);
        Product Carrie = new Product (93626, "Carrie", 155, 15.29, helios, rowling);
        Product Jaapan = new Product (23003, "Õhk riisiterade vahel. Kaheksa aastat Jaapanis", 641, 9.99, helios, rowling);
        Product Matemaatika = new Product (61827, "Matemaatika õhtuõpik", 375, 27.99, pegasus, king);

        //products in array
        /*Product[] produktid = {Grindelwald, KiteRunner, RikasIsa, Carrie, Jaapan, Matemaatika};
        for (Product i : produktid) {
            System.out.println(i.toString());
        }*/

        //products in arraylist
        ArrayList<Product> product = new ArrayList<Product>();
        product.add(Grindelwald);
        product.add(KiteRunner);
        product.add(RikasIsa);
        product.add(Carrie);
        product.add(Jaapan);
        product.add(Matemaatika);

        while (true) {
            System.out.println();
            System.out.println("Jätkamiseks vajuta j. Lahkumiseks ükskõik, millist muud klahvi.");
            if (userInput().equals("j")) {
                System.out.println("Sisesta oma raamatu number:");
                Integer userProductNumber = userInputAsInteger();
                System.out.println("Sisesta oma raamatu pealkiri:");
                String userProductName = userInput();
                System.out.println("Sisesta oma raamatu arv laos:");
                Integer userNumberOfUnitsInStock = userInputAsInteger();
                System.out.println("Sisesta oma raamatu hind:");
                Double userProductPrice = userInputAsDouble();

                //lisab user inputi arraylisti
                product.add(new Product(userProductNumber, userProductName, userNumberOfUnitsInStock, userProductPrice));
            } else {
                break;
            }
        }

        //System.out.println(product);     //prindib kõik produktid ühele reale
        for (int i = 0; i < product.size(); ++i) {   //prindib kõik produktid eraldi ridadele
            System.out.println(product.get(i).toString());
        }
    }
}