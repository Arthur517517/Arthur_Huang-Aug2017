import java.util.Arrays;
/**
 * Write a description of SplitString here.
 * 
 * Arthur Huang
 * 10/27/2017
 */
public class SplitString {
    public static void main(String[] args) {
        // Your task Part 0
        //String.split();
        //It's a method that acts on a string, <StringName>.split(<String sp>);
        //Where sp is the string where the string splits
        //And it returns an array
        // Example: "I like apples!".split(" "); 
        //  it will split at spaces and return an array of ["I","like","apples!"]
        // Example 2: "I really like really red apples".split("really")
        //  it will split at the word "really" and return an array of ["I "," like "," red apples!"]
        //play around with String.split! 
        //What happens if you "I reallyreally likeapples".split("really") ?
        String str1 = "I really like really red apples";
        String[] ex1 = str1.split("really");
        System.out.println(Arrays.toString(ex1));
        
        String str2 = "I like apples!";
        String [] ex2 = str2.split(" ");
        System.out.println(Arrays.toString(ex2));
        
        //Your task Part 1:
        /*Write a method that take in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
        * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
        * What if it's a fancy sandwich with multiple pieces of bread?
        */
        middleOfSandwich("applespineapplesbreadlettucetomatobaconmayohambreadcheese");
        middleOfSandwich("applespineapplesbreadlettucetomatobreadbaconbreadmayohambreadcheese");
        middleOfSandwich("breadsushibread");
        //Your task Part 2:
        /*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
        * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
        * Again, what if it's a fancy sandwich with multiple pieces of bread?
        */
       //middleOfSandwichSpaces("apples pineapples bread lettuce tomato bacon mayo ham bread cheese");
    }
    public static void middleOfSandwich(String sandwich){
        String swch = sandwich;
        String filling = "";
        String[] swich = swch.split("bread");
        //int firstBreadPosi = sandwich.indexOf("bread");
        //int secondBreadPosi = sandwich.indexOf("bread", firstBreadPosi+5);
        //String middle;// middle of the sandwich
        //middle = sandwich.substring(firstBreadPosi+5, secondBreadPosi);
        //System.out.println(middle);
        
        if(swich.length > 3){
            for(int i = 1;i < swich.length - 1; i++){
                filling += swich[i];
            }
            System.out.println(filling);
        }else{
            System.out.println(swich[1]);
        }
        
    }
    public static void middleOfSandwichSpaces(String sandwich){
        //int firstBreadPosi = sandwich.indexOf("bread");
        //int secondBreadPosi = sandwich.indexOf("bread" , firstBreadPosi +5);
            
        //if (secondBreadPosi > 0){
            //String middle = sandwich.substring(firstBreadPosi+6, secondBreadPosi);
            //if (middle.length() > 1){
                //String[] realSandwich1 = middle.split(" ");
                //System.out.println(Arrays.toString(realSandwich1));
            //}
        //}
        
    }
}


    