package com.example.artifactidwebservice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquaredCalculatorTest {

    private SquaredCalculator squaredCalculator = new SquaredCalculator();
    private CacheHelper cacheHelper = new CacheHelper();

    @Before
    public void setUp() throws Exception {
        squaredCalculator.setCache(cacheHelper);
    }

    @Test
    public void whenCalculatingSquareValueOnce_thenCacheDontHaveValues() {
        for (int i = 1; i < 15; i++) {
            assertFalse(cacheHelper.getSquareNumberCache().containsKey(i));
            System.out.println("Square value of " + i + " is: " + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }
    }

    @Test
    public void whenCalculatingSquareValueAgain_thenCacheHasAllValues() {
        for (int i = 10; i < 20; i++) {
            assertFalse(cacheHelper.getSquareNumberCache().containsKey(i));
            System.out.printf("Square value of " + i + " is: " + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }

        for (int i = 10; i < 20; i++) {
            assertTrue(cacheHelper.getSquareNumberCache().containsKey(i));
            System.out.printf("Square value of " + i + " is: " + squaredCalculator.getSquareValueOfNumber(i) + "\n");
        }
    }
}