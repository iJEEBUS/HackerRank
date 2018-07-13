import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static String convertToBinary(int number){
        int inputted_number = number;
        int whole_part = number;
        int remainder = 0;
        String remainders_string = "";
        String binary = "";
        
        while (whole_part != 0){
            remainder = whole_part % 2;
            remainders_string += Integer.toString(remainder);
            whole_part = whole_part / 2;
        }
        binary = reverse(remainders_string);
        
        return binary;
    }
    
    private static String reverse(String str){
        String initial_string = str;
        String reversed_string = "";
        int string_length = str.length() - 1;
        for (int i = string_length; i >= 0; i--) {
            reversed_string += initial_string.charAt(i);
        }
        return reversed_string;
    }
    
    private static int longestOnesSubstring(String str) {
        int current_longest = 0;
        int longest = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                current_longest++;
             if (current_longest > longest)
                longest = current_longest;
            if (str.charAt(i) == '0')
                current_longest = 0;
        }
        return longest;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String binary = convertToBinary(n);
        
        int longest_ones_substring = longestOnesSubstring(binary);
        
        System.out.println(longest_ones_substring);
        scanner.close();
    }
}

