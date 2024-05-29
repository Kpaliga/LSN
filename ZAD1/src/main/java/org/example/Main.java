package org.example;

import lombok.NonNull;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       @NonNull Map<Integer, Long> occurrences =
                getNumbersFromUser()
                        .stream()
                        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        displayPairsThatSumUpTo13(occurrences);
    }

    private static void displayPairsThatSumUpTo13(@NonNull Map<Integer, Long> occurrences) {
        Set<Integer> keys = occurrences.keySet()
                .stream()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new)); //O(1)

        Iterator<Integer> iterator = keys.iterator();

        int key;
        int complement;
        while (iterator.hasNext()) {
            key = iterator.next();
            complement = 13 - key;

            if (keys.contains(complement)) {
                for (int j = 0; j < occurrences.get(key); j++) {
                    System.out.println(key + " " + complement);
                }
            }

            iterator.remove();
        }
    }


    @NonNull
    private static List<Integer> getNumbersFromUser() {
        System.out.println("I need integers separated by space character: ");
        String[] input = new Scanner(System.in).nextLine().split(" ");

        try {
            return Arrays.stream(input)
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());

        } catch (NumberFormatException exception) {
            System.out.println("I operate only on integers, sorry.");
            throw exception;
        }
    }
}