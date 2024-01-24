import java.util.Scanner;
class Gst {
    public static void main(String args[]){

       Scanner sc=new Scanner(System .in);
       float pencil=sc.nextFloat();
       float pen=sc.nextFloat();
       float eraser=sc.nextFloat();
       float total=pencil+pen+eraser;
       System.out.println("Bill is : "+total);
       System.out.println("Gst including tax"+ 0.18f*total);

       //Add on - with 18% 
       float newTotal=total+ (0.18f*total);
       System.out.println("Total Bill with 18% tax : " + newTotal);
    }
}

