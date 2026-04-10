package com.pluralsight;

import java.util.*;

class CalculatorApp

{

    public static void main(String[] args)

    {

        Scanner myScanner = new Scanner(System.in);

// get two numbers, add them together, and display the sum
        System.out.print("Enter first number: ");

        int num1 = myScanner.nextInt();

        System.out.print("Enter second number: ");

        int num2 = myScanner.nextInt();

        int sum = num1 + num2;

// select what you want to do with your numbers
        System.out.println();
        System.out.println("Possible calculations: ");
        System.out.println("---------------------------");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("---------------------------");
        System.out.print("Select an option (A, S, M, D): ");

// gives sum of your 2 IN ORDER numbers depending on what option you selected
        String option = myScanner.next();

        if (option.equals("A")) {
            System.out.println("The sum is: " + (num1 + num2));
        }

        else if (option.equals("S")) {
            System.out.println("The sum is: " + (num1 - num2));
        }

        else if (option.equals("M")) {
            System.out.println("The sum is: " + (num1 * num2));
        }

        else if (option.equals("D")) {
            System.out.println("The sum is: " + (num1 / num2));
        }

        else {
            System.out.println("Invalid option, please try again");
        }


    }

}
