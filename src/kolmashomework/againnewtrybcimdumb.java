//marguse hw

package kolmashomework;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.Math;

public class againnewtrybcimdumb {
    public static void main(String[] args) {

        List<List<String>> vormistatudFail = faililugeja();
        temperatuurAnalüüs(vormistatudFail);

    }

    static void temperatuurAnalüüs(List<List<String>> vormistatudFail){

        for (List<String> strings : vormistatudFail) {
            Double averageTemperature = 0.0;
            Double averageTemperatureNonextremities = 0.0;
            int maxTemperature = Integer.parseInt(strings.get(1));
            int minTemperature = Integer.parseInt(strings.get(1));
            for (int j = 1; j < strings.size(); j++) {
                averageTemperature = averageTemperature + Integer.parseInt(strings.get(j));
                if (Integer.parseInt(strings.get(j)) > maxTemperature) {
                    maxTemperature = Integer.parseInt(strings.get(j));
                } else if (Integer.parseInt(strings.get(j)) < minTemperature) {
                    minTemperature = Integer.parseInt(strings.get(j));
                }

            }

            averageTemperatureNonextremities = (averageTemperature - minTemperature - maxTemperature) / (strings.size() - 3);
            double roundedAverageTemperatureNonextremities = Math.round(averageTemperatureNonextremities * 100) / 100;
            averageTemperature = averageTemperature / (strings.size() - 1);
            double roundedAverageTemperature = Math.round(averageTemperature * 100) / 100;

            String location = strings.get(0);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Asukoht: " + location);
            System.out.println("Keskmine temperatuur: " + roundedAverageTemperature);
            System.out.println("Kõrgeim temperatuur: " + maxTemperature);
            System.out.println("Madalaim temperatuur: " + minTemperature);
            System.out.println("Ektreemumita keskmine temperatuur: " + roundedAverageTemperatureNonextremities);
        }
    }

    static List<List<String>> faililugeja(){

        List<List<String>> temperatuurid = new ArrayList<List<String>>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Sisesta otsitud failinimi koos selle laiendiga, et asukoha keskmine temperatuur");
                String failinimi = scan.nextLine();
                File kaust = new File(System.getProperty("user.dir"));
                System.out.println(kaust);
                File temperatuurideFail = new File(kaust,"./src/kolmashomework/" + failinimi);
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
                System.out.println("Sellist faili ei ole süsteemis");
                e.printStackTrace();
            }
        }

        return temperatuurid;
    }
}