package Basic_folder.Array;

import java.util.Scanner;

public class array_given_func {
    
    static void hupar(int arr[]){  //array to func def

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    

    
    public static void main(String[] args) {

        int arr[]={98,99,98};
        // Scanner sc=new Scanner(System.in);
        // int input[]=new int[sc.nextInt()];

        hupar(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
