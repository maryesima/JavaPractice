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
class findPair {
    
    void findPair(int A[], int sum) {
        for (int start = 0; start < A.length - 1; start++) {
            for (int next = start + 1; next < A.length; next++) {
                if (A[start] + A[next] == sum) {
                    System.out.println("Pair found: " + A[start] + " and " 
                            + A[next]);
                }
            }
        }
    }

public static void main(String[] args) {

    findPair testPair = new findPair();
    int A[] = {1,2,3,4,5,6,7,8,9};
    int sum = 10;
    testPair.findPair(A, sum);
    }
}