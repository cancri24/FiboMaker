package edu.cse;

public class Main {
    public static void main(String[] args) {
        //Fibonacci Sequence Section
        boolean sequential = true;

        for(int i = 5; i <= 15; i++) {
            FibonacciLike sequence = new FibonacciLike(i, (int) (Math.random() * 8), (int) (Math.random() * 8));

            if (sequential) sequence.run();

            else {
                Thread thread = new Thread((Runnable) sequence);
                thread.start();
            }
        }

        if(sequential) System.out.println("Ran sequentially.");
        else System.out.println("Ran concurrently.");

        System.out.println();

        //Pascal's Triangle Section
        int layers = 8;
        int startNum = 1;

        PascalLike triangle = new PascalLike(layers, startNum);
        triangle.make();
    }
}
