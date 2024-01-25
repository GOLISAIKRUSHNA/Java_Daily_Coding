

public class creation_arr {
    public static void main(String[] args) {
        
        // int arr[] =new int[3];
        // int[] arr=new int[3];
        int arr[]={1,2,3};

        int num[]={99,98,97};
        float floating[]={1.2f,2.2f,3.3f};
        char chars[]={'a','b','c'};
        String str[]={"sai","goli","krushna"};
        // System.out.println(num.length);

        for(int i=0;i<=arr.length;i++){
            System.out.print(arr[i]+" ");
            System.out.print(num[i]+" ");
            System.out.print(floating[i]+" ");
            System.out.print(chars[i]+" ");
            System.out.print(str[i]+" ");
            System.out.println();
        }
    }
}
