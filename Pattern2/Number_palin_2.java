package Basic_folder.Pattern2;

import java.util.Scanner;

import Basic_folder.Loop.for_loop;

public class Number_palin_2 {
    static void Number_palin_2(int n){


        //space + des + asc  by mam
        // for(int i=1;i<=n;i++){

        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }
        


        //own logic
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int c=i;
            for(int j=i;j>=1;j--){
                System.out.print(c);
                c--;
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }


    }

    
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);

        // int row=sc.nextInt();
        Number_palin_2(4);
    }
}
