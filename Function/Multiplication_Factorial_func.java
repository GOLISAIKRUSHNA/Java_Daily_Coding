package Basic_folder.Function;

import java.util.Scanner;

public class Multiplication_Factorial_func {
    public static int  multi(int val1,int val2){
        return val1*val2;
    }

public static int Fact(int val) {

    int f=1;

    for(int i=1;i<=val;i++){
        f=f*i;
    }

    return f;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Multiplication of Two number:");
        System.out.println(multi(sc.nextInt(),sc.nextInt()));

        System.out.println("Factorial using function:");
        System.out.println(Fact(sc.nextInt()));
    }
}
