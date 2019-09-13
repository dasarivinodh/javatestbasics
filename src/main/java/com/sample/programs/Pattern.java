package com.sample.programs;

class Pattern {

    // 1
    // 121
    // 12321
    // 1234321
    public static void main(String[] args) {

        int n = 3;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (i == j) {
                    System.out.print(j-1);
                    // for (int k = j - 1; k < 0; k--) {
                    //     System.out.print(k);
                    // }
                }

            }
            System.out.println();

        }

    }

}