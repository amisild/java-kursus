package kuueshomework;

public class TavalineBanaan {
    public double kaal; //1 banaani kohta
    public int kypsusaste; //1...10 (10 kõige küpsem)
    private String banaanisort;
    public double baashind; //kg eest

    public TavalineBanaan(double kaal, int kypsusaste, String banaanisort, double baashind) {
        this.kaal = kaal;
        this.kypsusaste = kypsusaste;
        this.banaanisort = banaanisort;
        this.baashind = baashind;
    }

    @Override
    public String toString() {
        return "TavalineBanaan{" +
                "kaal=" + kaal +
                ", kypsusaste=" + kypsusaste +
                ", banaanisort='" + banaanisort + '\'' +
                ", baashind=" + baashind +
                '}';
    }

    public int s2ilivuseInfo() {
        return 10 - kypsusaste;
    }

    public double hind() {
        if (kaal > 0.2) {
            return baashind * s2ilivuseInfo() * 0.95;
        } else {
            return baashind * s2ilivuseInfo();
        }
    }
}
