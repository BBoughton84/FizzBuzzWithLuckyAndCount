package com.adaction;

/**
 * Created by billboughton on 11/5/20.
 */
public class FizzBuzz {
    public static void calcFizzBuzzWithLuckyAndCount(int n){
        int numLucky=0, numFizzBuzz=0, numFizz=0, numBuzz=0, numInt=0;
        String lucky = "lucky";
        String fizz = "fizz";
        String buzz = "buzz";

        for (int i = 1; i <= n; i++){
            boolean isDivisibleBy3 = i % 3 == 0;
            boolean isDivisibleBy5 = i % 5 == 0;
            if (String.valueOf(i).contains("3")){
                numLucky += 1;
                System.out.print(lucky + " ");
            } else if (isDivisibleBy3 && isDivisibleBy5){
                numFizzBuzz += 1;
                System.out.print(fizz + buzz + " ");
            } else if (isDivisibleBy3) {
                numFizz += 1;
                System.out.print(fizz + " ");
            } else if (isDivisibleBy5) {
                numBuzz += 1;
                System.out.print(buzz + " ");
            } else {
                numInt += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(fizz + ": " + numFizz);
        System.out.println(buzz + ": " + numBuzz);
        System.out.println(fizz + buzz + ": " + numFizzBuzz);
        System.out.println(lucky + ": " + numLucky);
        System.out.println("integer: " + numInt);
    }
}
