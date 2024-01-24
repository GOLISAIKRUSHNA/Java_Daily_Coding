package Basic_folder.Loop.Quest_Loop;

import java.util.*;
/**
 * InnerPrime_or_not
 */
class Prime_or_not{
    public static void main(String[] args) {
        int prime=0;

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=2;i<num;i++){
            if(num%i==0){
                // System.out.println("not prime"+num);
                prime=1;
            }
        }
        if(prime==0){
            System.out.println("prime"+ num);
            System.exit(0);
        }
        else{
        } System.out.println("Not Prime"+num);

    }
}