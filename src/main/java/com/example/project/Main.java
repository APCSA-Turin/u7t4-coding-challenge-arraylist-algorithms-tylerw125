package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    // 1
    public static ArrayList<String> insertAfterI(ArrayList<String> stringList, String str) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains("i")) {
                stringList.add(i + 1, str);
                i++;
            }
        }
        return stringList;
    }
    // 2
    public static ArrayList<String> removeThree(ArrayList<String> stringList) {
        stringList.removeIf(s -> s.length() == 3);
        return stringList;
    }
    // 3
     public static ArrayList<Integer> reverseArray(int[] intList) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = intList.length - 1; i >= 0; i--) {
            reversedList.add(intList[i]);
        }
        return reversedList;
    }
    // 4
     public static ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList) {
        int originalSize = wordList.size();
        for (int i = 0; i < originalSize; i++) {
            wordList.add(wordList.get(i).toUpperCase());
        }
        return wordList;
    }
    // 5
    public static ArrayList<String> parseSentence(String sentence) {
        return new ArrayList<>(Arrays.asList(sentence.split(" ")));
    }
    // 6
    public static ArrayList<String> moveBWords(ArrayList<String> wordList) {
        ArrayList<String> bWords = new ArrayList<>();
        ArrayList<String> otherWords = new ArrayList<>();

        for (String word : wordList) {
            if (word.toLowerCase().startsWith("b")) {
                bWords.add(word);
            } else {
                otherWords.add(word);
            }
        }

        bWords.addAll(otherWords);
        return bWords;
    }

        public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> intList) {
            for (int i = 0; i < intList.size(); i++) {
                int num = intList.get(i);
                for (int j = i + 1; j < intList.size(); j++) {
                    if (intList.get(j) == num) {
                        intList.remove(j);
                        j--; 
                    }
                }
            }
            return intList;
        }
  
    // 8
    public static boolean sameFirstLast(ArrayList<Integer> list) {
        return list.size() > 0 && list.get(0).equals(list.get(list.size() - 1));
    }
    // 9
    public static ArrayList<Integer> swapEnds(ArrayList<Integer> list) {
        if (list.size() > 1) {
            Collections.swap(list, 0, list.size() - 1);
        }
        return list;
    }
    // 10
    public static ArrayList<Integer> zeroFront(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> nonZeros = new ArrayList<>();

        for (Integer num : list) {
            if (num == 0) {
                result.add(0);
            } else {
                nonZeros.add(num);
            }
        }

        result.addAll(nonZeros);
        return result;
    }
    // 11
    public static ArrayList<Integer> notAlone(ArrayList<Integer> list, int val) {
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) == val && list.get(i - 1) != val && list.get(i + 1) != val) {
                list.set(i, Math.max(list.get(i - 1), list.get(i + 1)));
            }
        }
        int lastIndex = list.size() - 1;
        if (list.get(lastIndex) == val && list.get(lastIndex - 1) != val) {
            list.set(lastIndex, list.get(lastIndex - 1));
        }
        return list;
    }
    // 12
    public static ArrayList<Integer> shiftLeft(ArrayList<Integer> list) {
        if (list.size() > 1) {
            int first = list.remove(0);
            list.add(first);
        }
        return list;
    }
    public static ArrayList<Integer> fix34(ArrayList<Integer> list) {
        ArrayList<Integer> fours = new ArrayList<>();
        
        // Collect indices of all 4s (to move them)
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4) {
                fours.add(i);
            }
            
        }

        int fourIndex = 0;
        
        // Rearrange the list to place 4s right after 3s
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3) {
                // Swap the next element with the next available 4
                int temp = list.get(i + 1);
                list.set(i + 1, 4);
                list.set(fours.get(fourIndex), temp);
                fourIndex++;
            }
        }
        return list;
    }
    public static ArrayList<Integer> modes(int[] numList) {
        ArrayList<Integer> modes = new ArrayList<>();
        ArrayList<Integer> uniqueNums = new ArrayList<>();
        ArrayList<Integer> frequencies = new ArrayList<>();

        // Count occurrences manually
        for (int num : numList) {
            int index = uniqueNums.indexOf(num);
            if (index == -1) {
                uniqueNums.add(num);
                frequencies.add(1);
            } else {
                frequencies.set(index, frequencies.get(index) + 1);
            }
        }

        // Find the maximum frequency
        int maxFrequency = Collections.max(frequencies);

        // If all elements appear the same number of times, return an empty list
        boolean allSame = true;
        for (int freq : frequencies) {
            if (freq != maxFrequency) {
                allSame = false;
                break;
            }
        }
        if (allSame) return modes;

        // Collect numbers with max frequency
        for (int i = 0; i < uniqueNums.size(); i++) {
            if (frequencies.get(i) == maxFrequency) {
                modes.add(uniqueNums.get(i));
            }
        }
        return modes;
    }
}

