package kolmashomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class homework03 {

    public static void main(String[] args) {
        List<List<String>> fail = filereader();
        temperatuuriArvutused(fail);
    }

    static void temperatuuriArvutused(List<List<String>> fail) {
        for (List<String> andmed : fail) {

            Double keskmineTemperatuur = 0.0;
            int maksimaalneTemperatuur = Integer.valueOf(andmed.get(1));
            int minimaalneTemperatuur = Integer.valueOf(andmed.get(1));
            Double keskmineTemperatuurIlmaEkstreemumiteta = 0.0;

            for (int i = 1; i < andmed.size(); i++) {
                keskmineTemperatuur = keskmineTemperatuur + Integer.valueOf(andmed.get(i));

                if (Integer.valueOf(andmed.get(i)) > maksimaalneTemperatuur) {
                    maksimaalneTemperatuur = Integer.valueOf(andmed.get(i));

                }else if (Integer.valueOf(andmed.get(i)) < minimaalneTemperatuur) {
                    minimaalneTemperatuur = Integer.valueOf(andmed.get(i));
                }
            }

            String location = andmed.get(0);

            keskmineTemperatuurIlmaEkstreemumiteta = (keskmineTemperatuur - minimaalneTemperatuur - maksimaalneTemperatuur) / (andmed.size() - 3);
            double keskmineTemperatuurEkstreemumitetaFinal = Math.round(keskmineTemperatuurIlmaEkstreemumiteta * 100) / 100;

            keskmineTemperatuur = keskmineTemperatuur / (andmed.size() - 1);
            double keskmineTemperatuurFinal = Math.round(keskmineTemperatuur * 100) / 100;

            System.out.println("Linnas " + location + " on keskmine temperatuur " + keskmineTemperatuurFinal + " kraadi.");
            System.out.println("Kõige soojem on " + maksimaalneTemperatuur + " kraadi ning kõige külmem " + minimaalneTemperatuur + " kraadi.");
            System.out.println("Temperatuuride nimekirjas ekstreemumite eemaldades on keskmiseks temperatuuriks " + keskmineTemperatuurEkstreemumitetaFinal + " kraadi.");
            System.out.println();
        }
    }

    static List<List<String>> filereader() {
        List<List<String>> temperatuurid = new ArrayList<List<String>>();

        Scanner skanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Sisesta failinimi: ");
                String failinimi = skanner.nextLine();

                File kaust = new File(System.getProperty("user.dir"));
                System.out.println(kaust);

                File temperatuurideFail = new File(kaust, "./src/kolmashomework/" + failinimi);
                Scanner myReader = new Scanner(temperatuurideFail);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] dataArray = data.split("\t");

                    List dataArrayList = Arrays.asList(dataArray);
                    temperatuurid.add(dataArrayList);
                }

                myReader.close();
                break;

            } catch (FileNotFoundException e) {
                System.out.println("Faili ei eksisteeri");
                e.printStackTrace();

            }
        }
        return temperatuurid;
    }
}