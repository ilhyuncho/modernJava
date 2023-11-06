package lambda;

@FunctionalInterface
interface MyFunction1 {
    void run();
}

class Outer{
    int val = 10;
    class Inner{
        int val = 30;

        void method(int i){
            int val = 30;

            MyFunction1 f= () -> {
                System.out.println("i :" + i);
                System.out.println("val :" + val);
                System.out.println("this.val :" + ++this.val);      // 상수로 간주되지 않는다
                System.out.println("outer.this.val :" + ++Outer.this.val);  // 상수로 간주되지 않는다
            };


            f.run();
        }
    }
}
public class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }


}
