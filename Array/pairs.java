import java.util.*;
public class pairs {
    static void pairs(int arr[]){
        
        int start=1,pair=0;
        int temp=start;
    for(int i=0;i<=arr.length-1;i++){

        while (start<=arr.length-1) {
            System.out.print(arr[i]+","+ arr[start]+"   ");

            start++;
            pair++;
        }
        System.out.println();
        temp=temp+1;
        start=temp;
    }
    // System.out.println(pair);


      
        }
    

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();


        pairs(arr);

        int size=arr.length;
        int sub=size-1;


        int res=(size*sub)/2;
        System.out.println(res);
        

        



        }

    }

