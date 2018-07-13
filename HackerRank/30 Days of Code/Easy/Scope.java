import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    
    /**
    * Constructor
    */
    Difference(int[] elements) {
        this.elements = elements;
    }
    
    /**
    * Computes and returns the largest difference between any two numbers
    * in a given array.
    */
    public void computeDifference() {
        // I will convert the array into a list, sort the list,
        // then compute the max - the min to determine the largest 
        // difference between the given numbers
        List<Integer> list_form = new ArrayList<Integer>();
        for (Integer number : elements)
            list_form.add(number);
        this.maximumDifference = Collections.max(list_form) - Collections.min(list_form);
    }
