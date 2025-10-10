package sort;

public class sortmatrix {

    public static boolean sorta(int matrix[][], int key) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Key found at (" + row + "," + col + ")");
                return true;

            } else if (matrix[row][col] >= key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;

    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 1, 2, 3, 4, },
                { 5, 6, 7, 8 },
                { 10, 12, 14, 16 } };
        int key = 10;
        sorta(matrix, key);

    }

}
