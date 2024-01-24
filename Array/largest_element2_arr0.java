package Basic_folder.Array;

public class largest_element2_arr0 {
   static int smallest(int arr[]){
    int smallest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[0]>arr[i]){
            smallest=arr[i];
            return arr[i];
        }
    }
    return -1;
    
   }
   static void largest(int arr[]){
    int largest=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[0]<arr[i]){
            largest=arr[i];
        }

    }
    System.out.println("Largest Element: "+ largest);
   }

    public static void main(String[] args) {
        
        int arr[]={2,1,3,4};
    

        int res=smallest(arr);
        if(res==-1){
            System.out.println("Not Found Smallest");
        }
        else{
            System.out.println("Smallest: "+res);
        }
        largest(arr);
    }
}
