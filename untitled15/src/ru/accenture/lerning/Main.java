package ru.accenture.lerning;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static int arr[];
    static Scanner a = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int bulls = 0;
        int cows = 0;
        int numberOfAttempts = 0;
        System.out.println("Choose the difficulty of the game 3 or 4 or 5");
        int c = a.nextInt();
        if(c == 3 || c == 4 || c == 5) {
            arr = new int[c];
                for (int i = 0; i < c; i++) {
                    do {
                        arr[i] = random.nextInt(11);
                    } while (coincidenceChecking(arr[i], i));
                    System.out.print(arr[i] + " ");
                } for(;;){
                System.out.println("\n" + "Enter your sequence");
                int[] array = new int[c];
                for (int i = 0; i < array.length; i++) {
                    array[i] = a.nextInt();
                    System.out.print(array[i]);
                    if (Arrays.equals(arr, array)) {
                        System.out.println("\n You are WIN!");
                        for (int element : arr) {
                            System.out.print(element + " ");
                        }
                    }
                }
                for (int i = 0; i <= arr.length - 1; i++) {
                    int a = arr[i];
                    for (int j = 0; j <= array.length - 1; j++) {
                        if (a == array[j] && i == j) {
                            bulls++;
                            break;
                        }
                        {
                            if (a == array[j]) {
                                cows++;
                            }
                        }
                    }
                }
                System.out.print("\n bulls " + bulls);
                System.out.print(" cows " + cows);
                System.out.print(" number of attempts) " + numberOfAttempts++);
                if (Arrays.equals(arr, array)){break;}
            }
            } else{
                System.out.println("the end!");
            }
    }

    static boolean coincidenceChecking(int num, int numArray) {
        for (int i = 0; i < numArray; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }
}

