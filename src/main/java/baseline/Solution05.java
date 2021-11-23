/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Davis
 */
package baseline;

import java.util.Scanner;

public class Solution05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        What is the first number? 10
//        What is the second number? 5
//        10 + 5 = 15
//        10 - 5 = 5
//        10 * 5 = 50
//        10 / 5 = 2

        // Ask for first num
        System.out.print("What is the first number? ");
        String firstString = in.next();

        // Ask for second num
        System.out.print("What is the second number? ");
        String secondString = in.next();

        // Parse ints
        int firstInt = Integer.parseInt(firstString);
        int secondInt = Integer.parseInt(secondString);

        // Math and Prints
        System.out.print("\n" + firstInt + " + " + secondInt + " = " + firstInt + secondInt + "\n"
                + firstInt + " - " + secondInt + " = " + (firstInt - secondInt) + "\n"
                + firstInt + " * " + secondInt + " = " + firstInt * secondInt + "\n"
                + firstInt + " / " + secondInt + " = " + firstInt / secondInt + "\n");

    }

}