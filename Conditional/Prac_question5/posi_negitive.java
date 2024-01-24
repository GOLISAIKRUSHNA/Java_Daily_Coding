package Basic_folder.Conditional.Prac_question5;

import java.util.Scanner;

public class posi_negitive {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int val=sc.nextInt();

        if (val >-1){
            System.out.println("positive");
        }
        else{
            System.out.println("Negative");
        }

    }
}
