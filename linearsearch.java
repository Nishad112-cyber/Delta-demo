public class linearsearch {

  public static int Search(int numbers[], int key){
      for(int i=0; i<numbers.length; i++){
          if( numbers[i] == key){
              return 1;
          }
      }
      return -1;
  }
  public static void main(String[] args) {
      int numbers[]= {1,2,3,4,56,7,8};
      int key= 9;
      int index =  Search(numbers, key);
      if( index == -1){
          System.out.print("not found ");

      }else{
        System.out.print(index+" found ");
      }

  }


}