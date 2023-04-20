import java.util.Arrays;

public class sort{

    //Default constructor
    public sort(){

    }

    // Selction_sort

    public static void selection_sort(int arr[]) {
        int min;
        int temp;
        int n = arr.length;
        
        for(int i=0; i<n-1; i++){
            min = arr[i];
            for(int j=i+1;j<n;j++){
                if (min>arr[j]){
                    temp=min;
                    min=arr[j];
                    arr[j]=temp;
                }
            }
            arr[i] = min;
        }
    }

    //Insertion_sort
    /*
    **steps: 
         5  3  6  2  1
         3  5  6  2  1
         3  5  6  2  1
         2  3  5  6  1
         1  2  3  5  6
     */

    public static void insertion_sort(int arr[]){

        int n=arr.length;
        int temp;

        for (int i=0;i<=n-2;i++){
            int j=i+1;
            if (arr[i]>arr[j]){
                while (j>=1 && arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;
                    j --; //j += 1
                     
                }
            }
        }

    }

    //Bubble Sort

    public static void bubble_sort(int arr[]){
        int n = arr.length;
        int temp;
        for (int i=0;i<=n-1;i++){
            for (int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static int[] merge_sort(int[] arr){
        if (arr.length <= 0) {
            return arr;
        }

        int i = arr.length/2;

        int[] left = merge_sort(Arrays.copyOfRange(arr, 0, i));
        int[] right = merge_sort(Arrays.copyOfRange(arr, i, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int i=0;
        int j=0;
        int[] newarr= new int[left.length+right.length];
        int k=0;

        while(i<left.length && j>right.length){
            if(left[i]<right[j]){
                newarr[k] = left[i];
                i++;
                k++;
            }
            else{
                newarr[k] = right[j];
                k++;
                j++;

            }
        }
        while(i<left.length){
            newarr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            newarr[k] = right[j];
            k++;
            j++;
        }

        return newarr;

    }
    public static void main(String[] args){
        int[] array = new int[10];
        array[0] = 10;
        array[1] = 8;
        array[2] = 15;
        array[3] = 5;
        array[4] = 4;
        array[5] = 12;
        array[6] = 20;
        array[7] = 1;
        array[8] = 16;
        array[9] = 18;

        int[] newarr=merge_sort(array);
        for (int i:newarr){
            System.out.println("mergesort");
            System.out.println(i + " ");
        }

        // bubble_sort(array); 
        for(int i=0;i<=9;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        bubble_sort(array);
        // array[0] = 2;
        for(int i=0;i<=9;i++){
            System.out.print(array[i]+" ");
        }

    }
    
}