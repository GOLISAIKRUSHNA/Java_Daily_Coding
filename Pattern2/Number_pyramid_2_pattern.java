package Basic_folder.Pattern2;

import java.util.Scanner;

public class Number_pyramid_2_pattern {
    static void Number_pyramid_pattern(int n){


        //Ma'am method shradha
        // for(int i=1;i<=n;i++){

        //    for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //    }
        //    for(int j=1;j<=i;j++){
        //     System.out.print(i+" ");
        //    }
        //    System.out.println();

        // }

        //own logic
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
             System.out.print(" ");
            }
            int c=1;
            for(int j=1;j<=((2*i)-1);j++){
                if(c%2==0){
                System.out.print(" ");
                }
                else{
                System.out.print(i);}
                c++;

            }
            System.out.println();
 
         }
    }

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int row=sc.nextInt();
        Number_pyramid_pattern(row);
    }
}
