package dk.bk.test.assignment.two.assignmenttwotest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {
    Utility util;
    @BeforeEach
    void setUp() {
        util = new Utility();
    }

    @Test
    void TestReverseString(){
        String expected = "dcba";
        String ans = util.reverseString("abcd");
        assertEquals(expected, ans);
    }
    @Test
    void TestReverse2String(){
        String expected = "wert";
        String ans = util.reverseString("trew");
        assertEquals(expected, ans);
    }

    @Test
    void TestCapitalizeString(){
        String expected = "BIG";
        String ans = util.capitalizeString("big");
        assertEquals(expected, ans);
    }
    @Test
    void TestCapitalizeString2(){
        String expected = "SMALL";
        String ans = util.capitalizeString("small");
        assertEquals(expected, ans);
    }
    @Test
    void TestLowercaseString(){
        String expected = "big";
        String ans = util.lowerString("BIG");
        assertEquals(expected, ans);
    }
    @Test
    void TestLowercaseString2(){
        String expected = "small";
        String ans = util.lowerString("SMALL");
        assertEquals(expected, ans);
    }
}