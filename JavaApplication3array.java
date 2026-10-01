/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author QUINONES_CPE113
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        int[] A = {2, 3, 5, 2, 8, 3};
        System.out.println("Length of A: " + A.length);

        int sumA = 0;
        for (int i = 0; i < A.length; i++) {
            sumA += A[i];
        }
        System.out.println("Sum of A: " + sumA);

        System.out.println("--boarder weee--");

        int[] arr = {10, 20, 30, 40, 50};

        int sumArr = 0;
        System.out.print("Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sumArr += arr[i];
        }
        System.out.println("Sum of arr: " + sumArr);

        double avgA = (double) sumA / A.length;
        System.out.println("Average of A: " + avgA);

        System.out.println("--linya napud wee--");

        double avgArr = (double) sumArr / arr.length;
        System.out.println("Average of arr: " + avgArr);

        int minArr = arr[0];
        int maxArr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
            if (arr[i] > maxArr) {
                maxArr = arr[i];
            }
        }

        System.out.println("Minimum of arr: " + minArr);
        System.out.println("Maximum of arr: " + maxArr);
    }
}
