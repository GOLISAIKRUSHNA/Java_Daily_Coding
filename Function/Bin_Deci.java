package Basic_folder.Function;

import java.util.Scanner;

public class Bin_Deci {
   static void Bin_Number(int Bin_val){

        int initial=Bin_val;
        int deci=0;
        int pow=0;

        while (Bin_val>0) {
            int ld=Bin_val%10;
           deci=deci+ld*(int)Math.pow(2,pow);

           Bin_val=Bin_val/10;
           pow++;





        }
        System.out.println("Binary of:"+ initial+"  to decimal number is:" + deci);


    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int Bin_val=sc.nextInt(); 
        
        Bin_Number(Bin_val);
    }
}
