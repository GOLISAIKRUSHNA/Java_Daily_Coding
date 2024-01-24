package Basic_folder.Function;

public class prime_optimised{

    public static  boolean Isprime(int n){
        
        if(n==2){
            return true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Not prime ");
                return false;
            }
        }

        System.out.println("prime");
        return true;

    }
    public static void main(String[] args) {
        System.out.println("efficient code");
        
        System.out.println(Isprime(15));
    }
}
