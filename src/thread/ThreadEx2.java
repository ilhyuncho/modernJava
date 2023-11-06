package thread;

import java.util.stream.IntStream;

public class ThreadEx2 implements Runnable{
    @Override
    public void run() {
        IntStream.rangeClosed(1,5).forEach((a) -> {
            System.out.println("Threawd2");
        });
    }
}
