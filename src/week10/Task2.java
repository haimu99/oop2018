package week10;

import java.util.Random;

public class Task2 {
    int[] arr = new int[999];
    public void initArr(){
        Random rd = new Random();
        
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(1000);
        }
    }
    public void bubbleSort() {
        int b;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    b = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = b;
                }
            }
        }
    }
    public void printArr(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.initArr();
        task2.bubbleSort();
        task2.printArr();
    }
}