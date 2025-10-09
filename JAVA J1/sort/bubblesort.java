package sort;

public class bubblesort {

    public static void bubblesortmethod(int arr[]){
        for (int i =0; i<arr.length-1; i++){
            for ( int j =0; j<arr.length-1-i;j++){
                if( arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;

                }

            }
        }

            
        }

                public static void printbubblesort(int arr[]){
                    for(int i =0;i<arr.length; i++){
                        System.out.print(arr[i]+ " ");
                    }
                    System.out.println();


        

    }
    
    public static void main(String[] args) {
        int arr[]={1,8,2,4,6,7,3,5};
        bubblesortmethod(arr);
        printbubblesort(arr);
        
    }
}
