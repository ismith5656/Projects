/*******************************************************************************
 * Program Filename:    ArrayMakerMain.java 
 * Author:              Smith,Ira
 * Date:                9/7/2015
 * Description:         This program will make 6 types of arrays(Int, Char, 
 *                      String, Double, Float, and Boolean). Once you have 
 *                      chosen one it will let you decide on how big you want 
 *                      the array to be. Then ask you if you want to put in your
 *                      own numbers or have it auto put in numbers. Then it will
 *                      print out the numbers given and ask if you want to run 
 *                      the program again.
 * 
 * Input:               There is a Scanner that will allow you to put in the 
 *                      appropriate values.
 * 
 * Output:              Output info. on how to run the program. Then the array 
 *                      you created.
 ******************************************************************************/
package searchalgorithms;


import java.util.*;
import static searchalgorithms.Sorts.*;

/**
 *
 * @author AmericanAce
 */
public class SearchAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randNum = new Random();
        final int arrLength = 1000;
        boolean looping = true;
        int inputNum;
        String answer;
        int[] array = new int[arrLength];
        boolean found;
        int foundNum = 2000000000;

        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(1000) ;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
         //runBubbleSort(array);
         //runSelectionSort(array);
        //runInsertionSort(array);
         
         System.out.println("");
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        

        do {
            System.out.print("Please enter the number you wish to look for: ");
            System.out.println("");

            found = false;
            inputNum = input.nextInt();

            System.out.println("Linear Search algorithm:");
            System.out.println("");

            /* Your linear search goes here */
            for (int i = 0; i < array.length; i++) {
                if (array[i] == inputNum) {
                    found = true;
                    foundNum = i;
                }
            }
            if (found) {
                System.out.println("The number " + inputNum
                        + " can be found at " + foundNum);
            } else {
                System.out.println("Sorry, " + " could not be found.");
            }

            System.out.println("Binary Search algorithm:");
            System.out.println("");

            found = false;

            /* Your binary search goes here */
            int low = 0;
            int high = array.length -1;
          
            int mid;
            mid = (low + high) / 2;
            while ( low <= high) {
                 
                if (array[mid] == inputNum) {
                    found = true;
                    foundNum = mid;
                    
                }
                if (array[mid] < inputNum) {
                    low = mid + 1;
                }
                if (array[mid] > inputNum) {
                    high = mid - 1;
                }
            }
            if (found) {
                System.out.println("The number " + inputNum
                        + " can be found at " + foundNum);
            } else {
                System.out.println("Sorry, " + " could not be found.");
            }

            System.out.println("Would you like to continue?");
            Scanner replay = new Scanner(System.in);
            answer = replay.next();

            System.out.println("");

            if (answer.equals("no")) {
                looping = false;
            }
        } while (looping);
    }
    
    




}
