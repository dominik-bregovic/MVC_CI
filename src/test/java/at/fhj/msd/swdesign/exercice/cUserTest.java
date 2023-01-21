package at.fhj.msd.swdesign.exercice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cUserTest {
    public static cUser model;

    @BeforeAll
    static void setUp(){
        System.out.println("setup");
        model= new cUser();
    }



    @DisplayName("User object test")
    @Test
    public void testModel(){
        assertEquals("", model.myTestingMethod());
    }
}