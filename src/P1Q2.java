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

public class P1Q2 {
    public static void main (String [] args){
        final int DAYS = 365;
        final int HOURS = 24;
        final int MIN = 60;
        final int SECONDS = 60;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age (years): ");
        int age = scanner.nextInt();
        
        int day = age * DAYS;
        int sec = day * HOURS * MIN * SECONDS;
        
        System.out.println("\nAge in years: "+age+ " years");
        System.out.println("Age in days: "+day+ " days");
        System.out.println("Age in seconds: "+sec+ " seconds");
        
        System.out.println("\nProcess completed. ");
    }
}
