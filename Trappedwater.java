import java.util.*;
public class Trappedwater {
public static int trappedRainwater(int height[]) {
    int n= height.length;
    //left max boundry
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1; i<n; i++){
        leftMax[i] = Math.max(height[i] , leftMax[i - 1]);

        
    }
    // calculate right boundry
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);

    }
        int trappedwater= 0;
       //loop f
       for ( int i = 0; i<n; i++){
         int waterlevel = Math.min(leftMax[i] , rightMax[i]);
         // trappedwater= waterlevel - hight[i]
       trappedwater += waterlevel - height[i];

       }
        return trappedwater;

    }
            public static void main(String[] args) {
             int height[] ={ 9, 2, 0,  6, 3, 32, 5 , 56, 67, 78, 89, 34, 45};
              System.out.println(trappedRainwater(height));
       }
    
    }   