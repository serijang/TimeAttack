package com.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }

    // Sum of A n B
    public int intersection(int[] A, int[] B) {
        int result = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                if (A[i] == B[j]) {
                    result += (A[i] + B[j]);
                } else {
                    return result;
                }
        }
        return result;
    }


    // Sum of A - B
    public int differenceOfSet(int[] A, int[] B) {
        int result = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result += (A[i] - B[j]);
            }
        }
        return result;
    }
}

