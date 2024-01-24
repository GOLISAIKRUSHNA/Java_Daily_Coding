package Basic_folder.Loop;

public class Break_do_while {
    public static void main(String[] args) {
        int i=1;
        do{
            if(i==3){System.out.println("stop");break;}
            System.out.println("hello world"+ i);
            i=i+1;
        }while(i<=10);
    }
}
