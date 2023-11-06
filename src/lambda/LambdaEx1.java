package lambda;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {

    static void execute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction(){
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {

        MyFunction f = () -> System.out.println("f1.run()");        // 람다식으로 MyFunction의 run()을 구현

        execute(f);

        MyFunction f2 = new MyFunction() {      // 익명 클래스로 run()을 구현
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f3.run();

        MyFunction f5 = (() -> {});




    }
}
