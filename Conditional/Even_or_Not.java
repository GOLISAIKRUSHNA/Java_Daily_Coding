package Basic_folder.Conditional;

import java.util.Scanner;

public class Even_or_Not {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int number=s.nextInt();
        if (number%2==0)
        {
        System.out.println("even:"+ number);
        }
        else
        {
        System.out.println("Odd");
        }

    }
}
