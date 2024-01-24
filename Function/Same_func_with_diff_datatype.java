package Basic_folder.Function;

public class Same_func_with_diff_datatype {
    public static int sai(int a,int b ){
        return a+b;
    }
    public static float sai(float a,float b,float c )
    {
        
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(sai(a,b));
        // float n1=3;
        // float n2=4;
        // System.out.println(n1);
        System.out.println(sai(3.045f,4.094f,6.3333f));

    }
}
