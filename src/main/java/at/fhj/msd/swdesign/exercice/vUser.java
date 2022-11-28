package at.fhj.msd.swdesign.exercice;

/**
* @author Dominik Bregovic, Schendlitz Elena, Antounius Metry Saad, Alexander Kauer
 *
 * description:
 * This class is providing all views to the console for our programm
 */

// here we are making the views HTML CSS and all design stuff

public class vUser {

    private String userName = "";

    public vUser(String name){
        this.userName = name;
    }

    public void getView(){
        System.out.println("\ns(how), c(hange), q(uit)");
    }

    public void viewUsername(){
        System.out.println(this.userName);
    }

    public void newUsername(){
        System.out.print("Enter new user name: ");
    }

    public void notSupported(){
        System.out.print("?");
    }

    public void setUsername(String name){
        this.userName = name;
    }


}
