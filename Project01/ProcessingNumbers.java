import java.util.Scanner;
/**
 * This class contains a program that allows users to input numbers, find
 * the largest and smallest numbers, find the largest even number, and find
 * the sum of all even numbers.
 * Arthur Huang
 * 10/4/2017
 */
public class ProcessingNumbers
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initializes a Scanner object
        int numInput;//declare variables 
        int userInput;
        int smallestNum;
        int largestNum;
        int largestEven;
        int evenSum = 0;
        
        System.out.println("How many numbers are you entering?");
        numInput = input.nextInt();
        System.out.println("Enter a number: ");
        userInput = input.nextInt();
        input.nextLine();
        largestNum = userInput;//gets the first number and set it to the largest number
        smallestNum = userInput;
        largestEven = userInput;
        
        if(userInput % 2 == 0){
            evenSum += userInput;
        }
        for(int i = 1; i < numInput; i++){
            System.out.println("Enter a number: ");
            userInput = input.nextInt();
            if(userInput > largestNum){//if the current number is greater than the largest number
                largestNum = userInput;
            }
            if(userInput < smallestNum){
                smallestNum = userInput;
            }
            if(userInput > largestEven && userInput % 2 == 0){//if the current number is greater than the largest even number, and is divisible by 2
                largestEven = userInput;
            }
            if(userInput % 2 == 0){
                evenSum += userInput;
            }
        }
        System.out.println("The largest number is " + largestNum + ", the smallest number is " + smallestNum);//print the largest number and the smallest number
        System.out.println("The sum of all even numbers is " + evenSum);
        System.out.println("The largest even number is " + largestEven);

        
    }
}
