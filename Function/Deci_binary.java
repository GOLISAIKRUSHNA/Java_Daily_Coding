package Basic_folder.Function;

import java.util.Scanner;

public class Deci_binary {

    static void Deci_binary(int n){

        int pow=0;
        int bin=0;
        
        while (n>0)
         {
            int rem =n%2;
            bin=bin+rem*(int)Math.pow(10, pow);

            n=n/2;
            pow++;
            
        }

        System.out.println("Binary to Decimal is:" +bin);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input number:");
        Deci_binary(sc.nextInt());
    }
}
