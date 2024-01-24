package Basic_folder.Array;

import java.util.Scanner;

public class Find_Element
 {

    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // System.out.print("Length of array:");
        int size=sc.nextInt();
        int arr[] =new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("you want search element:");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("index location: "+ i + "Element: "+ arr[i]);
            }
           
        }
      
            System.out.println("Element not found");
        
    }
}
