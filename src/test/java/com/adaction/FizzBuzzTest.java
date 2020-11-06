package com.adaction;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FizzBuzzTest
{
    @Test
    public void testFizzBuzzWorksWith0Input() throws Exception {
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLuckyAndCount(0));
        assertEquals("fizz: 0\n" +
                "buzz: 0\n" +
                "fizzbuzz: 0\n" +
                "lucky: 0\n" +
                "integer: 0", output.trim());
    }


    @Test
    public void testFizzBuzzWorksTo20() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLuckyAndCount(20));
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz \n" +
                "fizz: 4\n" +
                "buzz: 3\n" +
                "fizzbuzz: 1\n" +
                "lucky: 2\n" +
                "integer: 10", output.trim());
    }

    @Test
    public void testFizzBuzzWorksTo40() throws Exception{
        String output = tapSystemOut(() -> FizzBuzz.calcFizzBuzzWithLuckyAndCount(40));
        assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 lucky fizz buzz 26 fizz 28 29 lucky lucky lucky lucky lucky lucky lucky lucky lucky lucky buzz \n" +
            "fizz: 7\n" +
            "buzz: 5\n" +
            "fizzbuzz: 1\n" +
            "lucky: 13\n" +
            "integer: 14", output.trim());
    }
}
