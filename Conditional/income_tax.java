package Basic_folder.Conditional;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        int tax=0;
        Scanner sc =new Scanner(System.in);
        float income=sc.nextInt();

        if(income<500000){

            System.out.println("no tax:"+ income);
            System.out.println("Inhand:"+ income/12);
        }
        else if(income >=500000 && income <= 1000000){
            System.out.println("20 percent tax :"+ income*0.2);
            System.out.println("Inhand:"+ income/12);

        }
        else{
            System.out.println("30 percent"+income*0.3);
            System.out.println("Inhand:"+ income/12);

        }
    }
    
}
