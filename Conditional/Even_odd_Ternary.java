package Basic_folder.Conditional;

import java.util.Scanner;


public class Even_odd_Ternary {
    
    public static void main(String[] args) {
        
        System.out.println("using ternary");
        System.out.println("syntax: variable= condition?statement1:statement2");

        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();


        String val = ((num%2)==0)?"Even" : "Odd";
        System.out.println(val);

    }

}
