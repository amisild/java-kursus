package kuueshomework;

public class IndiaBanaan extends TavalineBanaan {
    private int k6verus; //0...45 kraadi

    public IndiaBanaan(double kaal, int kypsusaste, String banaanisort, double baashind, int k6verus) {
        super(kaal, kypsusaste, banaanisort, baashind);
        this.k6verus = k6verus;
    }

    public int s2ilivuseInfo() {
        return (10 - kypsusaste) / 2;
    }

    public double hind() {
        if (kaal > 0.2) {
            return baashind * s2ilivuseInfo() * 0.95;
        } else {
            return baashind * s2ilivuseInfo();
        }
    }
}
