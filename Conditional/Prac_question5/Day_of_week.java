package Basic_folder.Conditional.Prac_question5;

import java.util.Scanner;

public class Day_of_week {
    public static void main(String[] args) {
//         Write a Java program to input week number(1-7) and print day of week name
// using switch case.

        Scanner sc =new Scanner(System.in);

        switch(sc.nextInt()){
            case 1: System.out.println("sunday"); break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("friday");break;
            case 7: System.out.println("saturday");break;


        }
    }
}
