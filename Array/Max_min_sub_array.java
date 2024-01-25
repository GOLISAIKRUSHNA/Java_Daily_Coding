

public class Max_min_sub_array{

    static void Sub_array(int arr[]){
        int temp=0;
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int k=0;k<arr.length;k++){
            temp=k;
            for(int i=temp;i<arr.length;i++){
                int sum=0;
                for(int j=k;j<=i;j++){
                    // System.out.print("("+j+")");
                    System.out.print(arr[j]);
                    sum=sum+arr[j];
                    if(largest<=sum){
                        largest=sum;
                    }
                    if(smallest>=sum){
                        smallest=sum;
                    }

                }
                System.out.print(",");
            }
            System.out.println();
        }

        System.out.println("largest:"+largest);
        System.out.println("Smallest:"+smallest);

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        
        for(int hii:arr){
            System.out.print(hii +"  ");
        }
        System.out.println();

        Sub_array(arr);
    }
}