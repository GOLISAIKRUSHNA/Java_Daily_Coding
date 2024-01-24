package Basic_folder.Loop.Quest_Loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {


//         Write a program to print the multiplication table of a number N, entered by the
// user.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(n+"*"+i+"="+ n*i);
            
        }

    }
}
