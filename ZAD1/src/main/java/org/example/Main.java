package org.example;

import lombok.NonNull;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @NonNull int[] input = getNumbersFromUser();
        @NonNull int[] occurrences = sumUpOccurrences(input);

        for (int i = 0; i <= 6; i++) {
            if (occurrences[13 - i] > 0) {
                for (int j = 0; j < occurrences[i]; j++) {
                    System.out.println(i + " " + (13 - i));
                }
            }
        }
    }


    @NonNull
    private static int[] sumUpOccurrences(@NonNull int[] input) {
        int[] occurrences = new int[14];

        try {
            for (int number : input) {
                occurrences[number]++;
            }
            return occurrences;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Only digits from 0 to 13, please");
            throw e;
        }
    }

    @NonNull
    private static int[] getNumbersFromUser() {
        System.out.println("I need positive integers separated by space character: ");
        String[] input = new Scanner(System.in).nextLine().split(" ");

        try {
            return Arrays.stream(input)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException exception) {
            System.out.println("I operate only on integers, sorry.");
            throw exception;
        }
    }
}