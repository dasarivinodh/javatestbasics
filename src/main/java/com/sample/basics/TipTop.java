package com.sample.basics;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TipTop {
    static final Integer i1 = 1;
    final Integer i2 = 2;
    Integer i3 = 3;

    public static void main(String[] args) {
        final Integer i4 = 4;
        Integer i5 = 5;

        class Inner {
            final Integer i6 = 6;
            Integer i7 = 7;

            Inner() {
                System.out.print(i6 + i7);
            }
        }
    }
}