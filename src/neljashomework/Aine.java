package neljashomework;

public class Aine {
    private String kood;
    private String nimetus;
    private int ainepunktideArv;

    public Aine(String kood, String nimetus, int ainepunktideArv) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.ainepunktideArv = ainepunktideArv;
    }

    public Aine() {
    }

    public String getKood() {
        return kood;
    }

    public void setKood(String kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public int getAinepunktideArv() {
        return ainepunktideArv;
    }

    public void setAinepunktideArv(Integer ainepunktideArv) {
        this.ainepunktideArv = ainepunktideArv;
    }

    @Override
    public String toString() {
        return "aine{" +
                "kood='" + kood + '\'' +
                ", nimetus='" + nimetus + '\'' +
                ", ainepunktideArv=" + ainepunktideArv +
                '}';
    }

    //arvutab tundide arvu
    public int tundideArv() {
        return ainepunktideArv * 8;
    }

}
