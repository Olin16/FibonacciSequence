public class FibonacciLike implements Fibonacci, Runnable{
    int amountOfNumbersInSequence;
    int number1;
    int number2;

    public FibonacciLike(int amountOfNumbersInSequence, int number1, int number2){
        this.amountOfNumbersInSequence = amountOfNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }


    @Override
    public void start() throws InterruptedException {
        int fib = 0;

        System.out.println(number1);
        Thread.sleep(3000);

        System.out.println(number2);
        Thread.sleep(3000);

        fib = number1 + number2;
        System.out.println(fib);
        Thread.sleep(3000);



        for (int x = 3; x < amountOfNumbersInSequence; x++) {
            number1 = number2;
            number2 = fib;
            fib = number1 + number2;
            Thread.sleep(3000);
            System.out.println(fib);
        }
    }

    public void run() {
        try {
            start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
