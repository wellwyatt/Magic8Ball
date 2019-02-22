package com.LickingHeights;
import java.util.Scanner;
public class Main {






    public static void main(String[] args) {
	// write your code here
        Scanner keyboard;
        int userNumber;
        String question;
        keyboard = new Scanner(System.in);

        System.out.println("Think Of A Question And Give Me A Number Between 1 And 100");
        userNumber = keyboard.nextInt();

        if (userNumber<=10&&userNumber>=1) {
            System.out.print("I Think That Is A Yes.");
        }

        else if (userNumber<=20&&userNumber>=11){
            System.out.println("The Outcome Looks Good.");

        }
        else if (userNumber<=30&&userNumber>=21){
            System.out.println("Don't Count On It.");
        }
        else if (userNumber<=40&&userNumber>=31){
            System.out.println("Very Doubtful");
        }
        else if 













    }
}
