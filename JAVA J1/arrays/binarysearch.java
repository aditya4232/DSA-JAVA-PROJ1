package arrays;

public class binarysearch {
    public static int binarynumber{int numbers[], int key}{
        int start = 0; int end = numbers.length-1;
        while (start <= end ){
            int mid = (start + end) /2;

            if( numbers[mid]== key){
                return mid;
            }

            if( numbers[mid]<key ){
              start = mid + 1;
            } else {
                end = mid-1;
            }

        }

    }
    
}
