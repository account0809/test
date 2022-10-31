package com.epam.lections.exceptions.first;

public class MemoryErrors {
    public static void main(String[] args) {
        MemoryErrors memoryErrors = new MemoryErrors();
        memoryErrors.outOfMemory();
//        memoryErrors.stackOverflow();
    }

    //public void stackOverflow() {
//        stackOverflow();
//    }

    public void outOfMemory() {
        int[] array = new int[100000 * 100000];
    }
}
