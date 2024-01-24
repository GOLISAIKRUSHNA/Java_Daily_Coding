package Basic_folder.Variable;

public class Type_promotion {
    public static void main(String args[]){
        System.out.println("all this variable are int,char,float,and double but all are auto conversion");
        int a=12;
        char b='a';
        float c=23.344f;
        double d=34343;

        float all=(float)(a+b+c+d);
        System.out.println(all);

        System.out.println("compilation(filename.java) ----> (filename.class)---->execution-----> actual java code execute");

    }
}
