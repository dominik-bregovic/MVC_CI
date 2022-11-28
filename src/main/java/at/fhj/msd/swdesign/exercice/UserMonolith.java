package at.fhj.msd.swdesign.exercice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

/**
 * @author YourName
 * 
 * description:
 * 
 */
public class UserMonolith {

    private final String dataFile = "data.txt";
    private String name;


    private Scanner scanner;

    public UserMonolith() {
        name = readFromFile();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "User: name=" + name;
    }


    //////////////////////////////////////UserInterface view is here the console, consider real gui
    public void startUI() {

        scanner = new Scanner(System.in);
        boolean isRunning = true;
        do {
            System.out.println("\ns(how), c(hange), q(uit)");

            Character c = scanner.nextLine().charAt(0);
            switch (c) {
                case 'q':
                    isRunning = false;
                    break;

                case 's':
                    System.out.println(toString());
                    break;

                case 'c':
                    System.out.print("Enter new user name: ");
                    String newName = scanner.nextLine();

                    setName(newName);
                    writeToFile(getName());
                    break;
                default:
                    System.out.print("?");
            }

        } while (isRunning);
   }
   ///////////////////////////////////////////////////////////////


///////////////////////////////////////////////Data/saving singelten get object to write into file
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
    ///////////////////////////////////////////////
/////////////////////////////////mixed ask controller for view
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

    public static void main(String[] args) {

        UserMonolith u = new UserMonolith();
        u.startUI();

    }
}
