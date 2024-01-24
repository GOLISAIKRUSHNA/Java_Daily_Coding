package Basic_folder.Loop;

import java.util.Scanner;

public class Keep_multiple_of_10 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value:");
        int val=sc.nextInt();

        if(val%10==0){
            System.out.println("Multiple of ten is printed.."+val);
        }
        else System.out.println(val);
    }
}
