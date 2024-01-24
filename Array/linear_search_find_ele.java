package Basic_folder.Array;

public class linear_search_find_ele {
     static int linear(int arr[],int ele){//obj with []

        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                return i;
                
            }
        }
        return -1;
     }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int ele=400;
        int index=linear(arr,ele);//obj
        if(index==-1){
            System.out.println("Not found : "+ index);
        }
        else{
            System.out.println("Found  at Index: " + index);
        }
    }
}
