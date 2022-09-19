package chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticSmallestAndLargestTest {


    @Test
    void sum3Num() {
        ArithmeticSmallestAndLargest myArithmetic = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(60, myArithmetic.AddThreeNum(30, 20, 10));
    }
    @Test
    void sumDivision(){
        ArithmeticSmallestAndLargest myArithmetic = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(20,myArithmetic.sumDivision(60));
    }
    @Test
    void multiplication(){
        ArithmeticSmallestAndLargest myArithmetic = new ArithmeticSmallestAndLargest();
        Assertions.assertEquals(300,myArithmetic.multiplication(3,10,10));
    }
@Test
    void largest(){
    ArithmeticSmallestAndLargest myArithmetic = new ArithmeticSmallestAndLargest();
    Assertions.assertEquals(71, myArithmetic.largestNumber(21, 5, 71));
}
@Test
    void smallest(){
    ArithmeticSmallestAndLargest myArithmetic = new ArithmeticSmallestAndLargest();
    Assertions.assertEquals(5,myArithmetic.smallest(10,20,5));
}

}