public class insertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
           int current = arr[i];
           int previous = i-1;
           // finding out the cuurent position to insert
           while(current>=0 && arr[previous]>current){
               arr[previous+1] = arr[previous];
               previous--;
           }
           //insertion
            arr[previous+1]=current;
        }
    }
    public static void printArr(int nums[]) { //another function for printing the array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

        public static void main (String args[]){ //main function
            int arr[] = {2, 5, 4, 7, 8, 9};
            insertionSort(arr);
            printArr(arr);

        }
    }
