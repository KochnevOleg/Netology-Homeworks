package Unit1.JavaBasics.MultidimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class MatrixRotation {
    static final int SIZE = 8;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[SIZE][SIZE];
        fillArrayByRandom(matrix);
        printArray(matrix);
        System.out.println();
        printArray(rotateMatrix(matrix, scan.nextInt()));
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.format("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    static void fillArrayByRandom(int[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(255);
            }
        }
    }

    static int[][] rotateMatrix(int[][] matrix, int angle) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        if (angle == 90) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    rotatedMatrix[i][j] = matrix[SIZE - 1 - j][i];
                }
            }
        } else if (angle == 180) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    rotatedMatrix[i][j] = matrix[SIZE - 1 - i][SIZE - 1 - j];
                }
            }
        } else if (angle == 270) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    rotatedMatrix[i][j] = matrix[j][SIZE - 1 - i];
                }
            }
        }
        return rotatedMatrix;
    }
}