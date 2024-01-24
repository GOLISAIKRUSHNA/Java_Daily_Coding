package Basic_folder.Variable;

import java.util.*;

public class Typeconversion_TypeCasting{
    public static void main(String[] args) {
        System.out.println("Type conversion/widerning/implicit( automatically conversion)");
    
        Scanner n = new Scanner(System.in);

        int num = n.nextByte();
        float val= num;
        System.out.println("This is from bye to float");
        System.out.println(" It is always happens from lower byte to higher byes");
        System.out.println("type conversion :"+val);
        System.out.println("**********Type casting ************");
        System.out.println( "Expliciting  or jabarjasthi chota karna" );
        System.out.println("limit of type conversion:");
        System.out.println(" Type Casting ");

        float  data= 99.98f;

        int hhii= (int)data;

        System.out.println(hhii);






        char alpha = 'a';
        char alpha2 = 'A';



        int number= alpha;
        int number2 = alpha2;
        // System.out.println( "Small Alpha:"+ number);
        // System.out.println( "Big Alpha :"+number2);


        int num1 =65;
        int num2 = 99;



        char a1= (char)num1;
        char a2 = (char)num2;

        System.out.println(a1);
        System.out.println(a2);



    }
}