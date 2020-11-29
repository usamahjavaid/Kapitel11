/*
(Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0 and invokes this method to return the largest number in the input.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Opgave11_4 {

    public static void main(String[] args) {


        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create an arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter numbers and end it with 0: ");
         int number = 1;
        while (number != 0) {
            number = input.nextInt();
                list.add(number);


        }
        //Call max
        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list) {

        if (list.size() == 0) {

            return null;
        } else {
            int currentMax = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > currentMax ){
                    currentMax = list.get(i);
                }

            }


         return currentMax;
        }

    }


}
