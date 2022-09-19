package chapter2;

import chapter2.ComparingNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class ComparingNumbersTest {
     ComparingNumbers myComparing;
    @BeforeEach
     void setUp(){
        myComparing = new ComparingNumbers(15);
    }
    @Test
     void checkObjectNotNull(){
        Assertions.assertNotNull(myComparing);
    }
    @Test
     void numberIsGreaterThan100(){
        Assertions.assertEquals(false, myComparing.numberIsGreaterThan100());
    }
    @Test
     void numberIsLessThan100(){
        Assertions.assertEquals(true,myComparing.numberIsLessThan100());
    }
    @Test
     void numberEqual100(){
        Assertions.assertEquals(false,myComparing.numberEqual100());
    }
    @Test
     void numberNotEqual100(){
        Assertions.assertEquals(true,myComparing.numberNotEqual100());
    }
    @Test
     void squareNumberIsGreaterThan100(){
        Assertions.assertEquals(true,myComparing.squareNumberIsGreaterThan100());
    }
    @Test
     void squareNumberIsLessThan100(){
        Assertions.assertEquals(false,myComparing.squareNumberIsLessThan100());
    }
    @Test
     void squareNumberEqualTo100(){
        Assertions.assertEquals(false,myComparing.squareNumberEqualTo100());
    }
    @Test
     void squareNumberNotEqualTo100(){
        Assertions.assertEquals(true, myComparing.squareNumberNotEqualTo100());
    }
 }