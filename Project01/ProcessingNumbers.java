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
        Scanner input = new Scanner(System.in);
        int numInput;
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
        largestNum = userInput;
        smallestNum = userInput;
        largestEven = userInput;
        if(userInput % 2 == 0){
            evenSum += userInput;
        }
        for(int i = 1; i < numInput; i++){
            System.out.println("Enter a number: ");
            userInput = input.nextInt();
            if(userInput > largestNum){
                largestNum = userInput;
            }
            if(userInput < smallestNum){
                smallestNum = userInput;
            }
            if(userInput > largestEven && userInput % 2 == 0){
                largestEven = userInput;
            }
            if(userInput % 2 == 0){
                evenSum += userInput;
            }
        }
        System.out.println("The largest number is " + largestNum + ", the smallest number is " + smallestNum);
        System.out.println("The sum of all numbers is " + evenSum);
        System.out.println("The largest even number is " + largestEven);

        
    }
}
