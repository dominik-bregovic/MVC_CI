package at.fhj.msd.swdesign.exercice;

/**
* @author Dominik Bregovic, Schendlitz Elena, Antounius Metry Saad, Alexander Kauer
 *
 * description:
 * This class is handles writing and reading data from txt, all data accesses and data input
 */

import java.io.*;
import java.util.Scanner;


//model handels data logic interacts with db and other data-sources
public class mUser {

    private Scanner scanner;
    private String name = "";
    private final String dataFile = "data.txt";

    public mUser(){
        this.name = readFromFile();
    }

    private String readFromFile() {

        String data = null;

        try {
            File file = new File(dataFile);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader((dataFile)));

            data = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (data == null) {
            data = "new user";
        }
        return data;
    }

    private void writeToFile(String str) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(dataFile));
            writer.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    public String getInput(){
        if (this.scanner == null){
            this.scanner = new Scanner(System.in);
        }
        return scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        writeToFile(name);
    }
}
