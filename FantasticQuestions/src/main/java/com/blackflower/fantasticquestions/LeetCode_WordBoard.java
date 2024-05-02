package com.blackflower.fantasticquestions;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class LeetCode_WordBoard {

    static ArrayList<Location> locations = new ArrayList<>();

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board2 = {{'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'A'}, {'A', 'A', 'A', 'A', 'A', 'B'}, {'A', 'A', 'A', 'A', 'B', 'A'}};
        String word = "AAAAAAAAAAAAABB";

        System.out.println(isConsist(board2, word));
    }

    public static boolean isConsist(char[][] board, String word) {
        if (!isConsistAllElements(board, word)) {return false;}
        int lookingIndex = 0;
        char searchingFor = word.charAt(lookingIndex);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (searchingFor == board[i][j]) {
                    createLocation(lookingIndex, j, i, new Location[word.length()]);
                }
            }
        }
        if (locations.isEmpty()) {
            return false;
        } else if (word.length() == 1) {
            return true;
        }

        lookingIndex++;
        searchingFor = word.charAt(lookingIndex);
        int foundedLocations = locations.size();
        while (foundedLocations != 0) {
            System.out.println("While");
            foundedLocations = 0;
            int size = locations.size();
            for (int i = 0; i < size; i++) {
                if (!locations.get(i).isChecked) {
                    checkNeighbourhoods(board, searchingFor, lookingIndex, locations.get(i));
                    foundedLocations++;
                }
            }
            lookingIndex++;
            if (lookingIndex == word.length()) {
                for (Location location : locations) {
                    if (location.wordIndex == word.length() - 1) {
                        return true;
                    }
                }
                System.out.println("False Returned!");
                return false;
            }
            searchingFor = word.charAt(lookingIndex);
        }

        return false;
    }

    public static boolean isConsistAllElements(char[][] board, String word) {
        for (int k = 0; k < word.length(); k++) {
            char searchingFor = word.charAt(k);
            boolean consist = false;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (searchingFor == board[i][j]) {
                        consist = true;
                    }
                }
            }
            if (!consist) {
                return false;
            }
        }
        return true;
    }

    public static void checkNeighbourhoods(char[][] board, char letter, int wordIndex, Location location) {
        System.out.println("Checking for: " + location.rowIndex + ", " + location.columnIndex + " | letter: " + letter);
        if (location.rowIndex > 0 && board[location.rowIndex - 1][location.columnIndex] == letter && !location.isConnected(location.rowIndex - 1, location.columnIndex)) {
            createLocation(wordIndex, location.columnIndex, location.rowIndex - 1, location.connections);
            System.out.println("Location Found at: " + (location.rowIndex - 1) + ", " + location.columnIndex);
        }
        if (location.rowIndex < board.length - 1 && board[location.rowIndex + 1][location.columnIndex] == letter && !location.isConnected(location.rowIndex + 1, location.columnIndex)) {
            createLocation(wordIndex, location.columnIndex, location.rowIndex + 1, location.connections);
            System.out.println("Location Found at: " + (location.rowIndex + 1) + ", " + location.columnIndex);
        }
        if (location.columnIndex > 0 && board[location.rowIndex][location.columnIndex - 1] == letter && !location.isConnected(location.rowIndex, location.columnIndex - 1)) {
            createLocation(wordIndex, location.columnIndex - 1, location.rowIndex, location.connections);
            System.out.println("Location Found at: " + location.rowIndex + ", " + (location.columnIndex - 1));
        }
        if (location.columnIndex < board[location.rowIndex].length - 1 && board[location.rowIndex][location.columnIndex + 1] == letter && !location.isConnected(location.rowIndex, location.columnIndex + 1)) {
            createLocation(wordIndex, location.columnIndex + 1, location.rowIndex, location.connections);
            System.out.println("Location Found at: " + location.rowIndex + ", " + (location.columnIndex + 1));
        }
        location.isChecked = true;
    }

    public static void createLocation(int wordIndex, int columnIndex, int rowIndex, Location[] connections) {
        Location location = new Location(wordIndex, columnIndex, rowIndex, connections);
        location.connections[location.wordIndex] = location;
        locations.add(location);
    }

    public static class Location {

        public int wordIndex;
        public int columnIndex;
        public int rowIndex;
        public Location[] connections;
        public boolean isChecked;

        public Location(int wordIndex, int columnIndex, int rowIndex, Location[] locations) {
            this.wordIndex = wordIndex;
            this.columnIndex = columnIndex;
            this.rowIndex = rowIndex;
            connections = new Location[locations.length];
            for (int i = 0; i < locations.length; i++) {
                connections[i] = locations[i];
            }

        }

        public boolean isConnected(int row, int column) {

            for (int i = 0; i < connections.length; i++) {
                if (connections[i] != null && connections[i].columnIndex == column && connections[i].rowIndex == row) {
                    return true;
                }
            }
            return false;
        }
    }
}
