package com.epam.lections.memory;
/*
    - Stack of calls
    - Variables (stack vs heap / primitive vs reference)
    - Errors SO & OOfM
 */
public class Memory {

    public static void main(String[] args) {
        outOfMemory();
    }

    public static void outOfMemory() {
        Float[] array = new Float[10000 * 1000000];
    }
}
