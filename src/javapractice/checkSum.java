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

import java.util.Arrays;

class CheckSumExercise {
    
    void checkSum(int A[], int sum) {
        //go through all items in array
        for (int start = 0; start < A.length - 1; start++) {
            // check if any specific numbers equal the sum
            if (A[start] == sum) {
                System.out.println("Sum found: " + A[start] + " is equal to " 
                + sum);
            }
        }
        for (int var = 0; var < A.length - 1; var++) {
            int next =  var + 1;
            if (A[var] + A[next] == sum) {
                int temp[] = {A[var], A[next]}; 
                System.out.println("This array sums to " + sum + ":" + 
                        Arrays.toString(temp));
            }
        }
    }
    public static void main(String[] args) {

        CheckSumExercise testArray = new CheckSumExercise();
        int A[] = { 3, 4, -7, 0, 1, 2, -3};
        int sum = 3; 
        testArray.checkSum(A, sum);
    }
}
