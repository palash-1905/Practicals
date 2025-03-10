import java.util.Random;
import java.util.Scanner;

class Puzzle {

    // Method to generate and fill the Sudoku grid with numbers 1, 2, or 3
    void generateNumbers(int[][] grid, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = rand.nextInt(3) + 1; // Random numbers between 1 and 3
            }
        }
    }

    // Method to hide some elements randomly to mimic a Sudoku puzzle
    void hideNumbers(int[][] grid, int size) {
        Random rand = new Random();
        int cellsToHide = size * size / 2; // Hide about half of the grid

        while (cellsToHide > 0) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);
            if (grid[row][col] != 0) { // Ensure the cell isn't already empty
                grid[row][col] = 0;  // Zero denotes a hidden cell
                cellsToHide--;
            }
        }
    }

    // Method to display the Sudoku grid with box structure
    void displayBox(int[][] grid, int size) { 
        for (int line = 0; line < size; line++) {
            // Print top border for each row
            for (int i = 0; i < size * 2 + 1; i++) {
                System.out.print("_");
            }
            System.out.println();
            
            // Print numbers with vertical borders
            for (int stline = 0; stline < size * 2 + 1; stline++) {
                if (stline % 2 == 0) {
                    System.out.print("|");
                } else {
                    int num = grid[line][stline / 2];
                    System.out.print(num == 0 ? " " : num); // Print blank for hidden numbers
                }
            }
            System.out.println();
        }

        // Print bottom border after the last row
        for (int i = 0; i < size * 2 + 1; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 3; // Default size
        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid size. Using default size 3.");
            }
        }

        int[][] grid = new int[size][size];
        Puzzle s = new Puzzle();
        s.generateNumbers(grid, size);
        s.hideNumbers(grid, size); // Hides some numbers in the Sudoku grid
        s.displayBox(grid, size);
    }  
}

