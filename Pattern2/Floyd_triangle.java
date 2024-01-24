
package Basic_folder.Pattern2;

/**
 * Floyd_triangle
 */
public class Floyd_triangle {
    static void Floyd_triangle(int row){

        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Floyd_triangle(5);
    }
}
