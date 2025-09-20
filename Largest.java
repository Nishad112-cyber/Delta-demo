public class Largest {
    public static int greatest(int num[]){
        int Largst= -1;
        for(int i=0; i<num.length; i++){
            if(num[i]>Largst){
                Largst= num[i];
            }
        }
        return Largst;
    }
    public static void main(String[] args) {
        int num[]= {1,3,4,54,223,23,543};
        System.out.println(" "+greatest(num));
    }

    
}