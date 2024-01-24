package Basic_folder.Loop.Quest_Loop;
import java.util.Scanner;


public class Even_and_odd {
    // Your class code here
    public static void main(String[] args) {
        
        Scanner sc=new Scanner((System.in));
        int sum=0;
        int odd=0;
        while (true) {
            
        
        System.out.println("press 1 to continue and 0 to exit");
        int choice=sc.nextInt();
        while(choice==1){
            
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            if(num==0){
                System.exit(0);
            }
        else if(num%2==0)
        {
            sum=sum+num;
            System.out.println("sum of even total"+sum);
        }
        else{
            odd=odd+num;
        System.out.println("sum of odd total"+odd);

        }
    
        
    }
    
    System.out.println("thankyou See you again");
    System.exit(0);
    }}  
}

