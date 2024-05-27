package org.example;

import lombok.NonNull;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        @NonNull int[][] edges = readInputPairsFromUser();

        System.out.println("Number of separated graphs: " + countSeparatedGraphs(edges));
    }

    public static int countSeparatedGraphs(@NonNull int[][] edges) {
        Map<Integer, List<Integer>> connections = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            connections.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            connections.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        return depthFirstSearch(connections);
    }

    private static int depthFirstSearch(@NonNull Map<Integer, List<Integer>> connections) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int detectedGraphs = 0;

        for (int node : connections.keySet()) {
            if (!visited.contains(node)) {

                stack.push(node);
                visited.add(node);

                while (!stack.isEmpty()) {
                    for (int neighbor : connections.get(stack.pop())) {
                        if (!visited.contains(neighbor)) {
                            visited.add(neighbor);
                            stack.push(neighbor);
                        }
                    }
                }

                detectedGraphs++;
            }
        }

        return detectedGraphs;
    }

    @NonNull
    private static int[][] readInputPairsFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pairs number: ");
        int n = scanner.nextInt();

        int[][] inputPairs = new int[n][2];

        System.out.println("Enter two numbers separated by space character:");
        for (int i = 0; i < n; i++) {
            inputPairs[i][0] = scanner.nextInt();
            inputPairs[i][1] = scanner.nextInt();
        }

        scanner.close();
        return inputPairs;
    }
}
