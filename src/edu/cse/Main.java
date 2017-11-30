package edu.cse;

public class Main {

    public static void main(String[] args) {
        boolean sequential = false;

        if(sequential) {
            for(int i = 5; i < 15; i++) {
                FibonacciLike sequence = new FibonacciLike(i, (int) (Math.random() * 8), (int) (Math.random() * 8));
                sequence.run();
            }
            System.out.println("Ran Sequentially");
        }

        else {
            for (int i = 5; i < 15; i++) {
                Runnable sequence = new FibonacciLike(i, (int) (Math.random() * 8), (int) (Math.random() * 8));
                Thread thread = new Thread(sequence);
                thread.start();
            }
            System.out.println("Ran Concurrently");
        }
    }
}
