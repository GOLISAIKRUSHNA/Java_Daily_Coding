package Basic_folder.Pattern1;

import java.util.Scanner;

public class Char_pattern {
    public static void main(String[] args) {
        
        char val='A';
      
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(val);
                val++;   
            }
            System.out.println();
        }
    }
    }
    

