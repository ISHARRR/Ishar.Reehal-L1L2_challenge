package com.and.test;

import java.util.*;

public class Solution {

    /**
     * The following is the method where the solution shall be written
     */

    public static String solution(String input) throws NumberFormatException {
        input = reformatInput(input);
        String error = "Invalid Input";
        if (input.equals(error)) {
            return error;
        } else {
            ArrayList<String> result = new ArrayList<String>();
            return combinationsGenerator(input, 0, result);
        }
    }

    public static String combinationsGenerator(String input, int start, ArrayList result) {
        int end = input.length();
        if (start == end) {
            result.add(input);
        } else {
            for (int i = start; i < end; i++) {
                String swapped = swap(input, start, i);
                combinationsGenerator(swapped, start + 1, result);
            }
        }
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(result);
        ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
        Collections.sort(listWithoutDuplicates, Collections.reverseOrder());
        return String.join(",", listWithoutDuplicates);
    }

    public static String reformatInput(String input) {
        input = input.replaceAll("\\D", "");
        if (!input.matches(".*\\d.*")) {
            return "Invalid Input";
        }
        return input;
    }

    public static String swap(String str, int i, int j) {
        char temp;
        char[] cArray = str.toCharArray();
        temp = cArray[i];
        cArray[i] = cArray[j];
        cArray[j] = temp;

        return String.valueOf(cArray);
    }

    public static void main(String args[]) {
        solution("326");
        solution("A 3B2 C6D");
        solution("A B CD");
        solution("A2 B2 C2D");
        solution("A-3 B3 C3D");
    }
}
