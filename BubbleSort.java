public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){ //outer loop
           for(int j=0; j<arr.length-1-turn; j++){ //inner loop
               if(arr[j]>arr[j+1]) {
                   //swapping
                   int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }

           }
        }
    }
    public static void printArr(int arr[]){ //another function for printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){ // This is the main function
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr); // calling the function
        printArr(arr); // printing the aaray
    }
}
