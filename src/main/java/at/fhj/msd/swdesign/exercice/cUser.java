package at.fhj.msd.swdesign.exercice;

import java.awt.*;

/**
 * @author Dominik Bregovic, Schendlitz Elena, Antounius Metry Saad, Alexander Kauer
 *
 * description:
 * This class is handling all of the data requests over the model and combines them with the necessary views
 */


//controller does not handle data logic or db requests
//controller has to handle incoming data and validate and the send request to the model in order to recieve a result over the model and the db
//then this data gets send to the view, which is representing the data to my ui Html and css is here
// when the presentation stuff is done, the controller should get the result and send it to the user. All the interaction are done to the view over controller



public class cUser {
    private char choice;
    private vUser view;
    private mUser model;

//Outcommented for testing purposes
    public cUser() {
        initialize();
        startView();
    }

    /**
     * Initilizing the application with calling the model and the view to the controller
     */
    private void initialize(){
        this.model = new mUser();
        this.view = new vUser(model.getName());
    }

    /**
     * Starting view-UI from a private method
     */
    private void startView(){
        //startUI();
        System.out.println("\nHere runs our application\n");
    }

    /**
     * read input choice from user
     */
    protected void getChoice(){
        this.choice = this.model.getInput().charAt(0);
    }


    /**
     * Getting the Username from user and save it to the model
     * @return the name with calling it from the model
     */
    public String getUsername(){
        model.setName(model.getInput());
        return this.model.getName();
    }

    /**
     * starting our UI over the view and the logic of the controller
     */
    public void startUI() {

        boolean isRunning = true;
        do {
            this.view.getView();
            getChoice();
            switch (this.choice) {
                case 'q':
                    isRunning = false;
                    break;

                case 's':
                    this.view.viewUsername();
                    break;

                case 'c':
                    this.view.newUsername();
                    this.view.setUsername(getUsername());
                    this.model.setName(this.model.getName());
                    break;
                default:
                    this.view.notSupported();
            }

        } while (isRunning);
    }

    /**
     * The first method to check if tests are being called
     * @return a empty string for testing
     */
    public String myTestingMethod(){
        return  "";
    }

}
