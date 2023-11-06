package thread;

import java.util.stream.IntStream;

public class ThreadEx1 extends Thread {
    @Override
    public void run() {

        for(int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print("<<th1 종료>>");

    }
}
