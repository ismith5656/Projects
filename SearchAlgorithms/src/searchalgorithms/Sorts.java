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

/**
 *
 * @author ismith5656
 */
public class Sorts {

    public static void runBubbleSort(int arr[] ) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    
                    swapped = true;
                }
            }

        }
        
    }


public static void runSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        
      
}
      }

    public static void runInsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0 && temp < arr[j]; j-- ) {
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

   
    
}

