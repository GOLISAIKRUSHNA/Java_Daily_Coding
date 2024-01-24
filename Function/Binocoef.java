
package Basic_folder.Function;


import java.util.Scanner;

public class Binocoef {
   

public static int Fact(int val) {

    int f=1;

    for(int i=1;i<=val;i++){
        f=f*i;
    }

    return f;

}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        System.out.println("Factorial using function:");// func-->  inbuilt :pow,sqrt,max 
        int a=sc.nextInt();                          // userdefined: sai,fact,bino
        int b=sc.nextInt();

        int n=Fact(a);
        int r=Fact(b);
        
        int minus=Fact(a-b);

        System.out.println(n);
        System.out.println(r);
        // System.out.println(n_r);
        // System.out.println(minus);


        int binomialcoef=n/(r*minus);

        System.out.println(binomialcoef);

    
    }
}
