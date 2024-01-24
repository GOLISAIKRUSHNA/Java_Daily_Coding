package Basic_folder.Array;

import java.util.Scanner;

public class gcd_two_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int all[]=new int[10];

        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        int s=0;
        for(int i=2;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
                s=i;

            }
        // System.out.println("Final Gcd: "+ i);

        }
        System.out.println(" Gcd of two Number: "+ s);


    }
}
