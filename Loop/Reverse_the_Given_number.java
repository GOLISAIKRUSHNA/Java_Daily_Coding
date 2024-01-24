package Basic_folder.Loop;

import java.util.Scanner;

public class Reverse_the_Given_number {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner((System.in));
        int num=sc.nextInt();
        int rev=0,digit=0;
        while(num>0){
            
            //Formula rev=rev*10+digit
            digit=num%10;
            rev=rev*10+digit;

            num=num/10;

        }
        System.out.println(rev);
    }
}
