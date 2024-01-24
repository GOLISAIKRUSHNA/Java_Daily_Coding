package Basic_folder.Pattern2;

import java.util.Scanner;

public class Inverted_or_Rotated_half_pyramid {
    static void Inverted_or_Rotated_half_pyramid(int row){

        for(int i=1;i<=row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
        System.out.println();

        }

    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int row=sc.nextInt();
        Inverted_or_Rotated_half_pyramid(row);
    }
}
