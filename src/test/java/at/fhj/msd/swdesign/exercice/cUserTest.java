package at.fhj.msd.swdesign.exercice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cUserTest {
    public static cUser testObj;

    @BeforeAll
    static void setUp(){
        System.out.println("Setup my test");
        testObj= new cUser();

    }



    @DisplayName("User object test")
    @Test
    public void testModel(){
        assertEquals(testObj.getModel(), testObj.myTestingMethod());
    }


    @DisplayName("User object test")
    @Test
    public void testView(){
        assertEquals(testObj.getView(), testObj.myTestingMethodView());
    }

}