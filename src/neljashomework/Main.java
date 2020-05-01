package neljashomework;

public class Main {
    public static void main(String[] args) {
        Aine oop = new Aine("RT - 016", "Objektorienteeritud programmeerimine", 5);

        System.out.println(oop.getKood());              //prindib aine koodi
        System.out.println(oop.getNimetus());           //prindib aine nimetuse
        System.out.println(oop.getAinepunktideArv());   //prindib ainepunktide arvu
        System.out.println();

        System.out.println(oop);   //prindib oop aine kõik andmed
        System.out.println("Aine sooritamiseks on vaja läbida " + oop.tundideArv() + " tundi.");
        System.out.println();

        //anname uued andmed
        oop.setNimetus("Automaattestimine");
        oop.setKood("RT - 024");
        oop.setAinepunktideArv(10);

        System.out.println("Uued andmed: " + oop + ". Aine sooritamiseks on vaja läbida " + oop.tundideArv() + " tundi.");
        System.out.println();

        Aine algebra = new Aine("RT-006", "Lineaaralgebra", 7);
        System.out.println(algebra);
        System.out.println(algebra.tundideArv());
        System.out.println();

        Aine enesejuhtimine = new Aine("RT-002", "Enesejuhtimine", 3);
        System.out.println(enesejuhtimine);
        System.out.println(enesejuhtimine.tundideArv());
        System.out.println();

        //Testige konstruktori ja meetodite kasutamist test-klassis
        Aine [] ained = {oop};   //ainete massiiv

        Oppekava robootikaTarkvara = new Oppekava("RT 2019", ained);
        System.out.println(robootikaTarkvara.toString());

        Aine [] uuedAined = {enesejuhtimine, algebra};   //uute ainete massiiv

        robootikaTarkvara.setOppekavaKood("RT 2020");
        robootikaTarkvara.setAined(uuedAined);

        System.out.print("ÕppekavaKood: '" + robootikaTarkvara.getOppekavaKood() + "' ja ained: ");
        for (Aine aine : robootikaTarkvara.getAined()) {
            System.out.print(aine + ", ");
        }
    }
}