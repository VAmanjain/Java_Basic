package org.example.Assignment;

public class Sorting {
    public static void main(String[] args) {

    bubbleSorting();
    insertionSort();
    selectionSort();
    }

    public static void bubbleSorting(){
        int []arr = {8,3,1,6,7,9,5};

        int n = arr.length;
        System.out.println("Bubble Sort : ");
        for (int i = 0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0 ; i <n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertionSort()
    {
        int []arr = {8,3,1,6,7,9,5};

        int n = arr.length;
        System.out.println("Insertion Sort: ");
        int i, key, j;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (i =0 ; i <n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    public static void selectionSort()
    {
        int []arr = {8,3,1,6,7,9,5};

        int n = arr.length;
        System.out.println("Selection Sort: ");
        int key, i, j;
        for ( i = 0 ; i <n; i++) {
            key = i;

            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[key]) {
                    key = i;
                    if (key != i) {
                        int temp = arr[key];
                        arr[key] = arr[i];
                        arr[i] = arr[key];
                    }
                }
            }
        }

        for (i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}
