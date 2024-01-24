package Basic_folder.Conditional;

public class If_nested_else {
    public static void main(String[] args) {
        
        int age=13;
        if (age>18) {
            System.out.println("adult");  
        }
        else if(age>10){
            System.out.println("teenage");

        }
        else{
            System.out.println("baby");
        }
    }
}
