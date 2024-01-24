package Basic_folder.Conditional;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int val=sc.nextInt();

        switch(val){
            case 1: System.out.println("Bring tea");
            break;
            case 2: System.out.println("Bring food");
            break;
            case 3: System.out.println("Bring Samosa");
            break;
            default:
            System.out.println("Please enter valid input");
            break;
        }

        }


    }
