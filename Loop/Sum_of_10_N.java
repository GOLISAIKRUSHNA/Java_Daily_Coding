package Basic_folder.Loop;

import java.util.Scanner;

public class Sum_of_10_N {
    public static void main(String[] args) {
        int count=1;
        int all=0;
        Scanner sc =new Scanner(System.in);
        while(count<=10)
        {
            all=all+count;
        System.out.println(all);
        count=count+1;
    }
    System.out.println("within 4 sec");
    System.out.println("total sum:"+all);
    }
}
