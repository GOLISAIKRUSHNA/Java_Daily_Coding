package Basic_folder.Conditional;

import java.util.Scanner;

public class Using_Ternary_Pass_Fail {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int marks=sc.nextInt();
        
        if (marks>=0 && marks<=100){
            String check= ((marks >34) ? "Pass": "Fail");
        System.out.println(check);
        }
        else{
            System.out.println("enter the valid marks");
        }

        
        

    }
}
