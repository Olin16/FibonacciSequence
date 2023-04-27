public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean useManyThreads = true;

        FibonacciLike sequence = new FibonacciLike(10, 0, 1);
        FibonacciLike sequence2 = new FibonacciLike(5, 10, 11);

        if(useManyThreads) {
            Thread sequenceLaunchingThread = new Thread(sequence);
            Thread sequence2LaunchingThread = new Thread(sequence2);
            sequenceLaunchingThread.start();
            sequence2LaunchingThread.start();
        } else {
            sequence.start();
            sequence2.start();
        }

    }
}

