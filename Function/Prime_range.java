package Basic_folder.Function;

import java.util.Scanner;

public class Prime_range {

    public static boolean Prime_range(int i)
    {
       
        for (int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2) System.out.println("Invalid Number");
        for(int i=2;i<=n;i++)
        {
           if (Prime_range(i)) {
            System.out.print(i+"  ");
            
           } 
    }
    System.out.println();
}
}

