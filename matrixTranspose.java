package matrixTranspose;

import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter array Elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        transpose(array, row, column);
    }

    public static void transpose(int array[][], int row, int column) {
        for (int i = 0; i < row; i++) {
            int temp;
            for (int j = 0; j < column; j++) {
                if (i < j) {
                    temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }
        // return array;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

}
