package com.someClass.firstJavaProject;

public class MultiplicationTable {
    void createMultiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", a, i, (a * i)).println();
        }
    }

    void createMultiplicationTable(int a, int b) {
        createMultiplicationTable(a);
    }

}
