/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author msima
 */
class JavaPractice {

    /**
     * @param args the command line arguments
     */
    //class RotateArray {

    void leftRotate(int arr[], int d, int n) {
        for(int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }    
    void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for(i = 0; i <n; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
    void printArray(int arr[], int n) {
        for(int i = 0; i <n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        JavaPractice rotate = new JavaPractice();
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
  }  
