import java.util.*;
public class reverser1 {
    static int[] reverser1(int arr[]){
        int start=0,temp=0;
        int end=arr.length-1;//3
    

        while (start<end) {
            
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            
            start++;
            end--;

        }
       
        return arr;
        }
    

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] res=reverser1(arr);
        
        for (int element : res) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(res.length);
        for(int i=0;i<=res.length-1;i++){
            System.out.print(res[i]);
        }

        // for(int i=0;i<=arr.length-1;i++)
        // {
        //     System.out.print(arr[i]);
        // }
    }
}
