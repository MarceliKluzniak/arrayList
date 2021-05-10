package pl.mkluzniak;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/* ArrayList = a resizable array.
	               Elements can be added and removed after compilation phase
	               store reference data types
	 */

        ArrayList<String> food = new ArrayList<String>(); //creating new arrayList
        food.add("pizza"); //adding food name to array list
        food.add("hamburger");
        food.add("hotdog");

        food.set(0,"sushi"); //changing name of food at nr 0 to sushi
        food.remove(2); //removing foob nr 2 (hotdog)
        //food.clear(); //clearing array list

        for (int i = 0; i < food.size(); i++) { //loop to display all foodstored in array list
            System.out.println(food.get(i));
        }


    }
}
