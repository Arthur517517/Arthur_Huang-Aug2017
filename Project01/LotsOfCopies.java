import java.util.Arrays;
/**
 * This class contains methods that test if values of different objects can be altered.
 * 
 * Arthur Huang
 * 10/31/2017
 */
public class LotsOfCopies {
    public static void main(String[] args){
        int num = 7;
        String strMain = "APCS";
        int[] arrMain = {1,2,3,4,5};
        
        //1. This part tests whether changing the values of the objects passed into the parameter
        //affect their actual values
        changeMe(num, strMain, arrMain);
        System.out.println(num);
        System.out.println(strMain);
        System.out.println(Arrays.toString(arrMain));
        
        //2. This part tests whether setting one variable to be equal to another will affect its
        //value;
        int a = 100;
        int b = a;
        a = 99;
        System.out.println(a + " " + b);
    }
    public static void changeMe(int x, String str, int[] arr){
        x = 34;
        str = "I changed it";
        for(int i = 0; i < arr.length ; i++){//increase the value of each element of the array by 3
            arr[i] += 3;
        }
        System.out.println(x);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
    }
}
