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
        
        String str3 = "bacon";
        String [] ex3 = str3.split("bread");
        System.out.println(Arrays.toString(ex3));
        //Your task Part 1:
        /*Write a method that take in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
        * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
        * What if it's a fancy sandwich with multiple pieces of bread?
        */
        middleOfSandwich("applespineapplesbreadlettucetomatobaconmayohambreadcheese");
        middleOfSandwich("applespineapplesbreadlettucetomatobreadbaconbreadmayohambreadcheese");
        middleOfSandwich("breadbread");
        middleOfSandwich("breadcheesebread");
        middleOfSandwich("bread");
        middleOfSandwich("bacon");
        middleOfSandwich("breadbacon");
        middleOfSandwich("baconbread");
        middleOfSandwich("breadbaconbread");
        middleOfSandwich("baconbreadbread");
        middleOfSandwich("breadbreadbacon");
        middleOfSandwich("applebreadbaconbread");
        middleOfSandwich("lemonbreadbaconbreadsushi");
        middleOfSandwich("lemonbreadbreadbaconbreadsushi");
        middleOfSandwich("lemonbreadbaconbreadsushi");
        //Your task Part 2:
        /*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
        * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
        * Again, what if it's a fancy sandwich with multiple pieces of bread?
        */
       //middleOfSandwichSpaces("apples pineapples bread lettuce tomato bacon mayo ham bread cheese");
    }
    public static void middleOfSandwich(String sandwich){
        int firstBreadPos = sandwich.indexOf("bread");
        int secondBreadPos = sandwich.indexOf("bread", firstBreadPos+5);
        
        String[] sand = sandwich.split("bread");
        //check if "bread" occurs twice
        if(firstBreadPos < 0){
            System.out.println("Not a sandwich");
        }else if(firstBreadPos >=0&& secondBreadPos < 0){
            System.out.println("Not a sandwich");
        }else{
            String middle = "";// middle of the sandwich
            if(firstBreadPos+5 == secondBreadPos){
                System.out.println("Not a sandwich");
            }else{
                middle = sandwich.substring(firstBreadPos+5, secondBreadPos);
                System.out.println(middle);
            }
        }
        
    }
    public static void middleOfSandwichSpaces(String sandwich){
        int firstBreadPosi = sandwich.indexOf("bread");
        int secondBreadPosi = sandwich.indexOf("bread" , firstBreadPosi +5);
            
        if (secondBreadPosi > 0){
            String middle = sandwich.substring(firstBreadPosi+6, secondBreadPosi);
            if (middle.length() > 1){
        	String[] realSandwich1 = middle.split(" ");
        	String newSandwich1 = Arrays.toString(realSandwich1);
        	sandwich = newSandwich1;
            }else if (middle.length() < 1){
        	sandwich = "Not a sandwich";
        
            }else{ 
        	sandwich = "Not a sandwich";
            }
            System.out.println(sandwich);
        }
    }
}


    