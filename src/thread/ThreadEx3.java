package thread;

public class ThreadEx3 extends  Thread{
    @Override
    public void run() {

        for(int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print("<<th3 종료>>");

    }
}
