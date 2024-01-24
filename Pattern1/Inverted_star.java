
package Basic_folder.Pattern1;

import java.util.Scanner;

public class Inverted_star {

    public static void main(String[] args) {
        
        System.out.println("Inverted star");

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}