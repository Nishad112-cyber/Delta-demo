import java.util.*;
public class Upadat {

    public static void upadate(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] =marks[i] +3;
        }

    }
    public static void main(String[] args) {
        int marks[] = {1,2,3,4,5,6};
        upadate(marks);
        for(int i=0; i<marks.length; i++){
            System.err.print(" "+marks[i]);
        }
        System.out.println();
    }
}