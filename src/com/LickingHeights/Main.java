package com.LickingHeights;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            // write your code here
            Scanner keyboard;
            int userNumber;
            keyboard = new Scanner(System.in);
            System.out.println("Think Of A Question And Give Me A Number Between 1 And 100");
            userNumber = keyboard.nextInt();

            if (userNumber <= 10 && userNumber >= 1) {
                System.out.print("I Think That Is A Yes.");
            }
            if (userNumber <= 20 && userNumber >= 11) {
                System.out.println("The Outcome Looks Good.");
            }
            if (userNumber <= 30 && userNumber >= 21) {
                System.out.println("Don't Count On It.");
            }
            if (userNumber <= 40 && userNumber >= 31) {
                System.out.println("Very Doubtful.");
            }
            if (userNumber <= 50 && userNumber >= 41) {
                System.out.println("Most Likely.");
            }
            if (userNumber <= 60 && userNumber >= 51) {
                System.out.println("As I See It, Yes.");
            }
            if (userNumber <= 70 && userNumber >= 61) {
                System.out.println("My Sources Say No.");
            }
            if (userNumber <= 80 && userNumber >= 71) {
                System.out.println("My Reply Is No.");
            }
            if (userNumber <= 90 && userNumber >= 80) {
                System.out.println("Signs Point To Yes.");
            }
            if (userNumber <= 100 && userNumber >= 91) {
                System.out.println("My Sources Say No");
            }

            if (userNumber>100&&1>userNumber) System.out.println("ERROR");

            }


        }
    }

