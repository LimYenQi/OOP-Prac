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

public class P1Q1 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your year of study: ");
        int year = scanner.nextInt();
        
        System.out.println("What is your target GPA for this semester? ");
        double gpa = scanner.nextDouble();
        
        System.out.println("\nWelcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of "+gpa+" this semester of your Year "+year+".");
    }
}
