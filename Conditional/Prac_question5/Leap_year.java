package Basic_folder.Conditional.Prac_question5;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {


//         Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.

        Scanner sc =new Scanner(System.in);
        
        int year=sc.nextInt();

        if((year%4==0) || (year%400==0))System.out.println("leap year");
        else if ((year%100==0) && (year%400==0)) System.out.println("leap year");
        else System.out.println("not leap year");






    }
}
