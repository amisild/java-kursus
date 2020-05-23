package kuueshomework;

public class Test {
    public static void main(String[] args) {

        TavalineBanaan b1 = new TavalineBanaan(0.204, 6, "Cavendishi banaan", 1.16);
        TavalineBanaan b2 = new TavalineBanaan(0.190, 9, "Cavendishi banaan", 1.01);
        TavalineBanaan b3 = new TavalineBanaan(0.300, 2, "Cavendishi banaan", 0.95);
        TavalineBanaan b4 = new TavalineBanaan(0.199, 5, "Cavendishi banaan", 1.00);
        TavalineBanaan b5 = new TavalineBanaan(0.328, 1, "Cavendishi banaan", 1.25);
        TavalineBanaan b6 = new TavalineBanaan(0.182, 7, "Cavendishi banaan", 0.99);
        TavalineBanaan b7 = new TavalineBanaan(0.293, 10, "Cavendishi banaan", 1.21);
        IndiaBanaan b8 = new IndiaBanaan(0.340, 8, "India banaan", 1.30, 15);
        IndiaBanaan b9 = new IndiaBanaan(0.156, 4, "India banaan", 1.23, 45);
        IndiaBanaan b10 = new IndiaBanaan(0.263, 3, "India banaan", 1.21, 13);
        IndiaBanaan b11 = new IndiaBanaan(0.182, 9, "India banaan", 1.12, 10);
        IndiaBanaan b12 = new IndiaBanaan(0.184, 0, "India banaan", 1.05, 38);

        TavalineBanaan[] banaanid = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12};

        for (TavalineBanaan i : banaanid) {
            System.out.println(i);
            System.out.println("See banaan säilib veel " + i.s2ilivuseInfo() + " päeva.");
            System.out.println("Selle banaani hind on " + i.hind() + " eurot kg kohta.");
            System.out.println();
        }
    }
}
