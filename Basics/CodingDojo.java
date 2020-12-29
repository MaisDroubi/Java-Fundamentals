/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingdojo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author pccorner
 */
public class CodingDojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 2;
        int y = 6;
        int[] arr = {0, -3, 9, 6, 2, -9};
        int[] arr2 = {1, 2, 3, 7};
        int[] arr3 = {1, 4, 5, 6, 7, 3};
        int[] arr4 = {1, 5, 10, -2};
        int[] arr5 = {1, 5, 10, -2};
        int[] arr6 = {1, 5, 10, -2};
        int[] arr7 = {1, 5, 10, 7, -2};
        Print();
        PrintOdd();
        Sum();
        IteratingArray();
        FindMax(arr);
        avareg(arr2);
        Odd();
        Square(arr4);
        System.out.println(GreatterThanY(arr3, 3));
        EliminateNegative(arr5);
        int[] array = MaxMinAvg(arr6);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Shifting(arr7);
    }

    public static void Print() {
        for (int i = 1; i <= 255; i++) {
            System.out.print(i + " ");
        }
    }

    public static void PrintOdd() {
        for (int j = 1; j <= 255; j++) {
            if (j % 2 == 1) {
                System.out.print(j);
            }

        }
    }

    public static void Sum() {
        int sum = 0;
        for (int k = 0; k <= 255; k++) {
            sum += k;
            System.out.println("New number:" + k + " Sum : " + sum);
        }

    }

    public static void IteratingArray() {
        int[] arr = {1, 3, 5, 7, 9, 13};
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }

    }

    public static int FindMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void avareg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }

    public static void Odd() {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for (int i = 0; i <= 255; i++) {
            if (i % 2 == 1) {
                oddArray.add(i);
            }
        }
        System.out.print(oddArray);
    }

    public static int GreatterThanY(int arr[], int y) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                counter++;
            }

        }
        return counter;
    }

    public static void Square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
            System.out.print(arr[i] + " ");
        }

    }

    public static void EliminateNegative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");

        }
    }

    public static int[] MaxMinAvg(int arr[]) {
        int[] array = new int[3];
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        array[0] = max;
        array[1] = min;
        array[2] = sum / arr.length;
        return array;
    }

    public static void Shifting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
