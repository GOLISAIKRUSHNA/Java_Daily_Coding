package Basic_folder.Loop;

import java.util.Scanner;

public class _1_to_N_numbers {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner((System.in));
        int range=sc.nextInt();
        while(count<=range)
        {
        System.out.print(count+" ");
        count=count+1;
        
    }
    System.out.println();
    System.out.println("within 4 sec");
    }
}
