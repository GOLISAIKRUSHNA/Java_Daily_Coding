
public class Prefix_max_subarr{
   static void Prefix_max_subarr(int arr[]){
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println();

        for(int pre:prefix){
            System.out.print(pre+ " ");

        }
        System.out.println();

        int curr=0;
        int max=0;
        int min=Integer.MAX_VALUE;   //+infinity
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;


                curr=start==0? prefix[end] :prefix[end]-prefix[start-1];
                // System.out.print(curr  +" ");
                if(max<curr){
                    max=curr;
                }

                if(min>curr){
                    min=curr;
                }
            }
            // System.out.println();
        }
        // System.out.println();

        System.out.println("max subarray: "+max);
        System.out.println("min subarray: "+min);






        



    }
    
    public static void main(String args[]){
    //    int arr[] =new int[5];
       int arr[]={1,-2,6,-1,3};

        for (int each : arr) {
            System.out.print(each +" ");
        }
        Prefix_max_subarr(arr);

    }
}