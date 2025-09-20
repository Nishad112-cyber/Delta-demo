// sub array 
public class dk {

    public static void pair(int num[]){
        int ts=0;
        for(int i=0; i<num.length; i++){
            int curr= num[i];
            for(int j=i+1; j<num.length; j++){
                System.out.print("("+curr+","+j+")");
                ts++;
            }
            System.out.println();
            
        }
        System.out.println("this is total pair sum : "+ts);
    }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6,7,8};
        pair(num);
    }
}