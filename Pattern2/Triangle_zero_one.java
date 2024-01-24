
package Basic_folder.Pattern2;

/**
 * Floyd_triangle
 */
public class Triangle_zero_one {
    static void Triangle_zero_one(int row){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Triangle_zero_one(5);
        
    }

}