package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals(true, App.headStart("headwvbwoev"), "INCORRECT");
       assertEquals(true, App.headStart("head"), "INCORRECT");
       assertEquals(true, App.headStart("headnnnnnnnnnnnnnnnnnnnnn"), "INCORRECT");
       assertEquals(true, App.headStart("headf"), "INCORRECT");
       assertEquals(false, App.headStart("hedwvbwoev"), "INCORRECT");
   }

}
