package Basic_folder.Array;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {  //0(n)>logn i.e 5 and divide(2 into 1)
        
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int arr[]={1,2,3,4,5};

        int start=0,end=arr.length-1;
        int f=0;
        while (start<=end) {
            int mid=start+end;
            
            if(arr[mid]==key)
            {
                System.out.println(mid);
                f=1;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        if(f==0){
            System.out.println("Not found"  );
        }
        
    }
}
