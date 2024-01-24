package Basic_folder.Function;

public class Scope_method_func{

    public static void sai(double number){
System.out.println("Function method ke andhar access variable hona chaiyee..");
System.out.println("Blockscope means with in this {} ");

System.out.println("Class_scope means public private and protected ");


    System.out.println(number);
    }
    public static void main(String[] args) {
        sai(6);
    }
}
