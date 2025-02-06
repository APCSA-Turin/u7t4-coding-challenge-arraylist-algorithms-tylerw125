package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    
    public static void main(String[] args) {
        // 1
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("hi", "hello", "in", "world"));
        System.out.println("insertAfterI: " + Main.insertAfterI(stringList, "inserted"));

        // 2
        ArrayList<String> stringList2 = new ArrayList<>(Arrays.asList("hi", "hello", "cat", "world", "dog"));
        System.out.println("removeThree: " + Main.removeThree(stringList2));

        // 3
        int[] intList = {1, 2, 3, 4, 5};
        System.out.println("reverseArray: " + Main.reverseArray(intList));

        // 4
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hello", "my", "best", "friend"));
        System.out.println("duplicateUpperEnd: " + Main.duplicateUpperEnd(wordList));

        // 5
        String sentence = "This is my sentence!";
        System.out.println("parseSentence: " + Main.parseSentence(sentence));

        // 6
        ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"));
        System.out.println("moveBWords: " + Main.moveBWords(wordList2));

        // 7
        ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Main.removeDuplicates(intList2);
        System.out.println(intList2);
    
        // 8
        ArrayList<Integer> intList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        System.out.println("sameFirstLast: " + Main.sameFirstLast(intList3));

        // 9
        ArrayList<Integer> intList4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("swapEnds: " + Main.swapEnds(intList4));

        // 10
        ArrayList<Integer> intList5 = new ArrayList<>(Arrays.asList(1, 0, 0, 1));
        System.out.println("zeroFront: " + Main.zeroFront(intList5));

        // 11
        ArrayList<Integer> intList6 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 2));
        System.out.println("notAlone: " + Main.notAlone(intList6, 2));
        ArrayList<Integer> intList11 = new ArrayList<>(Arrays.asList(4, 3, 4, 4));
        System.out.println("notAlone: " + Main.notAlone(intList11, 3));

        // 12
        ArrayList<Integer> intList7 = new ArrayList<>(Arrays.asList(6, 2, 5, 3));
        System.out.println("shiftLeft: " + Main.shiftLeft(intList7));

        // 13
        ArrayList<Integer> intList8 = new ArrayList<>(Arrays.asList(1, 3, 1, 4, 4, 3, 1));
        System.out.println("fix34: " + Main.fix34(intList8));

        // 14
        int[] numList1 = {1, 2, 2, 3, 4, 4, 4};
        int[] numList2 = {1, 2, 2, 3, 3, 4};
        int[] numList3 = {1, 2, 3, 4};

        System.out.println(Main.modes(numList1)); // Output: [4]
        System.out.println(Main.modes(numList2)); // Output: [2, 3]
        System.out.println(Main.modes(numList3)); // Output: []
    }
}
