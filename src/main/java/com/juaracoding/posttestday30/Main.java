package com.juaracoding.posttestday30;

public class Main {
    public static void main(String[] args) {
        //soal no 1
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println("BIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
        // soal no 2
        int n = 9;

// Mencetak baris 1
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i);
            if (i != n) {
                System.out.print("_");
            }
        }
        System.out.println();

// Mencetak baris 2
        for (int i = 3; i <= n; i += 2) {
            if (i == n) {
                System.out.print("");
            } else {
                System.out.print("_" + i);
            }
        }
        System.out.println();

// Mencetak baris 3
        for (int i = 3; i <= n; i += 2) {
            if (i == n) {
                System.out.print("");
            } else {
                System.out.print(""+i+"_");
            }
        }
        System.out.println();

// Mencetak baris 4
        System.out.print("_");
        System.out.print(n / 2 + 1);
        System.out.print("_");
        System.out.println();

// Mencetak baris 5
        System.out.print(n / 2 + 1);
        System.out.println();
}
}
