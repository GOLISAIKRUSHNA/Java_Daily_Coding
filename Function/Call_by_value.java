package Basic_folder.Function;

public class Call_by_value {
    public static int call_by(int a){
        a=10;
        System.out.println("java  always work on call by value is actual value or copy of value or  only the copy of variable is passed" + //
                "");
        return a;
    }
    public static void main(String[] args) {
       int  a=5;
        call_by(a);
        System.out.println(a);  //call stack work based on recursion 1 func and 2 func and 3 func..
        //collapsing 3 func and 2 func and 1 func..  storage is assigned in the form of frame's

    }
}

//java  always work on call by value is actual value  and call by reference is original val c++