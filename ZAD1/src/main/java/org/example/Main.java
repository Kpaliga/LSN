package org.example;

import lombok.NonNull;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @NonNull int[] input = getNumbersFromUser();
        @NonNull int[] normalised = normalise(input);

        System.out.println("count: " + input.length); //O(1)
        System.out.println("distinct: " + normalised.length); //O(1)
        System.out.println("min: " + normalised[0]); //O(1)
        System.out.println("max: " + normalised[normalised.length - 1]); //O(1)
    }

    @NonNull
    private static int[] normalise(@NonNull int[] input) {
        return Arrays.stream(input)
                .parallel()
                .distinct() //O(n)
                .sorted() //O(n log n)
                .toArray();
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