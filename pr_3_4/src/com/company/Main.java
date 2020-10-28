package com.company;

import java.util.ArrayList;

import static java.lang.Math.pow;

public class Main {
    public static double quick_pow(int a, int n){
        if (n == 0) {
            return 1;
        }
        double result = pow(quick_pow(a, n / 2), 2) % 100;

        if (n % 2 == 0){
            return result;
        }
        else {
            return result * a % 100;
        }
    }

    public static int GCD(int a, int b){
        while (a != b){
            if (a < b){ b -= a; }
            else { a -= b; }
        }
        return a;
    }

    public static ArrayList<Integer> ExtGCD(int a, int b){
        ArrayList<Integer> res = new ArrayList<Integer>(3);
        if (a < 0 & b < 0){
            res.add(0);
            return res;
        }
        int bb1;
        int bb2;
        int aa1 = bb2 = 1;
        int aa2 = bb1 = 0;

        while (a != b){
            if (a < b){
                b -= a;
                aa2 -= aa1;
                bb2 -= bb1;
            }
            else{
                a -= b;
                aa1 -= aa2;
                bb1 -= bb2;
            }
        }
        res.add(a);
        res.add(aa1);
        res.add(bb1);

        return res;
    }

    public static void main(String[] args) {

        System.out.println(quick_pow(2, 10));

       // System.out.println(ExtGCD(2,5));
    }
}
