package Basic_folder.Array;

import Basic_folder.Loop.for_loop;

public class largest_ele_Integer_MIN {
    static void largest_element(int arr[]){

        int max=Integer.MIN_VALUE;//-infinity
        int min=Integer.MAX_VALUE;//+infinity


        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max)
            {
                max=arr[i];
            }

            if(arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.println(" Largest : "+ max);
        System.out.println(" Smallest : "+ min);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        largest_element(arr);
    }
}
