package seitsmeshomework.warehouse;

import seitsmeshomework.product.Product;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.File;

public class Warehouse {

    //shelf arraylist
    private static List<Shelf> shelves = new ArrayList();

    //receive
    public void receive(Product product, String shelfLocation) {
        shelves.add(new Shelf(shelfLocation, product));
    }

    //dispatch
    public String dispatch(Product product) {

        for (Shelf shelf : shelves) {

            if (shelf.getProduct().equals(product)) {
                shelves.remove(shelf);
                return shelf.getShelfLocation();
            }
        }

        return null;
    }

    //getitemcount
    public Integer getItemCount(Product product) {
        int count = 0;

        for (Shelf shelf : shelves) {
            if (shelf.getProduct().equals(product)) {
                count++;
            }
        }

        return count;
    }

    //csv faili kirjutamine
    public static void saveDataToCSVFile(String filepath) {
        File csvfile = new File(filepath);

        try {
            FileWriter fw = new FileWriter(csvfile);
            CSVWriter csvWriter = new CSVWriter(fw);

            List<String[]> data = new ArrayList<>();
            data.add(new String[]{"Shelf location, product name"});

            for (Shelf shelf : shelves) {
                data.add(new String[]{shelf.getShelfLocation(), shelf.getProduct().toString()});
            }

            csvWriter.writeAll(data);
            csvWriter.close();

            JOptionPane.showMessageDialog(null, "Record saved");

        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null, "Record not saved");
        }
    }
}