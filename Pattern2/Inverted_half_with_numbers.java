package Basic_folder.Pattern2;

import java.util.Scanner;

public class Inverted_half_with_numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int row=sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
            System.out.print(j);

            }
        System.out.println();

        }
    }
}
