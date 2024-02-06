
// i need to check
public class kadanes_algo_maxsub {
    static void kadanes_algo_maxsub(int arr[]) {



        int ms=Integer.MIN_VALUE;
        int cs=0;
        int jaldi=0;


        for(int i=0;i<arr.length;i++){

            cs=cs+arr[i];

            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);

        }

        System.out.println("final sub array sum:" +ms);

    }

    static void negative_algo_maxsub(int num[]){
        int max =Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println(max);


    }


    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int num[] ={ -2,-3,-4,-1};
        for (int see : arr) {
            System.out.print(see + " ");
        }
        System.out.println();

        kadanes_algo_maxsub(arr);
        System.out.println();

        for (int see : num) {
            System.out.print(see + " ");
        }
        System.out.println();

        negative_algo_maxsub(num);


    }
}
