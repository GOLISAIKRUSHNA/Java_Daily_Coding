

public class Sub_array{

    static void Sub_array(int arr[]){
        int temp=0;

        for(int k=0;k<arr.length;k++){
            temp=k;
            for(int i=temp;i<arr.length;i++){

                for(int j=k;j<=i;j++){
                    // System.out.print("("+j+")");
                    System.out.print(arr[j]);

                }
                System.out.print(",");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        
        for(int hii:arr){
            System.out.print(hii +" ");
        }
        System.out.println();

        Sub_array(arr);
    }
}