package Basic_folder.Function;

public class same_funct_with_same_datatype {
    public static int sai(int a,int b ){
        return a+b;
    }
    public static int sai(int a,int b,int c )
    {
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(sai(a,b));
        // float n1=3;
        // float n2=4;
        // System.out.println(n1);
        System.out.println(sai(3,4,6));

    }
}
