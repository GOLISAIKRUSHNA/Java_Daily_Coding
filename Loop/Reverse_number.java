package Basic_folder.Loop;

public class Reverse_number {
    public static void main(String[] args) {
        
        int input=1234;
        int Last;

        while(input>0){
            Last=input%10;
            System.out.print(Last);
            input=input/10;
            

        }
        System.out.println();
    }
}
