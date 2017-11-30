package edu.cse;

public class FibonacciLike implements Runnable {
    private int length;
    private int recent1;
    private int recent2;
    private String sequence = "";

    FibonacciLike(int theLength, int first, int second) {
        if(theLength == 1) sequence = String.valueOf(first);
        else if(theLength >= 2) sequence = String.valueOf(first) + " " + String.valueOf(second);
        recent1 = first;
        recent2 = second;
        length = theLength;

    }

    private void makeSequence() {
        for(int i = 2; i < length; i++) {
            int addition = recent1 + recent2;
            recent1 = recent2;
            recent2 = addition;
            sequence = sequence + " " + String.valueOf(addition);
        }
    }

    public void run() {
        makeSequence();
        System.out.println(sequence);
    }
}
