package Basic_folder.Conditional;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String num =sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();

        switch (num) {
                case "add":System.out.println(a+b);
                break;
                case "sub":System.out.println(a-b);
                break;
                case "div":System.out.println(a/b);
                break;
                case "mul":System.out.println(a*b);
                break;
                case "mod":System.out.println(a%b);
                break;
                default:System.out.println("invalid Credential");
                break;

        }
        
    }
}

// char num =sc.next().charAt(4);
