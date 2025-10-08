package arrays;
import java.util.*;

public class twoDarray {

    public static void search(int[][] matrix, int key){
        int n = matrix.length;
        int m = matrix[0].length;
        for ( int i = 0; i<n ; i++){
            for ( int j = 0 ; j<m ; j++){
                if (matrix[i][j] == key) {
                    System.out.println("Key " + key + " found at [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Key " + key + " not found.");
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n =matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i<n ; i++){
            for ( int j = 0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();

                //output 
                
            }


        }
        int keyToSearch = 5; // Example key to search for
        search(matrix, keyToSearch);
    }

    
    
}
