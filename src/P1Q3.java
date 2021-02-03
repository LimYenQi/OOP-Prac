/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lim Yen Qi
 */
import java.util.Scanner;

public class P1Q3 {
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit card number (8 digits): ");
        int num = scanner.nextInt();
        
        int num1 = num % 10;
        int num2 = ((num % 100) / 10) * 2 ;
        int num3 = (num % 1000) / 100;
        int num4 = ((num % 10000) / 1000) * 2;
        int num5 = (num / 10000) % 10;
        int num6 = ((num / 100000) % 10) * 2;
        int num7 = (num / 1000000) % 10;
        int num8 = (num / 10000000) * 2;
        
        int sum1 = num1 + num3 + num5 + num7;
        int sum2 = (num2 / 10) + (num2 % 10) + (num4 / 10) + (num4 % 10) + (num6 / 10) + (num6 % 10) + (num8 /10) + (num8 % 10);
        int check = (sum1 + sum2) % 10;
        
        if (check == 0) {
            System.out.println("\nYour credit card number,"+num+", is valid.");
        }
        else {
            System.out.println("\nYour credit number,"+num+", is invalid!!");
            System.out.println("The check digit for the valid credit card number should be 0!!");
        }
    }
}
